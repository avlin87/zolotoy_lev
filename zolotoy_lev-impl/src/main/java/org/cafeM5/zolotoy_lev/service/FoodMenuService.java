package org.cafeM5.zolotoy_lev.service;

import org.cafeM5.zolotoy_lev.domain.entity.FoodMenu;

import java.util.List;
import java.util.UUID;

/**
 * FoodMenuService
 *
 * @author Aleksandr Liadov
 */
public interface FoodMenuService {

    FoodMenu find(UUID Id);

    FoodMenu save(FoodMenu foodMenu);

    FoodMenu update(FoodMenu foodMenu);

    boolean delete(int orderId);

    List<FoodMenu> getAll();
}
