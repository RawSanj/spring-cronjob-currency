package com.github.rawsanj.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.github.rawsanj.model.CurrencyRate;
import com.github.rawsanj.repository.CurrencyRateRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyRestController {

    private final CurrencyRateRepository currencyRateRepository;

    public CurrencyRestController(CurrencyRateRepository currencyRateRepository) {
        this.currencyRateRepository = currencyRateRepository;
    }

    @RequestMapping(path = "/currency", method = RequestMethod.GET)
    public List<CurrencyRate> getACurrencyRates() {
        List<CurrencyRate> currencyRateList = currencyRateRepository.findAll();

        currencyRateList.forEach(System.out::println);

        System.out.println(currencyRateList);

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
