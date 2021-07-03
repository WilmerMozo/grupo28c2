import org.graalvm.compiler.core.common.spi.ForeignCallLinkage;

public class App {

    private String nombre;
    private int edad;
    private double estatura;
    private float peso;
    private char inicial;

    private String direccionVivienda;

    public static void main(String[] args) throws Exception {
        //Operadores aritmeticos
        int resultado = 5 + 4;
        double resultado2 = 5 / 4;
        double resultado3 = 12 % 4;
        resultado++;
        resultado = resultado + 1;
        resultado--;
        resultado = -resultado;
        resultado = +resultado;
        //Operadores lógicos-nos periten comparar valores "booleanos"
        boolean respuesta = 5 > 4;
        respuesta = 25 != 12;
        respuesta = true;
        respuesta = 15 > 12 && 5 < 2;
        respuesta = 15 > 12 || 5 < 2;
        //Operadores Bit a bit -booleanos-
        //&
        //^
        //|
        //--------------------------------------------------
        // estructuras de control
        // condicionales
        if (respuesta) {
            //resultado se se cumple la condición
        }
        if (respuesta) {
            //resultado se se cumple la condición
        } else {
            //resultado se no se cumple la condición
        }
        int valor = 3;
        switch (valor) {// evaluaria si se cumple la condicion en cada uno de los casos, es como un if en cascada
            case 1:
               //bloque de codigo 
                break;
             case 2:
                //bloque de codigo 
                 break;
            case 3:
                //bloque de codigo 
                  break;//Funciona para romper el caso
        
            default:
                break;
        //ciclos o bucles
        while (valor != 3) { 
            //bloque de codigo
        }
        do {
            
        } while (valor != 3);
        //por cada elemento en la lista hace algo
        for (String string : args) {
            //bloque de codigo- instrucciones de cualquier tipo
            //for int se divide en tres partes
        for (int i = 0; i < args.length; i++) {
            //bloque de codigo
            
        }
        for(;;){} //for infinito
            
        


    }
}
