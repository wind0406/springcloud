package springcloud.test.user.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springcloud.test.user.service.OrderRemoteService;
import springcloud.test.user.web.mapper.SysUserMapper;
import springcloud.test.user.web.model.SysUser;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private SysUserMapper sysUserMapper;
	@Autowired
	private OrderRemoteService orderRemoteService;
     
	@RequestMapping("/getUser/{name}/{pwd}")
	public SysUser getUser(@PathVariable("name") String userName,@PathVariable("pwd") String userPwd){
		System.out.println("===================start12========"); 
		SysUser sysUser = sysUserMapper.selectByParam(userName, userPwd);
		return sysUser;
	}
	@RequestMapping("/addUser")
	public int addUser(@RequestBody SysUser sysUser) {
		int resultFlag = sysUserMapper.insert(sysUser);
		return resultFlag;
	}
	@RequestMapping("/getUserProductByOrder/{userId}")
	public String getUserProductByOrder(@PathVariable("userId") String userId) {
		return orderRemoteService.getPByUserOrders(userId);
	}
}
