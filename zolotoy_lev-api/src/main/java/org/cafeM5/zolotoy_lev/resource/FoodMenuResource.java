package org.cafeM5.zolotoy_lev.resource;

import org.cafeM5.zolotoy_lev.dto.FoodMenuDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * FoodMenu
 *
 * @author Aleksandr Liadov
 */

@RequestMapping("/foodmenu")
public interface FoodMenuResource {

    @GetMapping("/{id}")
    FoodMenuDto getFoodMenu(@PathVariable UUID id);

    @PostMapping
    FoodMenuDto saveFoodMenu(@RequestBody FoodMenuDto foodMenuDto);

    @PutMapping
    FoodMenuDto updateCustomer(@RequestBody FoodMenuDto customerDto);

    @DeleteMapping("/{id}")
    void deleteCustomer(@PathVariable UUID id);

    @GetMapping
    List<FoodMenuDto> getAllCustomers();
}
