package desafio.api_itau.dto;

import java.util.DoubleSummaryStatistics;

public class StatisticsResponseDto {

    private Long count;
    private Double sum;
    private Double avg;
    private Double min;
    private Double max;

    public StatisticsResponseDto(DoubleSummaryStatistics stats) {
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.avg = stats.getAverage();
        this.min = stats.getMin();
        this.max = stats.getMax();
    }

    public Long getCount() {
        return count;
    }

    public Double getSum() {
        return sum;
    }

    public Double getAvg() {
        return avg;
    }

    public Double getMin() {
        return min;
    }

    public Double getMax() {
        return max;
    }
}
