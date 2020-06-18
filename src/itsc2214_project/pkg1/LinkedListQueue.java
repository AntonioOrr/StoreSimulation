/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc2214_project.pkg1;

import java.util.LinkedList;
/**
 *
 * @author Antonio
 */
//NOTE: Make sure all classes share the same package 
public class LinkedListQueue {
    private LinkedList<Customer> q = new LinkedList<>(); //object for the line of customers
    
    public LinkedListQueue(){
        
    }
    
    public void addCustomer(Customer a){ //adds customer to the line
        q.addLast(a);
    }
    
    public void removeCustomer(){//removes serviced customer from the line
        q.removeFirst();
    }
    
    public Customer getFirst(){//returns first customer object in line
        return q.getFirst();
    }
    public int getQueueSize(){//returns current size of the line
        return q.size();
    }
}
