package controller;

public class TotalParController {
	int i = 0;
	
	public TotalParController() {
		super();
	}

	public int totalPares(int arr[], int tam) {
		
		//A condicao de parada e atingida quando o tamanho do vetor se iguala a zero, por ser o final do 
		//vetor
		if (tam == 0) {
			return i;
		}
		//A comparacao entre os valores do vetor para fazer a contagem dos pares dentro do vetor
		if (arr[tam-1] % 2 == 0) {
			i = i + 1;
		}
		//A chamada da propria funcao, fazendo com que o codigo percorra por todo o vetor
		return totalPares(arr, tam-1);
	}
	
}

