package lyons.order.service;

import java.util.List;

import lyons.order.entity.Order;
import lyons.service.publicService;

/**
 * 
 * 订单接口
 * @author  lyons(zhanglei)
 */
public interface OrderService extends publicService
{
    /** 根据用户名与商品关键字查询订单 **/
    public List<Order> orderListByKeyName(Order order);
    /** 查询当前用户订单列表 **/
    public List<Order> orderList(String userName);
    /** 查询所有用户订单列表 **/
    public List<Order> orderAllList();
    
    
    /** 删除单个订单 By id **/
    public void deleteOrderOneById(String id);
    /** 批量删除订单 By ids **/
    public void deleteOrderBatch(String[] ids);
}
