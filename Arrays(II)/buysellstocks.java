
public class buysellstocks {

    public static int  BuyandSellStocks(int prices[]){

        var buyPrice = Integer.MAX_VALUE;
        var maxprofit = 0;
        for(int i = 0; i< prices.length; i++){
            if(buyPrice < prices[i]){ //PROFIT
                int profit = prices[i] - buyPrice; //todays profit
                maxprofit = Math.max( maxprofit, profit);

            } else {
                buyPrice = prices[i];
            }

        }
        return maxprofit;

    }
    public static void main(String args[]){
      
      int prices[] ={7,1,5,3,6,4};
      System.out.println(BuyandSellStocks(prices));

    }
}
