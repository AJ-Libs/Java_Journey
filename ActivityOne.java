
package day6;

public class ActivityOne {
    public static void main(String[] args) {
        double income = 50_000;
        double foodAllowance = 15_000;
        double transportation = 2_500;
        double rent = 4_500;
        double utilityBill = 3_500;
        
        System.out.printf("Income:50000" );
        System.out.printf("\nFood Allowance:%.1f%%\n",100/(income / foodAllowance));
        System.out.printf("Transportation:%.1f%%\n",100/(income / transportation));
        System.out.printf("Rent:%.1f%%\n",100/(income / rent));
        System.out.printf("Utility Bill:%.1f%%\n",100/(income / utilityBill));
        System.out.printf("Remaining Balance:" + (income - foodAllowance - transportation - rent - utilityBill));
    }
}
