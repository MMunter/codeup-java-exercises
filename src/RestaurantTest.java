public class RestaurantTest {
    public static void main(String[] args){
        RestaurantDish dish = new RestaurantDish();
        dish.costInCents = 50;
        dish.nameofDish = "Ramen Noodles";
        dish.wouldRecommend = true;

        System.out.println("The " + dish.nameofDish + " costs " + dish.costInCents + ". Would I recommend it? " + dish.wouldRecommend + ".");
        System.out.println(dish.eat());

    }
}
