import java.util.Objects;

// understands chances of occurrence of an event
class Probability {
    private double occurrence;

    Probability(double occurrence) {
        this.occurrence = occurrence;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Probability p = (Probability) obj;
        return this.occurrence == p.occurrence;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this);
    }

    double combinedProbability(Probability throwDiceSix) {
        return this.occurrence * throwDiceSix.occurrence;
    }
}
