package com.cvs.ews.ere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.test.binder.TestSupportBinderAutoConfiguration;

@SpringBootApplication(exclude = TestSupportBinderAutoConfiguration.class)
@EnableStubRunnerServer
@EnableBinding
@EnableDiscoveryClient
public class EreStubRunnerBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EreStubRunnerBootApplication.class, args);
	}

	@AutoConfigureStubRunner
	static class Config {}
}

