package com.springb.test.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Getter
@Setter
@Table(name="bookAnalytics")
public class BookAnalytics {
   /* public BookAnalytics(){
    }

    public BookAnalytics(int id, String booktype, int bookcost, int count) {
        this.id = id;
        this.booktype = booktype;
        this.bookcost = bookcost;
        this.count = count;
    }*/
    @Id
    private int id;
    private String booktype;
    private int bookcost;
    private int count;

   public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public int getBookcost() {
        return bookcost;
    }

    public void setBookcost(int bookcost) {
        this.bookcost = bookcost;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
