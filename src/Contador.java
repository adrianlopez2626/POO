public class Contador {
    int inicio;
    int fin;

    //Constructor
    public Contador(int inicio, int fin){
        this.inicio=inicio;
        this.fin=fin;
    }

    public void contar(){
        //Método que escribe por pantalla los números desde inicio hasta fin

        //Solución 1
        for(int i=inicio;i<=fin;i++){
            System.out.println(i);
        }
        //Solución 2
        int i=inicio;
        while(i<fin){
            System.out.println(i);
            i++;
        }


    }
    //Suma desde inicio hasta fin
    public int sumar(){
        int suma=0;

        //Tenemos que sumar y almacenar en suma, la suma desde inicio hasta fin
        for(int i=inicio;i<=fin;i++){
            suma=suma+i;
        }


        return suma;
    }

}
