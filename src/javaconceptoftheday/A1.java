package javaconceptoftheday;

abstract class A1
{
    abstract int firstMethod(int i);

    abstract int secondMethod(int i);

    int thirdMethod(int i)
    {
        return secondMethod(++i);
    }
}

abstract class B1 extends A1
{
    @Override
    int secondMethod(int i)
    {
        return firstMethod(++i);
    }
}

class C1 extends B1
{
    @Override
    int firstMethod(int i)
    {
        return ++i;
    }
}

class MainClass4
{
    public static void main(String[] args)
    {
        C1 c = new C1();

        System.out.println(c.thirdMethod(121121));
    }
}
