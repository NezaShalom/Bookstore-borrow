/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DGenerate;

import Model.Libralian;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.*;
/**
 *
 * @author Charmant
 */
public class GeneralDao {
     SessionFactory sf=HibernateUtil.getSessionFactory();
    Session ss=null;
    Transaction tx=null;
    
    public String Save(Object o){
        try{
            ss=sf.openSession();
            tx=ss.beginTransaction();
            ss.save(o);
            tx.commit();
            return "Saved";
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            tx.rollback();
        }finally{
            ss.close();
        }
        return null;
    }
    public String Delete(Object o){
        try{
            ss=sf.openSession();
            tx=ss.beginTransaction();
            ss.delete(o);
            tx.commit();
            return "Deleted";
            
        }catch(Exception ex){
            tx.rollback();
        }finally{
            ss.close();
        }
        return null;
    }
    
    public String Update(Object o){
        try{
            ss=sf.openSession();
            tx=ss.beginTransaction();
            ss.update(o);
            tx.commit();
            return "Updated";
        }catch(Exception ex){
            tx.rollback();
        }finally{
            ss.close();
        }
        return null;
    }
    
    public Object Serch_By_Id(Object o,int id){
        try{
            ss=sf.openSession();
            Object ob=ss.get(o.getClass(), id);
            return ob;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            ss.close();
        }
        return null;
    }
    
        public Object Serch_By_String_Id(Object o,String id){
        try{
            ss=sf.openSession();
            Object ob=ss.get(o.getClass(), id);
            return ob;
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            ss.close();
        }
        return null;
    }
    
    public List Print_All(Object o){
        ss=sf.openSession();
        List<Object> ob=ss.createCriteria(o.getClass()).list();
        return ob;
    }
    
        public Libralian Login(String Username,String Password){
        try{
            ss=sf.openSession();
            String hql="From Libralian where username='"+Username+"' and password ='"+Password+"'";
            Query query=ss.createQuery(hql);
            return (Libralian) query.uniqueResult();
        }catch(Exception ex){
            
        }finally{
            ss.close();
        }
        return null;
    }
}
