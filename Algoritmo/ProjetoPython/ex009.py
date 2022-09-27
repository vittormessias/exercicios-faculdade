# Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo, dado seu raio e sua altura.
print('*'*40)
print('Calculo do volume de uma lata de óleo')
print('*'*40)

# dado seu raio e sua altura.
raio = float(input('Qual é o raio? '))
altura = float(input('Qual é a altura? '))

# calcule o valor do volume
volume = (3.14 * (raio ** 2)) * altura

print('*'*40)

# e apresente o valor do volume
print(f'O volume é igual a 3,14 x {raio}² x {altura} = {volume}cm³')

