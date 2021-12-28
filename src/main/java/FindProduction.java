public class FindProduction {
    public static long getResult(long num1,long num2){

        ProductionOfNumber productionOfNumbers= ((x, y) -> {
            long ans = 1;
            for(long i = y; i>=x;i--){
                ans = ans * i;
            }
            return ans;
        });
        return productionOfNumbers.getProduction(num1,num2);
    }
    public static void main(String[] args) {

//      getting output
        long output1 = FindProduction.getResult(1,4);
        long output2 = FindProduction.getResult(0,1);
        System.out.println(output1);
        System.out.println(output2);

    }
}
