/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DGenerate;

import Model.Book;
import Model.Categories;
import java.util.Date;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Charmant
 */
public class BorrowDaoTest {
    
    
    public void testBorr(){
        
    }
    public BorrowDaoTest() {
   
        Book b = new Book();
        Categories c= new Categories();
        
       // new BorrowDao().Borrowbo(14, "10/10/2020", "10/11/2020", "353");
        new BorrowDao().Returnbook(75, "2021/01/12");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

   

    @Test
    public void testReturnbook() {
        
    }

    @Test
    public void testBorrowbo() {
    }
    
}
