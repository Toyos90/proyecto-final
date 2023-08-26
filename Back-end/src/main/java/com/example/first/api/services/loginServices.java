package com.example.first.api.services;

import com.example.first.api.models.loginModel;
import com.example.first.api.repositories.loginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class loginServices {

    @Autowired
    private loginRepository myRepo;

    //https://www.logicbig.com/tutorials/spring-framework/spring-data/query-by-example.html

    public loginModel tryLogin(loginModel myLogin) {

        loginModel userOK=myRepo.findByUserEmailAndUserPassword(myLogin.getUserEmail(), myLogin.getUserPassword());

        if(userOK!=null){
            return userOK;
        }
        else return null;

//        if(myRepo.findOne(myLogin).isPresent()){
//            return myRepo.findOne(myLogin).get();
//        }
//        else {
//            return null;
//        }
    }

    public loginModel addNewUser(loginModel newData) {
        try{
            return myRepo.save(newData);
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
