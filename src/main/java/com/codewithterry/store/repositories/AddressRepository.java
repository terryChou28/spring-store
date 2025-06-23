package com.codewithterry.store.repositories;

import com.codewithterry.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}