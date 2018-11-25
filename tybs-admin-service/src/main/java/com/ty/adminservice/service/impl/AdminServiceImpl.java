package com.ty.adminservice.service.impl;


import com.ty.adminservice.mapper.AdminMapper;
import com.ty.adminservice.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import po.UserAdminInfo;
import po.UserOperInfo;
import qo.UserOperInfoQo;
import utils.Md5Util;
import vo.UserOperInfoVo;

import java.util.List;

/**
 * create by Lfm
 * on 2018-03-18 12:05
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public UserAdminInfo login(String username, String password) {
        return adminMapper.getUser(username, password);
    }

    @Override
    public String addOperator(UserOperInfoVo userOperInfoVo) {
        try {
            String pwd = Md5Util.encodeByMd5(userOperInfoVo.getLoginPwd());
            userOperInfoVo.setLoginPwd(pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        UserOperInfo operInfo= adminMapper.getObjectByPrimarykey(userOperInfoVo.getUserOperInfoId());
        if (operInfo != null) {
            return "该操作员号已经存在！";
        } else {
            UserOperInfo operInfoOfCardId = adminMapper.getObjectByIdCard(userOperInfoVo.getOperCardId());
            if (operInfoOfCardId != null) {
                return "该身份证号已开通操作员！";
            } else {
                UserOperInfo operInfoOfname = adminMapper.getObjectByName(userOperInfoVo.getOperName());
                if (operInfoOfname!=null) {
                    return "该操作员姓名已存在，请重新输入操作员姓名！";
                } else {
                    adminMapper.addOperator(userOperInfoVo);
                }
            }
        }
        return "操作员添加成功！";
    }

    @Override
    public List<UserOperInfoVo> getOperator(UserOperInfoQo userOperInfoQo) {
        return adminMapper.getOperator(userOperInfoQo);
    }

    @Override
    public String deleteOperator(UserOperInfoQo userOperInfoQo) {
        adminMapper.deleteOperator(userOperInfoQo.getUserOperInfoId());
        return "操作员已注销，将不能进行其它操作！";
    }

    @Override
    public String updateOperator(UserOperInfoVo userOperInfoVo) {
        adminMapper.updateOperator(userOperInfoVo);
        return "操作员信息修改成功！";
    }
}
