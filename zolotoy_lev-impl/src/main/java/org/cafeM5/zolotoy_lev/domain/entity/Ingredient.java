package org.cafeM5.zolotoy_lev.domain.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Ingredient
 *
 * @author Aleksandr Liadov
 */
//@Entity
@Data
@Accessors(chain = true)
public class Ingredient {

    @Id
    private UUID id;
    private String ingredientName;
}
