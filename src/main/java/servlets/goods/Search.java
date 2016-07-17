package servlets.goods;

import entities.Category;
import entities.Goods;
import service.CategoryDao;
import service.GoodsDao;

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

/**
 * Created by Hienadz on 17.07.16.
 */

@WebServlet(urlPatterns = "/goods/search")
public class Search extends HttpServlet {

    @EJB
    private GoodsDao goodsDao;
    @EJB
    private CategoryDao categoryDao;



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String title = request.getParameter("title");

        request.setAttribute("itemsArray", goodsDao.findByTitle(title));
        request.setAttribute("page", "/pages/goods/list.jsp");
        request.getRequestDispatcher("/pages/shared/template.jsp").forward(request, response);

    }

}
