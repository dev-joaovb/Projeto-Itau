package desafio.itau.springboot.dto;

import java.time.OffsetDateTime;
import jakarta.validation.constraints.min
;
import jakarta.validation.constraints.NotNull;

public class TransactionRequest {

    @NotNull
    @Min(value = 0, message = "O valor da transação deve ser um número positivo")
    private double valor;

    @NotNull
    private OffsetDateTime dataHora;

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}