#include <iostream>
#include <cstdlib>
#include <conio.h>
#include <cmath>
using namespace std;

double recebe(){
    double comprimento;
    
    cout << "Comprimento: " << endl;
    
    cin >> comprimento;
    
    return comprimento;
}

void exibe(double diametro, double raio, double area);
double diametro(double comprimento);
double raio(double diametro);
double area(double raio);

int main(){
    setlocale(LC_ALL, "Portuguese"); // configuração de idioma

    // Construção do menu 
    char tecla;
    while (tecla != 27){ // A tecla 27 do teclado corresponde ao 'ESC'
        cout << "\n1 - Para realizar o calculo\nESC - Para finalizar!" << endl;
        tecla = getch(); 
    switch (tecla)
        case '1':{ 
                
                double valor = recebe();
                exibe(diametro(valor),raio(diametro(valor)), area(raio(diametro(valor))));

                cout << endl;
                system("pause");
                system("cls");

                break;
                }
    }
    return 0;
}

void exibe(double diametro, double raio, double area){
    cout << "\nO diametro do circulo e: " << diametro << endl;
    cout << "\nO raio do circulo e: " << raio << endl;
    cout << "\nA area do circulo e: " << area << endl;
}

double diametro(double comprimento){
    double diametro;
    diametro = comprimento / 3.14;
    return diametro;
}

double raio(double diametro){
    double raio;
    raio = diametro / 2;
    return raio;
}

double area(double raio){
    double area;
    area = 3.14 * pow(raio, 2);
    return area;
}