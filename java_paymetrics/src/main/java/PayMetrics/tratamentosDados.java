package PayMetrics;

public class tratamentosDados extends Main{
    Double[] cpu_percent;
    Double[] ram_percent;
    Double[] disco_percent;
    Double[] ping;

    public void alertaCpu(){
        for(int i = 0; i < cpu_percent.length; i ++){
            if(cpu_percent[i] >= 50){
                System.out.println("Cuidado com a cpu, ela está quase no limite!");
            }
            else if(cpu_percent[i] >= 70){
                System.out.println("ALERTA! A cpu está com um uso acima do esperado!");
            }
            else if(cpu_percent[i] >= 90){
                System.out.println("CRITICO! A cpu está em um estado");
            }

        }
    }
    public Double alertaRam{

    }
}
