public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.turnOn();
        smartTv.volumeUp();
        smartTv.changeChannel(5);

        System.out.println(smartTv.volume);

    }
}
