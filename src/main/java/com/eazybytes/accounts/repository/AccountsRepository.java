package com.eazybytes.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eazybytes.accounts.entity.Accounts;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {

}
