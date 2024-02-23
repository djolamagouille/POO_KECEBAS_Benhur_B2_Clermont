/*package POO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;*/

public class Produit {
    private String nom;
    private String description;
    private int prix;

    public Produit(String nom, String description, int prix) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("Nom: " + nom);
        System.out.println("Description: " + description);
        System.out.println("Prix: " + prix);
    }
}
/* 
class ProduitAlimentaire extends Produit {
    private LocalDate dateExpiration;

    public ProduitAlimentaire(String nom, String description, int prix, LocalDate dateExpiration) {
        super(nom, description, prix);
        this.dateExpiration = dateExpiration;
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Date d'expiration: " + dateExpiration);
    }
}

class ProduitElectronique extends Produit {
    private int dureeGarantie;

    public ProduitElectronique(String nom, String description, int prix, int dureeGarantie) {
        super(nom, description, prix);
        this.dureeGarantie = dureeGarantie;
    }

    public int getDureeGarantie() {
        return dureeGarantie;
    }

    public void setDureeGarantie(int dureeGarantie) {
        this.dureeGarantie = dureeGarantie;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Durée de garantie: " + dureeGarantie + " mois");
    }
}

class ProduitBoisson extends Produit {
    private int quantite;

    public ProduitBoisson(String nom, String description, int prix, int quantite) {
        super(nom, description, prix);
        this.quantite = quantite;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Quantité: " + quantite + " cl");
    }
}

class Boutique {
    private List<Produit> produits;

    public Boutique() {
        this.produits = new ArrayList<>();
    }

    public void addProduit(Produit produit) {
        produits.add(produit);
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void afficherStock() {
        for (Produit produit : produits) {
            produit.afficher();
            System.out.println("---------------");
        }
    }
}

class Panier {
    private List<Produit> produits;

    public Panier() {
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public int prixTotalPanier() {
        int prixTotal = 0;
        for (Produit produit : produits) {
            prixTotal += produit.getPrix();
        }
        return prixTotal;
    }
}

public class ProgrammePrincipal {
    public static void main(String[] args) {
        // Création d'une instance de Boutique
        Boutique boutique = new Boutique();

        // Ajout de produits à la boutique
        Produit produit1 = new Produit("Laptop", "Ordinateur portable puissant", 1200);
        Produit produit2 = new ProduitAlimentaire("Chocolat", "Délicieux chocolat noir", 5, LocalDate.of(2023, 12, 31));
        Produit produit3 = new ProduitElectronique("Téléphone", "Smartphone haut de gamme", 800, 24);
        Produit produit4 = new ProduitBoisson("Eau minérale", "Eau pure et naturelle", 2, 500);

        boutique.addProduit(produit1);
        boutique.addProduit(produit2);
        boutique.addProduit(produit3);
        boutique.addProduit(produit4);

        // Affichage du stock de la boutique
        System.out.println("Stock de la boutique :");
        boutique.afficherStock();

        // Création d'une instance de Panier
        Panier panier = new Panier();

        // Ajout de produits au panier
        panier.ajouterProduit(produit1);
        panier.ajouterProduit(produit2);
        panier.ajouterProduit(produit3);

        // Affichage du prix total du panier
        System.out.println("Prix total du panier : " + panier.prixTotalPanier() + " euros");
    }
}
*/ 