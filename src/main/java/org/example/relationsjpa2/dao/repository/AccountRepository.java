package org.example.relationsjpa2.dao.repository;

import org.example.relationsjpa2.dao.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {

}
