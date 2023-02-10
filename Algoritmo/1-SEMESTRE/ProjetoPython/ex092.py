# Elabore um programa para ler valores e armazená-los em uma matriz 5 x 5.
A = [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]
for l in range(5):
    for c in range(5):
        A[l][c] = int(input(f'Valor da linha {l+1} e coluna {c+1}: '))
# Após o programa deverá responder se a matriz é ou não uma matriz simétrica.
# Uma matriz simétrica possui a mesma composição de valores abaixo e acima da diagonal principal.
if A[0] == A[1] and A[2] == A[3]:
    print(f"É uma matriz simétrica")
else:
    print("Não é uma matriz simétrica")

# A diagonal principal de uma matriz une o seu canto superior esquerdo ao canto inferior direito
if A[0][4] == A[1][0]:
    print(f"É uma matriz diagonal principal")
else:
    print("Não é uma matriz diagonal principal")


