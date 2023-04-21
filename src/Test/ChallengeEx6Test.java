package Test;

import ChallengeEx6.MarketingSpecialist;
import ChallengeEx6.SalesConsultant;
import ChallengeEx6.Shop;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChallengeEx6Test {

    @Test
    void testGetWorkers(){
        Shop shop = new Shop();
        MarketingSpecialist marketingSpecialist = new MarketingSpecialist();
        SalesConsultant salesConsultant = new SalesConsultant();

        shop.addWorker(marketingSpecialist);
        shop.addWorker(salesConsultant);

        int total = shop.getWorkers().size();

        assertEquals(2, total);
    }


    @Test
    void testGetTurnOver(){
        Shop shop = new Shop();
        SalesConsultant salesConsultant = new SalesConsultant();

        shop.addWorker(salesConsultant);

        salesConsultant.sellProduct(124.12);

        double turnover = shop.getTurnover();

        assertEquals(124.12, turnover);
    }

    @Test
    void testGetBudget(){
        Shop shop = new Shop();
        MarketingSpecialist marketingSpecialist = new MarketingSpecialist();

        shop.addWorker(marketingSpecialist);

        marketingSpecialist.spendMoney(1232);

        double budget = marketingSpecialist.getBudget();

        assertEquals(3768, budget);
    }
}
