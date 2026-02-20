public class Operators {
    public static void main (String[] args) {
        int[] price = {7,1,5,3,6,4}; //-6
        
        int day = 0;
        int nextday = 1;
        
        int maxProfit = 0;

        while (nextday < price.length - 1) {
            if (price[nextday] > price[day]) {
            int profit = price[nextday] - price[day];
            maxProfit = Math.max(maxProfit, profit);
            } else {
                day = nextday;
                nextday++;
            }
        }
        System.out.println(maxProfit);
    }
}
