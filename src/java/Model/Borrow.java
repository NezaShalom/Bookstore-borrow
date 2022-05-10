/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Charmant
 */
@Entity
public class Borrow implements Serializable{

        @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int boroid;
    @ManyToOne
    private Member member;
    @ManyToOne
    private Book books;
    @Temporal(TemporalType.DATE)
    private Date Borrowdate;
    @Temporal(TemporalType.DATE)
    private Date Duedate;
    @Temporal(TemporalType.DATE)
    private Date returnDate;
    private int Fine;
    @Enumerated(EnumType.STRING)
    private BorrowStatus borrowStatus;

    public int getBoroid() {
        return boroid;
    }

    public void setBoroid(int boroid) {
        this.boroid = boroid;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBooks() {
        return books;
    }

    public void setBooks(Book books) {
        this.books = books;
    }

    public Date getBorrowdate() {
        return Borrowdate;
    }

    public void setBorrowdate(Date Borrowdate) {
        this.Borrowdate = Borrowdate;
    }

    public Date getDuedate() {
        return Duedate;
    }

    public void setDuedate(Date Duedate) {
        this.Duedate = Duedate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getFine() {
        return Fine;
    }

    public void setFine(int Fine) {
        this.Fine = Fine;
    }

    public BorrowStatus getBorrowStatus() {
        return borrowStatus;
    }

    public void setBorrowStatus(BorrowStatus borrowStatus) {
        this.borrowStatus = borrowStatus;
    }


    
    
}
