package com.tyr.service.ls.pagingsorting.data.mapper;

import com.tyr.service.ls.pagingsorting.domain.dto.ProductDTO;
import com.tyr.service.ls.pagingsorting.domain.model.ProductModel;
import org.springframework.stereotype.Component;
import java.util.function.Function;

@Component("productModelRequestMapper")
public class ProductModelRequestMapper implements Function<ProductDTO, ProductModel> {


    @Override
    public ProductModel apply(ProductDTO productDTO) {
        return new ProductModel().builder()
                .withName(productDTO.getName())
                .withDescription(productDTO.getDescription())
                .withPrice(productDTO.getPrice())
                .build();

    }
}
