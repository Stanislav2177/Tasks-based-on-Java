package ChallengeEx2;

public class Ball {
    private String color;
    private int count;

    public Ball(String color, int count) {
        this.color = color;
        this.count = count;
    }

    public Ball(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
