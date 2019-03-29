
package arreglo_aleatorio.clases;

import java.text.DecimalFormat;

public class Arreglo {

    int[] array;
    int dimension;

    public Arreglo(int dimension) {
        this.dimension = dimension;
        this.array = new int[dimension];
        valores_aleatorios();
    }

    public void valores_aleatorios() {
        for (int i = 0; i < this.dimension; i++) {
            this.array[i] = (int) (Math.random() * 10) + 1;
        }
    }

    public String retornar_arreglo() {
        String aux = "";
        for (int i = 0; i < this.dimension; i++) {
            aux = aux + this.array[i] + ", ";
        }
        return aux;
    }

    public int obtenerValorMaximo() {
        String aux = "";
        int max = 0;
        for (int i = 0; i < this.dimension; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        return max;
    }

    public int obtenerValorMinimo() {
        int min = 999999999;
        for (int i = 0; i < this.dimension; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return min;
    }

    public int obtenerSuma() {
        int sum = 0;
        for (int i = 0; i < this.dimension; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public String obtenerPromedio() {
        DecimalFormat df = new DecimalFormat("#.00");
        double prom = 0;
        double sum = (double) obtenerSuma();
        prom = sum / this.dimension;
        return df.format(prom);
    }

}
