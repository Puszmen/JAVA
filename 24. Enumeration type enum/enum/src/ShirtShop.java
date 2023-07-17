public class ShirtShop {

    public static void main(String[] args) {

//        System.out.println("XSMALL - " + Tshirt.XSMALL);
//        System.out.println("SMALL - " + Tshirt.SMALL);
//        System.out.println("MEDIUM - " + Tshirt.MEDIUM);
//        System.out.println("LARGE - " + Tshirt.LARGE);

        System.out.println(Size.SMALL.getDescription());
        System.out.println(Size.MEDIUM.getDescription());
        System.out.println(Size.LARGE.getDescription());

        Tshirt tshirt = new Tshirt();
        tshirt.setSize(Size.SMALL);

    }
}
