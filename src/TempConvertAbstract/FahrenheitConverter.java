package TempConvertAbstract;

public class FahrenheitConverter extends Converter {
    public double convert(double t){
        return t * 1.8 + 32;
    }

}