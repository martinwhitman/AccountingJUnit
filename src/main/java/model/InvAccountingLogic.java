package model;



public class InvAccountingLogic {
	public double roiNetIncome(Investment investment){
		double roi = (investment.getIncomeNet())/(investment.getValueInitial());
		return roi;
	}
	public double roiCapitalGain(Investment investment){
		double roi = (investment.getPriceShareCurrent()-investment.getPriceSharePurchase())/(investment.getPriceSharePurchase());
		return roi;
	}
	public double roiTotalReturn(Investment investment){
		double roi = (investment.getPriceShareCurrent()+investment.getPerShareDividend()-investment.getPriceSharePurchase())/(investment.getPriceSharePurchase());
		return roi;
	}
	public double roiAnnualized(Investment investment){
		double roi = ((investment.getPriceShareCurrent()-investment.getPriceSharePurchase())/(investment.getPriceSharePurchase()))/(investment.getInvestmentTimeDays()/365);
		return roi;
	}
}
