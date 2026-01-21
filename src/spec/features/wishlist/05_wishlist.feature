#langage: EN
@wishlists @tr
Feature: Je Souhaite Tester La Page wishlist de l'application Web Demo Shop

Background:
Given Je me connecte sur le site Web Demo Shop
When Je clique sur le bouton Log in
And  Je saisis une adresse mail
And Je saisis un mot de passe
And Je clique sur le bouton Login

@wishlists
Scenario: Je Souhaite Tester La Page wishlists vide pour un utilisateur donné 

And Je clique sur le bouton wishlist
Then le message suivant doit apparaitre Message1 "The wishlist is empty!"