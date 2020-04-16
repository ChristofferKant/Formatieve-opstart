public class Zwembad {
    private String lengte;
    private String breedte;
    private String diepte;

    public Zwembad(String lng, String br, String di)
    {
        lengte = lng;
        breedte = br;
        diepte = di;
    }

    public String getLengte() {
        return lengte;
    }

    public String getBreedte() {
        return breedte;
    }

    public String getDiepte() {
        return diepte;
    }

    public String toString() {
        String s = "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
        return s;
    }
}
