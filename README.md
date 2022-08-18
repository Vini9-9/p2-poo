# Music and Instruments control
Sistema de controle de músicos e instrumentos

# Requisitos

1) Domínio da aplicação:

- [X] Classe: musico.Musico
- [X] Classe:instrumento.Instrumento
- [X] Interface: instrumento.corda.Distorcao
- [X] Classe: instrumento.corda.Guitarra
- [X] Classe: instrumento.corda.Violao
- [X] Classe: instrumento.piano.Piano
- [X] Classe: instrumento.piano.EfeitoSonoro
- [X] Classe: instrumento.piano.Armario

2) Detalhes de implementação:

- [X] No métodos tocarInstrumento(), da classe Musico, deve-se percorre a lista de instrumentos do músico e chama o método emitirSom(), 
verificando também se o instrumento tem Distorção para chamar o métodos emitirSomDistorcao()

- [X] Os métodos emitirSom() e emitirSomDistorcido(), implementados nos instrumentos, 
devem retornar strings indicando qual instrumento está emitindo o som (normal ou distorcido)

## Diagrama de classes
![Diagrama de classes-p2 drawio](https://user-images.githubusercontent.com/58668142/185506944-c3592ae5-8771-4528-bc7c-66722e5a971f.png)
