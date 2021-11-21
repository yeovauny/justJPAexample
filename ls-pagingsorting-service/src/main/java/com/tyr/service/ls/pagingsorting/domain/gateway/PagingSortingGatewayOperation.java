package com.tyr.service.ls.pagingsorting.domain.gateway;

import com.tyr.service.ls.pagingsorting.domain.dto.ProductDTO;

import java.util.List;

public interface PagingSortingGatewayOperation {

    ProductDTO saveNewProduct(ProductDTO request);

    List<ProductDTO> findProductsByPage(int page, int volume);
}
