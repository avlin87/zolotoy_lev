package org.cafeM5.zolotoy_lev.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.UUID;

/**
 * FoodMenuDto
 *
 * @author Aleksandr Liadov
 */
@Data
@Accessors(chain = true)
public class FoodMenuDto {

    private UUID id;
    private String menuName;
    private Date creationDate;
}
