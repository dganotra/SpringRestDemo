package com.gfg.deepanshu.SpringRestDemo;

import com.gfg.deepanshu.SpringRestDemo.model.User;

import java.util.HashMap;

public class UserData {

    public static HashMap<Long, User> userDataMap = new HashMap<Long, User>();

    static {

        userDataMap.put(0L, new User(0L, "Deepanshu", "Ganotra"));
        userDataMap.put(1L, new User(1L, "Ramesh", "Singh"));
        userDataMap.put(2L, new User(2L, "Suresh", "Singh"));
        userDataMap.put(3L, new User(3L, "Rod", "Johnson"));
    }
}
