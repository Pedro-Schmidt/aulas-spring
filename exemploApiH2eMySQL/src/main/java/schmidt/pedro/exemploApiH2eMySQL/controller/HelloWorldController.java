package schmidt.pedro.exemploApiH2eMySQL.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Seja bem vindo ao sistema!";
    }

//    @RequestMapping("/")
//    public ResponseEntity<String> index() {
//        return new ResponseEntity<String>("Seja bem vindo ao server do Cury", new HttpHeaders(), HttpStatus.OK);
//    }

}
