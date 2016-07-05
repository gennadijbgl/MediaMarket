package servlets.roles;

import service.CategoryDao;
import service.GoodsDao;
import service.RoleDao;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/roles/list")
public class List extends HttpServlet{

    @EJB
    private RoleDao dao;



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.setAttribute("itemsArray", dao.findAll().toArray());
        request.setAttribute("page", "/pages/roles/list.jsp");
        request.getRequestDispatcher("/pages/shared/template.jsp").forward(request, response);


    }




}
