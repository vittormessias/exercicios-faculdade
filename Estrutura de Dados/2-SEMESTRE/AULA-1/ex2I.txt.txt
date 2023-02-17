#include <iostream>

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
    
    cout <<"A diferença entre eles é: " << RESULTADO << endl;
}

int calcula(){
    int RESULTADO, A, B;
    
    cout <<"Digite um numero: " << endl;
    cin >> A;
    cout <<"Digite um outro numero: " << endl;
    cin >> B;
    
    if(A > B){
        RESULTADO = A - B;
    } else{
        RESULTADO = B - A;
    }
    
    return RESULTADO;
}