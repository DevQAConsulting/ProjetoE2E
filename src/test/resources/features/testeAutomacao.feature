@LinxEcoomerceLab
Feature: Teste Automacao


  Scenario: Login bem sucedido
    Given realize login no site da linx ecommerce com Sucesso
    When realizo a busca pelo produto "Geladeira Electrolux Multidoor Efficient Com Autosense e Inverter 590L Inox Look (IM8S)"
    And realizo o processo para finalização de compra


  Scenario: Validar login sem sucesso
    Given que o usuario tente realizar login passando a senha invalida
    When o modal de carregar
    Then a mensagem de erro deve ser "Dados de login não conferem"
