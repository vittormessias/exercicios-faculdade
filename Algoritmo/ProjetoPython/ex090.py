# Escreva um programa que dado uma string
listaCaracter = list()
caracter = str(input('Digite uma palavra: '))
# crie uma nova string contendo na ordem em que aparecem no string dado,
palavra = caracter
print(f'A palavra {caracter} tem as vogais: ', end='')
for i in range(len(palavra)):
    # as vogais no começo
    for v in palavra[i]:
        if v.upper() in 'AEIOU':
            print(f'{v}', end=', ')
print()
print(f'E tem as consoantes: ', end='')
for i in range(len(palavra)):
    # e as consoantes no final
    for v in palavra[i]:
        if v.upper() in 'BCDFGJKLMNPQRSTVWXZ':
            print(f'{v}', end=', ')
