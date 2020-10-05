public class DishTools {
    public static final int avgCostofDish = 1300;

    public static void shoutDishName(Dish d) {
        System.out.println(d.nameOfDish.toUpperCase());
    }

    public static void analyzeDishCost(Dish d) {
        if (d.costInCents > avgCostofDish) {
            System.out.println("More expensive than average...");
        } else {
            System.out.println("Less expensive than average...");
        }
    }

    public static void flipRecommendation(Dish d) {
        d.wouldRecommend = !d.wouldRecommend;

        }


}
