package first;

public class DrinkUser {
    public static void main(String[] args) {
        NutritionFacts cocaColaZero = new NutritionFacts.Builder(240,8)
                .calories(0)
                .fat(0)
                .build();
    }
}
