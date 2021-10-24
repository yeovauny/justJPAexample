package com.tyr.service.ls.onetomany.data.mapper;

import com.tyr.service.ls.onetomany.domain.dto.BookDTO;
import com.tyr.service.ls.onetomany.domain.model.BookModel;
import com.tyr.service.ls.onetomany.domain.model.CommentsModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.BiFunction;

@Component("bookModelRequestMapper")
public class BookModelRequestMapper implements BiFunction<BookDTO,List<CommentsModel>, BookModel> {

    @Override
    public BookModel apply(BookDTO bookDTO,List<CommentsModel> commentsModels) {
       return new BookModel().builder()
               .withAuthor(bookDTO.getAutor())
               .withISBN(bookDTO.getBookISBN())
               .withName(bookDTO.getBookName())
               .withgenre(bookDTO.getGenero())
               .andComents(commentsModels)
               .build();
    }

}
