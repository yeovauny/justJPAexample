package com.tyr.service.ls.pagingsorting.data.gateway;

import com.tyr.service.ls.pagingsorting.data.mapper.ProductModelRequestMapper;
import com.tyr.service.ls.pagingsorting.data.mapper.ProductModelResponseMapper;
import com.tyr.service.ls.pagingsorting.data.repository.ProductRepository;
import com.tyr.service.ls.pagingsorting.domain.dto.ProductDTO;
import com.tyr.service.ls.pagingsorting.domain.gateway.PagingSortingGatewayOperation;
import com.tyr.service.ls.pagingsorting.domain.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component ("pagingSortingGatewayOperationImpl")
public class PagingSortingGatewayOperationImpl implements PagingSortingGatewayOperation {

    @Autowired
    ProductModelRequestMapper productModelRequestMapper;

    @Autowired
    ProductModelResponseMapper productModelResponseMapper;

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductDTO saveNewProduct(ProductDTO request) {

        productRepository.save(productModelRequestMapper.apply(request));

        return request;
    }

    @Override
    public List<ProductDTO> findProductsByPage(int page, int volume) {
        List<ProductDTO> listaResponse = new ArrayList<>();

        Pageable paging = PageRequest.of(page, volume, Sort.by("id"));
        Page<ProductModel> all = productRepository.findAll(paging);

        for(ProductModel productModel: all) {
           listaResponse.add(productModelResponseMapper.apply(productModel));
        }
        return listaResponse;
    }
}
