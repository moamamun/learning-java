public class Main {
    public static void main(String args[]) {
//        Player player = new Player();
//        player.health = 50;
//        player.name = "Momu";
//        player.weapon = "Hammer";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 30;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Momu", 50, "Hammer");
        System.out.println("Initial health is " + player.getHitpoints());
    }
}
