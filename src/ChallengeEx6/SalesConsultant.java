package ChallengeEx6;

public class SalesConsultant implements Worker {
    private Shop workingShop;
    private double earnedMoney;

    public SalesConsultant() {
        this.workingShop = Shop.getInstance();
        this.workingShop.addWorker(this);
        this.earnedMoney = 0;
    }

    public void sellProduct(double price) {
        this.earnedMoney += Math.max(price, 0);
    }

    public double getMoney() {
        return this.earnedMoney;
    }
}