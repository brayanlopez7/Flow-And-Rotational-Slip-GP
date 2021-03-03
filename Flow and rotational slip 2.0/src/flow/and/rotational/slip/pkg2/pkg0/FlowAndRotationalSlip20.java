
package flow.and.rotational.slip.pkg2.pkg0;

import java.util.Scanner;

public class FlowAndRotationalSlip20 {

    public static void main(String[] args) {
              
   Scanner input = new Scanner(System.in);
  boolean mainLoop = true;
        int option = 0;

        do {
            option = showMenu(input);

            switch (option) {

                case 1:
                    calculateFlowRate(input);
                    break;

                case 2:
                    calculateRotationalDisplacement(input);
                    break;

                case 3:
                    calculateRunoffRainwater(input);
                    break;

                case 4:
                    TransformHoursToMinutes(input);
                    break;

                case 5:
                    transformSecondsToMinutes(input);
                    break;

                case 6:
                    transformKilometersToMeters(input);
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
    
    private static int showMenu(Scanner input) {
        int option;
        System.out.println("Hello, choose an option");
        System.out.println("1.-Calculate the flow rate by speed and time");
        System.out.println("2.-Calculate the rotational displacement of a "
                + "landslide using : Width of the break surface, length of"
                + " the break surface and depth of the break surface by "
                + "perpendicularity to the original topography "
                + "of the terrain.");
        System.out.println("3.- Calculate runoff of rainwater");
        System.out.println("4.- Transform from hours --> minutes ");
        System.out.println("5.- Transform from seconds --> minutes ");
        System.out.println("6.- Transform from kilometers --> meters ");
        System.out.println("0.- Exit");
        System.out.println("Enter your menu option-->");
        option = (int) input.nextFloat();
        return option;
}

        private static void calculateFlowRate(Scanner input) {
        System.out.println("Enter the calculated speed (m^3/hr)-->");
        
        float flow;
        float speed = input.nextFloat();
        
        System.out.println("Enter the calculated time (min)--> ");
        
        float time = input.nextFloat();
        flow = speed / time;
        System.out.println(" The Flow is whit speed -> " + speed + " and "
                + " time -> " + time + " is ->" + flow);
    }
  private static void calculateRotationalDisplacement(Scanner input) {
        System.out.println("Enter the width of the break surface (Wr or Ar)-->");
        float width = input.nextFloat();
        
        System.out.println("Enter the length of the break surface (Lr)--> ");
        float length = input.nextFloat();
        
        System.out.println("Enter the depth of the break surface by "
                + "perpendicularity to the original topography "
                + "of the terrain(Dr or Pr)--> ");
        float depth = input.nextFloat();
        
        float volume = (float) (((Math.PI) * (width * depth * length)) / (6));
        
        System.out.println("The rotational displacement is --> " + volume);
    }

private static void calculateRunoffRainwater(Scanner input) {
        System.out.println("Enter the average intensity of rainwater");
        float averageIntensity = input.nextFloat();

        System.out.println("Enter the total area of the zone in (ha)");
        float areaSurface = input.nextFloat();

        System.out.println("Enter the adimentional runoff coeficient");
        float runoffCoef = input.nextFloat();

        float runoff = (averageIntensity * areaSurface * runoffCoef);

        System.out.println("The runoff of rainwater is --> " + runoff);
    }

    private static void transformSecondsToMinutes(Scanner input) {
        System.out.println("Enter the hours)--> ");
        
        float seconds = input.nextFloat();
        float minutes2;
        
        minutes2 = seconds / 60;
        
        System.out.println("The " + seconds + "in minutes is --> " + minutes2);
    
    }
        private static void TransformHoursToMinutes(Scanner input) {
        System.out.println("Enter the hours --> ");
        
        float hours = input.nextFloat();
        float minutes1;
        
        minutes1 = hours * 60;
        
        System.out.println("The " + hours + "in minutes is --> " + minutes1);
    }
     
        private static void transformKilometersToMeters(Scanner input) {
        System.out.println("Enter the kilometers -->");
        
        float kilometers = input.nextFloat();
        float meters;
        
        meters = (float) (kilometers * (1e+9));
        
        System.out.println("The " + kilometers + "in meters^3 is --> " + meters);
    }

    private static void showExit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void doError() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}