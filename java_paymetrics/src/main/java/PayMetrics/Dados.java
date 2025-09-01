package PayMetrics;

public class Dados{


        Double[] cpu_percent;
        Double[] ram_percent;
        Double[] disco_percent;
        Double[] pacotesRecebidos;
        Double[] pacotesEnviados;

        public Dados(Double[] cpu_percent,Double[] ram_percent, Double[] disco_percent, Double[] pacotesRecebidos, Double[] pacotesEnviados){
            this.cpu_percent = cpu_percent;
            this.ram_percent = ram_percent;
            this.disco_percent = disco_percent;
        }

        public static void alertaCpu(Dados empresa1){
            for(int i = 0; i < empresa1.cpu_percent.length; i ++){
                if(empresa1.cpu_percent[i] >= 50 || empresa1.cpu_percent[i] < 70){
                    System.out.println("Cuidado com a cpu, ela está quase no limite!");
                }
                else if(empresa1.cpu_percent[i] < 90){
                    System.out.println("ALERTA! A cpu está com um uso acima do esperado!");
                }
                else if(empresa1.cpu_percent[i] >= 90){
                    System.out.println("CRITICO! A cpu está em um estado critico!");
                }
            }
        }
//        public static void alertaRam(){
//            for(int i = 0; i < ram_percent.length; i ++){
//                if(ram_percent[i] >= 50){
//                    System.out.println("Cuidado com a memoria ram, ela está quase no limite do uso!");
//                }
//                else if(ram_percent[i] >= 70){
//                    System.out.println("ALERTA! A memoria ram está com um uso acima do esperado!");
//                }
//                else if(ram_percent[i] >= 90){
//                    System.out.println("CRITICO! A memoria ram está em um estado critico!");
//                }
//            }
//        }
//        public static void discoAlerta(){
//            for(int i = 0; i < disco_percent.length; i ++){
//                if(disco_percent[i] >= 50){
//                    System.out.println("Cuidado com o disco, ela está quase no limite do uso!");
//                }
//                else if(disco_percent[i] >= 70){
//                    System.out.println("ALERTA! O disco está com um uso acima do esperado!");
//                }
//                else if(disco_percent[i] >= 90){
//                    System.out.println("CRITICO! O disco está em um estado critico!");
//                }
//            }
//        }
//        public static void alertaPacotesRecebidos(){
//            for(int i = 0; i < pacotesRecebidos.length; i ++){
//                if(pacotesRecebidos[i] >= 50){
//                    System.out.println("Cuidado! a latência da rede esta em um nível alto");
//                }
//                else if(pacotesRecebidos[i] >= 70){
//                    System.out.println("ALERTA! a letência da rede está muito alta!");
//                }
//                else if(pacotesRecebidos[i] >= 90){
//                    System.out.println("CRÍTICO! a latência da rede esta em um estado crítico!");
//                }
//            }
//        }
}
