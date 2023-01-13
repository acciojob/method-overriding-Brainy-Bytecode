package com.driver;

public class Main {

    public static void main(String[] args) {

        B b=new B();
        b.meth();
    }
  
}

class A {

    public String meth() {

        return null;
    }
}


class B extends A {

    public String meth() {

        return "Method is overridden in Extended class B";
    }
}
