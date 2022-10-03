# Escreva um programa que leia um valor
valor = int(input('Digite um valor: '))
# e imprima o par de todas as possíveis combinações
for c1 in range(1, 10):
    for c2 in range(1, 10):
        # que tenha como resultado da soma o número lido.
        if c1 + c2 == valor:
            print(f"{c1} e {c2}")

