#include <iostream> // comandos cin e cout
using namespace std; //diretiva using

// declaração das funções
int calculoMultiplicação(int A, int C);
int calculoSoma(int B, int D);

int main()
{
    setlocale(LC_ALL, "Portuguese"); // configuração de idioma

    int valor1, valor2, valor3, valor4;
    
    cout<<"\nDigite o 1 Valor: ";
    cin >> valor1;
    cout<<"\nDigite o 2 Valor: ";
    cin >> valor2;
    cout<<"\nDigite o 3 Valor: ";
    cin >> valor3;
    cout<<"\nDigite o 4 Valor: ";
    cin >> valor4;
    
    int resultadoDivisão, resultadoSoma;
    
    int resultadoMultiplicação = calculoMultiplicação(valor1, valor3);
    resultadoSoma = calculoSoma(valor2, valor4);
    
    cout << "\nMultiplicação: " << resultadoMultiplicação << endl;
    cout << "\nSoma: " << resultadoSoma << endl;

    system("sleep 5"); // faz uma pausa para ver o resultado

return 0;
}


int calculoMultiplicação(int A, int C){
    int P;
    P = A * C;
    return P;
}

int calculoSoma(int B, int D){
    int S;
    S = B + D;
    return S;
}


=========================================================
#include <iostream> // comandos cin e cout
using namespace std; //diretiva using

// declaração das funções
int calculoMultiplicação(){
    int valorA, valorC;
    cout<<"\nDigite o valor de A: ";
    cin >> valorA;
    
    cout<<"\nDigite o valor de C: ";
    cin >> valorC;
    
    int P;
    P = valorA * valorC;
    return P;
}

int calculoSoma(){
    int valorB, valorD;
    
    cout<<"\nDigite o valor de B: ";
    cin >> valorB;
    
    cout<<"\nDigite o valor de D ";
    cin >> valorD;
    
    int S;
    S = valorB + valorD;
    return S;
}

void exibir(int resultadoMultiplicação, int resultadoSoma){

    cout << "\nMultiplicação: " << resultadoMultiplicação << endl;
    cout << "\nSoma: " << resultadoSoma << endl;
    
    system("sleep 5"); // faz uma pausa para ver o resultado
}


int main(void)
{
    setlocale(LC_ALL, "Portuguese"); // configuração de idioma
    
    exibir(calculoMultiplicação(), calculoSoma());

return 0;
}





