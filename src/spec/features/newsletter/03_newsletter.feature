#language: en
@newsletter @tr 
Feature: Je Souhaite Tester Le Boutton Subscribe de l'application Web Demo Shop

Background:
Given Je me connecte sur le site Web Demo Shop


@newsletter_valid
Scenario: Je Souhaite Tester le Boutton Subscribe 

When Je saisis une adresse mail valide
And  clique sur Subscribe
Then le message suivant doit apparaitre Message "Thank you for signing up! A verification email has been sent. We appreciate your interest."

@newsletter_InvalidMail
Scenario: Je Souhaite Tester la souscription aux newsletter

When Je saisis une adresse mail invalide mail "noor.com"
And  clique sur Subscribe
Then le message suivant doit apparaitre Message1 "Enter valid email"