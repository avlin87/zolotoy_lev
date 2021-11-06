package org.cafeM5.zolotoy_lev.resource.impl;

import lombok.RequiredArgsConstructor;
import org.cafeM5.zolotoy_lev.converter.FoodMenuDtoToFoodMenu;
import org.cafeM5.zolotoy_lev.converter.FoodMenuToFoodMenuDto;
import org.cafeM5.zolotoy_lev.domain.entity.FoodMenu;
import org.cafeM5.zolotoy_lev.dto.FoodMenuDto;
import org.cafeM5.zolotoy_lev.resource.FoodMenuResource;
import org.cafeM5.zolotoy_lev.service.FoodMenuService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * FoodMenuResourceImpl
 *
 * @author Aleksandr Liadov
 */
@RestController
@RequiredArgsConstructor
public class FoodMenuResourceImpl implements FoodMenuResource {

    private final FoodMenuService foodMenuService;
    private final FoodMenuToFoodMenuDto toFoodMenuDto;
    private final FoodMenuDtoToFoodMenu toFoodMenu;

    @Override
    public FoodMenuDto getFoodMenu(UUID id) {
        FoodMenu foodMenu = foodMenuService.find(id);
        return toFoodMenuDto.convert(foodMenu);
    }

    @Override
    public FoodMenuDto saveFoodMenu(FoodMenuDto foodMenuDto) {
        FoodMenu foodMenu = toFoodMenu.convert(foodMenuDto);
        FoodMenu savedFoodMenu = foodMenuService.save(foodMenu);
        foodMenuDto = toFoodMenuDto.convert(savedFoodMenu);
        return foodMenuDto;
    }

    @Override
    public FoodMenuDto updateCustomer(FoodMenuDto customerDto) {
        return null;
    }

    @Override
    public void deleteCustomer(UUID id) {

    }

    @Override
    public List<FoodMenuDto> getAllCustomers() {
        return null;
    }
}
