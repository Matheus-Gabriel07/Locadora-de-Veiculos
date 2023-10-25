package OperaçõesVeiculos;

public class Settings {
    public static void start(){}
    public void timeDelay(int millis){}
}
class Delay extends Settings{
    @Override
    public void timeDelay(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {};
    }

    public void spacePrint(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println();
        }
    }
}
