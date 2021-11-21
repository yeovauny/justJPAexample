package com.tyr.service.ls.pagingsorting.controller;

import com.tyr.service.ls.pagingsorting.domain.dto.ProductDTO;

import java.util.List;


public interface PagingsortingControllerResources {

       ProductDTO saveProducts(ProductDTO productDTO);

       List<ProductDTO> searchProductByPrice(int page,int volumen);

}
