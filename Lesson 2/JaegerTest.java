public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger("Gipsy Danger", 1.980f, 10);

        jaeger1.setModelName("Cherno Alpha");
        jaeger1.setStrenght(10);
        jaeger1.setWeight(2.412f);

        System.out.println("Робот 1: " + jaeger1.getModelName());
        System.out.println("Робот 1: " + jaeger1.getStrenght());
        System.out.println("Робот 1: " + jaeger1.getWeight());
        jaeger1.useVortexCannon();

        System.out.println("Робот 2: " + jaeger2.getModelName());
        System.out.println("Робот 2: " + jaeger2.getStrenght());
        System.out.println("Робот 2: " + jaeger2.getWeight());
        jaeger2.move();

        if (jaeger1.getModelName().equals(jaeger2.getModelName())) {
            System.out.println("Имена одинаковые");
        } else {
            System.out.println("Имена разные");
        }

        if (jaeger1.getStrenght() == jaeger2.getStrenght()) {
            System.out.println("Cила одинаковая");
        } else {
            System.out.println("Сила разная");
        }

        if (jaeger1.getWeight() == jaeger2.getWeight()) {
            System.out.println("Вес одинаковый");
        } else {
            System.out.println("Вес разный");
        }
    }
}
