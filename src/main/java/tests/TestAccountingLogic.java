package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.InvAccountingLogic;
import model.Investment;

public class TestAccountingLogic {
	InvAccountingLogic iAL = new InvAccountingLogic();
	Investment investment = new Investment("gold");
	
	@Before
	public void setUp() throws Exception{
		
	}
	@Test
	public void testRoiNetIncome() {
		investment.setValueInitial(100000);
		investment.setIncomeNet(10000);
		double roiNet = iAL.roiNetIncome(investment);
		assertEquals(0.1, roiNet, 0.0);
	}
	@Test
	public void testRoiCapitalGain() {
		investment.setPriceSharePurchase(5.00);
		investment.setPriceShareCurrent(7.00);
		double roiCap = iAL.roiCapitalGain(investment);
		assertEquals(0.4,roiCap, 0.0);
	}
	@Test
	public void testRoiTotalReturn() {
		investment.setPriceSharePurchase(5.00);
		investment.setPerShareDividend(1.00);
		investment.setPriceShareCurrent(9.00);
		double roiTot = iAL.roiTotalReturn(investment);
		assertEquals(1.0,roiTot,0.0);
	}
	@Test
	public void testRoiAnnualized() {
		investment.setPriceSharePurchase(5.00);
		investment.setPriceShareCurrent(7.00);
		investment.setInvestmentTimeDays(730);
		double roiAnn = iAL.roiAnnualized(investment);
		assertEquals(.2,roiAnn,0.0);
	}
}
