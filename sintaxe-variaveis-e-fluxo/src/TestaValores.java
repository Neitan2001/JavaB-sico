public class TestaValores {
    public static void main(String[] args) {
        int primeiro = 5;
        int segundo = 7;

        segundo = primeiro; // passagem por valor

        primeiro = 10;

        System.out.println(segundo); // continua 5 pois não foi passagem por referência

    }
}
