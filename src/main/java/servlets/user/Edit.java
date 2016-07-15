package servlets.user;


import entities.User;
import service.RoleDao;
import service.UserDao;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import static servlets.Helper.handle;

@WebServlet(value = "/users/edit/*")
public class Edit extends HttpServlet {

    @EJB
    UserDao dao;
    @EJB
    RoleDao roleDao;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int number = new Integer(request.getParameter("id"));
        User item = dao.findById(number);
        request.setAttribute("item", item);
        request.setAttribute("page", "/pages/users/edit.jsp");

        request.setAttribute("roles", roleDao.findAll());

        request.getRequestDispatcher("/pages/shared/template.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try{
            edit(request);
        }
        catch (Exception exception){
            request.getSession().setAttribute("message", handle(exception));
        }
        response.sendRedirect("list");
    }

    protected void edit(HttpServletRequest request)throws NumberFormatException, SQLException, EJBException, NullPointerException{
        User item = User.getUser(request);
        dao.update(item) ;

    }
}
