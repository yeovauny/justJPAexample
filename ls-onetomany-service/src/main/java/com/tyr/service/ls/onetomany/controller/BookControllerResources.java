package com.tyr.service.ls.onetomany.controller;

import com.tyr.service.ls.onetomany.domain.dto.BookDTO;

import java.util.List;

public interface BookControllerResources {

        BookDTO savingBook(BookDTO resquestBook);

        BookDTO modifyBookInformation(BookDTO requestBook);

        BookDTO deleteBookByID(String id);

        BookDTO  deleteAllBook();

        BookDTO getBookByid(String id);

        BookDTO getBookByIsbn(String id);

        List<BookDTO> getAllBook();

}
