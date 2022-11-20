package chain.com.personetics.test;

import java.util.List;
import java.util.stream.IntStream;

public class ChainValidator extends Node {

	public ChainValidator(Object value) {
		super(value);
	}

	public ChainValidator() {

	}

	private IntStream chars;

	/**
	 * Method that returns validation if a list is valid or not.
	 * 
	 * @param nodes
	 * @return
	 */
	boolean validate(List<Node> nodes) {
		boolean isValidate = false;

		if (!nodes.isEmpty() && nodes != null) {
			try {
				if (getTypeOf(nodes).contains("java.lang.Integer")) {
					isValidate = integerValidation(nodes);
				}
				if (getTypeOf(nodes).contains("java.lang.String")) {
					isValidate = stringValidation(nodes);
				}

				if (getTypeOf(nodes).contains("java.lang.Integer") && getTypeOf(nodes).contains("java.lang.String")) {
					throw new ExceptionList();
				}
			} catch (ExceptionList e) {
				String listaMescladaMsg = e.getListaMesclada();
				System.out.println(listaMescladaMsg);
			} catch (Exception e) {
				e.getMessage();
				System.out.println(e.getMessage());
			}
		}
		return isValidate;
	}

}