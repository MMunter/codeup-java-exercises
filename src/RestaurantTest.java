public class RestaurantTest {
    public static void main(String[] args){
        RestaurantDish dish = new RestaurantDish(500, "Ramen Noodles", true);
    dish.setCostInCents(800);
    dish.setNameofDish("Macaroni and Cheese");
    dish.setWouldRecommend(false);

        System.out.println("The " + dish.getNameofDish() + " costs " + dish.getCostInCents() + ". Would I recommend it? " + dish.isWouldRecommend() + ".");
        System.out.println(dish.eat());

    }
}
