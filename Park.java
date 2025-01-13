import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    private List<Attraction> attractions;

    // Конструктор для инициализации парка
    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Метод для добавления аттракциона в список
    public void addAttraction(String name, String workingHours, int cost) {
        Attraction attraction = new Attraction(name, workingHours, cost);
        attractions.add(attraction);
    }

    public void listAttractions() {
        for (Attraction attraction : attractions) {
            attraction.info();
        }
    }

    // Внутренний класс Attraction
    private class Attraction {
        private String nameAttractions;
        private String workingHours;
        private int cost;

        // Конструктор для инициализации аттракциона
        public Attraction(String nameAttractions, String workingHours, int cost) {
            this.nameAttractions = nameAttractions;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void info() {
            System.out.println("Аттракцион: " + nameAttractions);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + cost + " р.\n");
        }
    }
}