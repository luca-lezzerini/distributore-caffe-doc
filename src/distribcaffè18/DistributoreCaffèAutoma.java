package distribcaffè18;

public class DistributoreCaffèAutoma implements State {

    private State stato;
    private double tot;
    // interfaccia usata per comunicare con la User Interface (qualunque essa sia)
    private Automabile ui;

    public DistributoreCaffèAutoma(Automabile ui) {
        tot = 0;
        this.ui = ui;
        stato = new Attesa();
        ui.stampaMessaggio("");
    }

    @Override
    public void next(Event e) {
        System.out.println("Siamo nello stato " + stato);
        System.out.println("Il totale prima è " + tot);
        System.out.println("Ricevuto evento " + e);
        stato.next(e);
        System.out.println("Il totale dopo è " + tot);
        System.out.println("Siamo arrivati nello stato " + stato + "\n");
    }

    private class Attesa implements State {

        public Attesa() {
            ui.entraStatoAttesa();
        }

        @Override
        public void next(Event e) {
            if (e instanceof CaffèEvent) {
                if (tot < 0.45) {
                    System.out.println("Soldi insufficienti.");
                    ui.stampaMessaggio("Soldi insufficienti.");
                } else {
                    stato = new Erogazione();
                    ui.stampaMessaggio("Preparazione caffè in corso ...");
                }
            } else if (e instanceof RestoEvent) {
                if (tot > 0) {
                    System.out.println("Erogato resto " + tot);
                    ui.stampaMessaggio("Erogato resto " + tot);
                    tot = 0;
                } else {
                    System.out.println("Nessun resto da dare.");
                    ui.stampaMessaggio("Nessun resto da dare.");
                }
            } else if (e instanceof SoldiEvent) {
                tot += ((SoldiEvent) e).getSoldi();
                ui.stampaMessaggio("Totale: " + tot);
            } else {
                System.out.println("Ricevuto evento inatteso.");
            }
        }

    }

    private class Erogazione implements State {

        public Erogazione() {
            ui.entraStatoErogazione();
        }

        @Override
        public void next(Event e) {
            if (e instanceof CaffèProntoEvent) {
                tot -= 0.45;
                stato = new Pronto();
                ui.stampaMessaggio("Caffè pronto, si prega di ritirarlo");
            } else {
                System.out.println("Ricevuto evento inatteso.");
            }
        }
    }

    private class Pronto implements State {

        public Pronto() {
            ui.entraStatoPronto();
        }

        @Override
        public void next(Event e) {
            if (e instanceof RitiroEvent) {
                stato = new Attesa();
                ui.stampaMessaggio("Totale: " + tot);
            } else {
                System.out.println("Ricevuto evento inatteso.");
            }
        }

    }

}
