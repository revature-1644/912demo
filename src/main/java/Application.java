import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
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
            }
        }
    }
}
