package org.cafeM5.zolotoy_lev.domain.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * FoodMenu
 *
 * @author Aleksandr Liadov
 */
@Entity
@Data
@Accessors(chain = true)
public class FoodMenu {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    private String menuName;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    /*@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "menuMeal",
            joinColumns = @JoinColumn(name = "foodMenuId"),
            inverseJoinColumns = @JoinColumn(name = "mealId"))
    private List<Meal> meals;*/
}
