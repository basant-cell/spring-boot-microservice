package com.accolite.microservices.currencyexchangeservice;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.microservices.currencyexchangeservice.bean.ExchangeValue;

@RestController
public class CurrencyExchangeController {
	
	private static Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);
	
	@Autowired
	private Environment environment;
	@Autowired
	private ExchangeValueRepository repository; 
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValues(@PathVariable String from, @PathVariable String to) {
//		ExchangeValue exchangeValue = new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.valueOf(environment.getProperty("server.port")));
		logger.info("{}",exchangeValue);
		return exchangeValue;
	}
	@PostMapping("/currency-exchange")
	public ExchangeValue retrieveExchangeValuesBody(@RequestBody ExchangeValue value) {
		String from = value.getFrom();
		String to = value.getTo();
//		ExchangeValue exchangeValue = new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.valueOf(environment.getProperty("server.port")));
		logger.info("{}",exchangeValue);
		return exchangeValue;
	}

}
