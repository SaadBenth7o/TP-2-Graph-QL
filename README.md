# TP 2 GraphQL

**Auteur:** Bendahou Saad

## Architecture

Cette application Spring Boot utilise GraphQL pour exposer une API de gestion d'étudiants et de centres. L'architecture suit le pattern MVC avec les composants suivants :

- **Entités JPA** : `Centre` et `Etudiant` avec relation ManyToOne
- **Repositories** : Interfaces JPA pour l'accès aux données
- **Services** : Logique métier avec support des subscriptions (WebFlux)
- **Controller GraphQL** : Point d'entrée avec annotations `@QueryMapping`, `@MutationMapping`, `@SubscriptionMapping`
- **Schéma GraphQL** : Définition des types, queries, mutations et subscriptions dans `schema.graphqls`
- **DTOs** : Objets de transfert de données pour les mutations

## Base de données

L'application utilise **H2** (base de données en mémoire) pour le stockage des données. La console H2 est accessible pour visualiser les données.

## Lancement du projet

1. Compiler le projet avec Maven :
   ```bash
   mvn clean install
   ```

2. Lancer l'application :
   ```bash
   mvn spring-boot:run
   ```

3. Accéder à GraphiQL (interface GraphQL interactive) :
   ```
   http://localhost:8080/graphiql?path=/graphql
   ```

4. Accéder à la console H2 :
   ```
   http://localhost:8080/h2-console
   ```
   - URL JDBC: `jdbc:h2:mem:centredb`
   - Username: (vide)
   - Password: (vide)

## Endpoints GraphQL

- **Queries** : `getAllEtudiants`, `getEtudiantById`, `getAllCentres`, `getCentreById`
- **Mutations** : `addEtudiant`, `updateEtudiant`, `deleteEtudiant`
- **Subscriptions** : `etudiantAdded`, `etudiantRemoved`

