//子类可以调用哪些方法
package com.zileikeyidiaoyongdefagnfa;

class F {
    public void ran() {

    }
}

class S extends F {
    public void eat() {

    }
}

class Main {
    public static void main(String[] args) {
        F s = new S();
        s.ran();
        //s.eat(); //Cannot resolve method 'eat' in 'F'
        //q的编译类型是Test，所以q能调用的方法只能从Test类中找
        //在写代码时，编译器只认编译类型
        //若要调用eat方法，可以强制类型转换
        S s1 = (S)s;
        ((S) s).eat();
        s1.eat();



    }
}
