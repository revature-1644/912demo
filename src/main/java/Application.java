import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//        max value of an int is a bit over 2 billion
        int servings = 5;
        CoffeeService service1 = new CoffeeService(servings);
        CoffeeService service2 = new CoffeeService(servings);
        Scanner in = new Scanner(System.in);

        while(true){
            String userInput = in.nextLine();
            if(userInput.equals("purchase 1")){
                service1.purchase();
                int currentServings = service1.getServings();
                System.out.println("current servings: "+currentServings);
            }else if(userInput.equals("purchase 2")){
                service2.purchase();
                int currentServings = service2.getServings();
                System.out.println("current servings: "+currentServings);
            }else if(userInput.equals("tip")){

                String numberInput = in.nextLine();
                try {
                    double amount = Double.parseDouble(numberInput);
                    System.out.println("Thanks for tipping! amount : "+amount);
                }catch(NumberFormatException e){
                    System.out.println("oops... thats not a number");
                }
            }
        }
    }
}
