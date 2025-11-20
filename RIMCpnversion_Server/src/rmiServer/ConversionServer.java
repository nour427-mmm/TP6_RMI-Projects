package rmiServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import rmiService.ConversionImpl;

public class ConversionServer {

    public static void main(String[] args) {
        try {
            // 1. Activer l'annuaire RMI (RMIRegistry) sur le port 1099 (port par défaut)
            // Cet annuaire permet aux clients de trouver les objets distants.
            LocateRegistry.createRegistry(1099);
            System.out.println("Annuaire RMI créé sur le port 1099.");

            // 2. Créer une instance de l'objet d'implémentation du service
            ConversionImpl od = new ConversionImpl();
            System.out.println("Instance de l'objet de service créée : " + od.toString());

            // 3. Publier la référence de cet objet dans l'annuaire RMI
            // Le nom "ConversionService" sera utilisé par les clients pour le retrouver.
            // La méthode rebind écrase une éventuelle publication précédente sous le même nom.
            Naming.rebind("rmi://localhost:1099/ConversionService", od);

            System.out.println("Le service de conversion est publié et prêt à être utilisé.");

        } catch (Exception e) {
            System.err.println("Erreur du serveur : " + e.toString());
            e.printStackTrace();
        }
    }
}