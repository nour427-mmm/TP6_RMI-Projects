package rmiService;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * L'interface distante définit les méthodes qui peuvent être appelées à distance par un client.
 * 1. Elle DOIT hériter de l'interface java.rmi.Remote.
 * 2. Chaque méthode DOIT déclarer qu'elle peut lever une java.rmi.RemoteException.
 */
public interface IConversion extends Remote {
    
    /**
     * Convertit un montant d'une devise à une autre.
     * Pour ce TP, on supposera une conversion d'Euros vers Dinars Tunisiens.
     * @param mt Le montant en Euros.
     * @return Le montant équivalent en Dinars.
     * @throws RemoteException Si une erreur de communication réseau survient.
     */
    double convertirMontant(double mt) throws RemoteException;
}