algoritmo "arrayUnidimensional"
var
v: vetor[1..5] de inteiro
i, soma, maior, menor: inteiro

inicio
Escreval("-----------------------")
Escreval("       Bem Vindo!      ")
Escreval("-----------------------")
i <- 0
para i de 1 ate 5 passo 1 faca
     escreva("Informe o ", i, "°", " valor de ", v[i], ": ")
     leia(v[i])
fimpara

Escreval("-----------------------")

soma <- 0
menor <- v[i]
maior <- v[i]

para i de 1 ate 5 passo 1 faca
     soma <- soma + v[i]
     se v[i] < menor entao
        menor <- v[i]
     fimse
     se v[i] > maior entao
        maior <- v[i]
     fimse
fimpara

Escreval("-----------------------")

para i de 1 ate 5 passo 1 faca
      se v[i] = menor entao
         escreval("v[",i,"]", " = ", v[i], " <-- menor valor")
      fimse
      se v[i] = maior entao
         escreval("v[",i,"]", " = ", v[i], " <-- maior valor")
      senao
          escreval("v[",i,"]", " = ", v[i])
      fimse
fimpara

Escreval("-----------------------")

escreval("A soma = ", soma)

fimalgoritmo