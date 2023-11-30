class ShowBitsDemo{
    public static void main(String[] args) {
        ShowBits sizeFour = new ShowBits(4);
        ShowBits sizeEigth = new ShowBits(8);

        System.out.println(sizeFour.show(1));
        System.out.println(sizeFour.show(2));
        System.out.println(sizeFour.show(4));
        System.out.println(sizeFour.show(8));

        System.out.println(sizeEigth.show(247));
    }
}