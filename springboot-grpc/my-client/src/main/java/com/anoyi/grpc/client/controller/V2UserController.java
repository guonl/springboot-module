package com.anoyi.grpc.client.controller;


import com.hubo.security.service.rpc.UserServiceByProtoStuff;
import com.hubo.security.vo.rpc.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/v2/user")
public class V2UserController {

    private final UserServiceByProtoStuff userServiceByProtoStuff;

    @PostMapping("/add")
    public UserEntity insertUser(@RequestBody UserEntity userEntity){
        userServiceByProtoStuff.insert(userEntity);
        return userEntity;
    }

    @GetMapping("/list")
    public List<UserEntity> findAllUser(){
        return userServiceByProtoStuff.findAll();
    }

    @PostMapping("/remove")
    public String removeUser(@RequestParam("id") Long id){
        userServiceByProtoStuff.deleteById(id);
        return "success";
    }

}
