public class Check implements Implement{
    int radius = 7;
    int pi = 314;
    int cap = 65;
    @Override
    public void area() {
        int area = radius*pi;
        System.out.println(area);
    }

    @Override
    public void maxLength() {
        int maxLength = cap;
        System.out.println(maxLength);

    }
}
