package PayMetrics;

public class Dados{


        Double[] cpu_percent;
        Double[] ram_percent;
        Double[] disco_percent;
        Double[] pacotesRecebidos;
        Double[] pacotesEnviados;

        public void alertaCpu(){
            for(int i = 0; i < cpu_percent.length; i ++){
                if(cpu_percent[i] >= 90){
                    System.out.println("CRITICO! A cpu está em um estado critico!");
                }
                else if(cpu_percent[i] >= 70 && cpu_percent[i] < 90){
                    System.out.println("ALERTA! A cpu está com um uso acima do esperado!");
                }
                else if(cpu_percent[i] >= 50 && cpu_percent[i] < 70){
                    System.out.println("Cuidado com a cpu, ela está quase no limite!");
                }
            }
        }
        public void alertaRam(){
            for(int i = 0; i < ram_percent.length; i ++){
                if(ram_percent[i] >= 90){
                    System.out.println("CRITICO! A memoria ram está em um estado critico!");
                }
                else if(ram_percent[i] >= 70 && ram_percent[i] < 90){
                    System.out.println("ALERTA! A memoria ram está com um uso acima do esperado!");
                }
                else if(ram_percent[i] >= 50 && ram_percent[i] < 70){
                    System.out.println("Cuidado com a memoria ram, ela está quase no limite do uso!");
                }
            }
        }
        public void discoAlerta(){
            for(int i = 0; i < disco_percent.length; i ++){
                if(disco_percent[i] >= 90){
                    System.out.println("CRITICO! O disco está em um estado critico!");
                }
                else if(disco_percent[i] >= 70 && disco_percent[i] < 90){
                    System.out.println("ALERTA! O disco está com um uso acima do esperado!");
                }
                else if(disco_percent[i] >= 50 && disco_percent[i] < 70){
                    System.out.println("Cuidado com o disco, ela está quase no limite do uso!");
                }
            }
        }
        public void alertaPacotesRecebidos(){
            for(int i = 0; i < pacotesRecebidos.length; i ++){
                if(pacotesRecebidos[i] >= 90){
                    System.out.println("CRÍTICO! a latência da rede esta em um estado crítico!");
                }
                else if(pacotesRecebidos[i] >= 70 && pacotesRecebidos[i] < 90){
                    System.out.println("ALERTA! a letência da rede está muito alta!");
                }
                else if(pacotesRecebidos[i] >= 50 && pacotesRecebidos[i] < 70){
                    System.out.println("Cuidado! a latência da rede esta em um nível alto");
                }
            }
        }
        public void alertaPacotesEnviados(){
            for(int i = 0; i < pacotesEnviados.length; i ++){
                if(pacotesEnviados[i] >= 90){
                    System.out.println("CRÍTICO! a latência da rede esta em um estado crítico!");
                }
                else if(pacotesEnviados[i] >= 70 && pacotesEnviados[i] < 90){
                    System.out.println("ALERTA! a letência da rede está muito alta!");
                }
                else if(pacotesEnviados[i] >= 50 && pacotesEnviados[i] < 70){
                    System.out.println("Cuidado! a latência da rede esta em um nível alto");
                }
            }
        }
}
