package com.example.interceptor;

import com.example.entity.AyUser;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author dongshi
 */
public class LoginIntercetor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session=request.getSession();
        AyUser user=(AyUser) session.getAttribute("user");
        if(user==null){
            //重定向到登录页面
            response.sendRedirect(request.getContextPath()+"/login");
            return false;
        }

        return true;
    }
}
