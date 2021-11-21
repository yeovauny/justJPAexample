package com.tyr.service.ls.pagingsorting.domain;

import com.tyr.service.ls.pagingsorting.domain.dto.ProductDTO;

import java.util.List;

public interface PagingSortingOperationService {

    ProductDTO saveNewProduct(ProductDTO request);

    List<ProductDTO> findProductByPage(int page, int volume);

}
