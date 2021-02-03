package interview.fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * Computes fibonacci sequence. It uses dynamic programming approach to cache results of previous computation.
 */
public class FibonacciSequence {
    private final List<Integer> cachedFibonacciSequence = new ArrayList<>();

    public FibonacciSequence() {
        cachedFibonacciSequence.add(0);
        cachedFibonacciSequence.add(1);
    }

    /**
     * Returns number at given position in fibonacci sequence.
     *
     * @param n position in fibonacci sequence
     *
     * @return number at given position in fibonacci sequence.
     */
    public int calculate(int n) {
        if(cachedFibonacciSequence.size() <= n) {
            final var result = calculate(n - 1) + calculate(n - 2);
            cachedFibonacciSequence.add(result);
        }
        return cachedFibonacciSequence.get(n);
    }
}
