#language : en 
@login
Feature: Je Souhaite Tester La page Login de l'application Web Demo Shop  

Scenario: Je souhaite Tester la page Login avec Des données Valides  

Given Je me connecte sur le site Web Demo Shop
When Je clique sur le bouton log in
And Je saisis une adresse mail
And Je saisis un mot de passe
And Je clique sur le bouton Login
Then Je me redirige vers la page home "ziedhannachi0@gmail.com"

