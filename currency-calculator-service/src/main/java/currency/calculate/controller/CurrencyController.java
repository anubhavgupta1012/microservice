package currency.calculate.controller;

import currency.calculate.facade.CurrencyExchangeProxy;
import currency.calculate.model.CalculatedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyController {

    @Value("${currency.exchange.url}")
    private String currencyExchangeUrl;

    @Autowired
    private CurrencyExchangeProxy proxy;

    @GetMapping("api/calculate/from/{from}/to/{to}/quantity/{quantity}")
    public CalculatedValue getCalculatedValue(@PathVariable String from,
                                              @PathVariable String to,
                                              @PathVariable String quantity) {
        Map hashMap = new HashMap();
        hashMap.put("from", from);
        hashMap.put("to", to);
        CalculatedValue calculatedValue = (CalculatedValue) new RestTemplate().getForEntity(currencyExchangeUrl + "from/{from}/to/{to}",
                CalculatedValue.class,
                hashMap).getBody();
        calculatedValue.setQuantity(Integer.parseInt(quantity));
        calculatedValue.setTotalAmount(calculatedValue.getQuantity() * calculatedValue.getExchangeValue());
        return calculatedValue;
    }


    @GetMapping("api/calculate-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CalculatedValue getCalculatedValueFeign(@PathVariable String from,
                                                   @PathVariable String to,
                                                   @PathVariable String quantity) {

        CalculatedValue calculatedValue = proxy.getCalculatedValueByFeign(from, to);
        calculatedValue.setQuantity(Integer.parseInt(quantity));
        calculatedValue.setTotalAmount(calculatedValue.getQuantity() * calculatedValue.getExchangeValue());
        return calculatedValue;
    }
}