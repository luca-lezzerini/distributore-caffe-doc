package distribcaffè18;

public class SoldiEvent implements Event {

    private final double soldi;

    public SoldiEvent(double soldi) {
        this.soldi = soldi;
    }

    public double getSoldi() {
        return soldi;
    }
}
