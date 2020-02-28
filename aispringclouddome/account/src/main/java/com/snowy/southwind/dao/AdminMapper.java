package com.snowy.southwind.dao;

import com.snowy.southwind.bean.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @auther snowy
 * @date 2020/2/3 - 19:38
 */
@Repository
public interface AdminMapper {
    Admin adminLogin(@Param("username")String username, @Param("password")String password);
}
