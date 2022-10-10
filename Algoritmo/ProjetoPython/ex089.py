# Escreva um programa que gere uma string composta
nome = str(input('Digite o seu nome: ')).upper()
nomeDoMeio = str(input('Digite seu nome do meio: '))
condicao = str(input('Você tem sobrenome? [S/N]'))[0]
# pelo último nome, seguido de virgula e as iniciais dos demais nomes (em ordem), seguida de ponto.
if condicao in 'Ss':
    sobrenome = str(input('Digite seu ultimo nome: '))
    print(f'{sobrenome}, {nome[0]}. {nomeDoMeio.upper()[0]}.')
else:
    print(f'{nomeDoMeio}, {nome[0]}.')
