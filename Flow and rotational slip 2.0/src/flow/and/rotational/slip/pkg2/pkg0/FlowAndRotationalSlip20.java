
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
    }
    
}
