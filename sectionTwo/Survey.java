import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        // Scanner has different methods we can use to get value from user. .
        System.out.println("Welcome. Thank you for taking the survey");

        // nextLine() waits for user to enter a string. 
        System.out.println("What is your name?");
        String name = scan.nextLine();
        counter++;

        // nextDouble() - waits for user to enter a double
        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;
        
        // nextDouble() 
        System.out.println("How much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;
        
        // nextInt() - waits for user to enter a int
        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;
        
        // nextDouble() 
        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;

        // outputs
        System.out.println("\n" + "Thank you " + name + " for answering all "+ counter + " questions");
        System.out.println("\n" + "Your fast food expenses are " + (foodPrice/coffeePrice) + " times your coffee expesnses");
        System.out.println("\n" + "Weekly, you spend $" + (coffeeAmount*coffeePrice) + " on coffee");
        System.out.println("\n" + "Weekly, you spend $" + (foodAmount*foodPrice) + " on food");
        scan.close();
    }
}
