public class SumatranTiger {

    /**
     * This class the animal object Sumatran Tiger.
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

    public SumatranTiger(String name, int chipnummer, String fressverhalten, String lebensraum, boolean bedroht) {
        this.name = name;
        this.chipnummer = chipnummer;
        this.fressverhalten = fressverhalten;
        this.lebensraum = lebensraum;
        this.bedroht = bedroht;
    }


    /**
     * This method provides a way to get a summary of a Tiger object's attributes in a human-readable format.

     * The string returned by this method consists of several concatenated parts, including the Tiger's name, chip number
     and so on.

     * This code defines a toString() method for the 'SumatranTiger' class. When called on an instance of the 'SumatranTiger' class,
     this method returns the object's attributes.

     * I used '\n' only to continue writing in the next line (Cosmetic).
     */



    public String toString() {
        return "This sumatran tiger has the name: " + name + " and the number: " + chipnummer +
                " " + name + " lives in the " + lebensraum + " and eats " + fressverhalten +
                ". \nThe sumatran tiger is not afraid of water and is a very good swimmer. That's why he has webbed feet between his toes. Is the sumatran tiger threatened? " + bedroht;
    }



}