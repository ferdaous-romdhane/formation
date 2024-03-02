
@PaiementPanier
Feature: ajouter des produits au panier 
  defenir la methode de paiement
  
Background: 
Given ouvrir url de la page "https://automationexercise.com/"
    When cliquer sur le boutton signup1
    And saisir le mail pour le login "ferdaoustest3@hotmail.fr"
    And saisir le password pour le login "123456doussa"
    And cliquer sur le boutton login2


@Paiement
  Scenario: paiement du panier
    Given   cliquer sur le lien view card
    And cliquer sur le bouton add to card
    And cliquer sur le lien view card2
    And cliquer sur procced to chekout
    And cliquer sur le bouton place order
    And saisir le Name on Card "ferdaous"
    And saisir le Card Number "23456789"
    And saisir cvc  et day Expiration "234" "3" "2026"
    And cliquer sur confirm order 
    And cliquer sur le boutton continuer
