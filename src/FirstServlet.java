import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String nameLocal = request.getLocalName();
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        PrintWriter pw =response.getWriter();
        pw.println("<html>");
        pw.println("<h1> Hello bro " +name + " " +surname+"</h1>");
        pw.println("<h2> You know  " +nameLocal +" ? </h1>");

        pw.println("</html>");
    }
}
