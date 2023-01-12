public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        /*System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);*/

        smartTv.ligar();
        System.out.println("Teste - Tv ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Teste - Tv ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.mudarCanal(33);
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.subirCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.descerCanal();
        smartTv.descerCanal();
        smartTv.descerCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

    }
}
