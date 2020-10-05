public class Dish {
    public int costInCents ;
    public String nameOfDish;
    public Boolean wouldRecommend;

    public Dish(int cost, String name, boolean recommend) {
      costInCents = cost;
        nameOfDish = name;
        wouldRecommend = recommend;
    }

    public void printSummary(){
        System.out.printf("\nCost: %d \nName: %s \nRecommend: %b", costInCents, nameOfDish, wouldRecommend);
    }


}
