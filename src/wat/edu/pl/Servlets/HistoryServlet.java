package wat.edu.pl.Servlets;

import wat.edu.pl.Logger.LoggerSingleton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Magda on 24.05.2017.
 */
@WebServlet(name = "HistoryServlet", urlPatterns = "/historia")
public class HistoryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        java.io.PrintWriter out = response.getWriter();
        String historia = LoggerSingleton.getHistory();
        request.setAttribute("historia", historia);
        request.getRequestDispatcher("history.jsp").forward(request, response);
        out.close();
    }
}
