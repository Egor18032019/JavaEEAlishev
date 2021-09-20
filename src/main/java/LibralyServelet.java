import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class LibralyServelet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();

        try {
            System.out.println("еще раз отдельно подключаем драйвер");
            Class.forName("org.postgresql.Driver"); // еще раз отдельно подключаем драйвер
//            DriverManager.registerDriver(new org.postgresql.Driver());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // создем подклюение
        try {
            System.out.println("создем подклюение");
            Connection conn = DriverManager.getConnection
                    ("jdbc:postgresql://localhost:5000/java_ee_db", "postgres", "222324");
            System.out.println("Создали");

            Statement sttm = conn.createStatement();
            System.out.println("Фильтруем");
            ResultSet rs = sttm.executeQuery("Select title from books");
            pw.println("<html>");
            pw.println("<h1> From sql: </h1>");
            pw.println("<ul>");

            while (rs.next()) {

            pw.println("<li>");
                pw.println(rs.getString("title"));
            pw.println("</li>");
            }
            pw.println("</ul>");
            pw.println("</html>");
            sttm.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

