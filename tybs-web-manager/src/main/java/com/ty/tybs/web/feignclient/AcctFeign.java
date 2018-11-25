package com.ty.tybs.web.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import qo.TransListInfoQo;
import vo.CardBaseInfoVo;
import vo.TransListInfoVo;

import java.util.List;

/**
 * User:jiaw.j
 * Date:2018/4/4 0004
 */
@FeignClient("zuul-servers")
@Service
public interface AcctFeign {

    @RequestMapping("/acct/acct/transfer")
    String transfer(@RequestBody CardBaseInfoVo cardBaseInfoVo);

    @RequestMapping("/acct/acct/bankSaving")
    String bankSaving(@RequestBody CardBaseInfoVo cardBaseInfoVo);

    @RequestMapping("/acct/acct/drawMoney")
    String drawMoney(@RequestBody CardBaseInfoVo cardBaseInfoVo);

    @RequestMapping("/acct/acct/getTransList")
    List<TransListInfoVo> getTransList(@RequestBody TransListInfoQo transListInfoQo);

    @RequestMapping("/acct/acct/transferByMoney")
    String transferByMoney(@RequestBody CardBaseInfoVo cardBaseInfoVo);


}
