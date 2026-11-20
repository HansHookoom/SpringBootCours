package org.formation.service;

import org.formation.dto.CoffeeDto;
import org.formation.entity.Coffee;

import java.util.List;
import java.util.Optional;

public interface CoffeeService {

    List<CoffeeDto> allCoffees();
    Optional<Coffee> getCoffee(Long id);
}
