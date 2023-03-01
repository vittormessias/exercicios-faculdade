#include <iostream> // comandos cin e cout
using namespace std; //diretiva using

// declaração 
double reajusteSalario(double valor1, double valor2);

int main()
{
    setlocale(LC_ALL, "Portuguese"); // configuração de idioma
    
    double SM, PR, resultado;
    cout <<"\nDigite o valor do salario mensal: "<< endl;
    cin >> SM;
    
    cout <<"\nDigite o valor do percentual de reajuste: "<<endl;
    cin >> PR;
    
    resultado = reajusteSalario(SM, PR);
    cout <<"\nValor de reajuste: " << resultado << endl;
    system("sleep 5"); // faz uma pausa para ver o resultado

return 0;
}


double reajusteSalario(double valor1, double valor2){
    
    double NS, reajuste;
    
    reajuste = valor1 * valor2;
    NS = valor1 + reajuste;
    return NS;
}