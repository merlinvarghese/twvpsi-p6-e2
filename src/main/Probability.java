// understands chances of occurrence of an event
class Probability {
    private double occurrence;

    Probability(double occurrence) {
        this.occurrence = occurrence;
    }

    boolean compare(Probability event2) {
        return this.occurrence == event2.occurrence;
    }
}
