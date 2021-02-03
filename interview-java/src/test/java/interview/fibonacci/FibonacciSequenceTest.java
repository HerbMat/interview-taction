package interview.fibonacci;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceTest {
    private final static FibonacciSequence fibonacciSequence = new FibonacciSequence();

    @ParameterizedTest
    @MethodSource("fibonacciStream")
    @DisplayName("For position {0} it should return {1}")
    void calculate(int n, int expectedResult) {
        assertEquals(expectedResult, fibonacciSequence.calculate(n));
    }

    private static Stream<Arguments> fibonacciStream() {
        return Stream.of(
          Arguments.of(0, 0),
          Arguments.of(5, 5),
          Arguments.of(8, 21),
          Arguments.of(12, 144),
          Arguments.of(30, 832040),
          Arguments.of(40, 102334155)
        );
    }
}