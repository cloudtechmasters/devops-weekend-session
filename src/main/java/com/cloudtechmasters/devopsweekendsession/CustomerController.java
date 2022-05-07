package com.cloudtechmasters.devopsweekendsession;

import com.cloudtechmasters.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {
    //create a customer
    @PostMapping("/createnewcustomer")
    public  String createNewCustomer(@RequestBody Customer customer){
        return "customer created";
    }


    //list all customers
    @GetMapping("/listallcustomers")
    public List<Customer> getAllCustomers(){
        return Arrays.asList(new Customer("vamsi","001","INDIA","AP","retail"));
    }
    
    //list all customers
    @GetMapping("/listallcustomersupdated")
    public List<Customer> getAllUpdatedCustomers(){
        return Arrays.asList(new Customer("vamsiupdated","001","INDIA","AP","retail"));
    }

}
