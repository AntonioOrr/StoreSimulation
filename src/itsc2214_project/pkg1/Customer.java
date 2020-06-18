/* Program: CustomerQueue ~ Customer Class
Professor: D. Jugan
Date: 
Summary: Creates a Customer object to be used in the line queue. Holds the serviceTime for each customer. 
Functionality: 
    Constructor: Random ServiceTime (1-5)
    Public Methods: getServiceTime, newMinute*/
package itsc2214_project.pkg1;
import java.util.Random;

/**
 *
 * @author Antonio
 */
public class Customer {
    private int serviceTime;                       // ServiceTime for this Customer
    private Customer next;
    /// Constructor
        public Customer() {
            serviceTime = new Random().nextInt(5) + 1; // Randomly assign required service time 1-5    
            next = null;
        }   
    // Getter for next Customer in list   
        public Customer getNext(){     
            return next;   }   
    // Setter for next reference   
        public void setNext(Customer c){      
            next = c;   }
        /// Getter for ServiceTime
        public int getServiceTime() {
            return serviceTime;}
        /// Decrement ServiceTime by 1
        public void decServiceTime() {
            serviceTime--;}
}
