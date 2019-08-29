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
    @Test
    void expect1By12ForCombiningTwoProbabilityEvent() {
        Probability flipCoinHead = new Probability(1.0/2);
        Probability throwDiceSix = new Probability(1.0/6);
        assertEquals(0.08333,flipCoinHead.combinedProbability(throwDiceSix), 001);
    }
}
