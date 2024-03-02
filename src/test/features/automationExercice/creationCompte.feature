@CreationCompte
Feature: Creation dun compte utilisateur
  je voudrais creer un compte en tant que utilisateur

  @NouveauCompte
  Scenario: Creation du compte
    Given ouvrir url de la page "https://automationexercise.com/"
    When cliquer sur le boutton signup1
    And saisir le name "Ferdaous"
    And saisir le mail "ferdaoustest3@hotmail.fr"
    And cliquer sur le boutton signup2
    And choisir le genre
    And saisir le Password "123456doussa"
    And saisir le DateOfBithday avec le jour "12" , mois "5" , annee "1987"
    And choisir le Newsletter
    And choisir le Offer
    And saisir le FirstName "ferdaous"
    And saisir le LastName "romdhane"
    And saisir le Adress1 "05 Rue 2 Mars"
    And saisir le Adress2 "Khniss"
    And saisir le Country "Canada"
    And saisir le Sate "canada"
    And saisir le City "monastir"
    And saisir le ZipCode "2004"
    And saisir MobileNumber "123455678"
    And Clique sur CreateAcount

#  @OuvrirCompte
 # Scenario: Ouvrir compte
 #   Given ouvrir url de la page "https://automationexercise.com/"
 #   When cliquer sur le boutton signup1
 #   And saisir le mail pour le login "ferdaoustest3@hotmail.fr"
 #   And saisir le password pour le login "123456doussa"
 #   And cliquer sur le boutton login2
