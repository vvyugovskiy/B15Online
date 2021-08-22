import java.io.EOFException;
import java.util.Optional;

public class OptionalJob {

    public static void main(String[] args) throws EOFException {

        Optional<String> optString = Optional.ofNullable("jopa");
        optString.orElseThrow(()->new RuntimeException());



    }
}
