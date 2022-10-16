package com.countryservice.demo.repositories;

import com.countryservice.demo.beans.Country;
import org.springframework.data.jpa.repository.JpaRepository;

//first argument=pojo/bean/entity class name
//second argument=primary key data type from database
//Interface to Interface we extends
public interface CountryRepository extends JpaRepository<Country, Integer>
{
}
