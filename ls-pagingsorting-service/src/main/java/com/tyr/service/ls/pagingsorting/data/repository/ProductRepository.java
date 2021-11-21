package com.tyr.service.ls.pagingsorting.data.repository;


import com.tyr.service.ls.pagingsorting.domain.model.ProductModel;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<ProductModel,Long> {

  //  List<ProductModel> findAllByPrice(double price, Pageable pageable);
}
