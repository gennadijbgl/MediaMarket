package servlets;

import entities.User;
import service.UserDao;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name="Index",urlPatterns = {"/index"})
public class Index extends HttpServlet {
    @EJB
    UserDao userDao;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{


        List<User> persons = userDao.findAll();

        // Attach persons to the Model

        request.setAttribute("persons", persons.toArray());

        request.setAttribute("page", "/pages/index.jsp");
        request.getRequestDispatcher("/pages/shared/template.jsp").forward(request, response);
    }

}