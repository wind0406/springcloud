package springcloud.test.order.web.controller;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springcloud.test.order.service.ProductRemoteService;
import springcloud.test.order.web.mapper.MallOrderMapper;

@RestController
@RequestMapping("order")
public class OrderController {
	@Autowired
	private MallOrderMapper mallOrderMapper;
	@Autowired
	private ProductRemoteService productRemoteService;
     
	@RequestMapping("/getProductByUserAndOrders/{userId}")
	public String getProductByUserAndOrders(@PathVariable("userId") String userId){
		System.out.println("===================ordercontroller========"); 
		List<String> list =mallOrderMapper.selectOrderByUserId(userId);
		String aString = StringUtils.join(list, ",");
		return productRemoteService.getProductByOrderIds(aString);
	}
	
}
