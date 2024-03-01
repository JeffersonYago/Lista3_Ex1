package controller;

public class QtdDigController {

	public QtdDigController() {
		super();
	}
	public int QuantidadeDig(int num, int cont) {
		if(num < 10) {
// quando num é menor do que 10, significa que a quantidade de digitos é igual a 1
			return 1;
		}else {
			num = num / 10;
			return cont + QuantidadeDig(num, cont);
// a cada chamada de funcao, é acrescentado 1 ao contador; num é dividido por 10 para contabilizar os digitos
		}
	}
}
