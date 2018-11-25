package com.ty.adminservice.mapper;


import org.apache.ibatis.annotations.Param;
import po.UserAdminInfo;
import po.UserOperInfo;
import qo.UserOperInfoQo;
import vo.UserOperInfoVo;

import java.util.List;


/**
 * create by Lfm
 * on 2018-03-18 12:00
 */

public interface AdminMapper {

    UserAdminInfo getUser(@Param("adminName") String adminName, @Param("adminPwd") String adminPwd);

    UserOperInfo getObjectByIdCard(@Param("operCardId") String operCardId);

    UserOperInfo getObjectByPrimarykey(@Param("userOperInfoId") String userOperInfoId);

    UserOperInfo getObjectByName(@Param("operName") String operName);

    List<UserOperInfoVo> getOperator(@Param("userOperInfoQo") UserOperInfoQo userOperInfoQo);

    void deleteOperator(@Param("userOperInfoId") String userOperInfoId);

    void updateOperator(@Param("userOperInfoVo") UserOperInfoVo userOperInfoVo);

    void addOperator(@Param("userOperInfoVo") UserOperInfoVo userOperInfoVo);


}
