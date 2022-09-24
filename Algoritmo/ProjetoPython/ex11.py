# Faça um algoritmo para calcular a nota semestral de um aluno. A nota semestral é obtida pela média aritmética
# entre a nota de 2 bimestres. Cada nota de bimestre é composta por 2 notas de provas.

print('*'*40)
print('     Nota Semestral de um aluno')
print('*'*40)

print(' 1°BIMESTRE')
print('-'*40)
# Cada nota de bimestre é composta por 2 notas de provas.
nota1 = float(input('Digite a nota da 1° prova: '))
nota2 = float(input('Digite a nota da 2° prova: '))

print('-'*40)
print(' 2°BIMESTRE')
print('-'*40)
# Cada nota de bimestre é composta por 2 notas de provas.
nota3 = float(input('Digite a nota da 1° prova: '))
nota4 = float(input('Digite a nota da 2° prova: '))

# calcular a nota semestral
media = (nota1 + nota2 + nota3 + nota4) / 2

print('='*40)
# média aritmética entre a nota de 2 bimestres
print(f'Média final: {media}')
