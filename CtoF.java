import java.io.*;
 
class CtoF {
    // function to convert temperature
    // from degree Celsius to Kelvin
    static float Celsius_to_Kelvin(float C)
    {
        return (float)(C + 273.15);
    }
     
    // Driver function
    public static void main (String[] args)
    {
        // variable to hold the
        // temperature in Celsius
        float C = 100;
     
        System .out.println ( "Temperature in Kelvin ( K ) = "
                             + Celsius_to_Kelvin(C));
             
    }
}
