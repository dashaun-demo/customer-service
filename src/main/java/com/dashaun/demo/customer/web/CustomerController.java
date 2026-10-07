package com.dashaun.demo.customer.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/api/customers")
    public String customers() {
        return "[{\"id\":\"C-1001\",\"name\":\"Dana Rivera\"},"
                + "{\"id\":\"C-1002\",\"name\":\"Marcus Chen\"}]";
    }

    @GetMapping("/api/customers/{id}")
    public String customer(@PathVariable String id) {
        return "{\"id\":\"" + id + "\",\"name\":\"Dana Rivera\","
                + "\"memberSince\":\"2016-03-14\",\"tier\":\"PREFERRED\","
                + "\"address\":{\"city\":\"San Antonio\",\"state\":\"TX\"}}";
    }
}
