package com.snowy.southwind.dao;

import com.snowy.southwind.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @auther snowy
 * @date 2020/2/3 - 19:40
 */
@Repository
public interface UserMappero {
    User userLogin(@Param("username")String username,@Param("password")String password);
}
