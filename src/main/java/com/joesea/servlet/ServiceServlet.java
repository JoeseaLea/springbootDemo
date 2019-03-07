package com.joesea.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>@author : Joesea Lea</p>
 * <p>@date : 2019/3/7</p>
 * <p>@description : </p>
 */
@WebServlet(name="serviceServlet", urlPatterns = "/*")
public class ServiceServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("hello world");

        resp.getWriter().append("hello wold");
        resp.getWriter().flush();
    }
}
