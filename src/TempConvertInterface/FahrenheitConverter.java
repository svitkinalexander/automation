package TempConvertInterface;

public class FahrenheitConverter implements Converter{
        public double convert(double t){
            return t * 1.8 + 32;
        }

}
