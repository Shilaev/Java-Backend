package ru.shilaev.testjavaeeproject;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h1>Hello, " + name + "</h1>");
        printWriter.println("</html>");

//        response.sendRedirect("https://www.youtube.com/watch?v=lesNd-lqUiM");
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("TacoPage.jsp");
//        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
