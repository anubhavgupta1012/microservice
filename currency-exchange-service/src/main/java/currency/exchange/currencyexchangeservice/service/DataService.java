package currency.exchange.currencyexchangeservice.service;

import currency.exchange.currencyexchangeservice.entity.ExchangeValue;
import org.springframework.http.ResponseEntity;

import java.net.UnknownHostException;

public interface DataService {

    public ExchangeValue getExchangeValueByFromCurrencyAndToCurrency(String from, String to) throws UnknownHostException;

    String putData();
}
