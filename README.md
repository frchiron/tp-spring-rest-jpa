# Spring : Mise en place de controllers REST et JPA


## Prequis

- Maven 3.+
- JDK 8 +
- Intellij

## Support

voir https://www.dev-institut.fr/formation-spring-07-2018/05-mvc-web-api/


## Prequis

Pour lancer l'application :

```
mvn jetty:run
```

## Etapes

- Créer un controller pour le chemin /persons
- Ajouter l'endpoint GET /persons qui retourne l'ensemble des personnes
- AJouter l'endpoint GET /person/{id] qui retourne une personne
- AJouter l'endpoint GET /person?firstname=xxx qui retourne l'ensemble des personnes correspondant à ce critères

- Ajouter un PersonRepository qui étend CrudRepository
- Ajouter un personService (qui contient la logique métier)
- Faire appel au PersonService dans le PersonController