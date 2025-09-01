package PayMetrics;

public class Main {

    public static void main(String[] args) {
        Dados empresa1 = new Dados();
        empresa1.cpu_percent = new Double[]{1.8, 18.9, 8.3, 1.1, 14.8, 13.3, 1.5, 14.1};
        empresa1.ram_percent = new Double[]{74.5, 75.1, 74.5, 72.5, 73.3, 73.5, 73.6, 73.5};
        empresa1.disco_percent = new Double[]{8.7, 8.7, 8.7, 8.7, 8.7, 8.7, 8.7, 8.7};
        empresa1.pacotesRecebidos = new Double[]{0.0004749298095703125, 0.0, 0.0, 0.0, 0.0, 0.0, 0.000110626220703125, 0.003047943115234375};
        empresa1.pacotesEnviados = new Double[]{0.005917549133300781, 0.0038089752197265625, 0.004851341247558594, 0.003032684326171875, 0.009695053100585938, 0.0028200149536132812, 0.0363616943359375, 0.009655952453613281};
        alertaCpu();
    }


}
