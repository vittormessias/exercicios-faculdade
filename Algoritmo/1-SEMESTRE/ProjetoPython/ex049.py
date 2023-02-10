# O número é primo quando é possível dividir ele por 1 e por ele mesmo.

valor = int(input("Digite um valor: "))

# todo número primo é impar
if valor % 2 == 0:  # par
    # o número 2 é exceção
    if valor == 2:
        print("Primo")
    else:
        print("Não é primo")
# impar
else:  # valor % 2 == 1
    print("Primo")
