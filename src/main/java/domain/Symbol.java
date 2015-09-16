package domain;

public class Symbol {
	
	private final String symbol, name, exchange;
	
	public Symbol(String symbol, String name, String exchange) {
		this.symbol = symbol;
		this.name = name;
		this.exchange = exchange;
	}
	

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}

	public String getExchange() {
		return exchange;
	}
	
	
	
	
	
}
