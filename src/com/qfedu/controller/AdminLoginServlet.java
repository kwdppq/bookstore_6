package com.qfedu.controller;

import com.qfedu.entity.User;
import com.qfedu.service.AdminLoginService;
import com.qfedu.service.impl.AdminLoginServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        ServletContext servletContext = request.getServletContext();
        AdminLoginService adminLoginService = new AdminLoginServiceImpl();

        String adminname = request.getParameter("adminname");
        String password = request.getParameter("password");
        User user1 = new User();
        user1.setUsername(adminname);
        user1.setPassword(password);
        int i = adminLoginService.selectOne(user1);
        if (i>=1) {
            response.sendRedirect(servletContext.getContextPath()+"/adminjsps/admin/index.jsp");
        } else {
            response.sendRedirect(servletContext.getContextPath()+"/adminjsps/login.jsp");
        }
    }
}
