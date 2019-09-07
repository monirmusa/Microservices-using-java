package com.example.convocationregistration;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConvocationRegistrationRepository extends CrudRepository<ConvocationRegistration,Long> {
    List<ConvocationRegistration> findAllByName(String name);

}
