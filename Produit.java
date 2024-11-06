public class Produit {
    private int id;
    private String libelle;
    private double prix;


    public Produit(int id, String libelle, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
    }


    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getPrix() {
        return prix;
    }


    public boolean comparer(Produit autreProduit) {
        return this.id == autreProduit.id &&
                this.libelle.equals(autreProduit.libelle) &&
                this.prix == autreProduit.prix;
    }


    public static boolean comparer(Produit produit1, Produit produit2) {
        return produit1.id == produit2.id &&
                produit1.libelle.equals(produit2.libelle) &&
                produit1.prix == produit2.prix;
    }
}
