package com.learning.address.repository;

import com.learning.address.model.AddressRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressRequest, Long> {
}
