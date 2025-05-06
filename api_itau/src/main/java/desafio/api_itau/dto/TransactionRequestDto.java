package desafio.api_itau.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public class TransactionRequestDto {

    @NotNull
    @Min(0)
    private Double valor;

    @NotNull
    private OffsetDateTime dateTime;

    public @NotNull @Min(0) Double getValor() {
        return valor;
    }

    public @NotNull OffsetDateTime getDateTime() {
        return dateTime;
    }
}
