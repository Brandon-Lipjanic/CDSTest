package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//This is what gets run when the app is first started.
@SpringBootApplication
public class CDsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CDsApplication.class, args);
    }

}
