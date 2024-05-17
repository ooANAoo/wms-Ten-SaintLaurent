package com.sh.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PurchaseListDto {
    private int orderNum;
    private List<ItemDto> itemDto;
    private int userId;
    private int outboundNum;
    private Date orderDate;

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public List<ItemDto> getItemDto() {
        return itemDto;
    }

    public void setItemDto(List<ItemDto> itemDto) {
        this.itemDto = itemDto;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOutboundNum() {
        return outboundNum;
    }

    public void setOutboundNum(int outboundNum) {
        this.outboundNum = outboundNum;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}