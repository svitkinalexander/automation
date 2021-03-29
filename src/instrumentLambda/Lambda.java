package instrumentLambda;

import static instrumentLambda.InstrumentLambda.KEY;

public class Lambda {

    public static void main(String[] args) {
        InstrumentLambda guitar = (countString) -> System.out.printf("Инструмент гитара играет ноту %s с количеством струн %d \n", KEY, countString);
        guitar.play(6);

        InstrumentLambda drum = (size) -> System.out.printf("Инструмент барабан играет ноту %s размер которого %d см^2 \n", KEY, size);
        drum.play(50);

        InstrumentLambda trumpet = (diameter) -> System.out.printf("Инструмент труба играет ноту %s диаметр которого %d \n", KEY, diameter);
        trumpet.play(20);

    }
}
