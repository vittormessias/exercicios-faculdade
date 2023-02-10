def DecisaoSimples():
    texto = "TESTE"
    if texto == "TESTE":
        print("igual", texto)


DecisaoSimples()


def DecisaoComposta():
    texto = "TES"
    if texto == "TESTE":
        print("igual", texto)
    else:
        print("diferente", texto)


DecisaoComposta()


def DecisaoEncadeada():
    texto = "NAO TESTE"
    if texto == "TESTE":
        print("igual", texto)
    elif texto == "NAO TESTE":
        print("NÃO TESTE", texto)
    else:
        print("diferente", texto)
        

DecisaoEncadeada()
