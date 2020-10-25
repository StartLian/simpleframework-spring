package com.jessica.controller;

import com.jessica.controller.frontend.MianPageController;
import com.jessica.controller.superadmin.HeadlIneOperationController;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
@Slf4j
public class DispatcherServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servletPath = req.getServletPath();
        String method = req.getMethod();
        log.info("servletPath="+servletPath+",method="+method);
        if (servletPath=="/frontend/getmianpageinfo"&& method=="GET"){
            new MianPageController().getMianPageinfoDTO(req, resp);
        }else if (servletPath=="/superadmin/addheadline"&& method=="POST"){
            new HeadlIneOperationController().addHeadLine(req, resp);
        }
    }
}
