"""
ATT = Passes tentados
COMP = Passes completos
YARDS = Jardas aéreas
TD = Passes para touchdown
INT = Passes interceptados
"""

# passos
ATT = float(input('Passes tentados: '))
COMP = float(input('Passes completos: '))
YARDS = float(input('Jardas: '))
TD = float(input('Passes para touchdown: '))
INT = float(input('Passes interceptados: '))

# Calcula-se  o  percentual  de  passes completados em relação aos passes tentados pelo quarterback
A = ((COMP / ATT) - 0.3) * 5
# caso  seja,  ajusta-se  o  valor  para  2,375  ou  0, respectivamente)
if A > 2.375:
    A = 2.375
elif A < 0:
    A = 0
else:
    A = A

# calcula-se a razão de jardas passadas pela quantidade de passes tentados.
B = ((YARDS / ATT) - 3) * 0.25
# caso  seja,  ajusta-se  o  valor  para  2,375  ou  0, respectivamente)
if B > 2.375:
    B = 2.375
elif B < 0:
    B = 0
else:
    B = B

# calcula-se a razão de passes para touchdowns pelo número de passes tentados
C = (TD / ATT) * 20
# caso  seja,  ajusta-se  o  valor  para  2,375  ou  0, respectivamente)
if C > 2.375:
    C = 2.375
elif C < 0:
    C = 0
else:
    C = C

# Então, calcula-se a razão entre passes interceptados e o número de passes tentados.
D = 2.375 - ((INT / ATT) * 25)
# caso  seja,  ajusta-se  o  valor  para  2,375  ou  0, respectivamente)
if D > 2.375:
    D = 2.375
elif D < 0:
    D = 0
else:
    D = D

# informe o QB Rating do quarterback
passerRating = ((A + B + C + D) / 6) * 100
print(f'QB Rating do quarterback: {passerRating:.1f}')
