# language: pt

@Feature
Funcionalidade: Desafio Dasa Jornada médica
  #Pelo caminho do site institucional da Dasa, quero acessar o site
  #do laboratório Delboni Auriemo.

  Cenario: Desafio Dasa
    Dado Que acesso o site institucional da Dasa
    E Clico no link Nossas Marcas
    E Listo no console todos os laboratórios de São Paulo
    Quando Seleciono o laboratório Delboni Auriemo
    E valido meu acesso na área do laboratório
    E clico no link com nome da marca
    Então valido o direcionamento correto para o site do Delboni Auriemo.
