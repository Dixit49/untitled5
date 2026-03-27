package com.servlets;
import java.io.IOException;
import java.util.List;

import com.studentdata.Qns;
import com.studentdata.QnsDao;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import jakarta.servlet.annotation.WebServlet;

// code


@WebServlet("/questions")

public class Qnservlet extends HttpServlet{
    

        private QnsDao q1;

        @Override
        public void init() throws ServletException {
            ApplicationContext context =
                    new ClassPathXmlApplicationContext("config1.xml");

            q1 = context.getBean("qnsDaoimpl",QnsDao.class);
        }

        //@Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                throws ServletException, IOException {

            List<Qns> list = q1.getqn();
            System.out.println(list);
            req.getSession().setAttribute("questions", list);
            req.setAttribute("questions", list);

            req.getRequestDispatcher("index3.jsp").forward(req, resp);
        }
    }

