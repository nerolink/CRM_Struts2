package com.nerolink.utils;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by nero on 2017/10/9.
 */
public class HBUtils {
    private static SessionFactory sf;

    static {
        //1 创建,调用空参构造
        Configuration conf = new Configuration().configure();
        //2 根据配置信息,创建 SessionFactory对象
        sf = conf.buildSessionFactory();
    }

    public static Session getOpenSession() {
        return sf.openSession();
    }

    public static Session getCurrentSession() {
        return sf.getCurrentSession();
    }
}
