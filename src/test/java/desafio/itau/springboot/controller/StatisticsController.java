package desafio.itau.springboot.controller;


@RestController
@RequestMapping("/estatisticas")
// Endpoint para gerenciar estatísticas das transações
public class StatisticsController {
    
    private final TransactionService transactionService;

    // Construtor que recebe o serviço de transações como dependência
    public StatisticsController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    // Endpoint para obter as estatísticas das transações recebidas nos últimos 60 segundos
    public ResponseEntity<StatisticsResponse> getStatistics() {

        DoubleSummaryStatistics stats = transactionService.getStatistics();
        return ResponseEntity.ok(new StatisticsResponse(stats));
    }
}