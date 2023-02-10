# A famosa conjectura de Goldbach diz que todo inteiro par maior que 2 é soma de dois números primos.
# Testes foram feitos, mas ainda não se achou um contra-exemplo.
# Escreva um programa mostrando que a afirmação é verdadeira para todo número par entre 500 e 1000.
from random import randint

while True:
    valor = randint(500, 1000)
    if valor % 2 == 0:
        valor = valor
        break
print(valor)

lista = []
for c1 in range(500, 1000):
    if c1 % 2 == 1:
        lista.append(c1)








