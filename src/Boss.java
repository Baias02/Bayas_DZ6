public class Boss extends GameEntity{
   Weapon weapon = new Weapon();
    public Boss(String name,int health,int damage){
        super(name,health,damage);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String info() {
        return super.info() + " weapon: " + weapon.getTypeWeapon() + "|" +
                " name weapon " + weapon.getNameWeapon() +  "|";
    }
}
