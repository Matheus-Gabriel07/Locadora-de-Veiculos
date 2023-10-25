

public interface Settings {
    public void delayTimer(int millis);
    public void spacePrint(int size);
    public void breakPrint();
}

class Configuration implements Settings {
    public void delayTimer(int millis) {
        System.out.println("Carregando...");
        try{
            Thread.sleep(millis);
        } catch(InterruptedException e){}
    }

    public void spacePrint(int size) {
        for(int i = 0; i < size; i++){
            System.out.println();
        }
     }

    public void breakPrint() {
        System.out.println("--------------------------------");
    }
}
