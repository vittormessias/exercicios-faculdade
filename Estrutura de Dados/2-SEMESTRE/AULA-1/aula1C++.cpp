#include <iostream> // comandos cin e cout
#include <math.h>  // funções matemáticas
#include <cstdlib> 
using namespace std; //diretiva using

int main(){
	setlocale(LC_ALL, "Portuguese"); // configuração de idioma

	double base, expoente, potencia;

	cout << "\nDigite a base: ";
	cin >> base;

	cout << "\nDigite o expoente: ";
	cin >> expoente;

	potencia = pow(base, expoente);
	
	cout<< base <<" elevado a " << expoente << " é:";
	cout << potencia << endl;
	
	system("pause"); // faz uma pausa para ver o resultado

return 0;
}