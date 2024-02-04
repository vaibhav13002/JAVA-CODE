package Contest;
///wrong unsolved
public class MinimumTimetoRevertWordtonitialStateI {
    public static void main(String[] args) {
        String word="abacaba";
        int k=3;
        
        int result = minimumTimeToInitialState(word, k);
        System.out.println("Minimum time required: " + result);
    }
        public static int  minimumTimeToInitialState(String word, int k) {
            int wordLength = word.length();
    
            for (int i = 1; i <= 10000; ++i) {
                int removedChars = i * k;
    
                if (removedChars >= wordLength) {
                    return i;
                }
                String remainingPart = word.substring(removedChars);
                boolean areCharsEqual = true;
                for (int j = 0; j < remainingPart.length(); ++j) {
                    if (remainingPart.charAt(j) != word.charAt(j)) {
                        areCharsEqual = false;
                        break;
                    }
                }
                if (areCharsEqual) {
                    return i;
                }
            }
            return 0;
        }
    }
