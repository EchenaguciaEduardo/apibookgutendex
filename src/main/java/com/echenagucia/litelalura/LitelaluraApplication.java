package com.echenagucia.litelalura;

import com.echenagucia.litelalura.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.lang.model.element.Name;

@SpringBootApplication
public class LitelaluraApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LitelaluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();

	}
}
