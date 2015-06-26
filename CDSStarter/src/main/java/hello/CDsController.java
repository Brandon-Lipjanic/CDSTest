package hello;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;

@Controller
public class CDsController {

    //This is what maps the JSON to the root page.
    @RequestMapping(value = "/")
    public ResponseEntity<Greeting> get() {
        Greeting greeting = new Greeting();
        return new ResponseEntity<Greeting>(greeting, HttpStatus.OK);
    }
}
