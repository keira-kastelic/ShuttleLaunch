import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Shuttle Launch
 * Author: Keira
 * Collaborator(s): Nickel
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/


public class ShuttleLaunch {
    public static void main(String[] args) {
        double curTemp; // establishing the variable for temperature
        boolean tempNum; // creating a boolean for the temperature
        double cloudCover; // creating a variable for the cloud coverage
        boolean cloudCoverage; // creating a boolean for the cloud coverage
        boolean isRaining; // creating a boolean for weather or not it is raining
        int timeSinceLastLightning; // creating a variable for the last time lightning hit
        boolean lightningTime; // creating a boolean for the lightning
        double windSpeed; // creating a variable for the wind's speed
        boolean windSpeedKnots; // creating a boolean for the wind's speed
        boolean overrideOn; // creating a boolean for weather or not the override is on


        // test one (creating a list of information from each test)

            System.out.println("Test One"); // prints out whish test it shown
            curTemp = 100.0;
            cloudCover = 0.35;
            isRaining = false;
            timeSinceLastLightning = 55;
            windSpeed = 33.0;
            overrideOn = false;

        // Test 2 (in comments because it is not being run, but cn switch tests depending on which one you are checking)
        /**
            System.out.println("Test Two");
            curTemp = 99.0;
            cloudCover = 0.26;
            isRaining = true;
            timeSinceLastLightning = 55;
            windSpeed = 33.0;
            overrideOn = false; **/

        // Test 3
        /**
            System.out.println("Test Three");
            curTemp = 99.0;
            cloudCover = 0.25;
            isRaining = true;
            timeSinceLastLightning = 45;
            windSpeed = 34.0;
            overrideOn = false; **/

        // Test 4
        /**
            System.out.println("Test Four");
            curTemp = 110.0;
            cloudCover = 0.55;
            isRaining = true;
            timeSinceLastLightning = 3;
            windSpeed = 55.0;
            overrideOn = true; **/

        tempNum = (curTemp > 32) && (curTemp < 100); // establishing that the temperature has to be above freezing (or 32)
        cloudCoverage = (!isRaining && cloudCover <= 0.48) || (isRaining && cloudCover <= 0.25); // establishing if it is raining and the clouds coverage is never less than 48%
        lightningTime = (timeSinceLastLightning >= 45); // establishing if the lightning is greater than or equal to 45
        windSpeedKnots = (windSpeed <= 34); // establishing that the wind speed is less than or rqual to 34

        System.out.println(tempNum && cloudCoverage && lightningTime && windSpeedKnots || overrideOn );



    }
}
