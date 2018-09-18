package com.startinpoint.proj.microservice;

import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author HsuWaiWaiTun
 *
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

	ExchangeValue findByFromAndTo(String from , String to);
}
