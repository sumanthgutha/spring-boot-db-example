package org.db.app.controller;

import org.db.app.entiry.Customer;
import org.db.app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/create")
    @ResponseBody
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/getAllCustomers")
    public List<Customer> getCustomerList() {
        return customerService.getCustomerList();
    }
}
