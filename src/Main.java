import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService client = new BmiService();
        double weight = 57.5;
        double height = 1.75;
        double bodyMassIndex = client.calculate(weight, height);

        DecimalFormat df = new DecimalFormat("###.#");
        System.out.println(df.format(bodyMassIndex));

    }
}
