package com.yang.controller;

import com.yang.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("/all")
    @CrossOrigin(origins = "*") //*允许所有域名的访问
    public Object findAll(){
        int i = 10;
        List<User> userList = new LinkedList<User>();
        for (int i1 = 0; i1 < 10; i1++) {
            User user = new User();
            user.setId(i1);
            user.setUsername("张三" + i1);
            user.setAge(i1 + 10);
            userList.add(user);
        }
        Map map = new HashMap();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", 10);
        map.put("data", userList);
        return map;
    }
}
