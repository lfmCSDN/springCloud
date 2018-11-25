package com.ty.operatorservice.mapper;

import org.apache.ibatis.annotations.Param;
import po.CardBaseInfo;
import vo.UserAndCardVo;

import java.math.BigDecimal;
import java.util.List;

/**
 * create by Lfm
 * on 2018-04-07 12:19
 */
public interface CardBaseInfoMapper {


    CardBaseInfo getObjectByCardId(String cardId);

    CardBaseInfo getObjectByForeignKey(@Param("userBaseInfoId") String userBaseInfoId, @Param("cardType") String cardType);

    List<CardBaseInfo> getObjectByKey(@Param("userBaseInfoId") String userBaseInfoId);

    void addCardBaseInfo(@Param("userAndCardVo") UserAndCardVo userAndCardVo);

    void lostUser(@Param("userCardId") String userCardId);

    void freezeUser(@Param("userCardId") String userCardId);

    void delCardById(@Param("cardBaseInfoId") String cardBaseInfoId);

    void upLostUser(@Param("userCardId") String userCardId);

    void upFreezeUser(@Param("userCardId") String userCardId);

    void modifyPwd(@Param("transPwd1") String transPwd1, @Param("cardId") String cardId);

    void resetPwd(@Param("resetDefault") String resetDefault, @Param("cardId") String cardBaseInfoId);

}
