# Escreva um programa que leia um vetor
vetor = list()
# de 10 posições de inteiros ordenados
print("Informe Dez inteiros")
for c in range(10):
    seq = int(input(f"Digite o {c + 1}° valor: "))
    vetor.append(seq)
vetor.sort()
print('-' * 70)
print("O programa deve informar a posição onde este inteiro ocorre no vetor")
print('-' * 70)
# e um inteiro
print("Informe Um inteiro")
x = int(input("Digite um valor: "))

# O programa deve informar a primeira posição onde este inteiro ocorre no vetor
for i, v in enumerate(vetor):
    if x == v:
        print(f"O valor {x} ocorre na posição {i+1}")
        break
    else:
        if x not in vetor:
            # ou -1 caso o valor não ocorra no vetor (Busca Binária)
            print(f'{-1}')
            break
print(vetor)

