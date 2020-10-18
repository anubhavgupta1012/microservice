package currency.calculate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrencyCalculatorServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyCalculatorServiceApplication.class, args);
    }

}
