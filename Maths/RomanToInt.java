import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;
        HashMap<Character,Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        for(int i=s.length()-1; i>=0; i--) {
            char symbol = s.charAt(i);
            int currValue = romanValues.get(symbol);

            if(currValue < prevValue) {
                result -= currValue;
            } else {
                result+= currValue;
            }
            prevValue = currValue;
        }

        return result;
    }    
}
