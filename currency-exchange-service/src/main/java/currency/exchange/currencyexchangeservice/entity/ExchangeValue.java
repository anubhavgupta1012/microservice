package currency.exchange.currencyexchangeservice.entity;

import javax.persistence.*;

@Entity
@Table(name = "ExchangeValue")
public class ExchangeValue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String fromCurrency;
    private int exchangeValue;
    private String toCurrency;
    @Transient
    private int port;

    public ExchangeValue() {
    }

    public ExchangeValue(int id,String fromCurrency, int exchangeValue, String toCurrency, int port) {
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.exchangeValue = exchangeValue;
        this.toCurrency = toCurrency;
        this.port = port;
    }

    public ExchangeValue(String fromCurrency, int exchangeValue, String toCurrency) {
        this.fromCurrency = fromCurrency;
        this.exchangeValue = exchangeValue;
        this.toCurrency = toCurrency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String from) {
        this.fromCurrency = from;
    }

    public int getExchangeValue() {
        return exchangeValue;
    }

    public void setExchangeValue(int exchangeValue) {
        this.exchangeValue = exchangeValue;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String to) {
        this.toCurrency = to;
    }

    public int getPort() {
        return port;
    }

    public ExchangeValue setPort(int port) {
        this.port = port;
        return this;
    }
}
