package com.fayne.j2ee.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by WangZezhou(301255) on 2017/8/2
 */

@WebServlet(name = "ServletView",urlPatterns = "/ServletView",
        initParams = @WebInitParam(name="name",value = "123456",description = "description"))
public class MyServletView extends HttpServlet{

    private final static Logger logger = LogManager.getLogger();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

            logger.trace("A==a23");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // Write some content
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Fayne's Servlet Demo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Hello Fayne!!!</h2>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
