// understands chances of occurance of an event
 class Probability{
    double occurance;

    Probability(double occurance) {
        this.occurance = occurance;
    }
    boolean compare(Probability event2) {
        if(this.occurance == event2.occurance)
            return true;
        return false;
    }
}
