# Escreva um programa que calcula o desconto previdenciário de um funcionário. Dado um salário, o programa deve
# retornar o valor do desconto proporcional ao mesmo. O cálculo segue  a  regra:  o  desconto  é  de  11%  do  valor
# do  salário,  entretanto,  o  valor  máximo  de desconto é 334,29, o que seja menor.

# Dado um salário
salario = float(input('Digite o seu salário: '))

# valor do desconto proporcional
salarioFinal = salario - (salario * 11 / 100)

# retornar o valor do desconto proporcional ao mesmo
print(f'Salario: {salario} / Desconto de 11%: {salarioFinal}')

desconto = salario * 11 / 100
if desconto > 334:
    print(f'O valor de desconto {desconto} ultrapassa o valor máximo de 334,29')
else:
    print('está dentro do limite de desconto')
