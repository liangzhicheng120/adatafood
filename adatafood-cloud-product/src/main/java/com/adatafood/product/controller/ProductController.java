package com.adatafood.product.controller;

import com.adatafood.product.bean.ProductCategory;
import com.adatafood.product.bean.ProductInfo;
import com.adatafood.product.service.ProductCategoryService;
import com.adatafood.product.service.ProductService;
import com.adatafood.product.vo.ProductInfoVO;
import com.adatafood.product.vo.ProductVO;
import com.adatafood.product.vo.WebResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liangzhicheng https://github.com/liangzhicheng120
 * @version V1.0
 * @Project: ${project_name}
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: 查询所有商品信息, 获取类目列表, 查询类目, 构造数据
 * @date ${date} ${time}
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public WebResultVO list() {
        List<ProductInfo> productInfoList = productService.findUpAll();
        List<Integer> productCategoryIds = productInfoList.stream().map(ProductInfo::getCategoryType).collect(Collectors.toList());
        List<ProductCategory> productCategoryList = productCategoryService.findAllByCategoryTypeIn(productCategoryIds);
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList) {
            ProductVO productVO = ProductVO.build(productInfoList, productCategory);
            productVOList.add(productVO);
        }
        return new WebResultVO(productVOList);
    }

}
