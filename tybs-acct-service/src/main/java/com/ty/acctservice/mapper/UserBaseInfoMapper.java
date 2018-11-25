package com.ty.acctservice.mapper;

import org.apache.ibatis.annotations.Param;
import po.UserBaseInfo;

/**
 * User:jiaw.j
 * Date:2018/4/4 0004
 */
public interface UserBaseInfoMapper {

    UserBaseInfo getObjectByPrimarykey(@Param("userBaseInfoId") String userBaseInfoId);
}
