package org.example.relationsjpa2.service;

import org.example.relationsjpa2.dao.entity.Customer;
import org.example.relationsjpa2.dao.repository.CustomerRepository;
import org.example.relationsjpa2.dto.CustomerDto;
import org.example.relationsjpa2.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public void add(CustomerDto dto){
       Customer customer = customerMapper.toEntity(dto);
       if(customer.getAccount()!=null){
           customer.getAccount().setCustomer(customer);
       }
        customerRepository.save(customer);
    }

    public List<CustomerDto> getAll(){
        List <Customer> customers = customerRepository.findAll();
        return customers.stream().map(customerMapper::toDto).collect(Collectors.toList());
    }

    public CustomerDto getById(Long id){
        return customerMapper.toDto(customerRepository.findById(id).orElseThrow());
    }

    public void delete(Long id){
        customerRepository.deleteById(id);
    }



//    public void add(CustomerDto dto){
//        Customer customer = customerMapper.toEntity(dto);
//        customerRepository.save(customer);
//
//    }
}
