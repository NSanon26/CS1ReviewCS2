// CoffeeDrink object class

class Drink {

    int numberOfCups;//class wide variable
    String drinkType;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public Drink(int numberOfCups, String drinkType, boolean hasWhippedCream) {
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        this.drinkType = drinkType;
        this.numberOfCups = numberOfCups;
        this.hasWhippedCream = hasWhippedCream;
    }

    //another drink constructor
    // method overloading
    public Drink(){
        drinkType = "coffee";
        numberOfCups = 1;
        hasWhippedCream = false;
    }
    // Drink Constructor that takes in a number of cups parameter
    // but has "coffee" and false as defaults for other variables
    public Drink(int numberOfCups){
        drinkType = "coffee";
        hasWhippedCream = false;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        // Make this method print order details.
        // Include information stored in each variable.
        System.out.print("you ordered "+numberOfCups+"cups of "+drinkType);
        if(hasWhippedCream){
            System.out.println(" with whipped cream");
        }else{
            System.out.println(" without whipped cream");
        }


    }
}
