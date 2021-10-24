package com.tyr.service.ls.onetomany.domain.gateway;

import com.tyr.service.ls.onetomany.domain.dto.BookDTO;

import java.util.List;

public interface BookGateway {

    BookDTO savingNewBook(BookDTO newBook);

    List<BookDTO> searchingAllSavedBook();

    BookDTO fingBookbyIsbn(String isbn);

}
