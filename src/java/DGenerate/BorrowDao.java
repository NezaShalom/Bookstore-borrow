/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DGenerate;


import Model.Book;
import Model.Borrow;
import Model.BorrowStatus;
import Model.Member;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import org.hibernate.*;

/**
 *
 * @author Charmant
 */
public class BorrowDao {
    SessionFactory sf=HibernateUtil.getSessionFactory();
    Session ss=null;
    Transaction tx=null;
    
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    
    Member member=new Member();
    Book book=new Book();
    Borrow borrow=new Borrow();
    
    public void Borrowbo(int clientid,String BorrowDate,String DueDate,String bookID){
        try{
            ss=sf.openSession();
            tx=ss.beginTransaction();
            Member m=(Member) new GeneralDao().Serch_By_Id(member, clientid);
            Book b=(Book) new GeneralDao().Serch_By_String_Id(book, bookID);
            
            borrow.setBooks(b);
            borrow.setBorrowdate(new Date(BorrowDate));
            borrow.setMember(m);
            borrow.setDuedate(new Date(DueDate));
            borrow.setFine(0);
            borrow.setBorrowStatus(BorrowStatus.InBorrowing);
            
            ss.save(borrow);
            tx.commit();
        }catch(HibernateException ex){
            ex.printStackTrace();
            tx.rollback();
        }finally{
        ss.close();
    }
    }
    
    public void Returnbook(int BorrowId,String ReturnDate){
        try{
          ss=sf.openSession();
          Transaction tx=ss.beginTransaction();
          Borrow bo=(Borrow) new GeneralDao().Serch_By_Id(borrow, BorrowId);
          
          int fine;
          if(bo!=null){
            SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
            
            String DueDate=sdf1.format(bo.getDuedate());
            String returnDate=sdf1.format(new Date(ReturnDate));
            
            LocalDate DueD=LocalDate.parse(DueDate);
            LocalDate ReturnD=LocalDate.parse(returnDate);
            
//            Calculating Fine

            Long Diff=ChronoUnit.DAYS.between(DueD, ReturnD);
            
            if(Diff>0){
              fine=Integer.parseInt(Diff.toString())*1000;
              bo.setBoroid(bo.getBoroid());
              bo.setFine(fine);
              bo.setBooks(bo.getBooks());
              bo.setBorrowStatus(BorrowStatus.Returned);
              bo.setBorrowdate(bo.getBorrowdate());
              bo.setDuedate(bo.getDuedate());
              bo.setMember(bo.getMember());
              bo.setReturnDate(new Date(ReturnDate));
              
              ss.update(bo);
              tx.commit();
            }else{
              bo.setBoroid(bo.getBoroid());
              bo.setFine(bo.getFine());
              bo.setBooks(bo.getBooks());
              bo.setBorrowStatus(BorrowStatus.Returned);
              bo.setBorrowdate(bo.getBorrowdate());
              bo.setDuedate(bo.getDuedate());
              bo.setMember(bo.getMember());
              bo.setReturnDate(new Date(ReturnDate));
              
              ss.update(bo);
              tx.commit();
            }
            
          }
        }catch(HibernateException ex){
          tx.rollback();
          ex.printStackTrace();
        }finally{
          ss.close();
        }
    }
}
