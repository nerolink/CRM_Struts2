package com.nerolink.server;

import com.nerolink.entity.CstCustomer;

import java.util.List;

/**
 * Created by nero on 2017/10/9.
 */
public interface CustomerServer {
    public void save(CstCustomer customer);
    public List<CstCustomer> getAll();
}
