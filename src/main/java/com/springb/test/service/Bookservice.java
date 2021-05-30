package com.springb.test.service;


import com.springb.test.Model.BookRepositry;
import com.springb.test.Model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class Bookservice {


    @Autowired
    private BookRepositry bookRepositry;

   /*private List<Books> books= new ArrayList<Books>(Arrays.asList(
            new Books(1,"comic",100),
            new Books(2,"mythology",200)
    ));*/

   public List<Books> getallBooks()
   {
       //return books;
       List<Books> allbooks =new ArrayList<>();

       bookRepositry.findAll().forEach(allbooks ::add);
       return allbooks;

   }

   public Optional<Books> getBook(Integer id)
   {
      // return books.stream().filter( t -> t.getBooktype().equals(type)).findFirst().get();
      return bookRepositry.findById(id);
   }

   public void addBook( Books book)
   {
      // books.add(book);

       bookRepositry.save(book);
   }


   public void updateBook(String type,Books newbook)
   {
      /* for(int i=0;i< books.size();i++)
       {
           Books b=books.get(i);
           if(b.getBooktype().equals(type))
           {
               books.set(i,newbook);
               return ;
           }
       }*/

     bookRepositry.save(newbook);


   }
    public void deleteBook(Integer id)
    {
       /* for(int i=0;i< books.size();i++)
        {

            books.removeIf(rb -> rb.getBooktype().equals(type));
        } */

       bookRepositry.deleteById(id);
    }


}
