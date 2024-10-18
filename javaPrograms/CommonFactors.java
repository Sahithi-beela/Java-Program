import java.util.ArrayList;
import java.util.List;

public class CommonFactors {

    public static List<Integer> findCommonFactors(int... numbers) {
        List<Integer> factors = new ArrayList<>();
        
        if (numbers.length == 0) {
            return factors; 
        }

        
        int minNum = numbers[0];
        for (int num : numbers) {
            if (num < minNum) {
                minNum = num;
            }
        }

        
        for (int i = 1; i <= minNum; i++) {
            boolean isCommonFactor = true;
            for (int num : numbers) {
                if (num % i != 0) {
                    isCommonFactor = false;
                    break;
                }
            }
            if (isCommonFactor) {
                factors.add(i);
            }
        }

        return factors;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 18, 24};
        List<Integer> commonFactors = findCommonFactors(numbers);
        System.out.println("Common factors: " + commonFactors);
    }
}
