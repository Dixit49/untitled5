package com.servlets;
import com.studentdata.Qns;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.List;

@WebServlet("/submitAnswers")
public class SubmitServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        List<Qns> list = (List<Qns>) req.getSession().getAttribute("questions");

        int score = 0;
        int i = 1;

        for (Qns q : list) {

            String userAnswer = req.getParameter("q" + i);


            if (userAnswer != null && userAnswer.equals(q.getAns())) {
                score++;
            }

            i++;
        }

       
        req.setAttribute("score", score);
        req.setAttribute("total", list.size());

        RequestDispatcher rd = req.getRequestDispatcher("index4.jsp");
        rd.forward(req, resp);
    }
}
