package PayMetrics;

public class tratamentosDados extends Main{
    Double[] cpu_percent;
    Double[] ram_percent;
    Double[] disco_percent;
    Double[] ping;

    public void alertaCpu(){
        for(int i = 0; i < cpu_percent.length; i ++){
            if(cpu_percent[i] > 70){
                System.out.println();
            }

        }
    }
    public Double alertaRam{

    }
}
