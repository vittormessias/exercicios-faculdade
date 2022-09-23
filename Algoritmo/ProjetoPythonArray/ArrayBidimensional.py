matriz = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
for l in range(3):
    for c in range(2):
        matriz[l][c] = int(input(f'Valor para linha {l} e coluna {c}: '))
print('-='*30)
for l in range(3):
    for c in range(2):
        print(f'Valor linha {l} e Coluna {c} = {matriz[l][c]}')

