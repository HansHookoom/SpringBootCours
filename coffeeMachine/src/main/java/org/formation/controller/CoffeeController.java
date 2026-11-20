package org.formation.controller;

import lombok.RequiredArgsConstructor;
import org.formation.dto.CoffeeDto;
import org.formation.entity.Coffee;
import org.formation.service.CoffeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CoffeeController {
    // http://localhost:8080

    private final CoffeeService service;

    @GetMapping("/coffees")
    List<CoffeeDto> coffees(){
        return service.allCoffees();
    }
}
