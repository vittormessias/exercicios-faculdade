valor = int(input("Digite quantos termos devem aparecer: "))
f0 = 0
f1 = 1
fn = 0
print(f"F({valor}) = ", end=" ")
for c in range(valor+1):
    f0 = f1
    f1 = fn
    print(f"{fn}, ", end="")
    fn = f0 + f1
print("...")


