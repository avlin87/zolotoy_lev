package org.cafeM5.zolotoy_lev.service.impl;

import lombok.RequiredArgsConstructor;
import org.cafeM5.zolotoy_lev.domain.entity.FoodMenu;
import org.cafeM5.zolotoy_lev.repository.FoodMenuRepository;
import org.cafeM5.zolotoy_lev.service.FoodMenuService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * FoodMenuServiceImpl
 *
 * @author Aleksandr Liadov
 */
@Service
@RequiredArgsConstructor
public class FoodMenuServiceImpl implements FoodMenuService {

    private final FoodMenuRepository foodMenuRepository;

    @Override
    public FoodMenu find(UUID id) {
        Optional<FoodMenu> optionalFoodMenu = foodMenuRepository.findById(id);
        if (optionalFoodMenu.isPresent()) {
            return optionalFoodMenu.get();
        }
        throw new RuntimeException("FoodMenu no found");
    }

    @Override
    public FoodMenu save(FoodMenu foodMenu) {
        Optional<FoodMenu> optionalFoodMenu = Optional.of(foodMenuRepository.save(foodMenu));
        if (optionalFoodMenu.isPresent()) {
            foodMenu = optionalFoodMenu.get();
            return foodMenu;
        }
        throw new RuntimeException("FoodMenu not saved");
    }

    @Override
    public FoodMenu update(FoodMenu foodMenu) {
        return null;
    }

    @Override
    public boolean delete(int orderId) {
        return false;
    }

    @Override
    public List<FoodMenu> getAll() {
        return null;
    }
}
