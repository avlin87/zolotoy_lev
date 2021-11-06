package org.cafeM5.zolotoy_lev.resource;

import org.cafeM5.zolotoy_lev.dto.MealDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

/**
 * MealResource
 *
 * @author Aleksandr Liadov
 */
@RequestMapping("/meal")
public interface MealResource {

    MealDto getMeal(@PathVariable UUID id);
}
