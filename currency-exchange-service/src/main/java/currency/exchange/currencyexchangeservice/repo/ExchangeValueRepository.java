package currency.exchange.currencyexchangeservice.repo;

import currency.exchange.currencyexchangeservice.entity.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, String> {

    public ExchangeValue getExchangeValueByFromCurrencyAndToCurrency(String from, String to);
}
