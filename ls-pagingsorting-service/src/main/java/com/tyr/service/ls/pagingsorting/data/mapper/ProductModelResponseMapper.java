package com.tyr.service.ls.pagingsorting.data.mapper;

import com.tyr.service.ls.pagingsorting.domain.dto.ProductDTO;
import com.tyr.service.ls.pagingsorting.domain.model.ProductModel;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("productModelResponseMapper")
public class ProductModelResponseMapper  implements Function<ProductModel, ProductDTO> {
    @Override
    public ProductDTO apply(ProductModel productModel) {
        return new ProductDTO().builder()
                .withDescription(productModel.getDescription())
                .withName(productModel.getName())
                .withPrice(productModel.getPrice())
                .build();
    }
}
