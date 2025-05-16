package desafio.api_itau.controller;

import desafio.api_itau.dto.StatisticsResponseDto;
import desafio.api_itau.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("estatistica")
public class StatisticsController {

    private TransactionService transactionService;

    public StatisticsController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public ResponseEntity<StatisticsResponseDto> getStatistics() {
        DoubleSummaryStatistics statistics = transactionService.getStatistics();
        return ResponseEntity.ok(new StatisticsResponseDto(statistics));
    }
}
