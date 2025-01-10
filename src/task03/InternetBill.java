package task03;

import java.util.Scanner;

public class InternetBill {
    public static void main(String[] args) {
        do {
            System.out.println("Bill = " + calculateBill());
        } while (processContinue().equalsIgnoreCase("Y"));
    }

    private static Float calculateBill() {
        Scanner readInt = new Scanner(System.in);
        Scanner readFlt = new Scanner(System.in);
        System.out.print("Enter the monthly flat fee = ");
        float monthlyFixedFee = readFlt.nextFloat();
        System.out.print("Enter category (1,2 or 3) = ");
        int category = readInt.nextInt();
        System.out.print("Enter the excess usage amount (GB) = ");
        int excessUsageAmountGB = readInt.nextInt();
        float additionalFeeUnitPrice = 0;
        switch (category) {
            case 1:
                additionalFeeUnitPrice = 0.10F;
                break;
            case 2:
                additionalFeeUnitPrice = 0.20F;
                break;
            case 3:
                additionalFeeUnitPrice = 0.30F;
                break;
            default:
                System.out.println("Incorrect Category");
        }
        float extraFee = additionalFeeUnitPrice * excessUsageAmountGB;
        return monthlyFixedFee + extraFee;
    }

    private static String processContinue() {
        Scanner readStr = new Scanner(System.in);
        System.out.print("Do you want to calculate for a new customer? ('Y' for Yes, 'N' for No) = ");
        return readStr.nextLine().trim();
    }
}
