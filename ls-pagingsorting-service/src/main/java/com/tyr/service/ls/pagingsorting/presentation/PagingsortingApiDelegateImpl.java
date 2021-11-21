package com.tyr.service.ls.pagingsorting.presentation;

import com.tyr.service.ls.pagingsorting.controller.PagingsortingControllerResources;
import com.tyr.service.ls.pagingsorting.domain.PagingSortingOperationService;
import com.tyr.service.ls.pagingsorting.domain.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1/")
public class PagingsortingApiDelegateImpl implements PagingsortingControllerResources {


    @Autowired
    @Qualifier("pagingSortingOperationLoggerProxy")
    PagingSortingOperationService pagingSortingSaveOperationLoggerProxy;



    @Override
    @PostMapping("new-product")
    public ProductDTO saveProducts(@RequestBody ProductDTO productDTO) {
        return  pagingSortingSaveOperationLoggerProxy.saveNewProduct(productDTO);
    }

    @GetMapping("finding-products/onpage/{page}/volumen/{volumen}")
    @Override
    public List<ProductDTO> searchProductByPrice(@PathVariable("page") int page,@PathVariable("volumen")int volumen) {
        return pagingSortingSaveOperationLoggerProxy.findProductByPage(page,volumen);
    }

}
