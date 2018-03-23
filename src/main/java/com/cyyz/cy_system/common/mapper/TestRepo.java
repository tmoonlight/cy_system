package com.cyyz.cy_system.common.mapper;

import com.cyyz.cy_system.domain.*;
import org.apache.ibatis.annotations.*;
import java.util.List;

/**
 * @Author: SHZ
 * @Description:
 * @Date: Created in 2018-03-22 12:21
 */
public interface TestRepo  {
    @Select("SELECT * FROM sa_stampquote")
    List<sa_StampQuote> CGetAllList();

    @Delete("DELETE FROM sa_stampquote WHERE id =#{id}")
    void delete(Long id);
}

