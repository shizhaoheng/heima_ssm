package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author : shi zhao heng
 * @Date :   2021/2/5 17:22
 * @Description :
 */
public interface ITravellerDao {

    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{ordersId})")
    public List<Traveller> findByOrdersId(String ordersId) throws Exception;
}
