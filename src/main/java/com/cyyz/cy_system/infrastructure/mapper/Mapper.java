package com.cyyz.cy_system.infrastructure.mapper;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * @Author: SHZ
 * @Description:定制版MyBatis Mapper插件接口，如需其他接口参考官方文档自行添加。
 * @Date: Created in 2018-03-22 20:08
 */
public interface Mapper<T>
        extends
        BaseMapper<T>,
        ConditionMapper<T>,
        IdsMapper<T>,
        InsertListMapper<T> {
}

