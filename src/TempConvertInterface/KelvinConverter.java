package TempConvertInterface;

public class KelvinConverter implements Converter{
    public double convert(double t){
        return t + 273.15;
    }
}
