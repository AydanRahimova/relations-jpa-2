package org.example.relationsjpa2.mapper;

import org.example.relationsjpa2.dao.entity.Account;
import org.example.relationsjpa2.dto.AccountDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    AccountDto toDto(Account entity);
    Account toEntity(AccountDto dto);
}
