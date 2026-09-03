package desafio.itau.springboot.dto;


// DTO para representar a resposta das estatísticas das transações
public class StatisticsResponse {

    private long count;
    private double sum;
    private double avg;
    private double max;
    private double min;

    // Construtor que recebe um objeto DoubleSummaryStatistics e inicializa os campos do DTO
    public StatisticsResponse(DoubleSummaryStatistics stats){
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.avg = stats.getAverage();
        this.max = stats.getMax();
        this.min = stats.getMin();
    }

    // Getters para os campos do DTO

    public long getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double getAvg() {
        return avg;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

}