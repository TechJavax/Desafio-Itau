package desafio.api_itau.controller;

import desafio.api_itau.dto.TransactionRequestDto;
import desafio.api_itau.model.Transaction;
import desafio.api_itau.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/transacao")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public ResponseEntity<Void> createTransaction(@Valid @RequestBody TransactionRequestDto request) {
        if(request.getDateTime().isAfter(OffsetDateTime.now())) {
            return ResponseEntity.unprocessableEntity().build();
        }
        transactionService.addTransaction(new Transaction(request.getValor(), request.getDateTime()));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
