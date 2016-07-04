package servlets.roles;

import service.CategoryDao;
import service.GoodsDao;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/goods/list")
public class List extends HttpServlet{

    @EJB
    private GoodsDao goodsDao;
    @EJB
    private CategoryDao categoryDao;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.setAttribute("itemsArray", goodsDao.findAll().toArray());
        request.setAttribute("page", "/pages/goods/list.jsp");
        request.getRequestDispatcher("/pages/shared/template.jsp").forward(request, response);


    }




}
