package com.navis.advisor;

import com.navis.advisor.bean.N4HealthLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AdvisorApplication {

	private List<N4HealthLog> logEntries = new ArrayList<>();

	@Bean
	public List<N4HealthLog> n4LogEntries() {
		logEntries.add(new N4HealthLog() {
			{ setCpu("10"); setFreeMemory("7033 MB"); setAmqMemoryPercentUsage("0");}
		});
		logEntries.add(new N4HealthLog() {
			{ setCpu("25"); setFreeMemory("8000 MB"); setAmqMemoryPercentUsage("0");}
		});
		return logEntries;
	}

	public static void main(String[] args) {
		SpringApplication.run(AdvisorApplication.class, args);
	}
}
