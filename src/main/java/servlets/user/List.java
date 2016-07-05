package servlets.user;

import entities.User;
import service.UserDao;
import servlets.user.Login;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Hienadz on 30.06.16.
 */
@WebServlet(name = "List",urlPatterns = "/users/list")
public class List extends HttpServlet {
    @EJB
    UserDao userDao;




    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("itemsArray",  userDao.findAll().toArray());
        request.setAttribute("page", "/pages/users/list.jsp");
        request.getRequestDispatcher("/pages/shared/template.jsp").forward(request, response);

    }

}


