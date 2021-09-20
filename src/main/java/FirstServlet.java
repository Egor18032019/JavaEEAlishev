import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String nameLocal = request.getLocalName();
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        HttpSession session = request.getSession();
        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            session.setAttribute("count", 1);
            count = 1;
        } else {
            System.out.println(count);
            count++;
            session.setAttribute("count", count);

        }

        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h1> Hello bro " + name + " " + surname + "</h1>");
        pw.println("<h2> You know  " + nameLocal + " ? </h2>");
        pw.println("<h3> You here  " + count + " ? </h3>");
        pw.println("</html>");


    }
}
