package chain.com.personetics.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		ChainValidator chainValidator = new ChainValidator();

		List integers1 = Arrays.asList(36, 6, 2, 3, 21, 23, 4, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 5, 7, 8, 9, 10, 11,
                12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 24, 25, 1);
		List integers2 = Arrays.asList(4, 6, 2, 35, 2, 51, 40, 13, 23, 541 , 2, 3, 21, 23, 4, 26);

		List strs10 = Arrays.asList("abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz");
		List strs20 = Arrays.asList("abc", "test", "s", "rua", "o", "a", "b", "c", "abc", "test", "s", "rua", "o", "a", "b", "c");
     
				

		List<Node> nodesInteger10 = new ArrayList<>(integers1);
		List<Node> nodesInteger20 = new ArrayList<>(integers2);

		List<Node> nodesStrs10 = new ArrayList<>(strs10);
		List<Node> nodesStrs20 = new ArrayList<>(strs20);

		System.out.println(chainValidator.validate(nodesInteger10));
		System.out.println(chainValidator.validate(nodesInteger20));
		System.out.println(chainValidator.validate(nodesStrs10));
		System.out.println(chainValidator.validate(nodesStrs20));

	}

}