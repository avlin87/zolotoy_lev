package org.cafeM5.zolotoy_lev.domain.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

/**
 * Meal
 *
 * @author Aleksandr Liadov
 */
//@Entity
@Data
@Accessors(chain = true)
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String mealName;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Ingredient> ingredients;
}
