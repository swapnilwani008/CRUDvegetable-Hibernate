//Q.2)WAP to perform CRUD operation to save your Project Entity
package com.Swapnil.CRUDVegetable;

import org.hibernate.Session;
import com.Swapnil.Entity.Vegetable;  // Import your Vegetable entity class
import com.Swapnil.Utility.HibernateUtil;

public class Insert {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        
        try {
            session.beginTransaction();
            
            Vegetable vegetable1 = new Vegetable("Carrot", 1.5);  // Create Vegetable objects
            Vegetable vegetable2 = new Vegetable("Tomato", 2.0);
            Vegetable vegetable3 = new Vegetable("Cucumber", 1.0);
            Vegetable vegetable4 = new Vegetable("Broccoli", 1.8);
            
            session.save(vegetable1);  // Save Vegetable objects
            session.save(vegetable2);
            session.save(vegetable3);
            session.save(vegetable4);
            
            session.getTransaction().commit();  // Commit the transaction
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
