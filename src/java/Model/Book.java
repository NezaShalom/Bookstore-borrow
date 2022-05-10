/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Charmant
 */
@Entity
public class Book implements Serializable{
        @Id
    private String ISBN;
        @Column(unique = true)
    private String title;
    private String authors;
    @Temporal(TemporalType.DATE)
    private Date publicationYear;
    private Long purchasingPrice;
    @Temporal(TemporalType.DATE)
    private Date recordingDate;
    private int initial_q;
    private int q_sold;
    @ManyToOne
    private Categories categories;
    @Enumerated(EnumType.STRING)
    private Book_Status status;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public Date getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Date publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Long getPurchasingPrice() {
        return purchasingPrice;
    }

    public void setPurchasingPrice(Long purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }

    public Date getRecordingDate() {
        return recordingDate;
    }

    public void setRecordingDate(Date recordingDate) {
        this.recordingDate = recordingDate;
    }

    public int getInitial_q() {
        return initial_q;
    }

    public void setInitial_q(int initial_q) {
        this.initial_q = initial_q;
    }

    public int getQ_sold() {
        return q_sold;
    }

    public void setQ_sold(int q_sold) {
        this.q_sold = q_sold;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Book_Status getStatus() {
        return status;
    }

    public void setStatus(Book_Status status) {
        this.status = status;
    }
    
    
}
