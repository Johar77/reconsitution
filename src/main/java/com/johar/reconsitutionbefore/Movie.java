package com.johar.reconsitutionbefore;

import lombok.*;

/**
 * @ClassName: Movie
 * @Description: TODO
 * @Auther: Johar
 * @Date: 2019/7/27 08:03
 * @Version: 1.0
 */
@Data
@Builder
@Setter
@Getter
@AllArgsConstructor
public class Movie {
    public static final int CHILDRENS =2;
    public static final int REGULAR =0;
    public static final int NEW_RELEASE =1;

    private String title;
    private int priceCode;
}
