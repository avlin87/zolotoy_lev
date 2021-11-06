package org.cafeM5.zolotoy_lev.repository;

import org.cafeM5.zolotoy_lev.domain.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * MealRepository
 *
 * @author Aleksandr Liadov
 */
@Repository
public interface MealRepository extends JpaRepository<Meal, UUID> {
}
