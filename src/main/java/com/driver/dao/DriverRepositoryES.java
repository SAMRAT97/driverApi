package com.driver.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.driver.entities.Driver;


@Repository
public interface DriverRepositoryES extends ElasticsearchRepository<Driver, String>

{

	@Query("select d from Driver d")
	List<Driver> findAllDrivers(Pageable pageable);


	List<Driver> findByTransporterId(String transporterId, Pageable pageable);

	List<Driver> findByPhoneNum(String phoneNum, Pageable pageable);

	List<Driver> findByTruckId(String truckId, Pageable pageable);

	List<Driver> findByPhoneNumAndTransporterId(String phoneNum, String transporterId, Pageable pageable);

	List<Driver> findByTruckIdAndTransporterId(String truckId, String transporterId, Pageable pageable);

	List<Driver> findByPhoneNumAndTruckId(String phoneNum, String truckId, Pageable pageable);

	List<Driver> findByPhoneNumAndTransporterIdAndTruckId(String phoneNum, String transporterId, String truckId,
			Pageable pageable);

}