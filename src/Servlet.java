import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "Servlet",urlPatterns = "/display_discount")
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String des = request.getParameter("description");
        Double price = Double.parseDouble(request.getParameter("price"));
        Double percent = Double.parseDouble(request.getParameter("discount_percent"));
        Double Amount =price * percent * 0.1;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Description: " +des+"<br>");
        writer.println("price: " +price+"<br>");
        writer.println("Result: "+Amount+"<br>");
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
