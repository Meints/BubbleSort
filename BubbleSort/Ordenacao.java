public class Ordenacao {
    private int vet[] = {9,8,5,6,3,4,7,0,2,1};


    public void bubbleSort(){
        int aux = 0;
        mostraVet();
        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = 0; j < vet.length - i - 1; j++) {
                if (vet[j] > vet[j+1]) {
                    aux      = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1]   = aux;
                }
            }
            System.out.println("---------> Final da " + i + "º interação <---------");
            mostraVet();
        }
    }

    public void mostraVet(){
        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.print(vet[i]+ " ");
        }
        System.out.println("");
    }
}
