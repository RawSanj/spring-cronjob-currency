package com.github.rawsanj.controller;

import java.util.List;
import java.util.Optional;

import com.github.rawsanj.model.CurrencyRate;
import com.github.rawsanj.repository.CurrencyRateRepository;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyRestController {

    private final CurrencyRateRepository currencyRateRepository;
    
    private static final Log logger = LogFactory.getLog(CurrencyRestController.class);

    public CurrencyRestController(CurrencyRateRepository currencyRateRepository) {
        this.currencyRateRepository = currencyRateRepository;
    }

    @RequestMapping(path = "/currency", method = RequestMethod.GET)
    public List<CurrencyRate> getACurrencyRates() {
        List<CurrencyRate> currencyRateList = currencyRateRepository.findAll();

        currencyRateList.forEach(System.out::println);
        
        logger.info("Total Currencies: "+ currencyRateList.size());
        
        logger.info(currencyRateList);

        return currencyRateList;
    }

    @RequestMapping(value = "/currency/{id}", method = RequestMethod.GET)
    public CurrencyRate getCurrencyRateById(@PathVariable("id") long id) {
        Optional<CurrencyRate> currencyRateRepositoryById = currencyRateRepository.findById(id);
        if (currencyRateRepositoryById.isPresent()) {
            return currencyRateRepositoryById.get();
        } else {
            return null;
        }
    }

}
