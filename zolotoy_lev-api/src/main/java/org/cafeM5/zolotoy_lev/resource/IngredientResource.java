package org.cafeM5.zolotoy_lev.resource;

import org.cafeM5.zolotoy_lev.dto.IngredientDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

/**
 * IngredientResource
 *
 * @author Aleksandr Liadov
 */
@RequestMapping("/ingredient")
public interface IngredientResource {

    IngredientDto getIngredient(@PathVariable UUID id);
}
