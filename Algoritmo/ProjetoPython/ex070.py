# Escreva um programa que carregue um array com tamanho variável.
lista = []

# O tamanho máximo do array é de 100 posições
while 100 > len(lista):
    i = int(input("Digite um valor: "))
    lista.append(i)
    parar = str(input("Quer continuar? [S/N]")).upper()
    if parar in 'N':
        break
print(lista)
