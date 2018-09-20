package com.github.rawsanj;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringCurrencyApplication {

	private static final Log logger = LogFactory.getLog(SpringCurrencyApplication.class);

	@Value("${GOOGLE_APPLICATION_CREDENTIALS}")
	String path;

	public static void main(String[] args) {
		SpringApplication.run(SpringCurrencyApplication.class, args);
	}

//	@Bean
//	ApplicationRunner applicationRunner(){
//		return args -> {
//
//            System.out.println("Starting Application......!" + path);
//
//			logger.info("Starting Application......!");
//
//			//read file into stream, try-with-resources
//			try (Stream<String> stream = Files.lines(Paths.get(path))) {
//
//				stream.forEach(System.out::println);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//
//		};
//	}
	
}
