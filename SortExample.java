class InterestCalculator {
 	public static double calculateInterest(double principal, int termInMonths, double annualRate) {
     	if (principal <= 0 || termInMonths <= 0 || annualRate <= 0) {
         	return 0;
     	}
     	double monthlyRate = annualRate / 12;
     	double totalInterest = 0;
     	for (int i = 0; i < termInMonths; i++) {
         	totalInterest += (principal + totalInterest) * monthlyRate;
     	}
         return totalInterest;
 	}
}
