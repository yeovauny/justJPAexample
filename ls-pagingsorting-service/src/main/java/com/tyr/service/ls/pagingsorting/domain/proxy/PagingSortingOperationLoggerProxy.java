package com.tyr.service.ls.pagingsorting.domain.proxy;

import com.tyr.service.ls.pagingsorting.domain.PagingSortingOperationService;
import com.tyr.service.ls.pagingsorting.domain.dto.ProductDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PagingSortingOperationLoggerProxy implements PagingSortingOperationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PagingSortingOperationLoggerProxy.class);

    @Autowired
    @Qualifier("pagingSortingOperationServiceImpl")
    PagingSortingOperationService pagingSortingOperationServiceImpl;



    @Override
    public ProductDTO saveNewProduct(ProductDTO request) {

        try{
            LOGGER.info("sending request body to the service layyer");
            return pagingSortingOperationServiceImpl.saveNewProduct(request);
        }catch(RuntimeException e){
            LOGGER.error("there is an error on service layer "+e.getMessage());
            throw e;
        }
    }

    @Override
    public List<ProductDTO> findProductByPage(int page, int volume) {
        try {
            LOGGER.info("find all products by page");
            return pagingSortingOperationServiceImpl.findProductByPage(page, volume);
        }catch (RuntimeException ex){
            LOGGER.error("there is an error on service layer"+ ex.getMessage());
            throw ex;
        }
    }
}
