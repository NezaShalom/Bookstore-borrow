/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DGenerate;

import Model.Member;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Charmant
 */
public class GeneralDaoTest {
    
    public GeneralDaoTest() {
    }

    @Test
    public void testSave() {
        Member m=new Member();
        
        m.setName("MIhigo");
        m.setSurname("Yves");
        m.setEmail("ymihigo@gmail.com");
        m.setPhone("8765438590");
        
        new GeneralDao().Save(m);
    }

    @Test
    public void testDelete() {
    }

    @Test
    public void testUpdate() {
    }

    @Test
    public void testSerch_By_Id() {
    }

    @Test
    public void testSerch_By_String_Id() {
    }

    @Test
    public void testPrint_All() {
    }
    
}
