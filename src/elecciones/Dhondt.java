package elecciones;

import java.io.Serializable;

/**
 *
 * @author Josemi
 */

public class Dhondt implements Serializable{

    //Cogemos el mayor de la tabla creada y lo eliminamos.
    //Devuelve la fila que contiene el partido con el maximo.
	public static int getMaximo(double [][]dTable, int pN, int pM)
	{
	double maxValue = dTable[0][0];
 	int maxElement = 0;
	int i =0, j =0;
	for (int sn = 0; sn < pN; sn++) {
		for (int sm = 0; sm < pM; sm++) {
		if(dTable[sm][sn] > maxValue){
			maxValue = dTable[sm][sn];
			i =sm;
			j = sn;
			}
		  }
		}
	dTable[i][j] = 0.0; 
	return j;
	}

}