import org.apache.commons.codec.digest.DigestUtils;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Favor informar texto para geração de hash");
        }
        System.out.println(DigestUtils.md2Hex(args[0]));
    }
}
