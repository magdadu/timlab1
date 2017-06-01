package wat.edu.pl.Servlets;

import wat.edu.pl.LabelSingleton.LabelSingleton;
import wat.edu.pl.ParameterSingleton.ParameterSingleton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Magda on 25.05.2017.
 */
@WebServlet(name = "ConfigureServlet", urlPatterns = "/config")
public class ConfigureServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;");
        out = response.getWriter();
        //////////////////////////////////////////////////////////////
        Object checkbox = request.getParameter("checkbox");
        if (checkbox == null) {
            ParameterSingleton.setParameter("maleLitery", false);
        } else {
            ParameterSingleton.setParameter("maleLitery", true);
        }
        ////////////////////////////////////////////////////////////////
        Object checkbox1 = request.getParameter("checkbox1");
        if (checkbox1 == null) {
            ParameterSingleton.setParameter("maleNaglowki", false);
        } else {
            ParameterSingleton.setParameter("maleNaglowki", true);
        }
        ///////////////////////////////////////////////////////////////
        Object checkbox2 = request.getParameter("checkbox2");
        if (checkbox2 == null) {
            ParameterSingleton.setParameter("maleNazwa", false);
        } else {
            ParameterSingleton.setParameter("maleNazwa", true);
        }
        ////////////////////////////////////////////////////////////////
        Object checkbox3 = request.getParameter("checkbox3");
        if (checkbox3 == null) {
            ParameterSingleton.setParameter("malePrzycisk", false);
        } else {
            ParameterSingleton.setParameter("malePrzycisk", true);
        }
        ////////////////////////////////////////////////////////////////
        request.getRequestDispatcher("configure.jsp").forward(request, response);
        out.close();
    }
}
