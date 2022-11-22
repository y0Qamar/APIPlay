package org.dream.firstAPI.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiController {

    //When someone goes this route, this mapping says this method is gon run
    @GetMapping(value = "/")

    public String getPage() {
        return "Hello from our API";
    }

}
