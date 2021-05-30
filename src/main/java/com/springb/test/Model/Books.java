package com.springb.test.Model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {

    @Id
    private int id;
    private String booktype;
    private int bookcost;

  public Books() {
    }

    public Books(String booktype, int bookcost) {
        this.booktype = booktype;
        this.bookcost = bookcost;

    }

    public Books(int id, String booktype, int bookcost) {
        this.id = id;
        this.booktype = booktype;
        this.bookcost = bookcost;
    }

    public int getBookcost() {
        return bookcost;
    }

    public void setBookcost(int bookcost) {
        this.bookcost = bookcost;
    }

    public String getBooktype() {
        return booktype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

}
