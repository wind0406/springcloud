package springcloud.test.product.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springcloud.test.product.web.mapper.MallProductMapper;
import springcloud.test.product.web.model.MallProduct;

@RestController
@RequestMapping("product")
public class ProductController {
	@Autowired
	private MallProductMapper mallProductMapper;
     
	@RequestMapping("/getProductByOrderId/{productIds}")
	public List<MallProduct> getProductByOrderId(@PathVariable("productIds") String productIds){
		System.out.println("===================productcontroller========"); 
		List<MallProduct> list =mallProductMapper.selectByIdSet(java.util.Arrays.asList(productIds.split(",")));
		return list;
	}
	
}
