package wat.edu.pl.Servlets;

import com.sun.xml.ws.org.objectweb.asm.Label;
import wat.edu.pl.LabelSingleton.LabelSingleton;
import wat.edu.pl.Logger.LoggerSingleton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;

/**
 * Created by Magda on 25.05.2017.
 */
@WebServlet(name = "EditLabelServlet", urlPatterns = "/edit")
public class EditLabelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;");
        out = response.getWriter();
        LabelSingleton.setLabel("height", request.getParameter("height"));
        LabelSingleton.setLabel("weight", request.getParameter("weight"));
        LabelSingleton.store();
        request.getRequestDispatcher("editLabels.jsp").forward(request, response);
        out.close();
    }
}
