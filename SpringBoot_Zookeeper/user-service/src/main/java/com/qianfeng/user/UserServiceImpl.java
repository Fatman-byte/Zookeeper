package com.qianfeng.user;

import org.springframework.stereotype.Service;
import com.qianfeng.user.service.UserService;
/**
 * author:刘强
 * date:2019/9/1819:59
 * description:业务逻辑代码
 */
@Service
public class UserServiceImpl implements UserService{

    @Override
    public String getName(String name) {
        return "Fengge.....xxxxxL&"+name+".jpg";
    }
}
