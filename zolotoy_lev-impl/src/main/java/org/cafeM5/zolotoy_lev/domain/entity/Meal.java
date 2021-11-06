package org.cafeM5.zolotoy_lev.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

/**
 * Meal
 *
 * @author Aleksandr Liadov
 */
@Entity
@Data
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String mealName;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Ingredient> ingredients;
}
