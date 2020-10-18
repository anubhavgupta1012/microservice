package currency.calculate.model;

public class CalculatedValue {
    private int id;
    private String fromCurrency;
    private int exchangeValue;
    private String toCurrency;
    private int port;
    private int quantity;
    private  int totalAmount;

    public CalculatedValue() {
    }

    public CalculatedValue(int id, String fromCurrency, int exchangeValue, String toCurrency, int port, int quantity) {
        this.id = id;
        this.fromCurrency = fromCurrency;
        this.exchangeValue = exchangeValue;
        this.toCurrency = toCurrency;
        this.port = port;
        this.quantity = quantity;
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

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
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

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
