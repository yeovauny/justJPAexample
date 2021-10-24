package com.tyr.service.ls.onetomany.domain.proxy;

import com.tyr.service.ls.onetomany.domain.BookService;
import com.tyr.service.ls.onetomany.domain.dto.BookDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceLoggerProxy implements BookService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookServiceLoggerProxy.class);

    @Autowired
    @Qualifier("bookServiceImpl")
    BookService bookServiceImpl;

    @Override
    public BookDTO savingBook(BookDTO resquestBook) {
        try{
            LOGGER.info("Saving the new book "+resquestBook);
            return bookServiceImpl.savingBook(resquestBook);
        }catch (RuntimeException ex){
            LOGGER.error("Error Saving the Book with request "+resquestBook+" error "+ex.getMessage());
            throw ex;
        }

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
    public BookDTO getBookByIsbn(String id) {
        try{
            LOGGER.info("searching the book by isbn");
            return bookServiceImpl.getBookByIsbn(id);
        }catch (RuntimeException ex){
            LOGGER.error("there is an error searching the book by isbn "+ex.getMessage());
            throw  ex;
        }
    }

    @Override
    public List<BookDTO> getAllBook() {
        try{
            return bookServiceImpl.getAllBook();
        }catch (RuntimeException ex){
            LOGGER.error("there is an error searching all books ");
            throw  ex;
        }



    }


}
