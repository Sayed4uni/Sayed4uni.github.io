public class BlueWhale {

    /**
     * This class the animal object Blue Whale.
     * Let's start by defining animal variables aka animal characteristics.
     */

    /**
     * Why each data type was choosen:
     String: because the variables 'name', 'fressverhalten', 'Lebensraum' and 'herkunft' are series of alphabets.
     int: Because the variable 'chipnummer' ist only sequence of numbers.
     boolean: because the variable 'bedroht' is only True or false. In our code it's only true.
     */

    private String name;
    private int chipnummer;
    private String fressverhalten;
    private String lebensraum;
    private boolean bedroht;
    private String farbe;


    /**
     * We define here a contractor with six parameters.

     * The 'this' keyword is used to refer to the class'
     instance variables, or the variables that are
     specific to each class object.

     * The = operator is used in this constructor to assign
     the parameters' values to the corresponding instance
     variables.

     * This means:
     'name' parameter -> 'name' variable.
     'chipnummer' parameter -> 'chipnummer' variable.
     usw....
     */


    public BlueWhale(String name, int chipnummer, String fressverhalten, String lebensraum, boolean bedroht, String farbe) {
        this.name = name;
        this.chipnummer = chipnummer;
        this.fressverhalten = fressverhalten;
        this.lebensraum = lebensraum;
        this.bedroht = bedroht;
        this.farbe = farbe;
    }

    /**
     * This method provides a way to get a summary of a Blue Whale object's attributes in a human-readable format.

     * The string returned by this method consists of several concatenated parts, including the lion's name, chip number
     and so on.

     * This code defines a toString() method for the Blue Whale class. When called on an instance of the Blue Whale class,
     this method returns the object's attributes.

     * I used '\n' only to continue writing in the next line (Cosmetic).
     */


    public String toString() {
        return "This blue whale has the name: " + name + " and the number: " + chipnummer +
                " " + name + " lives in the " + lebensraum + " and eats " + fressverhalten +
                ". \nThe blue whale is the largest sea creature. " + name + " has the color as a distinguishing feature: " +
                farbe + ". Is the blue whale threatened? " + bedroht;
    }


}