import java.util.ArrayList;
import java.util.List;

public class Magasin {
    private String nom;
    private List<Produit> produits;


    public Magasin(String nom) {
        this.nom = nom;
        this.produits = new ArrayList<>();
    }


    public void ajouterProduit(Produit produit) {
        // Recherche si le produit existe déjà dans le magasin
        if (!existeProduit(produit)) {
            produits.add(produit);
            System.out.println("Produit ajouté : " + produit.getLibelle());
        } else {
            System.out.println("Produit déjà présent : " + produit.getLibelle());
        }
    }


    private boolean existeProduit(Produit produit) {
        for (Produit p : produits) {
            if (p.comparer(produit)) {
                return true;
            }
        }
        return false;
    }


    public int chercherProduit(Produit produit) {
        for (int i = 0; i < produits.size(); i++) {
            if (produits.get(i).comparer(produit)) {
                return i;
            }
        }
        return -1;
    }


    public boolean supprimerProduit(Produit produit) {
        int index = chercherProduit(produit);
        if (index != -1) {
            produits.remove(index);
            System.out.println("Produit supprimé : " + produit.getLibelle());
            return true;
        } else {
            System.out.println("Produit non trouvé : " + produit.getLibelle());
            return false;
        }
    }


    public static Magasin magasinAvecPlusDeProduits(Magasin magasin1, Magasin magasin2) {
        if (magasin1.produits.size() > magasin2.produits.size()) {
            return magasin1;
        } else {
            return magasin2;
        }
    }

    public void afficherProduits() {
        System.out.println("Produits du magasin " + nom + ":");
        for (Produit p : produits) {
            System.out.println("- " + p.getLibelle() + " (" + p.getPrix() + "€)");
        }
    }


    public String getNom() {
        return nom;
    }
}

