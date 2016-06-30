package servlets;

import entities.User;
import service.UserDao;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import java.io.IOException;

@WebServlet(urlPatterns = "/index")

public class Index extends HttpServlet {
    @EJB
    UserDao userDao;

    @Transactional
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

        User t = (User) userDao.findById(1).get(0);




        User s = new User("sf","sf",0,"asgf");

        userDao.save(s);


        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

}