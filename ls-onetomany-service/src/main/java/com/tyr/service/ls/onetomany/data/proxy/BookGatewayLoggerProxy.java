package com.tyr.service.ls.onetomany.data.proxy;

import com.tyr.service.ls.onetomany.domain.dto.BookDTO;
import com.tyr.service.ls.onetomany.domain.gateway.BookGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookGatewayLoggerProxy implements BookGateway {


    @Autowired
    @Qualifier("bookGatewayOperations")
    BookGateway bookGatewayOperations;

    private static final Logger LOGGER = LoggerFactory.getLogger(BookGatewayLoggerProxy.class);


    @Override
    public BookDTO savingNewBook(BookDTO newBook) {
        try{
            LOGGER.info("There is a New book");
            return  bookGatewayOperations.savingNewBook(newBook);
        }catch (RuntimeException ex){
            LOGGER.error("There is a new error saving the new book "+ex.getMessage());
            throw ex;
        }
    }

    @Override
    public List<BookDTO> searchingAllSavedBook() {
      try{
          LOGGER.info("searching all saved books");
          return bookGatewayOperations.searchingAllSavedBook();

      }catch (RuntimeException ex){
          LOGGER.error("There is an error getting all savedBook "+ex.getMessage());
          throw ex;
      }
    }

    @Override
    public BookDTO fingBookbyIsbn(String isbn) {
        try{
            LOGGER.info("searching book by isbn ");
            return bookGatewayOperations.fingBookbyIsbn(isbn);

        }catch (RuntimeException ex){
            LOGGER.error("There is an error the book by isbn "+ex.getMessage());
            throw ex;
        }
    }
}
