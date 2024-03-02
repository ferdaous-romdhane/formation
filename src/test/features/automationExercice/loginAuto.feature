
@ouvrirCompte
Feature: ouvrir un compte utilisateur
  je voudrais ouvrir un compte deja cree

@Ouvrir
  Scenario: Ouvrir compte
    Given ouvrir url de la page "https://automationexercise.com/"
    When cliquer sur le boutton signup1
    And saisir le mail pour le login "ferdaoustest3@hotmail.fr"
    And saisir le password pour le login "123456doussa"
    And cliquer sur le boutton login2
