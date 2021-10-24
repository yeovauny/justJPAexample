package com.tyr.service.ls.onetomany.data.repository;


import com.tyr.service.ls.onetomany.domain.model.BookModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRespository extends CrudRepository<BookModel,Long> {

    BookModel findBookModelByBookISBN (String isbn);
}
