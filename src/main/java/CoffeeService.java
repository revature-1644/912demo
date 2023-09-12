public class CoffeeService {
//    int is whole numbers
    int servings;
//    double is decimals numbers
    double revenue;
//    true/false values
    boolean open;
//    char (characters)
//    shorts (not used much, but small whole numbers)
//    byte (not used much, a very small whole number)
//    long (a very large whole number)
//    float (decimal, don't use it)

    /**
     * User story:
     * As a user of CoffeeApp, I should be able to submit a purchase.
     * A purchase will increase revenue, but decrease servings of coffee.
     */

    /**
     * User story:
     * As a user of CoffeeApp, attempting to purchase coffee when no servings exist should not decrease servings
     * and should not increase revenue.
     */

    /**
     * User story:
     * As a user of CoffeeApp, I should be able to start the app with a certain amount of servings of coffee.
     */
    public CoffeeService(){

    }
    public CoffeeService(int servings){
        open = true;
        this.servings = servings;
    }
    public int getServings(){
        return servings;
    }
    public double getRevenue(){
        return revenue;
    }
    public void purchase(){
        if( servings > 0 ){
            servings = servings - 1;
            revenue = revenue + 1;
        }else{

        }
    }

}
