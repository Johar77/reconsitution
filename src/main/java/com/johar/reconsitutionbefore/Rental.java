package com.johar.reconsitutionbefore;

import lombok.*;

/**
 * @ClassName: Rental
 * @Description: TODO
 * @Auther: Johar
 * @Date: 2019/7/27 08:07
 * @Version: 1.0
 */
@Data
@Setter
@Getter
@Builder
@AllArgsConstructor
public class Rental {
    private Movie movie;
    private int dayRented;
}
