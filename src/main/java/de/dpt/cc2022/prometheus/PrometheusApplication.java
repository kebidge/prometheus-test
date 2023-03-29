package de.dpt.cc2022.prometheus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PrometheusApplication {

	final static Logger logger = LoggerFactory.getLogger(PrometheusApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PrometheusApplication.class, args);
	}

	@GetMapping("/trigger")
	public ResponseEntity<String> createLogs() {
		
		logger.warn("Trigger Warning");
		return ResponseEntity.ok().body("Warning Check completed!");
	}

}
