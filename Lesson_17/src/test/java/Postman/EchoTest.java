package Postman;

import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.specification.*;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.*;

import java.nio.charset.StandardCharsets;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.IsEqual.equalTo;

public class EchoTest {

    private static final String URL = "https://postman-echo.com";
    private ResponseSpecification responseSpecification;

    @BeforeEach
    void setup() {
        RestAssured.baseURI = URL;
        responseSpecification = createBaseResponseSpec();
    }

    @Test
    void getTest() {
        String endPointName = "/get";

        given()
                .param("foo1", "bar1")
                .param("foo2", "bar2")
                .when()
                .get(endPointName)
                .then().log().all()
                .assertThat()
                .spec(responseSpecification)
                .and()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    void postRawTextTest() {
        String endPointName = "/post";

        given()
                .log().body().contentType("text/plain")
                .body("{\n" +
                        "    \"test\": \"value\"\n" +
                        "}")
                .when()
                .post(endPointName)
                .then().log().body()
                .assertThat()
                .spec(responseSpecification)
                .and()
                .body("data", equalTo("{\n    \"test\": \"value\"\n}"))
                .body("files", notNullValue())
                .body("form", notNullValue())
                .body("json", equalTo(null));
    }

    @Test
    void postFormDataTest() {
        String endPointName = "/post";

        given()
                .contentType("application/x-www-form-urlencoded")
                .config(RestAssured.config().encoderConfig(
                        EncoderConfig.encoderConfig().defaultCharsetForContentType(
                                StandardCharsets.UTF_8, "application/x-www-form-urlencoded")))
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post(endPointName)
                .then()
                .log().all()
                .assertThat()
                .spec(responseSpecification)
                .and()
                .body("data", equalTo(""))
                .body("files", notNullValue())
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }

    @Test
    void testRequestWithMethod() {
        performRequestWithMethod("PUT", "/put");
        performRequestWithMethod("PATCH", "/patch");
        performRequestWithMethod("DELETE", "/delete");
    }

    /**
     Метод для выполнения запроса с использованием методов (PUT, PATCH, DELETE)

      @param method       - method name
      @param endPointName - endpoint name
     */
    private void performRequestWithMethod(String method, String endPointName) {
        ResponseSpecification localResponseSpec = createBaseResponseSpec();
        localResponseSpec = addUrl(endPointName, localResponseSpec);
        localResponseSpec = addBodyForPutPatchDelete(localResponseSpec);

        requestSpecificationForPutPatchDelete()
                .when()
                .request(method, endPointName)
                .then()
                .log().all()
                .assertThat()
                .spec(localResponseSpec);
    }

    /**
      @return RequestSpecification
     */
    private RequestSpecification requestSpecificationForPutPatchDelete() {
        return given()
                .log().body().contentType("application/json")
                .body(new String("This is expected to be sent back as part of response body."));
    }

    /**
      Метод возвращает базовый ответ для каждого запроса
      В зависимости от запроса к нему будут добавляться др. ".body"
      За это отвечают RequestSpecification методы
     */
    private ResponseSpecification createBaseResponseSpec() {
        return expect()
                .statusCode(HttpStatus.SC_OK)
                .body("args", notNullValue())
                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.user-agent", notNullValue())
                .body("headers.accept", equalTo("*/*"));
    }

    /**
      Метод добавляет URL к нашей спецификации
     */
    private ResponseSpecification addUrl(String name, ResponseSpecification responseSpecification) {
        return responseSpecification
                .body("url", equalTo(URL + name));
    }

    /**
      Метод для PUT,PATCH,DELETE запросов
     */
    private ResponseSpecification addBodyForPutPatchDelete(ResponseSpecification responseSpecification) {
        return responseSpecification
                .body("data", equalTo("This is expected to be sent back as part of response body."));
    }
}