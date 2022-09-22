vetor = [[], []]
for l in range(1, 4):
    for c in range(1, 3):
        valor = (int(input(f'Valor para a linha {l} e coluna {c}: ')))
        vetor[0].append(valor)
        vetor[1].append(valor)
for l in range(1, 4):
    for c in range(1, 3):
        print(f'Valor Linha e Coluna {l} x {c} = {vetor[l][c]}')



