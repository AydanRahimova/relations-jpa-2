package org.example.relationsjpa2.controller;

import org.example.relationsjpa2.dao.entity.Customer;
import org.example.relationsjpa2.dto.CustomerDto;
import org.example.relationsjpa2.mapper.CustomerMapperImpl;
import org.example.relationsjpa2.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addCustomer(@RequestBody CustomerDto dto){
        customerService.add(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id){
        customerService.delete(id);
    }

    @GetMapping
    public List<CustomerDto> getAll(){
        return customerService.getAll();
    }

    @GetMapping("/{id}")
    public CustomerDto get(@PathVariable Long id){
        return customerService.getById(id);
    }
}
