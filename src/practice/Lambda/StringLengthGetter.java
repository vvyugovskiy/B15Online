package practice.Lambda;

import java.util.function.Function;

public class StringLengthGetter implements Function<String, Integer> {

    @Override
    public Integer apply(String t) {

        return t.length();
    }
}
