package com.ty.adminservice.feignImpl;

import com.ty.adminservice.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import po.UserAdminInfo;
import qo.UserAdminInfoQo;
import qo.UserOperInfoQo;
import vo.UserOperInfoVo;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminFeignImpl {
    @Autowired
    private AdminService adminService;

    //登录
    @RequestMapping("/login")
    public UserAdminInfo login(@RequestBody UserAdminInfoQo adm) {
        String name = adm.getAdminName();
        String password = adm.getAdminPwd();
        UserAdminInfo admin = adminService.login(name, password);
        return admin;
    }

    /*
    添加操作员
    */
    @RequestMapping("/addOperator")
    public String addOperator(@RequestBody UserOperInfoVo userOperInfoVo) {
        return adminService.addOperator(userOperInfoVo);
    }

    /*
    删除操作员
     */
    @RequestMapping("/deleteOperator")
    public String deleteOperator(@RequestBody UserOperInfoQo userOperInfoQo) {
        return adminService.deleteOperator(userOperInfoQo);
    }

    /*
    查询操作员
     */
    @RequestMapping("/getOperator")
    public List<UserOperInfoVo> getOperator(@RequestBody UserOperInfoQo userOperInfoQo) {
        return adminService.getOperator(userOperInfoQo);
    }

    /*
    修改操作员
     */
    @RequestMapping("/updateOperator")
    public String updateOperator(@RequestBody UserOperInfoVo userOperInfoVo) {
        return adminService.updateOperator(userOperInfoVo);
    }
}
