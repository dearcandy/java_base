package base.generics;


/**
 * 泛型类测试
 * @author liuhangfei
 */
public class GenericsDemo01 {

    public static void main(String[] args) {
        Point<String> point = new Point<>();
        point.setVar("test");
        System.out.println(point.getVar());
    }

}

class Point<T>{
    private T var ;

    public T getVar(){
        return var ;
    }
    public void setVar(T var){
        this.var = var ;
    }
}