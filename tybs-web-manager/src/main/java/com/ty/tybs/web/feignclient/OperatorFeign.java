package com.ty.tybs.web.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import po.UserOperInfo;
import qo.UserAndCardQo;
import qo.UserBaseInfoQo;
import qo.UserOperInfoQo;
import vo.CardBaseInfoVo;
import vo.UserAndCardVo;
import vo.UserBaseInfoVo;

import java.util.List;

/**
 * create by Lfm
 * on 2018-04-06 10:45
 */
@FeignClient("zuul-servers")
@Service
public interface OperatorFeign {
    //登录操作员
    @RequestMapping("/operator/operator/login")
    UserOperInfo login(@RequestBody UserOperInfoQo operator);

    //账户开通
    @RequestMapping("/operator/operator/addUser")
    String addUser(@RequestBody UserAndCardVo userAndCardVo);

    // 注销账户
    @RequestMapping("/operator/operator/deleteUser")
    String deleteUser(@RequestBody UserAndCardVo userAndCardVo);

    //查询账户和账户
    @RequestMapping("/operator/operator/getUser")
    List<UserAndCardVo> getUser(@RequestBody UserAndCardQo userAndCardQo);

    //查询账户
    @RequestMapping("/operator/operator/getAcct")
    List<UserBaseInfoVo> getAcct(@RequestBody UserBaseInfoQo userBaseInfoQo);

    //冻结账户
    @RequestMapping("/operator/operator/freezeUser")
    String freezeUser(@RequestBody UserAndCardVo userAndCardVo);

    // 挂失账户
    @RequestMapping("/operator/operator/lostUser")
    String lostUser(@RequestBody UserAndCardVo userAndCardVo);

    //解挂账户
    @RequestMapping("/operator/operator/upLostUser")
    String upLostUser(@RequestBody UserAndCardVo userAndCardVo);

    //解冻账户
    @RequestMapping("/operator/operator/upFreezeUser")
    String upFreezeUser(@RequestBody UserAndCardVo userAndCardVo);

    //修改密码
    @RequestMapping("/operator/operator/modifyPwd")
    String modifyPwd(@RequestBody CardBaseInfoVo cardBaseInfoVo);

    //修改账户信息
    @RequestMapping("/operator/operator/modifyUser")
    String modifyUser(@RequestBody UserBaseInfoQo userBaseInfoQo);

    //重置密码
    @RequestMapping("/operator/operator/resetPwd")
    String resetPwd(@RequestBody CardBaseInfoVo cardBaseInfoVo);


}
