package com.aatstdio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aatstdio.entities.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
