vetor = []
soma = 0
print('-'*20)
print(f'<< Bem Vindo! >>')
print('-'*20)
for i in range(1, 6):
    vetor.append(int(input(f'Informe o {i}° valor de v[{0}]:')))
menor = maior = vetor[0]
for c, v in enumerate(vetor):
    if v > maior:
        maior = v
    elif v < menor:
        menor = v
    soma += v
print('-'*20)
for c, v in enumerate(vetor):
    c += 1
    if v == maior:
        print(f'v[{c}] = {maior} <-- maior valor')
    elif v == menor:
        print(f'v[{c}] = {menor} <-- menor valor')
    else:
        print(f'v[{c}] = {v}')
print(f'A soma = {soma}')

