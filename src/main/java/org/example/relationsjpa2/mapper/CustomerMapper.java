package org.example.relationsjpa2.mapper;

import org.example.relationsjpa2.dao.entity.Customer;
import org.example.relationsjpa2.dto.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    Customer toEntity(CustomerDto dto);
    CustomerDto toDto(Customer entity);
}
