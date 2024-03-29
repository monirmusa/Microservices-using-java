package bd.edu.seu.gradeentries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GradeEntriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradeEntriesApplication.class, args);
	}

}
