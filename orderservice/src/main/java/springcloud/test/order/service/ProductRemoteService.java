package springcloud.test.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "productservice")
public interface ProductRemoteService {
	@RequestMapping("product/getProductByOrderId/{productIds}")
	  public String getProductByOrderIds(@PathVariable("productIds") String productIds);
}
