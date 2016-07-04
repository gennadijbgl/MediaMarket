package servlets.category;

import service.CategoryDao;
import service.GoodsDao;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/categories/list")
public class List extends HttpServlet{

    @EJB
    private CategoryDao categoryDao;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.setAttribute("itemsArray", categoryDao.findAll().toArray());
        request.setAttribute("page", "/pages/categories/list.jsp");
        request.getRequestDispatcher("/pages/shared/template.jsp").forward(request, response);


    }




}
