package com.ty.acctservice.service;

import qo.TransListInfoQo;
import vo.CardBaseInfoVo;
import vo.TransListInfoVo;

import java.util.List;

/**
 * User:jiaw.j
 * Date:2018/4/4 0004
 */
public interface AcctService {

    List<TransListInfoVo> getTransList(TransListInfoQo transListInfoQo);

    String bankSaving(CardBaseInfoVo cardBaseInfoVo);

    String transfer(CardBaseInfoVo cardBaseInfoVo);

    String drawMoney(CardBaseInfoVo cardBaseInfoVo);

    String transferByMoney(CardBaseInfoVo cardBaseInfoVo);
}
