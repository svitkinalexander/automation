package Instrument;

public class automation12 {
    public static void main(String[] args) {
        Instrument guitar = new Instrument() {
            @Override
            public void play(){
                int countString = 6;
                System.out.println("Инструмент гитара с кол-вом струн " + countString + " играет ноту " + KEY);
            }
        };
        Instrument drum = new Instrument() {
            @Override
            public void play(){
                int size = 50;
                System.out.println("Инструмент барабан размером " + size + "см^2 играет ноту " + KEY);
            }
        };
        Instrument trumpet = new Instrument() {
            @Override
            public void play(){
                int diameter = 20;
                System.out.println("Инструмент труба диаметром " + diameter + "см играет ноту " + KEY);
            }
        };
        guitar.play();
        drum.play();
        trumpet.play();
    }
}
