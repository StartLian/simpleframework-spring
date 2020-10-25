package com.jessica;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
//@Slf4j
public class HelloServlet extends HttpServlet {
    Logger log = LoggerFactory.getLogger(HelloServlet.class);

    @Override
    public void init() throws ServletException {
       log.info("init()");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("service");
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        String name ="我的简易框架";
        log.debug("name %s",name);
        req.setAttribute("name",name);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp");
        requestDispatcher.forward(req,resp);
        return;
    }

    @Override
    public void destroy() {
        log.info("destroy()");
    }
}

