public class Main {

    public static void main(String[] args) {

        Car davis = new Car();
        System.out.println(davis);
        System.out.println(davis.getColor());

        Car iris = davis;

        System.out.println(iris);
        System.out.println(iris.getColor());

        iris.setColor("green");
        System.out.println(iris.getColor());
        System.out.println(davis.getColor());

        davis.setMake("Subaru");

        Car sam = new Car();
        sam.setMake("idk");
        sam.setColor("black");
        System.out.println("-----");
        System.out.println(davis);
        System.out.println(iris);
        System.out.println(sam);


//        System.out.println(EvenDigitSum.getEvenDigitSum(246));
//        System.out.println(EvenDigitSum.getEvenDigitSum(36689));
//        System.out.println(EvenDigitSum.getEvenDigitSum(24466789));
    }
}
