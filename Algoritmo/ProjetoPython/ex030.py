# Um posto está vendendo combustíveis com a seguinte tabela de descontos: Álcool Até 25 litros, desconto de 2% por
# litro Acima de 25 litros, desconto de 4% por litro Gasolina Até 25 litros, desconto de 3% por litro Acima de 25
# litros, desconto de 5% por litro. Escreva  um  algoritmo  que  leia  o  número  de  litros vendidos  e  o  tipo  de
# combustível (codificado  da seguinte  forma:  A-álcool,  G-gasolina),  calcule  e  imprima  o  valor  a  ser pago
# pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,70 e o preço do litro do álcool é R$ 1,90.

print('-'*51)
print('|Álcool Até 25 litros, desconto de 2% por litro   |\n'
      '|Acima de 25 litros, desconto de 4% por litro     |\n'
      '|Gasolina Até 25 litros, desconto de 3% por litro |\n'
      '|Acima de 25 litros, desconto de 5% por litro     |')
print('-'*51)

print('Tipo de combustível')
print('-'*50)

# tipo  de combustível
valorInserido = str(input('A - álcool\n'
                          'G - gasolina\n'
                          'Digite aqui: '))
while True:
    if valorInserido not in 'AaGg':
        valorInserido = str(input('A - álcool\n'
                                  'G - gasolina\n'
                                  'Digite aqui: '))
    else:
        break

print('-'*50)
# número  de  litros vendidos
valorLitros = float(input('litros vendidos: '))
print('-'*50)
if valorInserido in 'Aa':  # álcool
    combustivelEscolhido = 'álcool'
    if valorLitros < 25:  # desconto de 2%
        # calcule o valor a ser pago
        valorPorLitro = valorLitros * 2.70
        desconto = valorPorLitro - (valorPorLitro * 0.02 / 100)
        print(f'Valor por litro: {valorPorLitro:.2f}\n'
              f'Total a pagar com desconto: {desconto:.2f}')
    print(f'Tipo de combustível: {combustivelEscolhido}')
    if valorLitros > 25:  # desconto de 4%
        # calcule o valor a ser pago
        valorPorLitro = valorLitros * 2.70
        desconto = valorPorLitro - (valorPorLitro * 0.04 / 100)
        print(f'Valor por litro: {valorPorLitro:.2f}\n'
              f'Total a pagar com desconto: {desconto:.2f}')
elif valorInserido in 'Gg':  # Gasolina
    combustivelEscolhido = 'Gasolina'
    if valorLitros < 25:  # desconto de 3%
        # calcule o valor a ser pago
        valorPorLitro = valorLitros * 1.90
        desconto = valorPorLitro - (valorPorLitro * 0.03 / 100)
        print(f'Valor por litro: {valorPorLitro:.2f}\n'
              f'Total a pagar com desconto: {desconto:.2f}')
    if valorLitros > 25:  # desconto de 5%
        # calcule o valor a ser pago
        valorPorLitro = valorLitros * 1.90
        desconto = valorPorLitro - (valorPorLitro * 0.05 / 100)
        print(f'Valor por litro: {valorPorLitro:.2f}\n'
              f'Total a pagar com desconto: {desconto:.2f}')
    print(f'Tipo de combustível: {combustivelEscolhido}')



