package bestTimeToBuyAndSellStock;

public class solution {
	public static int maxProfit(int[] prices) {
		int maxPoint = 0 ;
		int min = prices[0];
		for(int i = 1 ; i < prices.length ; i++) {
			int profit =prices[i]-min;
			//우선 가장 낮은 숫자 찾기
			if(profit > maxPoint) {
				maxPoint = profit;
			}
			
			if(min > prices[i]) {
				min = prices[i];
			}
		}
		
		return maxPoint;
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		solution.maxProfit(prices);

	}

}
