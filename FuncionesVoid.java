
public class FuncionesVoid {
    
    public static void main(String[] args){
        // como solo imprime un valor, no retorna nada,
        // no lo guardo en ninguna variable
        imprimirSimbolo('x', 5);
        imprimirSimbolo('@', 8);
        imprimirSimbolo('3', 3);

        // como la funcion devuelve un valor,
        // lo guardo en una variable y la imprimo
        String s = sucesionSimbolos('#', 7);
        System.out.println(s);
    }
    
    static void imprimirSimbolo(char simbolo, int veces){
        System.out.println( sucesionSimbolos(simbolo, veces) );
    }
    
    static String sucesionSimbolos(char simbolo, int veces){
        String sucesion = "";
        for(int i = 0; i < veces; i++){
            sucesion += simbolo;
        }
        return sucesion;
    }
}
