public class Test {
    public static void main(String[] args) {

        Produit produit1 = new Produit(1, "Ordinateur", 999.99);
        Produit produit2 = new Produit(2, "Téléphone", 499.99);
        Produit produit3 = new Produit(1, "Ordinateur", 999.99);


        Magasin magasin1 = new Magasin("Magasin A");
        Magasin magasin2 = new Magasin("Magasin B");


        magasin1.ajouterProduit(produit1);
        magasin1.ajouterProduit(produit2);
        magasin2.ajouterProduit(produit2);
        magasin2.ajouterProduit(produit3);


        magasin1.afficherProduits();
        magasin2.afficherProduits();

        magasin1.supprimerProduit(produit1);
        magasin1.afficherProduits();


        Magasin magasinAvecPlusDeProduits = Magasin.magasinAvecPlusDeProduits(magasin1, magasin2);
        System.out.println("Le magasin avec plus de produits est : " + magasinAvecPlusDeProduits.getNom());
    }
}
