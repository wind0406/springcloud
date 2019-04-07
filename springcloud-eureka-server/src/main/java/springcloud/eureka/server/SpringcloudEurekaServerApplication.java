package springcloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaServerApplication {
  /**
   * 服务注册
   * @param args
   */
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaServerApplication.class, args);
	}

}
