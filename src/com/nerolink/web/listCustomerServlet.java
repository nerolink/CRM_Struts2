package com.nerolink.web;

import com.nerolink.entity.CstCustomer;
import com.nerolink.server.CustomerServerImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by nero on 2017/10/13.
 */
@WebServlet(name = "listCustomerServlet",urlPatterns = "/servlet/listCustomerServlet")
public class listCustomerServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CstCustomer> list;
        com.nerolink.server.CustomerServer customerServer = new CustomerServerImpl();
        list = customerServer.getAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("/jsp/customer/list.jsp").forward(request, response);
    }
}
