#include <iostream> // comandos cin e cout
using namespace std; //diretiva using

// declaração das funções
int somaEleitor(int A, int B, int C, int nulos, int branco);
double descobrePercetual(double porcetualCandidatos);
double PercetualCandidatos(int numeroEleitor, int votos);

int main()
{
    setlocale(LC_ALL, "Portuguese"); // configuração de idioma
    
    // entrada de dados
    int candidatoA, candidatoB, candidatoC, votosNulos,votosBranco;
    cout <<"\nVotos do candidato A: "<<endl;
    cin >> candidatoA;
    cout <<"\nVotos do candidato B: "<<endl;
    cin >> candidatoB;
    cout <<"\nVotos do candidato C: "<<endl;
    cin >> candidatoC;
    cout <<"\nVotos nulos: "<<endl;
    cin >> votosNulos;
    cout <<"\nVotos em branco: "<<endl;
    cin >> votosBranco;
    
    //função somar quantidade de eleitores
    int numeroTotalEleitor;
    numeroTotalEleitor = somaEleitor(candidatoA, candidatoB, candidatoC, votosNulos, votosBranco);
    cout << "\nEleitores: " << numeroTotalEleitor << endl;
    
    //função descobre Percetual
    double percentualFinal;
    percentualFinal = descobrePercetual(numeroTotalEleitor);
    cout << "\nPercentual: " << percentualFinal << "%" << endl;
    
    //função descobre Percetual candidatos
    double percetualCandidatoA;
    percetualCandidatoA = PercetualCandidatos(numeroTotalEleitor, candidatoA);
    
    double percetualCandidatoB;
    percetualCandidatoB = PercetualCandidatos(numeroTotalEleitor, candidatoB);
    
    double percetualCandidatoC;
    percetualCandidatoC = PercetualCandidatos(numeroTotalEleitor, candidatoC);
    
    double percetualNulos;
    percetualNulos = PercetualCandidatos(numeroTotalEleitor, votosNulos);
    
    double percetualBranco;
    percetualBranco = PercetualCandidatos(numeroTotalEleitor, votosBranco);
    
    // saida percentual dos candidatos
    cout << "\nPercentual do candidato A: " << percetualCandidatoA << "%" << endl;
    cout << "\nPercentual do candidato B: " << percetualCandidatoB << "%" << endl;
    cout << "\nPercentual do candidato C: " << percetualCandidatoC << "%" << endl;
    cout << "\nPercentual votos nulos: " << percetualNulos << "%" << endl;
    cout << "\nPercentual votos branco: " << percetualBranco << "%" << endl;
    
    system("sleep 5"); // faz uma pausa para ver o resultado

return 0;
}

int somaEleitor(int A, int B, int C, int nulos, int branco){
    int resultadoSoma;
    resultadoSoma = A + B + C + nulos + branco;
    return resultadoSoma;
}

double descobrePercetual(double porcetualCandidatos){
    double percentualFinal;
    percentualFinal = porcetualCandidatos * porcetualCandidatos / 100;
    return percentualFinal;
}

double PercetualCandidatos(int numeroEleitor, int votos){
    double percetual;
    percetual = numeroEleitor * votos / 100;
    return percetual;
}

