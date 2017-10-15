package com.nerolink.dao;

import com.nerolink.entity.CstCustomer;
import com.nerolink.utils.HBUtils;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by nero on 2017/10/9.
 */
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save(CstCustomer customer) {
        Session session = HBUtils.getOpenSession();
        session.save(customer);
    }

    public List<CstCustomer> getAll() {
        Session session = HBUtils.getCurrentSession();
        String hql = "from CstCustomer";
        Query query = session.createQuery(hql);
        return query.list();
    }

    @Override
    public int getTotalNumber() {
        String hql = "select count(*) from CstCustomer";
        Session session = HBUtils.getCurrentSession();
        Query query = session.createQuery(hql);
        return (int) (query.iterate().next());
    }
}
