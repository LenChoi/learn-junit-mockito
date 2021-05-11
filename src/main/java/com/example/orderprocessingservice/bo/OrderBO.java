package com.example.orderprocessingservice.bo;

import com.example.orderprocessingservice.exception.BOException;
import com.example.orderprocessingservice.dto.Order;

public interface OrderBO {

    boolean placeOrder(Order order) throws BOException;

    boolean cancelOrder(int id) throws BOException;

    boolean deleteOrder(int id) throws BOException;
}
