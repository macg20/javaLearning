package pl.emgie.interfaces;

public interface PrivateMethod {

    private int sum(int a, int b) {
        return  a+b;
    }

    default int sumTreeNumber(int a, int b, int c) {
        return sum(sum(a,b),c);
    }
}
