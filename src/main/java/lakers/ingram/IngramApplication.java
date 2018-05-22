package lakers.ingram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class IngramApplication
{
    @RequestMapping("/")
    String index()
    {
        return "Hello Spring Boot";
    }

	public static void main(String[] args)
    {
		SpringApplication.run(IngramApplication.class, args);
	}
}



