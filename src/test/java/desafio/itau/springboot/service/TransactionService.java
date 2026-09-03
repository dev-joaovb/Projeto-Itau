package desafio.itau.springboot.service;
import org.springframework.stereotype.Service;

// Endpoint para gerenciar transações e calcular estatísticas

@Service
public class TransactionService {

    // Fila para armazenar as transações recebidas
    private final Queue<Transaction> transactions = new ConcurrentLinkedQueue<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void clearTransactions() {
        transactions.clear();
    }

    // Método para calcular estatísticas das transações recebidas nos últimos 60 segundos
    public DoubleSummaryStatistics getStatistics() {
        OffsetDateTime now = OffsetDateTime.now();
        return transactions.stream()
                .filter(t -> t.getDataHora().isAfter(now.minusSeconds(60)))
                .mapToDouble(Transaction::getValor)
                .summaryStatistics();
    }

}