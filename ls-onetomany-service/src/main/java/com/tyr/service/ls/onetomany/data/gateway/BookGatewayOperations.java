package com.tyr.service.ls.onetomany.data.gateway;

import com.tyr.service.ls.onetomany.data.mapper.BookDTOResponseMapper;
import com.tyr.service.ls.onetomany.data.mapper.BookModelRequestMapper;
import com.tyr.service.ls.onetomany.data.mapper.CommentsDTOResponseMapper;
import com.tyr.service.ls.onetomany.data.mapper.CommentsModelRequestMapper;
import com.tyr.service.ls.onetomany.data.repository.BookRespository;
import com.tyr.service.ls.onetomany.domain.dto.BookDTO;
import com.tyr.service.ls.onetomany.domain.dto.CommentsDTO;
import com.tyr.service.ls.onetomany.domain.gateway.BookGateway;
import com.tyr.service.ls.onetomany.domain.model.BookModel;
import com.tyr.service.ls.onetomany.domain.model.CommentsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookGatewayOperations implements BookGateway {

   @Autowired
    BookRespository bookRespository;

   @Autowired
    BookModelRequestMapper bookModelRequestMapper;

   @Autowired
    CommentsModelRequestMapper commentsModelRequestMapper;

   @Autowired
    BookDTOResponseMapper bookDTOResponseMapper;

   @Autowired
    CommentsDTOResponseMapper commentsDTOResponseMapper;



    @Override
    public BookDTO savingNewBook(BookDTO newBook) {

        List<CommentsModel> bunchOfComments = new ArrayList<>();
        for(CommentsDTO comments: newBook.getComentarios()){
           bunchOfComments.add(commentsModelRequestMapper.apply(comments));
        }
        BookModel apply = bookModelRequestMapper.apply(newBook,bunchOfComments);
        bookRespository.save(apply);

        return newBook;
    }

    @Override
    public List<BookDTO> searchingAllSavedBook() {
        List<BookDTO> result = new ArrayList<>();
        List<CommentsDTO> commentsDTOS = new ArrayList<>();
        Iterable<BookModel> all = bookRespository.findAll();
        for(BookModel book:all){
                for (CommentsModel comments :book.getComentarios()){
                    commentsDTOS.add(commentsDTOResponseMapper.apply( comments));
                }
            result.add(bookDTOResponseMapper.apply(book,commentsDTOS));
            commentsDTOS = new ArrayList<>();
        }

        return result;
    }

    @Override
    public BookDTO fingBookbyIsbn(String isbn) {
        BookModel bookModelByISBN = bookRespository.findBookModelByBookISBN(isbn);

        return bookDTOResponseMapper.apply(bookModelByISBN,null);
    }
}
