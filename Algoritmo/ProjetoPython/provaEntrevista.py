A = [[0, 1, 1, 0, 1, 0, 0, 0, 0, 0],
     [1, 0, 0, 1, 0, 1, 1, 1, 1, 1],
     [1, 1, 1, 0, 0, 0, 1, 0, 1, 0],
     [0, 1, 1, 1, 0, 1, 0, 1, 0, 1],
     [0, 0, 1, 1, 1, 0, 0, 1, 1, 0],
     [1, 0, 1, 0, 0, 1, 1, 0, 0, 1],
     [1, 1, 0, 1, 1, 0, 0, 1, 0, 0],
     [1, 0, 1, 1, 0, 1, 0, 1, 0, 0],
     [1, 0, 0, 1, 1, 0, 0, 1, 1, 1],
     [1, 0, 0, 0, 0, 1, 1, 0, 0, 0]]
                   # X
coluna = [[], [], [], [], [], [], [], [], [], []]

for l in range(10):
    for c in range(10):
        coluna[c].append(A[l][c])

contUm = contZero = 0
senha = list()
for c in range(10):
    for v in coluna[c]:
        if v == 1:
            contUm += 1
        if v == 0:
            contZero += 1
    if contUm > contZero:
        senha.append(1)
    if contUm < contZero:
        senha.append(0)
    contUm = contZero = 0
# decimal = 708 / binario = 1011000100
# decimal = 356 / binario = 101100100
print(f'Binario: {senha}')


def binaryToDecimal(binary):
    binary1 = binary
    decimal, i, n = 0, 0, 0
    while binary != 0:
        dec = binary % 10
        decimal = decimal + dec * pow(2, i)
        binary = binary // 10
        i += 1
    print(f'Decimal: {decimal}')


binaryToDecimal(101100100)
