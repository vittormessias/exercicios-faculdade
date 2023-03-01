#include <iostream>
#include "math.h"
using namespace std;

int calcula();
void exibe(int);

int main()
{
    setlocale(LC_ALL, "Portuguese"); // configuração de idioma
    
    exibe(calcula());
    
    return 0;

}

void exibe(int RESULTADO){
    
    cout <<"À soma dos quadrados dos três valores lidos é: " << RESULTADO << endl;
}

int calcula(){
    int A, B, C, RESULTADO;
    
    cout <<"Digite um numero: " << endl;
    cin >> A;
    
    cout <<"Digite um outro numero:" << endl;
    cin >> B;
    
    cout <<"Digite mais um numero:" << endl;
    cin >> C;
    
    return RESULTADO = pow(A, 2) + pow(B, 2) + pow(C, 2);
    
}