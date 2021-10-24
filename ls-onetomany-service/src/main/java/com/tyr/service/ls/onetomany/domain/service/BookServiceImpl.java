package com.tyr.service.ls.onetomany.domain.service;

import com.tyr.service.ls.onetomany.domain.BookService;
import com.tyr.service.ls.onetomany.domain.dto.BookDTO;
import com.tyr.service.ls.onetomany.domain.gateway.BookGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    @Qualifier("bookGatewayLoggerProxy")
    BookGateway bookGatewayLoggerProxy;


    @Override
    public BookDTO savingBook(BookDTO resquestBook) {

        return bookGatewayLoggerProxy.savingNewBook(resquestBook);
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
        return bookGatewayLoggerProxy.fingBookbyIsbn(id);
    }

    @Override
    public List<BookDTO> getAllBook() {
        return bookGatewayLoggerProxy.searchingAllSavedBook();
    }
}
