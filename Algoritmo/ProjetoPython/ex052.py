# A série de FETUCCINE é gerada da seguinte forma: os dois primeiros termos são fornecidos pelo usuário
A1 = int(input("Informe o valor do primeiro termo: "))
A2 = int(input("Informe o valor do segundo termo: "))

# para existir esta série serão necessários pelo menos três termos.
numeroTermos = int(input("Digite a quantidade de termos: "))
while True:
    if numeroTermos < 3:
        print("A quantidade mínima de termos é 3! ")
        numeroTermos = int(input("Digite a quantidade de termos: "))
    else:
        break

# imprima os N primeiros termos da série digitados pelo usuario
print(A1, end=", ")
print(A2, end=", ")

# a partir daí, os termos são gerados
for i in range(3, numeroTermos):
    # com a subtração ou soma dos dois termos anteriores
    if i % 2 == 0:
        valorTermo = A2 - A1  # para i par
    else:
        valorTermo = A2 + A1  # para i ímpar
    A1 = A2
    A2 = valorTermo
    print(valorTermo, end=", ")






"""
termoPositivo = A1 + A2
termoNegativo = A1 - A2
if termoPositivo % 2 == 0:
    for termoPositivo in range(termoPositivo, 25):
        termo = A2 - A1
        A1 = A2
        A2 = termo
        print(termo, end=", ")
elif termoNegativo % 2 == 0:
    for termoNegativo in range(termoNegativo, 25):
        termo = A2 - A1
        A1 = A2
        A2 = termo
        print(termo, end=", ")
# Ai = Ai-1 + Ai-2, para i ímpar
elif termoPositivo % 2 == 1:
    for termoPositivo in range(termoPositivo, 25):
        termo = A2 + A1
        A1 = A2
        A2 = termo
        print(termo, end=", ")
elif termoNegativo % 2 == 1:
    for termoNegativo in range(termoNegativo, 25):
        termo = A2 + A1
        A1 = A2
        A2 = termo
        print(termo, end=", ")"""
