package base.generics;


/**
 * @author liuhangfei
 */
public class GenericsDemo03 {
    public static void main(String[] arsg) {
        Info<String> i;
        i = new InfoImpl<>("汤姆");
        System.out.println("内容：" + i.getVar());
    }
}

interface Info<T> {
    T getVar();
}

class InfoImpl<T> implements Info<T> {
    private T var;

    public InfoImpl(T var) {
        this.setVar(var);
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public T getVar() {
        return this.var;
    }
}


