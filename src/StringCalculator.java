import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringCalculator {
	public int add(String numbersStr) throws StringCalculatorException {
		// Returns the sum of the numbers given in numbersStr
		
		final Pattern pattern = Pattern.compile("-?\\d+");
		final Matcher matcher = pattern.matcher(numbersStr);
		
		final ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		while(matcher.find()){
			numbers.add(Integer.parseInt(matcher.group()));
		}
		
		int i;
		int sum = 0;
		for(i=0; i<numbers.size(); i++){
			if(numbers.get(i) < 0){
				throw new StringCalculatorException();
			}
			if(numbers.get(i)>1000){
				continue;
			}
			sum = sum + numbers.get(i);
		}
		
		/*
		String numbers = numbersStr.replaceAll("[^0-9]", "");
		
		int index = 0;
		int result = 0;
		for(int i=0; i<numbers.length(); i++){
			String number = numbers.substring(i);
			int num = Integer.parseInt(number);
			result = result + num;
		}
		*/
		
		// not yet implemented
		return sum;
	}
}
