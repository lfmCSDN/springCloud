package com.ty.operatorservice.mapper;

import org.apache.ibatis.annotations.Param;
import po.UserBaseInfo;
import qo.UserAndCardQo;
import qo.UserBaseInfoQo;
import vo.UserAndCardVo;
import vo.UserBaseInfoVo;

import java.util.List;

/**
 * create by Lfm
 * on 2018-04-07 12:25
 */
public interface UserBaseInfoMapper {

    UserBaseInfo getObjectByPrimarykey(String userBaseInfoid);

    UserBaseInfo getObjectByCardId(String userCardId);
    /*查询账户*/
    List<UserAndCardVo> getUserByIdCard(@Param("userAndCardQo") UserAndCardQo userAndCardQo);

    List<UserBaseInfoVo> getAcct(@Param("userBaseInfoQo") UserBaseInfoQo userBaseInfoQo);

    void modifyTelUser(@Param("userBaseInfoQo") UserBaseInfoQo userBaseInfoQo);
    /*用户基本信息*/
    void addUserBaseInfo(@Param("userAndCardVo") UserAndCardVo userAndCardVo);

}
