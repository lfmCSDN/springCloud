package com.ty.acctservice.mapper;

import org.apache.ibatis.annotations.Param;
import po.TransListInfo;

import java.math.BigDecimal;
import java.util.List;

/**
 * create by Lfm
 * on 2018-04-12 20:29
 */
public interface TransListMapper {
    /*增加交易信息*/
    void addTransList(@Param("transListInfoId") String transListInfoId, @Param("cardBaseInfoId") String cardBaseInfoId, @Param("serialNumber") String serialNumber, @Param("transAmount") BigDecimal transAmount, @Param("transType") String transType, @Param("merchandiseDate") String merchandiseDate);

    List<TransListInfo> getObjectByForeignKey(@Param("cardBaseInfoId") String cardBaseInfoId, @Param("startTime") String startTime, @Param("endTime") String endTime);
}
