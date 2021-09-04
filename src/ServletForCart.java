import somePackage.Cart;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ServletForCart")
public class ServletForCart extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        String name = request.getParameter("name");
        Integer quantity = Integer.parseInt(request.getParameter("quantity"));
        if (cart == null) {
            cart = new Cart();
            cart.setName(name);
            cart.setQuantity(quantity);
            session.setAttribute("cart", cart);

        }
//        else {
//
//
//        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/ShowCart.jsp");
        dispatcher.forward(request, response);
    }
}
