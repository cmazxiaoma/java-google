package Builder模式;

public class BuilderDemo {

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(100).carbohydrate(100)
                .build();

        System.out.println(cocaCola);
    }
}
