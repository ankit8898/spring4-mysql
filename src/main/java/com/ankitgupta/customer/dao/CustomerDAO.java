package com.ankitgupta.customer.dao;

import com.ankitgupta.customer.model.Customer;

public interface CustomerDAO
{
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}
