package wat.edu.pl.Servlets;

import org.eclipse.persistence.descriptors.ReturningPolicy;
import wat.edu.pl.Logger.LoggerSingleton;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Magda on 23.05.2017.
 */
@WebServlet(name = "BMIServlet", urlPatterns = "/bmi")
public class BMIServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out;
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;");
        out = response.getWriter();
        float height = Float.parseFloat(request.getParameter("height"));
        float weight = Float.parseFloat(request.getParameter("weight"));
        float bmi = (weight * 10000 / (height * height));
        String result;
        out.println("Twoje BMI wynosi: " + bmi);
        if (bmi < 18.0) {
            result = "Twoja waga jest poniżej prawidłowej:(";
        } else if (bmi > 25) {
            result = "Twoja waga jest powyżej prawidłowej:(";
        } else {
            result = "Twoja waga jest prawidłowa! :)";
        }
        //LoggerSingleton.getLogger().log(Level.INFO, Float.toString(height) + Float.toHexString(weight) + Float.toString(bmi));
        LoggerSingleton.writeToFile(" height: " + Float.toString(height) +
                " weight: " + Float.toString(weight)
                + " BMI: " + Float.toString(bmi));
        request.setAttribute("bmi", bmi);
        request.setAttribute("weight", weight);
        request.setAttribute("height", height);
        request.setAttribute("result", result);
        request.getRequestDispatcher("bmiResult.jsp").forward(request, response);
        out.close();
    }
}
