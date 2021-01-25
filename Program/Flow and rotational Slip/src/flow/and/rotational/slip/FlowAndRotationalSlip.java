/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow.and.rotational.slip;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class FlowAndRotationalSlip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean mainLoop = true;
        int option = 0;
        
        do {
            System.out.println("Hello, choose an option");
            System.out.println("1.-Calculate the flow rate by speed and time");
            System.out.println("2.-Calculate the rotational displacement of a "
                    + "landslide using : Width of the break surface, length of"
                    + " the break surface and depth of the break surface by "
                    + "perpendicularity to the original topography "
                    + "of the terrain.");
            System.out.println("0.- Exit");
            
            System.out.println("Enter your menu option-->");
            option = (int) input.nextFloat();// TODO code application logic here
    
    

