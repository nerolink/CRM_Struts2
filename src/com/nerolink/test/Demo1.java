package com.nerolink.test;

import com.nerolink.entity.CstCustomer;
import com.nerolink.utils.HBUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.List;

/**
 * Created by nero on 2017/10/9.
 */
public class Demo1 {
    @Test
    public void test1() {
        Session session = HBUtils.getOpenSession();
        Transaction transaction = session.beginTransaction();
        for (int i = 0; i < 100; i++) {
            CstCustomer customer = new CstCustomer();
            customer.setCustName("nero" + i);
            session.save(customer);
        }
        transaction.commit();
    }

    @Test
    public void test2() {
        Session session = HBUtils.getOpenSession();
        Transaction transaction = session.beginTransaction();
        String hql = "from CstCustomer where id < ?";
        Query<CstCustomer> query = session.createQuery(hql);
        query.setParameter(0, 104l);
        List<CstCustomer> res = query.list();
        for (CstCustomer c:res
             ) {
            System.out.println(c.getCustName());
        }
    }
}
