package servlets.goods;

import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.text.ParseException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/goods/add")
public class Add extends HttpServlet{

    @EJB
    private GoodsDao goodsDao;
    @EJB
    private CategoryDao categoryDao;

    protected String print(Object object)throws IOException, NullPointerException{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(object);
    }
    protected String handle(Exception exception) throws IOException{
        if (exception instanceof SQLException){
            return "Произошла ошибка при работе с базой данных";
        }
        if (exception instanceof ParseException){
            return "Ошибка преобразования формата даты";
        }
        if (exception instanceof NumberFormatException){
            return "Ошибка формата данных";
        }
        if (exception instanceof NullPointerException){
            return "Ошибка при передаче данных";
        }
        if (exception instanceof EJBException){
            return "Невозможно выполнить запрос к базе";
        }
        return "Ошибка выполнения";
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try{
            ArrayList<Category> categories = categoryDao.findAll();
            request.setAttribute("categories", print(categories));
        }
        catch (Exception exception){
            request.getSession().setAttribute("message", handle(exception));
        }
        request.getRequestDispatcher("/pages/goods/add.jsp").forward(request, response);
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
        String message = goodsDao.saveGoods(goods) == 1 ? "Товар успешно добавлен" : "Ошибка добавления в базу данных";
        request.getSession().setAttribute("message", message);
    }
}
