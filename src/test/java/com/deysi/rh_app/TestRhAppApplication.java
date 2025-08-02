package com.deysi.rh_app;

import org.springframework.boot.SpringApplication;

public class TestRhAppApplication {

	public static void main(String[] args) {
		SpringApplication.from(RhAppApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
