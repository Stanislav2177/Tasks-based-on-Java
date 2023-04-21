package ChallengeEx6;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private static Shop instance;
    private List<Worker> workers;


    public Shop(){
        this.workers = new ArrayList<>();
    }

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
        }

        return instance;
    }

    public void addWorker(Object worker) {
        this.workers.add((Worker) worker);
    }

    public double getTurnover() {
        var turnOver = 0.0;

        for(Worker worker : workers){
            if(worker instanceof SalesConsultant){
                turnOver += (( SalesConsultant)worker).getMoney();
            }
        }

        return turnOver;
    }


    public List<Worker> getWorkers() {
        return workers;
    }
}