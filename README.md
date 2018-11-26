## Observer

O observer é um projeto de padrão muito utilizado. O java fornece suporte para este padrão de projeto, portanto, é possível implementa-lo utilizando as próprias API’s: 
As API's mais gerais é a interface Observer e a classe Observable no pacote java.util. Basicamente o objetivo deste padrão é poder atualizar todos os objetos de uma classe ao mesmo tempo, ou seja, toda vez que um objeto muda de estado, todos os seu dependentes são notificados e atualizados automaticamente.

## Problema
Este padrão de projeto assemelha-se muito a relação entre editora e assinante. Foi então desenvolvido um código com esta estratégia de exemplificação.
Imagina-se que temos uma editora e vários assinantes, portanto, isto é uma relação de "UM PARA MUITOS". A cada nova edição lançada é necessário atualizar todos os assinantes sobre qual edição da revista está chegando em suas mãos. Enquanto essas pessoa forem assinantes elas continuarão a receber as edições em sua casa. No momento em que cancelado a assinatura, ela não receberá mais edições da revista.
