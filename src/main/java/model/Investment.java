package model;

public class Investment {
	private String nameInvestment;
	private double valueInitial;
	private double incomeNet;
	private double priceSharePurchase;
	private double priceShareCurrent;
	private double perShareDividend;
	private double investmentTimeDays;
	/**
	 * @param nameInvestment
	 * @param valueInitial
	 * @param incomeNet
	 * @param priceSharePurchase
	 * @param priceShareCurrent
	 * @param perShareDividend
	 * @param investmentTimeDays
	 */
	public Investment(String nameInvestment, double valueInitial, double incomeNet, double priceSharePurchase,
			double priceShareCurrent, double perShareDividend, double investmentTimeDays) {
		this.nameInvestment = nameInvestment;
		this.valueInitial = valueInitial;
		this.incomeNet = incomeNet;
		this.priceSharePurchase = priceSharePurchase;
		this.priceShareCurrent = priceShareCurrent;
		this.perShareDividend = perShareDividend;
		this.investmentTimeDays = investmentTimeDays;
	}
	
	/**
	 * @param nameInvestment
	 */
	public Investment(String nameInvestment) {
		this.nameInvestment = nameInvestment;
	}

	/**
	 * no arg constructor
	 */
	public Investment() {
	}
	public String getNameInvestment() {
		return nameInvestment;
	}
	public void setNameInvestment(String nameInvestment) {
		this.nameInvestment = nameInvestment;
	}
	public double getValueInitial() {
		return valueInitial;
	}
	public void setValueInitial(double valueInitial) {
		this.valueInitial = valueInitial;
	}
	public double getIncomeNet() {
		return incomeNet;
	}
	public void setIncomeNet(double incomeNet) {
		this.incomeNet = incomeNet;
	}
	public double getPriceSharePurchase() {
		return priceSharePurchase;
	}
	public void setPriceSharePurchase(double priceSharePurchase) {
		this.priceSharePurchase = priceSharePurchase;
	}
	public double getPriceShareCurrent() {
		return priceShareCurrent;
	}
	public void setPriceShareCurrent(double priceShareCurrent) {
		this.priceShareCurrent = priceShareCurrent;
	}
	public double getPerShareDividend() {
		return perShareDividend;
	}
	public void setPerShareDividend(double perShareDividend) {
		this.perShareDividend = perShareDividend;
	}
	public double getInvestmentTimeDays() {
		return investmentTimeDays;
	}
	public void setInvestmentTimeDays(double investmentTimeDays) {
		this.investmentTimeDays = investmentTimeDays;
	}
	
	
}
