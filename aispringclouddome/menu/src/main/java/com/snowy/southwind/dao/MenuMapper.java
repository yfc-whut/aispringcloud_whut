package com.snowy.southwind.dao;

import com.snowy.southwind.bean.Menu;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @auther snowy
 * @date 2020/1/19 - 22:13
 */
@Repository
public interface MenuMapper {
    List< Menu > findAll(Integer index, Integer limit);
    Integer count();
    Menu findById(long id);
    void save(Menu menu);
    void update(Menu menu);
    void deleteById(long id);

}
