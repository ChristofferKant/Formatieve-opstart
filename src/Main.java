public class Main {
    public static void main(String[] arg) {
        Zwembad z1 = new Zwembad("2.0", "5.5", "1.5");
        System.out.println("LENGTE: " + z1.getLengte());
        System.out.println("BREEDTE: " + z1.getBreedte());
        System.out.println("DIEPTE: " + z1.getDiepte());
    }
}
