package com.nerolink.entity;

import javax.persistence.*;

/**
 * Created by nero on 2017/10/9.
 */
@Entity
@Table(name = "cst_customer", schema = "crm", catalog = "")
public class CstCustomer {
    private long custId;
    private String custName;
    private String custSource;
    private String custLevel;
    private String custPhone;
    private String custMobile;
    private String custLinkman;

    @Id
    @Column(name = "cust_id")
    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    @Basic
    @Column(name = "cust_name")
    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    @Basic
    @Column(name = "cust_source")
    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    @Basic
    @Column(name = "cust_level")
    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    @Basic
    @Column(name = "cust_phone")
    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    @Basic
    @Column(name = "cust_mobile")
    public String getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile;
    }

    @Basic
    @Column(name = "cust_linkman")
    public String getCustLinkman() {
        return custLinkman;
    }

    public void setCustLinkman(String custLinkman) {
        this.custLinkman = custLinkman;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CstCustomer customer = (CstCustomer) o;

        if (custId != customer.custId) return false;
        if (custName != null ? !custName.equals(customer.custName) : customer.custName != null) return false;
        if (custSource != null ? !custSource.equals(customer.custSource) : customer.custSource != null) return false;
        if (custLevel != null ? !custLevel.equals(customer.custLevel) : customer.custLevel != null) return false;
        if (custPhone != null ? !custPhone.equals(customer.custPhone) : customer.custPhone != null) return false;
        if (custMobile != null ? !custMobile.equals(customer.custMobile) : customer.custMobile != null) return false;
        if (custLinkman != null ? !custLinkman.equals(customer.custLinkman) : customer.custLinkman != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (custId ^ (custId >>> 32));
        result = 31 * result + (custName != null ? custName.hashCode() : 0);
        result = 31 * result + (custSource != null ? custSource.hashCode() : 0);
        result = 31 * result + (custLevel != null ? custLevel.hashCode() : 0);
        result = 31 * result + (custPhone != null ? custPhone.hashCode() : 0);
        result = 31 * result + (custMobile != null ? custMobile.hashCode() : 0);
        result = 31 * result + (custLinkman != null ? custLinkman.hashCode() : 0);
        return result;
    }
}
