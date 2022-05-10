/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DGenerate;

import Model.Book;
import Model.Book_Status;
import Model.Bought;
import org.hibernate.*;

/**
 *
 * @author sudo
 */
public class BookDao {
  SessionFactory sf=HibernateUtil.getSessionFactory();
  Session ss=null;
  Transaction tx=null;
  Book bk=new Book();
  
  public Book SearchBook(String BookId){
    try{
      ss=sf.openSession();
      
      Book b=(Book)ss.get(bk.getClass(), BookId);
      
      return b;
    }catch(HibernateException ex){
      ex.printStackTrace();
    }finally{
      ss.close();
    }
    return null;
  }
  public String BuyBooks(String BookId,int quantity,Bought bought){
    try{
      ss=sf.openSession();
      Book buk=SearchBook(BookId);
      
      int dif=buk.getInitial_q()-buk.getQ_sold()+quantity;
      int q=buk.getQ_sold()+quantity;
      
      if(dif<0){
        return "Quantity you want is not in the store";  
      }else{
        String sav=new GeneralDao().Save(bought);
        
        if(sav.equalsIgnoreCase("Saved")){
                ss=sf.openSession();
                tx=ss.beginTransaction();
                
                buk.setAuthors(buk.getAuthors());
                buk.setCategories(buk.getCategories());
                buk.setISBN(buk.getISBN());
                buk.setInitial_q(buk.getInitial_q());
                buk.setPublicationYear(buk.getPublicationYear());
                buk.setPurchasingPrice(buk.getPurchasingPrice());
                buk.setQ_sold(q);
                buk.setRecordingDate(buk.getRecordingDate());
                if(dif==0){
                buk.setStatus(Book_Status.Out_Of_Stock);
                }else{
                  buk.setStatus(Book_Status.Available);
                }
                buk.setTitle(buk.getTitle());
                
                ss.update(buk);
                tx.commit();
        }else{
          return "Failed";
        }      
      }
      
  }catch(HibernateException ex){
    ex.printStackTrace();
  }finally{
      ss.close();
    }
  return  null;
}
}
