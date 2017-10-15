package com.nerolink.dao;

import com.nerolink.entity.CstCustomer;

import java.util.List;

/**
 * Created by nero on 2017/10/9.
 */
public interface CustomerDao {
    public void save(CstCustomer customer);

    public List<CstCustomer> getAll();

    public int getTotalNumber();
}
