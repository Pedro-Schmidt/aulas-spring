package schmidt.pedro.exemploLombok.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import schmidt.pedro.exemploLombok.model.Client;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Exemplo Lombok";
    }



//    @GetMapping("/product")
//    public String getProduct() {
//        return "Objeto produto";
//    }

}
