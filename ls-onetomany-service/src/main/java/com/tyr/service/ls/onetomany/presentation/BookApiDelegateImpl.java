package com.tyr.service.ls.onetomany.presentation;

import com.tyr.service.ls.onetomany.controller.BookControllerResources;
import com.tyr.service.ls.onetomany.domain.BookService;
import com.tyr.service.ls.onetomany.domain.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController("api/")
public class BookApiDelegateImpl implements BookControllerResources {


    @Autowired
    @Qualifier("bookServiceLoggerProxy")
    BookService bookServiceLoggerProxy;


    @Override
    @PostMapping("v1/newbook")
    public BookDTO savingBook(@RequestBody BookDTO resquestBook) {

        return bookServiceLoggerProxy.savingBook(resquestBook);
    }

    @Override
    public BookDTO modifyBookInformation(BookDTO requestBook) {
        return null;
    }

    @Override
    public BookDTO deleteBookByID(String id) {
        return null;
    }

    @Override
    public BookDTO deleteAllBook() {
        return null;
    }

    @Override
    public BookDTO getBookByid(String id) {
        return null;
    }

    @Override
    @GetMapping("v1/searching-by-isbn/{isbn}")
    public BookDTO getBookByIsbn(@PathVariable("isbn") String id) {
        return bookServiceLoggerProxy.getBookByIsbn(id);
    }

    @Override
    @GetMapping("v1/searching-books")
    public List<BookDTO> getAllBook() {
        return bookServiceLoggerProxy.getAllBook();
    }
}
