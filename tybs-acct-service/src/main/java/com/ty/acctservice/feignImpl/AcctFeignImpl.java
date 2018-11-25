package com.ty.acctservice.feignImpl;

import com.ty.acctservice.service.AcctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import qo.TransListInfoQo;
import vo.CardBaseInfoVo;
import vo.TransListInfoVo;

import java.util.List;

/**
 * User:jiaw.j
 * Date:2018/4/4 0004
 */
@RestController
@RequestMapping("/acct")
public class AcctFeignImpl {

    @Autowired
    AcctService acctService;

    @RequestMapping("/bankSaving")
    public String bankSaving(@RequestBody CardBaseInfoVo cardBaseInfoVo) {
        return acctService.bankSaving(cardBaseInfoVo);
    }

    @RequestMapping("/transfer")
    public String transfer(@RequestBody CardBaseInfoVo cardBaseInfoVo) {
        return acctService.transfer(cardBaseInfoVo);
    }

    @RequestMapping("/transferByMoney")
    public String transferByMoney(@RequestBody CardBaseInfoVo cardBaseInfoVo) {
        return acctService.transferByMoney(cardBaseInfoVo);
    }

    @RequestMapping("/drawMoney")
    public String drawMoney(@RequestBody CardBaseInfoVo cardBaseInfoVo) {
        return acctService.drawMoney(cardBaseInfoVo);
    }

    @RequestMapping("/getTransList")
    public List<TransListInfoVo> getTransList(@RequestBody TransListInfoQo transListInfoQo) {
        return acctService.getTransList(transListInfoQo);
    }
}
