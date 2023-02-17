public class Main {
    public static void main(String[] args) {
                Boss boss = new Boss("Boss",500,40);
                boss.weapon.setTypeWeapon(WeaponType.LASER);
                boss.weapon.setNameWeapon("Incendiary");
                System.out.println(boss.info());
                Skeleton skeleton = new Skeleton("Skeleton",300,30);
                skeleton.weapon.setTypeWeapon(WeaponType.Missile);
                skeleton.weapon.setNameWeapon("Cleaner");
                skeleton.setAmountArrow(12);
                System.out.println(skeleton.info());
                Skeleton skeleton1 = new Skeleton("Skeleton1",200,23);
                skeleton1.weapon.setTypeWeapon(WeaponType.Machine);
                skeleton1.weapon.setNameWeapon("Death");
                skeleton1.setAmountArrow(5);
                System.out.println(skeleton1.info());


    }
}