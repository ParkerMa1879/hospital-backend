package com.example.demo.interceptor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.example.demo.utils.jwt.JwtUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationInterceptor implements HandlerInterceptor {
//    @Autowired
//    UserService userService;


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception {
        try {
            if("OPTIONS".equals(httpServletRequest.getMethod().toString()))  //将vue中的第一次options请求放过
                return true;
            else {
                String token = httpServletRequest.getHeader("token");// 从 http 请求头中取出 token
                System.out.println("从head中取出token:" + token);
                JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(JwtUtil.getSecret())).build();
                jwtVerifier.verify(token);
                return true;
            }
        } catch (Exception e) {
            System.out.println("用户没有权限，访问被拒绝");
            return false;
        }

    }


    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}
