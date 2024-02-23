/*package POO ;*/
import java.time.LocalDate;


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