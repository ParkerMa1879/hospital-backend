package com.example.demo.login;


import com.auth0.jwt.interfaces.Claim;
import com.example.demo.utils.jwt.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class LoginController {
    @Autowired
    UserRepository userRepository;

    UserWithToken userwithtoken = new UserWithToken();



    @PostMapping("/user/login")
    @ResponseBody
    public ResponseEntity<Object> login(@RequestBody UserInfo requestUser) {
        try{
            String username = requestUser.getUsername();
            String password = requestUser.getPassword();
            Optional<UserInfo> user = userRepository.findById(username);
            if(user.equals(Optional.empty())){
                Map<String,String> message = new HashMap<>();
                message.put("info","NoUser");
                return new ResponseEntity<>(message,HttpStatus.OK);
            }
            else if(user.get().getPassword().equals(password)) {
                String token = JwtUtil.createToken(requestUser);
                UserInfo userinfo = user.get();
                System.out.println(userinfo);
                userwithtoken.setUserToken(userinfo,token);
                System.out.println(userwithtoken.toString());
                return new ResponseEntity<>(userwithtoken,HttpStatus.OK);
            }else{
                Map<String,String> message = new HashMap<>();
                message.put("info","WrongPassword");
                return new ResponseEntity<>(message,HttpStatus.OK);
        }}catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/user/info")
    @ResponseBody
    public ResponseEntity<UserWithToken> getUserInfo(@RequestBody Map<String,String> data){
        try{
            System.out.println(data);
            String token = data.get("token");
            System.out.println(data);
            Map<String, Claim> claims = JwtUtil.verifyToken(token);
            Claim claim = claims.get("username");
            String username = claim.asString();
            Optional<UserInfo> user = userRepository.findById(username);
            UserInfo userinfo = user.get();
            userwithtoken.setUserToken(userinfo,token);
            System.out.println(userwithtoken.toString());
            return new ResponseEntity<>(userwithtoken,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/user/logout")
    @ResponseBody
    public ResponseEntity<Object> logout(@RequestBody Map<String,String> data){
        Map<String,String> message = new HashMap<>();
        message.put("info","LogOut");
        return new ResponseEntity<>(message,HttpStatus.OK);
    }





}
