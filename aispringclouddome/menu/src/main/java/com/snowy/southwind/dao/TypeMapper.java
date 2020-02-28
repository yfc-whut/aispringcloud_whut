package com.snowy.southwind.dao;

import com.snowy.southwind.bean.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther snowy
 * @date 2020/1/20 - 21:47
 */
@Repository
public interface TypeMapper {
    Type findById(Integer id);
    List<Type> findAll();
}
