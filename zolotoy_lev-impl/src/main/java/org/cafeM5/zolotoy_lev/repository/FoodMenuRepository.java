package org.cafeM5.zolotoy_lev.repository;

import org.cafeM5.zolotoy_lev.domain.entity.FoodMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * FoodMenuRepository
 *
 * @author Aleksandr Liadov
 */
@Repository
public interface FoodMenuRepository extends JpaRepository<FoodMenu, UUID> {
}