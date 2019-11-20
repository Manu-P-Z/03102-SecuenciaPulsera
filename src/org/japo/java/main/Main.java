/* 
 * Copyright 2019 Manu Portolés Zagalá.
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
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Constantes
        final String NOMBRE_HIPPY = "Marta";
        final double PRECIO_PULSERA = 0.7;
        final double PAGA_DOMINGO = 1;
        final String PRODUCTO = "Pulsera hippy";

        //Variables
        double dineroFeria;

        //Operaciones
        dineroFeria = PAGA_DOMINGO - PRECIO_PULSERA;

        //Mensaje
        System.out.println("Secuencia de Pulsera");
        System.out.println("====================");
        System.out.printf("%s %s%n", "Nombre de la niña ...:", NOMBRE_HIPPY);
        System.out.printf(Locale.ENGLISH, "%s %.2f €%n", "Dinero inicial ......:", PAGA_DOMINGO);
        System.out.println("---");
        System.out.printf("%s %s%n", "Artículo a comprar ..:", PRODUCTO);
        System.out.printf(Locale.ENGLISH, "%s %.2f €%n", "Precio artículo .....:", PRECIO_PULSERA);
        System.out.println("---");
        System.out.printf(Locale.ENGLISH, "%s %.2f €%n", "Dinero restante .....:", dineroFeria);

    }

}
