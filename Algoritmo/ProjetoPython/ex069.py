from random import randint
# Escreva um programa que leia um vetor de 15 posições de inteiros
valor = []
for c in range(1, 16):
    i = randint(1, 10)
    valor.append(i)
# Em seguida, o programa deve ler um valor inteiro
inteiro = int(input("Digite um valor inteiro entre 1 e 10: "))

# e imprimir o número de vezes que este valor ocorre no vetor
print(f"O numero {inteiro} aparece no vetor {valor.count(inteiro)} vezes")

# print(valor)
