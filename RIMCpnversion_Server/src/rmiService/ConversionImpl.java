package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * L'implémentation de l'interface distante.
 * 1. Elle implémente l'interface (IConversion).
 * 2. Elle DOIT hériter de java.rmi.server.UnicastRemoteObject.
 *    Cela permet à l'objet d'être "exportable" et accessible via le réseau.
 */
public class ConversionImpl extends UnicastRemoteObject implements IConversion {

    // Le constructeur doit lever RemoteException, car la création de l'objet distant
    // peut échouer (par exemple, si le port est déjà utilisé).
    public ConversionImpl() throws RemoteException {
        super(); // Appel au constructeur de UnicastRemoteObject
    }

    @Override
    public double convertirMontant(double mt) throws RemoteException {
        // Logique métier : 1 Euro = 3.35 Dinars (taux fictif)
        double montantConverti = mt * 3.35;
        System.out.println("Conversion demandée : " + mt + " EUR -> " + montantConverti + " TND");
        return montantConverti;
    }
}