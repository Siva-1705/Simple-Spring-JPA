package com.springb.test.Controller;


import com.springb.test.Model.BookRepositry;
import com.springb.test.Model.Books;
import com.springb.test.service.Bookservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class BookController {
    private Logger logger= LoggerFactory.getLogger(BookController.class);

    @Autowired
    private Bookservice bookservice;

    @GetMapping("/books")
    public List<Books> getallBooks()
    {
        logger.info("all books are requested");
        return bookservice.getallBooks();
    }



    @GetMapping("/books/{id}") //using curly braces is a way of giving the type as a variable
    public Optional<Books> getBook(@PathVariable Integer id)
    {
       return bookservice.getBook(id);


    }

    //@RequestMapping(method = RequestMethod.POST,value = "/books")
    @PostMapping("/books")

    public void addBook(@RequestBody Books book)
    {
         bookservice.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/books/{type}")

    public void updateBook(@RequestBody Books newbook , @PathVariable String type)
    {
        bookservice.updateBook(type,newbook);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/books/{id}")

    public void deleteBook( @PathVariable Integer id)
    {
        bookservice.deleteBook(id);
    }

}
 //@RequestBody Books newbook