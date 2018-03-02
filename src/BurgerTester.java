public class BurgerTester {
    public static void main(String[] args){

        BurgerTools.mostPopularTopping = "Jalapeno";
        BurgerTools.averageDaysBeforeExpiration = 3;
        BurgerTools.temperatureWhenCooked = 80;
        BurgerTools.cheese = "Monterey Jack";

        System.out.println();
        BurgerTools.grill();
        System.out.println();
        System.out.println("The most popular topping is " + BurgerTools.mostPopularTopping + ". Burgers usually last for " + BurgerTools.averageDaysBeforeExpiration + " days. ");
        System.out.println("They should be cooked at " + BurgerTools.temperatureWhenCooked + " degrees.");
        System.out.println(BurgerTools.cheese + " is also available as a topping.");
        System.out.println();
        BurgerTools.orderUp();

    }
}
