package com.revature.caliber.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import com.netflix.appinfo.AmazonInfo;

@SpringBootApplication
@EnableEurekaServer
public class CaliberEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaliberEurekaApplication.class, args);
	}

// Disabled due to performance reasons also need to configure the aws secrets
//	@Bean
//	public EurekaInstanceConfigBean eurekaInstanceConfig(InetUtils inetUtils) {
//	  EurekaInstanceConfigBean b = new EurekaInstanceConfigBean(inetUtils);
//	  AmazonInfo info = AmazonInfo.Builder.newBuilder().autoBuild("eureka");
//	  b.setDataCenterInfo(info);
//	  return b;
//	}
}
