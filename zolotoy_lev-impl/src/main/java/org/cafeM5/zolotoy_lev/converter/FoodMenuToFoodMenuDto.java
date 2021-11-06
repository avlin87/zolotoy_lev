package org.cafeM5.zolotoy_lev.converter;

import org.cafeM5.zolotoy_lev.domain.entity.FoodMenu;
import org.cafeM5.zolotoy_lev.dto.FoodMenuDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * FoodMenuToFoodMenuDto
 *
 * @author Aleksandr Liadov
 */
@Component
public class FoodMenuToFoodMenuDto implements Converter<FoodMenu, FoodMenuDto> {

    @Override
    public FoodMenuDto convert(FoodMenu foodMenu) {
        var foodMenuDto = new FoodMenuDto();
        foodMenuDto.setId(foodMenu.getId())
                .setMenuName(foodMenu.getMenuName())
                .setCreationDate(foodMenu.getCreationDate());
        return foodMenuDto;
    }
}
