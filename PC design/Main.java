public class Main {

    public static void  main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor theMonitor = new Monitor("GUGU", "Asus", 25, new Resolution(1920, 1080));
        Motherboard theMB = new Motherboard("GU20", "B450M", 4, 2, "AMD");
        PC thePC = new PC(theCase, theMonitor, theMB);
        thePC.getTheCase().pressPowerButton();
        thePC.getMonitor().drawPixelAt(1550, 1200, "blue");
        thePC.getMotherboard().loadProgrammer("Windows 10");
    }
}
