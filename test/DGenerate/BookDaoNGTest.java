/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DGenerate;

import Model.Book;
import Model.Bought;
import java.util.Date;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author sudo
 */
public class BookDaoNGTest {
  
  public BookDaoNGTest() {
  }

  @Test
  public void testSearchBook() {
    
  }

  @Test
  public void testBuy() {
  }

  @Test
  public void testBuyBooks() {
    Bought bought=new Bought();
    
    bought.setBook(new BookDao().SearchBook("2020/12"));
    bought.setDate(new Date());
    bought.setEmail("Tunga@gmail.com");
    bought.setName("tunga");
    bought.setSurname("Yannick");
    bought.setPhone("0786278340");
    
    System.out.println(new BookDao().BuyBooks("2020/12", 10, bought));
  }
  
}
