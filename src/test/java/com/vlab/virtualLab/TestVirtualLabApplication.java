package com.vlab.virtualLab;

import org.springframework.boot.SpringApplication;

public class TestVirtualLabApplication {

	public static void main(String[] args) {
		SpringApplication.from(VirtualLabApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
