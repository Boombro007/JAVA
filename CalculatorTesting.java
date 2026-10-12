import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTesting {
    public static int findMax(int arr[]) {
        int max = arr[0];
        // Fix 1: Removed () from arr.length
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}

// Fix 2: Added 'static' keyword to the import


class TestLogic {    
    @Test
    public void testFindMax() {
        assertEquals(4, CalculatorTesting.findMax(new int[]{4, 3, 1}));
    }

    private void assertEquals(int i, int max) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }
}