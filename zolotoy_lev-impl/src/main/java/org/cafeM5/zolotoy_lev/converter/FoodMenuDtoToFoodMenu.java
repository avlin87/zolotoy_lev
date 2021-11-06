package org.cafeM5.zolotoy_lev.converter;

import org.cafeM5.zolotoy_lev.domain.entity.FoodMenu;
import org.cafeM5.zolotoy_lev.dto.FoodMenuDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * FoodMenuDtoToFoodMenu
 *
 * @author Aleksandr Liadov
 */
@Component
public class FoodMenuDtoToFoodMenu implements Converter<FoodMenuDto, FoodMenu> {

    @Override
    public FoodMenu convert(FoodMenuDto foodMenuDto) {
        var foodMenu = new FoodMenu();
        foodMenu.setId(foodMenuDto.getId())
                .setMenuName(foodMenuDto.getMenuName())
                .setCreationDate(new Date());
        return foodMenu;
    }
}