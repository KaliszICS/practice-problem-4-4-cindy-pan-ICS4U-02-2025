/**
 * This is a program that does multiple jobs such as
 * collecting data and returning them as Strings
 * converting data of a meter into centimeters
 * Takes in a String and removing all non letter characters
 * @author cindy pan
 * @version idk
 */

public final class CampbellClass{
    /**
     * Private constructor
     */
    private CampbellClass(){

    }

/**
 * This method collects ints, doubles, booleans, chars, and return them as a String
 * @param num the int value that is collected
 * @param var the double/char/boolean value that is collected
 * @return returns the data collected as String
 */
    public static String convertString(int num){
        return String.valueOf(num);
    }

    public static String convertString(double var){
        return String.valueOf(var);
    }
    public static String convertString(char var){
        return String.valueOf(var);
    }
    public static String convertString(boolean var){
        return String.valueOf(var);
    }
/**
 * this method collects data of meters and returns them as their centimeters
 * @param meter the int value that is collected 
 * @return returning the centimeters 
 */
    public static int convertMetersToCenti(int meter){
        return meter*100;
    }
    public static double convertMetersToCenti(double meter){
        
        return meter*100;
    }
/**
 * this method collects a String value and returns everything that is a letter
 * it also collects a boolean value 
 * when true, returns all letters as upper case
 * when false, returns all letters as lower case
 * @param input
 * @return
 */
    public static String removeNonAlpha(String input){

        String out = input.replaceAll("[^a-zA-Z]","");
        return out;
        
    }
    public static String removeNonAlpha(String help, boolean in){
        if(in==true){
            String out = help.replaceAll("[^a-zA-Z]","");
            return out.toUpperCase();
        }
        else {
            String out = help.replaceAll("[^a-zA-Z]", "");
            return out.toLowerCase();
        }
    }
   
}