public class BestTimeToBuyAndSell {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right;
        int profit=0;
        if(prices.length==1) return 0; // you can use stack for this its on you
        for(right=1;right<prices.length;right++){
            if(prices[left]>prices[right])
                left=right;
            else if(prices[left]<prices[right])
                profit =Math.max(profit,prices[right]-prices[left]);
        }
        return profit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("num of elements:-");
        int n=sc.nextInt();
        int i ;
        int arr[]= new int[n];
        for( i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }

        BestTimeToBuyAndSell b1 = new BestTimeToBuyAndSell();
       System.out.println( "max val of element:-"+" "+b1.maxProfit(arr));
    }
}
