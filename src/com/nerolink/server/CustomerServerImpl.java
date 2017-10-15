package com.nerolink.server;

import com.nerolink.dao.CustomerDao;
import com.nerolink.dao.CustomerDaoImpl;
import com.nerolink.entity.CstCustomer;
import com.nerolink.utils.HBUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by nero on 2017/10/9.
 */
public class CustomerServerImpl implements CustomerServer {
    @Override
    public void save(CstCustomer customer) {
        Session session = HBUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        CustomerDao dao = new CustomerDaoImpl();
        try{
            dao.save(customer);
        }
        catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
        transaction.commit();
    }

    @Override
    public List<CstCustomer> getAll() {
        Session session = HBUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        try {
            CustomerDao dao = new CustomerDaoImpl();
            return dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
        }
        return null;
    }
}
