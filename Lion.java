public class Lion {

    /**
     * This class the animal object Lion
     * Let's start by defining animal variables aka animal characteristics.
     */

    /**
     * Why each data type was choosen:
     String: because the variables 'name', 'fressverhalten', 'Lebensraum' and 'herkunft' are series of alphabets.
     int: Because the variable 'chipnummer' ist only sequence of numbers.
     boolean: because the variable 'bedroht' is only True or false. In our code it's only true.
     */

    public String name;
    public int chipnummer;
    public String fressverhalten;
    public String lebensraum;
    public boolean bedroht;
    public String herkunft;



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

    public Lion(String name, int chipnummer, String fressverhalten, String lebensraum, boolean bedroht, String herkunft) {
        this.name = name;
        this.chipnummer = chipnummer;
        this.fressverhalten = fressverhalten;
        this.lebensraum = lebensraum;
        this.bedroht = bedroht;
        this.herkunft = herkunft;
    }

    /**
     * This method provides a way to get a summary of a Lion object's attributes in a human-readable format.

     * The string returned by this method consists of several concatenated parts, including the lion's name, chip number
     and so on.

     * This code defines a toString() method for the Lion class. When called on an instance of the Lion class,
     this method returns the object's attributes.

     * I used '\n' only to continue writing in the next line (Cosmetic).
     */


    public String toString() {
        return "This lion has the name: " + name + " and the number: " + chipnummer +
                " " + name + " lives in the " + lebensraum + " and eats " + fressverhalten +
                ". \nThe lion is considered the king of beasts and in this case " + name +
                " is a specimen from " + herkunft + ". Is the lion threatened? " + bedroht;
    }


}