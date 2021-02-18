package distribcaffè18;

public class DistributoreCaffèAutoma implements State {

    private State stato;
    private double tot;

    public DistributoreCaffèAutoma() {
        stato = new Attesa();
        tot = 0;
    }

    @Override
    public void next(Event e) {
        System.out.println("Siamo nello stato " + stato);
        System.out.println("Ricevuto evento " + e);
        stato.next(e);
        System.out.println("Siamo arrivati nello stato " + stato + "\n");
    }

    private class Attesa implements State {

        @Override
        public void next(Event e) {
            if (e instanceof CaffèEvent) {
                if (tot < 0.45) {
                    System.out.println("Soldi insufficienti.");
                } else {
                    stato = new Erogazione();
                }
            } else if (e instanceof RestoEvent) {
                if (tot > 0) {
                    System.out.println("Erogato resto " + tot);
                    tot = 0;
                } else {
                    System.out.println("Nessun resto da dare.");
                }
            } else if (e instanceof SoldiEvent) {
                tot += ((SoldiEvent) e).getSoldi();
            } else {
                System.out.println("Ricevuto evento inatteso.");
            }
        }

    }

    private class Erogazione implements State {

        @Override
        public void next(Event e) {
            if (e instanceof CaffèProntoEvent) {
                tot -= 0.45;
                stato = new Pronto();
            } else {
                System.out.println("Ricevuto evento inatteso.");
            }
        }

    }

    private class Pronto implements State {

        @Override
        public void next(Event e) {
            if (e instanceof RitiroEvent) {
                stato = new Attesa();
            } else {
                System.out.println("Ricevuto evento inatteso.");
            }
        }

    }

}
