package currency.calculate.facade;

import currency.calculate.model.CalculatedValue;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange-service", url = "http://localhost:8000/")
@FeignClient(name = "currency-exchange-service")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeProxy {

    @GetMapping("/api/exchange/from/{from}/to/{to}")
    public CalculatedValue getCalculatedValueByFeign(@PathVariable("from") String from,
                                                     @PathVariable("to") String to);
}
