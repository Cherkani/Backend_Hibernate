package ma.projet.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import ma.projet.entities.Categorie;

import ma.projet.entities.Commande;
import ma.projet.entities.LigneCommandeProduit;
import ma.projet.entities.LigneCommandeProduitKey;
import ma.projet.entities.Produit;
import ma.projet.service.CategorieService;

import ma.projet.service.CommandeService;
import ma.projet.service.LigneCommandeProduitService;
import ma.projet.service.LigneCommandeProduitServiceKey;
import ma.projet.service.ProduitService;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

    public static void main(String[] args) throws ParseException {

        ////insertion
//        CommandeService css = new CommandeService();
//        ProduitService pd = new ProduitService();
//        CategorieService cas = new CategorieService();
//        LigneCommandeProduitService lcps = new LigneCommandeProduitService(); 
//       
//        // Création d'une catégorie
//        Categorie categorie1 = new Categorie("CodeCat", "LibelleCat");
//        cas.create(categorie1);
//
//        // Création d'un produit lié à la catégorie
//        Produit produit = new Produit("RefProd", 50.0f, categorie1);
//        pd.create(produit);
//
//        // Création d'une commande
//        Commande commande = new Commande(new Date());
//        css.create(commande);
//
//        // Création d'une ligne de commande associant le produit à la commande
//        LigneCommandeProduit ligneCommandeProduit = new LigneCommandeProduit();
//        ligneCommandeProduit.setId(new LigneCommandeProduitKey(produit.getId(), commande.getId(),15));
//        // Associer la ligne de commande au produit et à la commande
//        ligneCommandeProduit.setProduit(produit);
//        ligneCommandeProduit.setCommande(commande);
//        lcps.create(ligneCommandeProduit);
///////////////////////mise a jour  ne marche pas a cause des cle 
// try {
//    LigneCommandeProduitService lcps = new LigneCommandeProduitService();
//    
//   
//    LigneCommandeProduit prodcomm = lcps.findById(1, 1, 15);
//    
//    if (prodcomm != null) {
//       System.out.println("l objet  existe dans la base de donne ------>>>>"+prodcomm+"<<<<");
//        prodcomm.getId().setQuantity(300); 
//        
//       
//        lcps.update(prodcomm);
//    } else {
//       System.out.println("l objet n existe pas dans la base de donne");
//    }
//} catch (Exception e) {
//    e.printStackTrace();
//}
        //Q 4
//        CommandeService commandeService = new CommandeService();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//         Date   dateDebut = dateFormat.parse("2023-01-01");
//         Date   dateFin = dateFormat.parse("2023-12-31");
//     
//
//         List<Produit> produitsCommandes = commandeService.findProduitsCommandesEntreDates(dateDebut, dateFin);
//
//        
//        System.out.println("Liste des produits commandés entre " + dateDebut +
//                " et " + dateFin + ":");
//        for (Produit produit : produitsCommandes) {
//            System.out.println("ID: " + produit.getId() + ", Référence: " + produit.getReference() +
//                    ", Prix: " + produit.getPrix() + " DH");
//        }
        //Q5
//        LigneCommandeProduitService lcp =new LigneCommandeProduitService();
//        
//        int commandeId = 1;
//       
//
//        // Récupérez la liste des produits dans la commande
//        List<LigneCommandeProduit> produitsDansCommande = lcp.findProduitsDepuisIdCommande(commandeId);
//System.out.println("La liste des produits dans la commande ---> "+commandeId+" <--- est :");
//System.out.println("---------------------------------------------------------------------");
//        for (LigneCommandeProduit ligne : produitsDansCommande) {
//            System.out.println("Référence : " + ligne.getProduit().getReference()+
//                    "\t Prix : " + ligne.getProduit().getPrix() + " DH"+
//                    "\t Quantité : " + ligne.getId().getQuantity());
//        
//        }
        
        
        //Q6
//        ProduitService produitService = new ProduitService();
//List<Produit> produitsPrixSuperieur = produitService.findProduitsPrixSuperieur();
//
//for (Produit produit : produitsPrixSuperieur) {
//    System.out.println("ID : " + produit.getId()+"\tRéférence : " + produit.getReference()+"\tPrix : " + produit.getPrix() + " DH");
//
//}


    }
}
