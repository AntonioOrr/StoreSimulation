/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc2214_project.pkg1;
import java.util.Random;
/**
 *
 * @author Antonio
 */
public class Driver {
    
    //Note: Since this class does not have a main method, a Driver object should be created in the
    //main method. Also make sure the simulateStoreActivity method is used for that object.
    public void simulateStoreActivity(){
        int minutes;
        int chance;
        int totalCustServ = 0;
        int longestLine = 0;
        LinkedListQueue d = new LinkedListQueue(); //creates queue
        for (minutes = 0; minutes < 60; minutes++){//program loops 60 times
            System.out.println("Minute(s) passed: " + minutes);
            if(d.getQueueSize() > 0){//lines 25-33 used only when customer is being serviced
                d.getFirst().decServiceTime();
                int remainTime = d.getFirst().getServiceTime();
                if(remainTime == 0){
                    d.removeCustomer();
                    System.out.println("Customer serviced and removed from the queue. Queue length is now " + d.getQueueSize());
                    totalCustServ++;//increments total customers serviced
                }
            }
            chance = new Random().nextInt(100) + 1; //random number between 1 and 100
            if (chance <= 25){//25 percent chance
                Customer c = new Customer();//creates customer object
                d.addCustomer(c);//adds customer object to linklist
                System.out.println("New customer added! Queue length is now " + d.getQueueSize());
            }
            longestLine = Math.max(longestLine, d.getQueueSize());//longest line recorded
            System.out.println("-------------------------------------------------");
        }
        System.out.println("60 minutes have passed. Ending simulation...");
        //outputs total number customers serviced and longest line length in the end of program
        System.out.println("Total number of customers serviced: " + totalCustServ);
        System.out.println("Maximum line length: " + longestLine);
    }
}
