package org.cafeM5.zolotoy_lev.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Ingredient
 *
 * @author Aleksandr Liadov
 */
@Entity
@Data
public class Ingredient {

    @Id
    private UUID id;
    private String ingredientName;
}
