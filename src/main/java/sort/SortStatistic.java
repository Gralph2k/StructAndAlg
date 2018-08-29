package sort;

import helpers.CollectionHelpers;

import java.time.Duration;
import java.time.LocalDateTime;

public class SortStatistic {
    private LocalDateTime start;
    private LocalDateTime finish;
    private int steps=0;

    public SortStatistic() {
        this.start=LocalDateTime.now();
    }

    public void makeStep(){
        steps++;
    };

    public void run() {this.start=LocalDateTime.now();}

    public void stop(){
        this.finish=LocalDateTime.now();
    }

    public int getDurationNano(){
        return Duration.between(start, finish).getNano();
    }

    public  int getSteps() {return steps;}

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }
}
