package com.vuclip.naive.bayes.analyser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.vuclip")
public class AnalyserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnalyserApplication.class, args);
	}
}
