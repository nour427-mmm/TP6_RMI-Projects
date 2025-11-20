package rmiClient;

import java.rmi.Naming;
import rmiService.IConversion; 

public class ConversionClient {

    public static void main(String[] args) {
        try {
            
            IConversion stub = (IConversion) Naming.lookup("rmi://localhost:1099/ConversionService");
            
            
            double montantEnEuros = 500;
            
            System.out.println("Connexion au serveur RMI réussie...");
            System.out.println("Appel de la méthode distante convertirMontant(" + montantEnEuros + ")...");
            
            
            double montantEnDinars = stub.convertirMontant(montantEnEuros);
            
            
            System.out.println("Résultat reçu du serveur :");
            System.out.println(montantEnEuros + " EUR équivaut à " + montantEnDinars + " TND.");

        } catch (Exception e) {
            System.err.println("Erreur du client : " + e.toString());
            e.printStackTrace();
        }
    }
}