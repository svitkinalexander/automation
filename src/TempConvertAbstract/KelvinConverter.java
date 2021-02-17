package TempConvertAbstract;

public class KelvinConverter extends Converter {
    public double convert(double t){
        return t + 273.15;
    }
}