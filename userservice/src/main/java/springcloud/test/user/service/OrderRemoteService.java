package springcloud.test.user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "orderservice")
public interface OrderRemoteService {
	@RequestMapping("order/getProductByUserAndOrders/{userId}")
	  public String getPByUserOrders(@PathVariable("userId") String userId);
}
