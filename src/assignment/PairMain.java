package assignment;

public class PairMain {
    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<String,Integer>();
        pair.setType1("Junhwan");
        pair.setType2(27);

        System.out.println(pair.getType1());
        System.out.println(pair.getType2());
    }
}
