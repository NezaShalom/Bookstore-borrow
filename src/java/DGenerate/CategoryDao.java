/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DGenerate;

import Model.Categories;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Charmant
 */
public class CategoryDao {
    SessionFactory sf=HibernateUtil.getSessionFactory();
    Session ss=null;
    Transaction tx=null;
    
    public List CategoryList(){
     ss=sf.openSession();
     Categories c=new Categories();
     List<Categories> li=(List<Categories>) ss.createCriteria(c.getClass()).list();
     return li;
    }
}

