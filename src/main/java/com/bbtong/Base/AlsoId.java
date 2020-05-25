package com.bbtong.Base;

import lombok.Data;

/**
 * 查询待还单的ID 和 待还单用户的ID
 */

@Data
public class AlsoId {
    /**
     * 待还单的ID
     */
    private Integer newEntrustId;

    /**
     * 待还单用户的ID
     */
    private Integer userId;
}
