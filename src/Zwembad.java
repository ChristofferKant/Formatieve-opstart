public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double br, double lng, double di)
    {
        breedte = br;
        lengte = lng;
        diepte = di;
    }

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double getInhoud() {
        return breedte * lengte * diepte;
    }
    public String toString() {
        String s = "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
        return s;
    }
}
