import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 class ProbabilityTest
 {
    @Test
    void expectTwoGivenProbabilityEventsAreEqual() {
        Probability pc1 = new Probability(0.5);
        Probability pc2 = new Probability(0.5);
        Assertions.assertEquals(true, pc1.compare(pc2) );
    }

    @Test
     void expectTwoGiveProbabilityEventsAreUnequal() {
        Probability pc1 = new Probability(0.5);
        Probability pc2 = new Probability(0.7);
        Assertions.assertEquals(false, pc1.compare(pc2) );
    }
}
