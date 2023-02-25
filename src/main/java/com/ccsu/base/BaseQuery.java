package com.ccsu.base;

import lombok.Data;

/**
 * 用来测试分页查询的基础查询类
 * 其余条件查询可以继承此类
 */
@Data
public class BaseQuery {
    private Integer pageNum;
    private Integer pageSize;
}
