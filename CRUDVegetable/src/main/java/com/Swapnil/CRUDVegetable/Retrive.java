//Q.2)WAP to perform CRUD operation to save your Project Entity

package com.Swapnil.CRUDVegetable;

import org.hibernate.Session;
import com.Swapnil.Entity.Vegetable;  // Import your Vegetable entity class
import com.Swapnil.Utility.HibernateUtil;

public class Retrive {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        
        try {
            session.beginTransaction();
            
            Vegetable vegetable = session.get(Vegetable.class, 3);  // Replace 3 with the ID of the vegetable you want to retrieve
            
            System.out.println("Vegetable ID 3 data: " + vegetable);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
