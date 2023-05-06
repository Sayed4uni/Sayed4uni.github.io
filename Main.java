

/**
 * I am importing important libraries to manage the data and read from the file
 */

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * the Main class is declared and the main method is implemented.
 * It throws a FileNotFoundException because the file being read could be missing.
 * I want to store animal data so I use 'Arraylist' of type 'String[]'
 */

public class Main {

        public static void main(String[] args) throws FileNotFoundException {
            ArrayList<String[]> animals = new ArrayList<>();

            /**
             * To make the program read from the CSV file (animals.csv) i use the 'Scanner' method.
             * The data is sperated with ';' so i tell the programm that after ';' come new infos.
             * By using 'inputStream.nextLine()' I skip the first line because it's only headers
             (Not actual relatable infotmations).
             */

            try {
                Scanner inputStream = new Scanner(new File("src\\animals.csv"));
                inputStream.useDelimiter(";");
                inputStream.nextLine();


                /**
                 * The file is read line by line using a while loop until there are no more lines to read.
                 At the ';', each line is divided into an array of strings,
                 which is then added to the list of animals.
                 */



                while (inputStream.hasNext()) {
                    String[] data = inputStream.nextLine().split(";");
                    animals.add(data);
                }

                /**
                 * In order to free up system resources, I close the method 'Scanner'.
                 */

                inputStream.close();


                /**
                 * In case the file cannot be located, an exception is raised and an error message will be printed.
                 */



            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            /**
             * I use 'for' loop to make each animal data store in a specific variable (tierart, name...) and to
             reverse order.
             * I wrote 'herkunft, groesse, and farbe' variables in their respective cases because they don't represent
             every animal.
             * I used the method equalsIgnoreCase() because every boolean 'bedroht' has the value true.

             * As a result, we begin at the end (animals.size() - 1) and work our way down the index (i) until
             we reach the beginning (0) rather than looping through the list from beginning to end. This is inspired
             from: 'https://stackoverflow.com/questions/3610933/iterating-c-vector-from-the-end-to-the-beginning'
             */




            for (int i = animals.size() - 1; i >= 0; i--) {
                String[] animalData = animals.get(i);

                    String tierart = animalData[0];
                    String name = animalData[1];
                    int chipnummer = Integer.parseInt(animalData[2]);
                    String fressverhalten = animalData[3];
                    String lebensraum = animalData[4];
                    boolean bedroht = Boolean.parseBoolean(String.valueOf(animalData[5].equalsIgnoreCase("yes")));

                /**
                 *This switch statement executes the code block for the corresponding case after checking the value of
                 the tierart variable. The animal type is represented by a String 'tierart'.
                 * If tierart is equal to "Elephant", then a new Elephant object is created with the given parameters
                 and printed using its toString() method. This applies to other animals.
                 * The animal description summary is being initiated by the code 'System.out.println(classname.toString());'
                 * Then I just create a blank space.


                 */


                    switch (tierart) {
                        case "Lion" -> {
                            String herkunft = animalData[8];
                            Lion lion = new Lion(name, chipnummer, fressverhalten, lebensraum, bedroht, herkunft);
                            System.out.println(lion.toString());
                            System.out.println("");
                        }
                        case "Elephant" -> {
                            int groesse = Integer.parseInt(animalData[6]);
                            Elephant elephant = new Elephant(name, chipnummer, fressverhalten, lebensraum, bedroht, groesse);
                            System.out.println(elephant.toString());
                            System.out.println("");
                        }
                        case "Blue Whale" -> {
                            String farbe = animalData[7];
                            BlueWhale blueWhale = new BlueWhale(name, chipnummer, fressverhalten, lebensraum, bedroht, farbe);
                            System.out.println(blueWhale.toString());
                            System.out.println("");
                        }
                        case "Tiger" -> {
                            SumatranTiger sumatranTiger = new SumatranTiger(name, chipnummer, fressverhalten, lebensraum, bedroht);
                            System.out.println(sumatranTiger.toString());
                            System.out.println("");
                        }



                    }
                }
            }
        }

