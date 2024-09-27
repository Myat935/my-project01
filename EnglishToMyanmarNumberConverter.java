	import java.util.Scanner;
	public class EnglishToMyanmarNumberConverter {
	    
	    // Method to convert English number to Myanmar number
	    public static String convertToMyanmarNumber(int number) {
	        // Array of Myanmar numerals
	        String[] myanmarNumerals = {"၀", "၁", "၂", "၃", "၄", "၅", "၆", "၇", "၈", "၉"};

	        // Convert the number to a string
	        String englishNumber = String.valueOf(number);
	        StringBuilder myanmarNumber = new StringBuilder();

	        // Iterate through each digit of the English number and convert it to Myanmar numeral
	        for (int i = 0; i < englishNumber.length(); i++) {
	            char digit = englishNumber.charAt(i);
	            int digitValue = Character.getNumericValue(digit);
	            myanmarNumber.append(myanmarNumerals[digitValue]);
	        }

	        return myanmarNumber.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an English number: ");
	        int englishNumber = scanner.nextInt();

	        // Convert the English number to Myanmar number
	        String myanmarNumber = convertToMyanmarNumber(englishNumber);

	        System.out.println("Myanmar Number: " + myanmarNumber);

	        scanner.close();
	    }
	}



