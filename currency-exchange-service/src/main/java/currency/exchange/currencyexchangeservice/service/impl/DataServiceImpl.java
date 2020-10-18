package currency.exchange.currencyexchangeservice.service.impl;

import currency.exchange.currencyexchangeservice.entity.ExchangeValue;
import currency.exchange.currencyexchangeservice.repo.ExchangeValueRepository;
import currency.exchange.currencyexchangeservice.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.net.UnknownHostException;

@Service("DataService")
public class DataServiceImpl implements DataService {

    @Autowired
    private ExchangeValueRepository exchangeValueRepository;
    @Autowired
    private Environment environment;

    @Override
    public ExchangeValue getExchangeValueByFromCurrencyAndToCurrency(String from, String to) throws UnknownHostException {
        String property = environment.getProperty("local.server.port");
        return exchangeValueRepository.getExchangeValueByFromCurrencyAndToCurrency(from, to)
                .setPort(Integer.parseInt(property));
    }

    @Override
    public String putData() {
        exchangeValueRepository.save(new ExchangeValue("USD", 75, "INR"));
        exchangeValueRepository.save(new ExchangeValue("INDIA", 2, "USD"));
        exchangeValueRepository.save(new ExchangeValue("EURO", 86, "INR"));
        exchangeValueRepository.save(new ExchangeValue("DIR", 20, "INR"));
        return "Data Has been Saved";
    }
}
