package genes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import javax.servlet.http.HttpSession;

@RestController
@SpringBootApplication

public class Application {
	@Autowired
	HttpSession sessioon;
	
	
	public static void main(String[] args) {
		System.getProperties().put("server.port", 4222);
		SpringApplication.run(Application.class);
	}
}