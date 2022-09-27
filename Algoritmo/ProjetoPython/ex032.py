# Escreva um programa que leia um caractere diga se ele é uma vogal, consoante, número ou um símbolo (qualquer
# outro caracter, que não uma letra ou número).

print('*'*85)
print('Esse programa diz se o valor digitado é uma vogal, consoante, número ou um símbolo')
print('*'*85)
caracter = input('Digite aqui: ').upper()[0]

if caracter in 'AEIOU':
    print('É uma vogal')
elif caracter in 'BCDFGJKLMNPQRSTVWXZ':
    print('É uma consoante')
elif caracter in '12345678910':
    print('É um número')
elif caracter in '!@#$%¨&*()_+°/?=§´~^\|;,.':
    print('É um símbolo')


