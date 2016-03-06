public class numerosAutomorficos{
// Es un numero automorfico aquel que aparece como ultimos digitos del cuadrado del mismo numero. Cadena: 1, 5, 6, 25, 76, 376, 625, 9376
static long maxNumber = 1000000; // Numero maximo hasta el cual buscar
    public static void main(String[] args){
        for(long i=1;i<=maxNumber;i++){
            long cuadrado = i * i;
            //Tamanno de numero
            long numberSize = 1;
            long j = i;
            while(j/10!=0){
                   numberSize++;
                   j = j/10;
            }
            //sabiendo el tamanno de numero; hay que reducir el tamanno del cuadrado a los ultimos digitos
            numberSize = (long)Math.pow(10,numberSize); 
            if(cuadrado%numberSize == i){
                System.out.println("Es automorfico " + i + " con cuadrado " + cuadrado);
            }
        }
    }
}
//compilar primero con javac helloworld.java ; leer con java helloWorld