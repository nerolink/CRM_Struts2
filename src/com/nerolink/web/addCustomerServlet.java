package com.nerolink.web;

import com.nerolink.entity.CstCustomer;
import com.nerolink.server.CustomerServerImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by nero on 2017/10/9.
 */
@WebServlet(name = "addCustomerServlet",urlPatterns = {"/servlet/addCustomerServlet"})
public class addCustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CstCustomer customer = new CstCustomer();
        try {
            BeanUtils.populate(customer, req.getParameterMap());
            com.nerolink.server.CustomerServer server = new CustomerServerImpl();
            server.save(customer);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
