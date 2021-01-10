public class AutoPark {
    public static void main(String[] args) throws CloneNotSupportedException {


        Jaguar jaguar = new Jaguar("XE", 3800, 150000);

        Jaguar jaguar1 = new Jaguar("XF", 3800, 210000);
        try {
            Jaguar jaguar2 = jaguar.clone();
            System.out.println(jaguar);
            System.out.println(jaguar.equals(jaguar1));
            System.out.println(jaguar1);
            System.out.println(jaguar.hashCode());
            System.out.println(jaguar2);
            Mitsubishi mitsubishi = new Mitsubishi("L 200", 3000, 200000);
            Mitsubishi mitsubishi1 = new Mitsubishi("Pajero", 3800, 160000);
            System.out.println(mitsubishi);
            System.out.println(mitsubishi.equals(mitsubishi1));
            System.out.println(mitsubishi.hashCode());

        } catch (Exception e) {

        }
    }
}
