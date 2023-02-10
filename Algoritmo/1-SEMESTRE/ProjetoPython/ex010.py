# Converter um inteiro informado menor que 32 para sua representação em binário
print('*'*40)
print(f'    Representação em binário ')
print('*'*40)

# inteiro informado
base = int(input('Digite um valor inteiro menor que 32: '))

# teste inteiro informado menor que 32
while True:
    if base < 32:
        break
    else:
        print('-'*40)
        print('       Valor inválido!')
        print('-' * 40)
        base = int(input('Digite um valor inteiro menor que 32: '))

lista = []
# Converter um inteiro informado para binário
if base % 2 == 0:
    lista.append(0)
else:
    lista.append(1)
while True:
    # print(base)
    quociente = base // 2
    if quociente % 2 == 0:  # par
        lista.append(0)
    elif quociente % 2 == 1:  # impar
        lista.append(1)
    base = quociente
    # saida do laço
    if quociente == 1:
        break

# sequência de restos de baixo para cima (de trás pra frente)
lista.reverse()

print('='*40)
# representação em binário
print(f'O número convertido para binario é', end=' ')
for v in lista:
    print(f'{v}', end='')
print()























#contador = 0
"""while contador <= inteiro:
    contador *= contador
    resultado = inteiro // 2
    resultado = factorial(resultado) // 2
    if resultado % 2 == 0:
        lista.append(0)
    elif resultado % 2 == 1:
        lista.append(1)
    contador += 1
print(lista)"""
