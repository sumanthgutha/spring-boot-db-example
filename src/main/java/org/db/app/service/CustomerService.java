package org.db.app.service;

import org.db.app.entiry.Customer;

import java.util.List;

public interface CustomerService {

    Customer saveCustomer(Customer customer);

    List<Customer> getCustomerList();
}
