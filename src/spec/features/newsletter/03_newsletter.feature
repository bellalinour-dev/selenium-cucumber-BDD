#language: en
@newsletter @tr 
Feature: Je Souhaite Tester Le Boutton Subscribe de l'application Web Demo Shop

Background:
Given Je me connecte sur le site Web Demo Shop
When Je me dirige vers la rubrique newsletter

@newsletter_valid
Scenario: Je Souhaite Tester le Boutton Subscribe 

And Je saisis une adresse mail valide
And Je clique sur le bouton subscribe
Then Je vois un message de confirmation "Thank you for signing up! A verification email has been sent. We appreciate your interest."

@newsletter_invalid
Scenario: Je Souhaite Tester le Boutton Subscribe 

And Je saisis une adresse mail invalide
And Je clique sur le bouton subscribe
Then Je vois un message d'erreur "Enter valid email"

Examples:
|email|error_message|
|1234y|Enter valid email|