import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void expectTrueForProbablityObjectsOfSameReference() {
        Probability flipCoinHead = new Probability(0.5);
        assertTrue(flipCoinHead.equals(flipCoinHead));
    }
    @Test
    void expectFalseForProbablityObjectsOfDifferentReference() {
        Probability flipCoinHead = new Probability(0.5);
        Probability throwDice = new Probability(0.12);
        assertFalse(flipCoinHead.equals(throwDice));
    }
    @Test
    void expectTrueForProbablityObjectsOfDiffReferenceWithSameValues() {
        Probability flipCoinHead = new Probability(0.5);
        Probability throwDice = new Probability(0.5);
        assertTrue(flipCoinHead.equals(throwDice));
    }

    @Test
    void expectFalseForProbabilityObjectsOfDifferentValues() {
        Probability flipCoinHead = new Probability(0.7);
        Probability throwDice = new Probability(0.5);
        assertFalse(flipCoinHead.equals(throwDice));
    }
    @Test
    void expectFalseWithProbabilityObjectCompareWithAnotherType() {
        Probability flipCoinHead = new Probability(0.7);
        String str = new String("apple");
        assertFalse(flipCoinHead.equals(str));
    }
    @Test
    void expectFalseWithProbabilityObjectCompareWithNull() {
        Probability flipCoinHead = new Probability(0.7);
        assertFalse(flipCoinHead.equals(null));
    }
}
