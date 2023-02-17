
public class Skeleton extends Boss{
    private int amountArrow;

    public int getAmountArrow() {
        return amountArrow;
    }

    public void setAmountArrow(int amountArrow) {
        this.amountArrow = amountArrow;
    }

    public Skeleton(String name,int health, int damage){
        super(name,health,damage);
        this.amountArrow = amountArrow;
    }


    public String info(){
        return super.info() + " Amount of arrows: " + getAmountArrow();
    }
}