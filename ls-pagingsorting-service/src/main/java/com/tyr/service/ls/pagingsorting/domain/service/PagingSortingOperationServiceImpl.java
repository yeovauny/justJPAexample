package com.tyr.service.ls.pagingsorting.domain.service;

import com.tyr.service.ls.pagingsorting.domain.PagingSortingOperationService;
import com.tyr.service.ls.pagingsorting.domain.dto.ProductDTO;
import com.tyr.service.ls.pagingsorting.domain.gateway.PagingSortingGatewayOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagingSortingOperationServiceImpl implements PagingSortingOperationService {
    @Autowired
    @Qualifier("pagingSortingLoggerProxy")
    PagingSortingGatewayOperation pagingSortingLoggerProxy;


    @Override
    public ProductDTO saveNewProduct(ProductDTO request) {

        pagingSortingLoggerProxy.saveNewProduct(request);

        return request;
    }

    @Override
    public List<ProductDTO> findProductByPage(int page, int volume) {
        return pagingSortingLoggerProxy.findProductsByPage(page,volume);
    }


}
