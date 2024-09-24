import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 2008;
        System.out.println("actually, founded in " + yearFounded);

        // Calling methods
        randomDiscount();
        // TODO
        // Add string parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("hot chocolate");
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects
        Drink order1 = new Drink(9, "ice water", true);
        Drink order2 = new Drink();

        // TODO
        // Print out the order details
        order1.printInfo();
        order2.printInfo();


    }

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
        //Math.random() is a decimal 0-1
        double r = (int)(Math.random()*31);
        while(r<26){ // in the () goes the condition which,Aq   ``12345q as long as the condition is true the loop will keep funning
            r = (int)(Math.random()*31);
            System.out.println("Random discount is "+ r + "%!");

            //now do it with a for loop
            for(int x = 0; x<1;x=x-1){
                System.out.println(x);
                r = (int)(Math.random()*31);
                System.out.println("Random discount is "+ r + "%!");
                if(r>=26){
                    break;
                }
            }
            System.out.println("end of loop");
        }
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println("Today's Special is "+special);
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5
        for(int c = 1; c < 6;c++){
            System.out.println(c);
        }


        // Print 2, 5, 8, 11
        for(int i = 2; i<12; i+=3){
            System.out.print(i+", ");
        }
        System.out.println();


        // Print 8 to 0
        for(int j = 8; j>=0; j=j-1){
            System.out.println(j);
        }

    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
        double r = Math.random();
        System.out.print("The barista recommends ");
        if(r<0.25){
            System.out.println("cappuccino");
        }
        else if (r < .5){
            System.out.println("green tea");
        }
        else if(r < .75){
            System.out.println("ice water");
        }
        else{
            System.out.println("cold brew");
        }
    }
}

