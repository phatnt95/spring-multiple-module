package phatnt95.github.io.springmultiplemodulesayhello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@SpringBootApplication
public class SpringMultipleModuleSayHelloApplication {

	private static Logger log = LoggerFactory.getLogger(SpringMultipleModuleSayHelloApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringMultipleModuleSayHelloApplication.class, args);
	}

	@GetMapping("/greeting")
	public String greet() {
		log.info("Access /greeting");

		List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
		Random rand = new Random();

		int randomNum = rand.nextInt(greetings.size());
		return greetings.get(randomNum);
	}

	@GetMapping("/")
	public String home() {
		log.info("Access /");
		return "Hi!";
	}

}
