package servlets;

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
@WebServlet(name = "List",urlPatterns = "/list")
public class List extends HttpServlet {
    @EJB
    UserDao userDao;




    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        java.util.List<User> persons = userDao.findAll();

        // Attach persons to the Model

        request.setAttribute("persons", persons.toArray());

        request.getRequestDispatcher("pages/index.jsp").forward(request, response);




    }


    }


