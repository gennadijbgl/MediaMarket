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

@WebServlet(urlPatterns = "/goods/add")
public class Add extends HttpServlet{

    @EJB
    private GoodsDao goodsDao;
    @EJB
    private CategoryDao categoryDao;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try{
            ArrayList<Category> categories = categoryDao.findAll();
            request.setAttribute("categories1", print(categories));
        }
        catch (Exception exception){
            request.getSession().setAttribute("message", handle(exception));
        }
        request.setAttribute("categories", categoryDao.findAll());
        request.setAttribute("page", "/pages/goods/add.jsp");
        request.getRequestDispatcher("/pages/shared/template.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        try{
            add(request);
        }
        catch (Exception exception){
            request.getSession().setAttribute("message", handle(exception));
        }
        response.sendRedirect("add");
    }

    protected void add(HttpServletRequest request)throws NumberFormatException, SQLException, EJBException, NullPointerException{
        Goods goods = Goods.getGoods(request);
        goodsDao.save(goods);

    }
}
