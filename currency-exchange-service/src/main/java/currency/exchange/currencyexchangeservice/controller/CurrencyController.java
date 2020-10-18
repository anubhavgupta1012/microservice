package currency.exchange.currencyexchangeservice.controller;

import currency.exchange.currencyexchangeservice.entity.ExchangeValue;
import currency.exchange.currencyexchangeservice.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

@RestController
public class CurrencyController {

    @Autowired
    private DataService dataService;

    @GetMapping("/api/exchange/from/{from}/to/{to}")
    public ExchangeValue exchangeValue(@PathVariable("from") String from,
                                       @PathVariable("to") String to) throws UnknownHostException {
        return dataService.getExchangeValueByFromCurrencyAndToCurrency(from, to);
    }

    @GetMapping("/api/put")
    public String putExchangeValue() {
       return dataService.putData();
    }
}