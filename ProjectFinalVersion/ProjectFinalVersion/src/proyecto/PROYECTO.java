/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PROYECTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option ;
                                             
        do {
            option = showMenu(input);

            switch (option) {

                case 1:
                    
                    System.out.println("Enter the calculated speed (m^3/hr)-->");
                    float speed = input.nextFloat();
                    System.out.println("Enter the calculated time (min)--> ");
                    float time =input.nextFloat();
                    System.out.println(" The Flow is whit speed -> " + speed + " and "
                            + " time -> " + time + " is ->" + calculateFlowRate(speed,time));
                    break;

                case 2:
                    
                    System.out.println("Enter the width of the break surface (Wr or Ar)-->");
                    float width =input.nextFloat() ;
                    System.out.println("Enter the length of the break surface (Lr)--> ");
                    float length = input.nextFloat() ;
                    System.out.println("Enter the depth of the break surface by "
                            + "perpendicularity to the original topography "
                            + "of the terrain(Dr or Pr)--> ");
                     float depth = input.nextFloat() ;
                    System.out.println("The rotational displacement is --> " 
                            + calculateRotationalDisplacement(width, length,depth));
                    break;

                case 3:
                    
                    System.out.println("Enter the average intensity of rainwater");
                     float averageIntensity = input.nextFloat() ;
                    System.out.println("Enter the total area of the zone in (ha)");
                     float areaSurface = input.nextFloat() ;       
                    System.out.println("Enter the adimentional runoff coeficient");
                    float runoffCoef = input.nextFloat() ;
                    System.out.println("The runoff of rainwater is --> "
                            + calculateRunoffRainwater(averageIntensity,
                                    areaSurface, runoffCoef));

                    break;

                case 4:

                    System.out.println("Enter the hours --> ");
                    float hours = input.nextFloat()  ;
                    System.out.println("The " + hours + "in minutes is --> "
                            + TransformHoursToMinutes(hours));
                    break;

                case 5:
                    
                    System.out.println("Enter the seconds)--> ");
                    float seconds = input.nextFloat() ;
                    System.out.println("The " + seconds + "in minutes is --> " 
                            + transformSecondsToMinutes( seconds));
                    break;

                case 6:
                    
                    System.out.println("Enter the kilometers -->");
                    float kilometers = input.nextFloat() ;
                    System.out.println("The " + kilometers + "in meters^3 is --> " 
                            + transformKilometersToMeters( kilometers));

                    break;
                case 0:
                    showExit();
                    break;

                default:
                    doError();
                    break;

            }

        } while (option != 0);
    }

    // FUNCTIONS
    private static void doError() {
        System.out.println("INVALID OPTION\n\n");
    }

    private static void showExit() {
        System.out.println(" See you later ");
        System.exit(0);
    }

    public static float transformKilometersToMeters(float kilometers) {

        float meters;

        meters = (float) (kilometers * (1e+9));
        
        return meters;

    }

    public static float transformSecondsToMinutes(float seconds) {
      
        float minutes2;

        minutes2 = seconds / 60;
        
        return minutes2;

    }

    public static float TransformHoursToMinutes(float hours) {       

        float minutes1;

        minutes1 = hours * 60;
        
        return minutes1;

    }

    public static float calculateRunoffRainwater( float averageIntensity,float areaSurface,float runoffCoef  ) {

        float runoff;
        
        runoff=(averageIntensity * areaSurface * runoffCoef);
        
        return runoff ;

    }

    public static float calculateRotationalDisplacement(float width,float length,  float depth) {

        float volume;
        
        volume = (float) (((Math.PI) * (width * depth * length)) / (6));
        
        return volume;
    
    }

    public static float calculateFlowRate(float speed, float time) {

        float flow;

        flow = speed / time;
        
        return flow;
    }

    private static int showMenu(Scanner input) {
        int option;
        System.out.println("----------GROUP N°-5----------");
        System.out.println("╔══════════════╗");
        System.out.println(" HELLO, CHOOSE AN OPTION");
        System.out.println("╚══════════════╝");
        System.out.println("1.-Calculate the flow rate by speed and time.");
        System.out.println("2.-Calculate the rotational displacement of a ");
        System.out.println("landslide using : Width of the break surface ");
        System.out.println("length of the break surface and depth of the ");
        System.out.println(" break surface by perpendicularity to the ");
        System.out.println("original topography of the terrain.");
        System.out.println("3.- Calculate runoff of rainwater.");
        System.out.println("------------------------------------------------");
        System.out.println("4.- Transform from hours --> minutes ");
        System.out.println("5.- Transform from seconds --> minutes ");
        System.out.println("6.- Transform from kilometers --> meters ");
        System.out.println("0.- Exit");
        System.out.println("Enter your menu option-->");
        option = (int) input.nextFloat();
        return option;
    }
    
}
