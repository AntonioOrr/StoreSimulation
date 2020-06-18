/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc2214_project.pkg1;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class ITSC2214_Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Driver sim = new Driver();
        System.out.println("This is the beginning of the simulation. Press Enter to continue");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        sim.simulateStoreActivity();
    }
    
}
