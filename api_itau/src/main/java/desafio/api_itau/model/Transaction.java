package desafio.api_itau.model;

import java.time.OffsetDateTime;

public class Transaction {
    private Double valor;
    private OffsetDateTime dateTime;

    public Transaction(final double valor, final OffsetDateTime dateTime) {
        this.valor = valor;
        this.dateTime = dateTime;
    }

    public double getValor() {
        return valor;
    }

    public OffsetDateTime getDateTime() {
        return dateTime;
    }
}
