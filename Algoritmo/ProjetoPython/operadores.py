def atribuicao():
    lado = 2
    pi = 3.14
    caract = 'A'
    texto = "DevMedia"
    area = 2
    area *= 2

    print("Lado = ", lado)
    print("PI = ", pi)
    print("Caracter = ", caract)
    print("Texto = ", texto)
    print("Area = ", area)


atribuicao()


def aritmeticos(n1, n2):
    resultado = n1 + n2
    print("Soma = ", resultado)

    resultado = n1 - n2
    print("Sub = ", resultado)

    resultado = n1 * n2
    print("Mult = ", resultado)

    resultado = n1 / n2
    print("Div = ", resultado)


aritmeticos(5.8, 3.2)


def incremento():
    numero = 5
    print("Numero = ", numero)

    numero += 1
    print("Numero =", numero)

    numero -= 1
    print("Numero =", numero)


incremento()


def igualdade():
    valorA = 1
    valorB = 2
    textoA = "TESTE"
    textoB = "TEXTO"

    if valorA == valorB:
        print("Valores iguais")
    else: 
        print("Valores diferentes")

    if valorA != valorB:
        print("Valores diferentes")
    else:
        print("Valores iguais")

    if textoA == textoB:
        print("TEXTOS iguais")
    else:
        print("TEXTOS diferentes")

    if textoA != textoB:
        print("TEXTOS diferentes")
    else:
        print("TEXTOS iguais")


igualdade()


def relacionais():
    valorA = 1
    valorB = 2

    if valorA > valorB:
        if valorA == valorB:
            print("igual")
        print("maior")
    else:
        if valorA == valorB:
            print("igual")
        print("menor")


relacionais()


def logicos():
    if 1 == (2 - 1) and 2 == (1 + 1):
        print("Ambas as expressões são verdadeiras")
    
    if 1 != (2 - 1) or 2 == (1 + 1):
        print("iguais")


logicos()


def exemplos():
    quantidadeAnos = 5
    horasTrabalhadas = 40
    valorHora = 50
    salario = 0

    if quantidadeAnos <= 1:
        salario = 1500 + (valorHora * horasTrabalhadas)
    elif 1 < quantidadeAnos < 3:
        salario = 2000 + (valorHora * horasTrabalhadas)
    else:
        salario = 3000 + (valorHora * horasTrabalhadas)
    print("salario", salario)


exemplos()
