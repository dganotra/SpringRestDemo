package com.gfg.deepanshu.SpringRestDemo.controller;

import com.gfg.deepanshu.SpringRestDemo.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.gfg.deepanshu.SpringRestDemo.UserData.userDataMap;

@RestController
public class UserContoller {

    @GetMapping("/users")
    public ArrayList<User> getUsers(){
        ArrayList users= new ArrayList<User>();
        users.addAll(userDataMap.values());
        return users;
    }

    @PostMapping("/user")
    public Boolean createUser(@RequestBody User user){
        if(userDataMap.containsKey(user.getId())){
            return false;
        } else{
            userDataMap.put(user.getId(), user);
            return true;
        }
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
            userDataMap.put(user.getId(), user);
            return userDataMap.get(user.getId());
    }

    @DeleteMapping("/user/{id}")
    public Boolean deleteUser(@PathVariable("id") Long id){
        if(userDataMap.containsKey(id)){
            userDataMap.remove(id);
            return true;
        } else{
            return false;
        }
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        if(userDataMap.containsKey(id)){
            return userDataMap.get(id);
        } else{
            return null;
        }
    }
}
