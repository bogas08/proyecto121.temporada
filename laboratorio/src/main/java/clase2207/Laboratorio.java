
package clase2207;


    public class Laboratorio {
public static void main(String[] args) {
        ConfiguracionAulaVirtual config1 =ConfiguracionAulaVirtual.getInstancia();
        config1.mostrarConfiguracion();
        System.out.println("--- Modificando configuración ---");
        config1.setMaxEstudiantes(80);
        ConfiguracionAulaVirtual config2 =ConfiguracionAulaVirtual.getInstancia();
        config2.mostrarConfiguracion(); // Mostrará 80 como máximode estudiantes
        System.out.println("¿Ambos objetos son iguales?: " +
        (config1 == config2));
        }
}

