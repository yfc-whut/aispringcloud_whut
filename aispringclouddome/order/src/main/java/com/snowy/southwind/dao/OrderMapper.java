package com.snowy.southwind.dao;

import com.snowy.southwind.bean.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @auther snowy
 * @date 2020/2/5 - 22:13
 */
@Repository
public interface OrderMapper {
    /*保存订单*/
    void save(Order order);
    /*根据用户查询订单*/
    List <Order> findAllByUid(long uid, int index, int limit);
    /*根据用户查询订单数量*/
    int countByUid(long uid);
    /*管理员删除订单*/
    void deleteByMid(long mid);
    /*用户删除订单*/
    void deleteByUid(long uid);
    /*根据订单状态查询所有*/
    List<Order> findAllByState(int index,int limit);
    /*根据订单状态查询条数*/
    int countByState();
    /*修改订单状态*/
    void updateState(long id,long aid);
}
