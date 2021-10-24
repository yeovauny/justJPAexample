package com.tyr.service.ls.onetomany.data.mapper;


import com.tyr.service.ls.onetomany.domain.dto.BookDTO;
import com.tyr.service.ls.onetomany.domain.dto.CommentsDTO;
import com.tyr.service.ls.onetomany.domain.model.BookModel;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.function.BiFunction;

@Component("BookDTOResponseMapper")
public class BookDTOResponseMapper implements BiFunction<BookModel, List<CommentsDTO>, BookDTO> {
    @Override
    public BookDTO apply(BookModel bookModel, List<CommentsDTO> commentsDTOS) {
        return new BookDTO().builder()
                .withAutor(bookModel.getAutor())
                .withBookISBN(bookModel.getBookISBN())
                .withBookName(bookModel.getBookName())
                .withGenero(bookModel.getGenero())
                .andComments(commentsDTOS)
                .build();
    }
}
