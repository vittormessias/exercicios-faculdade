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

void exibe(double VOLUME){
    
    cout <<"O volume da caixa retangular é: " << VOLUME << endl;
}

double calcula(){
    
    double VOLUME, COMPRIMENTO, LARGURA, ALTURA;
    
    cout <<"Qual é o comprimento da caixa retangular: " << endl;
    cin >> COMPRIMENTO;
    
    cout <<"Qual é a largura da caixa retangular: " << endl;
    cin >> LARGURA;
    
    cout <<"Qual é o altura da caixa retangular: " << endl;
    cin >> ALTURA;
    
    return VOLUME = (COMPRIMENTO * LARGURA * ALTURA);
}