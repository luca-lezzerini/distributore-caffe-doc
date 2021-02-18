package distribcaffè18;

public interface Automabile {

    void entraStatoAttesa();

    void entraStatoErogazione();

    void entraStatoPronto();
    
    void stampaMessaggio(String msg);
}
