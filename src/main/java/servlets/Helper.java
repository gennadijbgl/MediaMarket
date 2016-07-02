package servlets;



import javax.ejb.EJBException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.fasterxml.jackson.databind.ObjectMapper;


public  class Helper {

    static void print(Object object, HttpServletResponse response)throws IOException, NullPointerException{
        response.setContentType("application/json");
        PrintWriter printWriter = response.getWriter();
        String jsonInString = print(object);
        printWriter.print(jsonInString);
        printWriter.close();
    }

    static public Date parseDate(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date parsed = format.parse(date);
        return new Date(parsed.getTime());
    }

    static public String handle(Exception exception) throws IOException{
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

    static public String print(Object object)throws IOException, NullPointerException{
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(object);
    }
}
