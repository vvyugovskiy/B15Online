package javaconceptoftheday;

class ClassOne
{
    int methodOne(int i, int j)
    {
        return i++ + ++j - ++i - j++;   //1ST -->> (-2,-2)
    }
}

abstract class ClassTwo extends ClassOne
{
    abstract int methodOne(int i, int j, int k);

    @Override
    int methodOne(int i, int j)
    {
        return methodOne(i, j, i+j); // 2ND
    }
}

class ClassThree extends ClassTwo
{
    @Override
    int methodOne(int i, int j, int k)
    {
        return --i - j-- + ++k - i++ + ++j - k--; // 3RD
    }
}

class MainClass5
{
    public static void main(String[] args)
    {
        ClassOne one = new ClassOne();

        ClassThree three = new ClassThree();

        System.out.println(three.methodOne(one.methodOne(10101, 20202), one.methodOne(20202, 10101)));  // 0
    }
}
