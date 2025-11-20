# TP 6 : Développement d'Applications Réparties - Java RMI

## Activité 6-1 : Service de Conversion de Devise

Ce dépôt contient la solution pour le Travail Pratique n°6 du cours "Développement d'applications réparties". L'objectif est de mettre en œuvre une communication client/serveur via la technologie Java RMI.

L'application simule un service financier où un serveur expose une méthode de conversion de devises (Euros vers Dinars Tunisiens), et un client distant invoque cette méthode.

---

## Architecture & Structure du Dépôt

Le projet est divisé en deux applications Java distinctes pour refléter l'architecture distribuée :

*   **`RMIConversion_Server`** : Le projet serveur qui contient l'implémentation du service.
*   **`RMIConversion_Client`** : Le projet client qui consomme le service.

```
.
├── RMIConversion_Server/
│   └── src/
│       ├── rmiService/
│       │   ├── IConversion.java
│       │   └── ConversionImpl.java
│       └── rmiServer/
│           └── ConversionServer.java
│
├── RMIConversion_Client/
│   └── src/
│       └── rmiClient/
│           └── ConversionClient.java
│
└── README.md
```

---

## Prérequis

*   JDK 1.8 ou supérieur
*   IDE Java (Eclipse, IntelliJ IDEA)
*   Git

---

## Guide d'Installation et de Configuration

### 1. Cloner le Dépôt
```bash

```

### 2. Importer les Projets dans l'IDE
1.  Ouvrir l'IDE, `File` -> `Import...`.
2.  Choisir `General` -> `Existing Projects into Workspace`.
3.  Sélectionner le dossier cloné comme "root directory".
4.  Importer les deux projets `RMIConversion_Server` et `RMIConversion_Client`.

### 3. Configurer la Dépendance du Client
1.  **Exporter le JAR depuis le Serveur :**
    *   Clic droit sur le projet `RMIConversion_Server` -> `Export...` -> `Java` -> `JAR file`.
    *   Sélectionner et exporter uniquement le fichier compilé `IConversion.class`.
    *   Enregistrer le JAR sous le nom `conversion-api.jar`.

2.  **Ajouter le JAR au Classpath du Client :**
    *   Clic droit sur le projet `RMIConversion_Client` -> `Properties`.
    *   Aller dans `Java Build Path` -> `Libraries`.
    *   Cliquer sur `Classpath`, puis sur `Add External JARs...`.
    *   Sélectionner le fichier `conversion-api.jar`.
    *   Appliquer et fermer.

---

## Exécution de l'Application

L'ordre de lancement est crucial.

### 1. Démarrer le Serveur
1.  Dans le projet `RMIConversion_Server`, exécuter la méthode `main()` de `ConversionServer.java`.
2.  La console du serveur affichera :
    ```text
    Serveur RMI prêt et en attente de clients.
    ```
3.  Laisser cette console active.

### 2. Lancer le Client
1.  Dans le projet `RMIConversion_Client`, exécuter la méthode `main()` de `ConversionClient.java`.
2.  La console du client affichera le résultat :
    ```text
    Le client a envoyé 500.0 EUR.
    Le serveur a retourné : 1675.0 TND.
    ```
3.  La console du serveur affichera un log de la requête reçue.

---

## Auteur

*   **Nom :Nour elhak ben mefteh 
*   **Auditoire : LSI 3
*   **Matière : Développement d'applications réparties
*   **Université :Faculté des Sciences de Sfax
*   **Année Universitaire :** 2025 - 2026
