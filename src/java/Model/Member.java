/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.*;

/**
 *
 * @author Charmant
 */
@Entity
public class Member extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
