Algoritmo "arrayBidimensional"
Var
// Seção de Declarações das variáveis 
m: vetor[1..3,1..2] de inteiro
l, c: inteiro
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
para l de 1 ate 3 passo 1 faca
     para c de 1 ate 2 passo 1 faca
          Escreva("Valor para Linha ",l, " e Coluna ", c, ": ")
          leia(m[l,c])
     fimpara
fimpara

para l de 1 ate 3 passo 1 faca
     para c de 1 ate 2 passo 1 faca
          Escreval("Valor Linha e Coluna ", l, " x ", c, " = ", m[l,c])
     fimpara
fimpara

Fimalgoritmo