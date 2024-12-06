package com.jwt.authentication.services;
import com.jwt.authentication.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {


    private List<User> store = new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(), "Rahul Ranjan", "rahulranjan2818@gmail.com" ));
        store.add(new User(UUID.randomUUID().toString(), "Utkarsh Raj", "utkarsh@gmail.com" ));
        store.add(new User(UUID.randomUUID().toString(), "Raina Barnwal", "raina@gmail.com" ));
        store.add(new User(UUID.randomUUID().toString(), "Aakash Sinha", "aakash@gmail.com" ));
    }


    public List<User> getUsers(){
        return this.store;
    }

}
