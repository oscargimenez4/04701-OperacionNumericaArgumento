/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Random;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public final class App {

    //Constantes de operacion
    public static final int OP_SUM = 0; // Suma
    public static final int OP_RES = 1; // Resta
    public static final int OP_MUL = 2; // Producto
    public static final int OP_DIV = 3; // Cociente
    public static final int OP_MOD = 4; // Resto
    public static final int OP_MED = 5; // Media
    public static final int OP_MAY = 6; // Mayor
    public static final int OP_MEN = 7; // Menor

    //Constantes
    public static final int N1;
    public static final int N2;

    //Static
    static {
        //Random
        final Random RND = new Random();
        //Limites
        final int MIN = 1;
        final int MAX = 10;
        N1 = RND.nextInt(MAX - MIN + 1) + MIN;
        N2 = RND.nextInt(MAX - MIN + 1) + MIN;
    }

    public final void launchApp() {
        //Cabecera
        System.out.println("OPERACIÓN NUMÉRICA");
        System.out.println("==================");
        //Muestra numeros
        System.out.printf("Número 1 .....:%d%n", N1);
        System.out.printf("Número 2 .....:%d%n", N2);
        //salto de linea
        System.out.println("---");
        //Calculo
        int mayor = (int) operar(N1, N2, OP_MAY);
        //mensaje final
        System.out.printf("El MAYOR es .: %d%n", mayor);
    }

    public static final double operar(double n1, double n2, int op) {
        double result = 0;
        switch (op) {
            case OP_SUM:
                result = N1 + N2;
                break;
            case OP_RES:
                result = N1 - N2;
                break;
            case OP_MUL:
                result = N1 * N2;
                break;
            case OP_DIV:
                result = N1 / N2;
                break;
            case OP_MOD:
                result = N1 % N2;
                break;
            case OP_MED:
                result = N1 + N2 / 2;
                break;
            case OP_MAY:
                result = N1 > N2 ? N1 : N2;
                break;
            case OP_MEN:
                result = N1 < N2 ? N1 : N2;
                break;
            default:
                throw new AssertionError();
        }
        return result;
    }

}
