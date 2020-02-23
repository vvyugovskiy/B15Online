package javaconceptoftheday;

class Apple {
    int i;

    {
        System.out.println("First IIB Block");
    }

    {
        System.out.println("Second IIB Block");
    }

    Apple(int j)
    {
        this();
        System.out.println("First Constructor");
    }

    Apple()
    {
        System.out.println("Second Constructor");
    }
}

class MainClass3 {
    public static void main(String[] args) {
        Apple a = new Apple(50);
    }
}