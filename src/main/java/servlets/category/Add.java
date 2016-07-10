package servlets.category;


import entities.Category;
import service.CategoryDao;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import static servlets.Helper.handle;
import static servlets.Helper.print;

@WebServlet(value = "/categories/add")
public class Add extends HttpServlet {

    @EJB
    CategoryDao dao;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try{
            ArrayList<Category> categories = dao.findAll();
            request.setAttribute("categories", print(categories));
        }
        catch (Exception exception){
            request.getSession().setAttribute("message", handle(exception));
        }
        request.setAttribute("page", "/pages/categories/add.jsp");
        request.getRequestDispatcher("/pages/shared/template.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try{
            add(request);
        }
        catch (Exception exception){
            request.getSession().setAttribute("message", handle(exception));
        }
        response.sendRedirect("list");
    }

    protected void add(HttpServletRequest request)throws NumberFormatException, SQLException, EJBException, NullPointerException{
        Category category = Category.getCategory(request);
        dao.save(category);
    }
}
