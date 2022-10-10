# Elabore um programa que leia valores inteiros para preencher uma matriz A 5 x 5
A = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]
# Você deverá criar adicionalmente dois vetores de 5 elementos: somaLinhas
somaLinhas = [[], [], [], [], []]
# E somaColunas
somaColunas = [[], [], [], [], []]
for l in range(5):
    for c in range(5):
        A[l][c] = int(input(f'Valor da linha {l+1} e coluna {c+1}: '))
        # deverá ser armazenada a soma da linha correspondente na matriz A
        somaLinhas[l].append(A[l][c])
        # deverá ser armazenada a soma da coluna correspondente na matriz A
        somaColunas[c].append(A[l][c])
print('-='*30)
# a soma da linha
print("   Linha   ")
print(somaLinhas)
for i, v in enumerate(somaLinhas):
    print(f"Soma Linha {i+1} = {sum(v)}")

print('-='*30)
# a soma da coluna
print("  Coluna  ")
print(somaColunas)
for i, v in enumerate(somaColunas):
    print(f"Soma Coluna {i+1} = {sum(v)}")
