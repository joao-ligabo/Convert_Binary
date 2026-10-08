package com.joao_ligabo.binary.converter;

import com.joao_ligabo.binary.converter.principal.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BinaryConverterApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BinaryConverterApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Main main = new Main();
    }
}
