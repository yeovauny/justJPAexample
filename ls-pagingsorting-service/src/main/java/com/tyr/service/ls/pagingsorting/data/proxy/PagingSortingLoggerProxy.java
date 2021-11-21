package com.tyr.service.ls.pagingsorting.data.proxy;

import com.tyr.service.ls.pagingsorting.domain.dto.ProductDTO;
import com.tyr.service.ls.pagingsorting.domain.gateway.PagingSortingGatewayOperation;
import com.tyr.service.ls.pagingsorting.domain.proxy.PagingSortingOperationLoggerProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PagingSortingLoggerProxy implements PagingSortingGatewayOperation {

    private static final Logger LOGGER = LoggerFactory.getLogger(PagingSortingOperationLoggerProxy.class);

    @Autowired
    @Qualifier("pagingSortingGatewayOperationImpl")
    PagingSortingGatewayOperation pagingSortingSaveGatewayOperationImpl;

    @Override
    public ProductDTO saveNewProduct(ProductDTO request) {
       try{
           LOGGER.info("seding the information to gateway layer");
           return pagingSortingSaveGatewayOperationImpl.saveNewProduct(request);
       }catch (RuntimeException ex){
           LOGGER.error("error on gateway layer "+ex.getMessage());
           throw ex;
       }
    }

    @Override
    public List<ProductDTO> findProductsByPage(int page, int volume) {
        try{
            LOGGER.info("seding the information to gateway layer");
            return pagingSortingSaveGatewayOperationImpl.findProductsByPage(page,volume );
        }catch (RuntimeException ex){
            LOGGER.error("error on gateway layer "+ex.getMessage());
            throw ex;
        }

    }
}
