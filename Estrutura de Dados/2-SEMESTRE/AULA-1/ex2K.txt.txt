#include <iostream>

using namespace std;

double calcula();
void exibe(double);

int main()
{
    setlocale(LC_ALL, "Portuguese"); // configuração de idioma
    
    exibe(calcula());
    
    return 0;

}

void exibe(double RESULTADO){
    
    cout <<"O valor em moeda brasileira é: R$" << RESULTADO << endl;
}

double calcula(){
    double cotacao, quantidadeDolaresDisponivel,RESULTADO;
    
    cout <<"Qual é a cotação do dolar? " << endl;
    cin >> cotacao;
    
    cout <<"Quantidade de dólares disponível: US$" << endl;
    cin >> quantidadeDolaresDisponivel;
    
    return RESULTADO = quantidadeDolaresDisponivel * cotacao;
    
}