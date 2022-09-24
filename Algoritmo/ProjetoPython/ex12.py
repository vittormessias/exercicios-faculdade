# Faça um algoritmo que transforme uma velocidade fornecida em m/s pelo usuário para Km/h. Para tal, multiplique o
# valor em m/s por 3,6.

print('*'*40)
print(' Transformação de m/s para km/h')
print('*'*40)

# velocidade fornecida
velocidade = float(input('Digite uma velocidade: '))

# multiplicando o valor em m/s por 3,6
velocidadeFinal = velocidade * 3.6

print('-'*40)
# velocidade em Km/h
print(f'Velocidade em {velocidade}m/s convertida para {velocidadeFinal}Km/h')
