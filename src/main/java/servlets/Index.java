package servlets;

import entities.User;
import service.UserDao;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/index")

public class Index extends HttpServlet {
    @EJB
    UserDao userDao;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
       User s = new User("sf","sf",0,"asgf");

        userDao.save(s);

        userDao.findByUsername("sf").get(0);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

}