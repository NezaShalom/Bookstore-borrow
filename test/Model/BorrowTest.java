/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DGenerate.BorrowDao;
import DGenerate.GeneralDao;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Charmant
 */
public class BorrowTest {
    
    public BorrowTest() {
        
//        Borrow b = new Borrow();
//        Book o = new Book();
//        Member m=new Member();
//        
//        b.setBorrowStatus(BorrowStatus.InBorrowing);
//        b.setBooks((Book) new GeneralDao().Serch_By_String_Id(o, "353"));
//            b.setBorrowdate(new Date("10/15/2020"));
//    b.setDuedate(new Date("10/20/2020"));
//    b.setFine(0);
//    b.setMember((Member) new GeneralDao().Serch_By_Id(m, 34));

    
    //new GeneralDao().Save(b);
    new BorrowDao().Returnbook(84, "10/28/2020");
 
    
    }

    @Test
    public void testGetBoroid() {
    }

    @Test
    public void testSetBoroid() {
    }

    @Test
    public void testGetMember() {
    }

    @Test
    public void testSetMember() {
    }

    @Test
    public void testGetBooks() {
    }

    @Test
    public void testSetBooks() {
    }

    @Test
    public void testGetBorrowdate() {
    }

    @Test
    public void testSetBorrowdate() {
    }

    @Test
    public void testGetDuedate() {
    }

    @Test
    public void testSetDuedate() {
    }

    @Test
    public void testGetReturnDate() {
    }

    @Test
    public void testSetReturnDate() {
    }

    @Test
    public void testGetFine() {
    }

    @Test
    public void testSetFine() {
    }

    @Test
    public void testGetBorrowStatus() {
    }

    @Test
    public void testSetBorrowStatus() {
    }
    
}
