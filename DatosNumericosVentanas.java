import javax.swing.*;//Clase que contiene ventanas gráficas

public class DatosNumericosVentanas {//Clase actual

    public static void main(String[] args) {//Metodo Main, todo inicia aqui

        //Le asignamos a una variable de la class String el metodo grafico JOptionPane.showInputDialog
        String numeroString= JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");

        /* Declaramos la variable afuera para que exista en todo el contexto del metodo main */
        int numeroDecimal=0;

        /*Manejamos las excepciones, en caso de que el usuario no capture un numero entero, envia mensaje
         * de error y devuelve al metodo main para continuar con el flujo del programa*/
        try{
            numeroDecimal= Integer.parseInt(numeroString);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error Debe mostrar un numero entero");
            main(args);
            System.exit(0);
        }

        /*Este bloque se va a imprimir en la terminal*/
        System.out.println("El numero Decimal es = " + numeroDecimal+System.lineSeparator());

        String mensajeBinario="El numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);

        String mensajeOctal= "El numero Octal de " + numeroDecimal + " = " +Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);

        String mensajeHexaDecimal = "El numero Hexadecimal de " + numeroDecimal + " = "+Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexaDecimal);

        /*Este bloque se imprimirá en una ventana grafica con JOptionPane.showMessageDialog*/
        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexaDecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
