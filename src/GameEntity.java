public class GameEntity {
    private int health;
    private int damage;
    private String name;

    public GameEntity(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String info(){
        return getName() +" health: "  + getHealth() +  "|" + " damage: " + getDamage() + "|";
    }
}
