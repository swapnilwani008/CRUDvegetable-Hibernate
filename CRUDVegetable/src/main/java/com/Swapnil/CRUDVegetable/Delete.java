//Q.2)WAP to perform CRUD operation to save your Project Entity
package com.Swapnil.CRUDVegetable;

import org.hibernate.Session;
import com.Swapnil.Entity.Vegetable;  // Import your Vegetable entity class
import com.Swapnil.Utility.HibernateUtil;

public class Delete {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSession();
        
        try {
            session.beginTransaction();
            
            Vegetable vegetable = session.get(Vegetable.class, 1);  // Replace 1 with the ID of the vegetable you want to delete
            
            session.delete(vegetable);
            
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
