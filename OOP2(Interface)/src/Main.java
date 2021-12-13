public class Main {
    public static void main(String[] args) {
        CEO ceo = new CEO("Captain", "Marvel", 30000);
        Programmer dang = new Programmer("Dang", "Red", 10000);
        AI alphaGo = new AI("alphaGo", "Java");

        ceo.orderWebsite(dang);

        ceo.orderWebsite(alphaGo);

    }

}
