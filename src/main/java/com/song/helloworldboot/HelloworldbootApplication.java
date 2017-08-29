package com.song.helloworldboot;

import com.song.helloworldboot.property.HomeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldbootApplication implements CommandLineRunner{

	@Autowired
	private HomeProperties homeProperties;
	public static void main(String[] args) {
		SpringApplication.run(HelloworldbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n" + homeProperties.toString());
		System.out.println();
	}
}
