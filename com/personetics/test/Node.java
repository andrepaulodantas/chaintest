package chain.com.personetics.test;

import java.util.ArrayList;
import java.util.List;


public class Node<T> {

	private List<T> nodes = new ArrayList<T>();

	public Node(T value) {
		super();

	}

	public Node() {
		super();
	}

	public T getValue(T o) {
		return o;
	}


	public List<T> getNodes() {
		return nodes;
	}

	public void setNodes(List<T> nodes) {
		this.nodes = nodes;
	}

	Class<?> getTokens(List<T> list) {
		return list.getClass().getComponentType();
	}

	/**
	 * Method that adds an item to the node list according to the list passed by the
	 * parameter
	 * 
	 * @param itens
	 */
	public void addSpecialItems(List<T> itens) {
		for (T t : itens) {
			addSpecialItem(t);
		}

	}

	/**
	 * Method that adds an item to the node list according to the item passed by the
	 * parameter
	 * 
	 * @param item
	 */
	public void addSpecialItem(T item) {
		nodes.add(item);

	}

	Boolean isInteger(Object o) {
		if (o.getClass() == Integer.class) {
			return true;
		}
		return false;
	}

	Boolean isString(Object o) {
		if (o.getClass() == String.class) {
			return true;
		}
		return false;

	}

	/**
	 * Type of elements in a List
	 * 
	 * @param n
	 * @return
	 */
	String getTypeOf(List<Node> n) {
		Class<? extends Object> class1 = null;
		String typeName = null;
		for (Object element : n) {
			typeName = element.getClass().getName();
		}
		return typeName;
	}

	/**
	 * 
	 * Validates if the list is of the Integer type
	 * 
	 * @param nodes
	 * @return
	 */
	public boolean integerValidation(List<Integer> nodes) {
		boolean aws = false;

		try {

			List<Object> moreThanOneDigits = new ArrayList<>();
			List<Object> oneDigits = new ArrayList<>();
			List<Boolean> isValid = new ArrayList<>();

			nodes.stream().filter(i -> i >= 10).forEachOrdered(moreThanOneDigits::add);
			nodes.stream().filter(i -> i < 10).forEachOrdered(oneDigits::add);

			for (Object number : moreThanOneDigits) {
				String numberStr = number.toString();
				for (int i = 0; i < numberStr.length(); i++) {
					String substring = numberStr.substring(i, i + 1);
					Integer numberSplited = Integer.valueOf(substring);
					isValid.add(oneDigits.contains(numberSplited));
				}

			}

			if (isValid.stream().allMatch(e -> e == Boolean.TRUE)) {
				return true;
			}
			isValid.removeAll(isValid);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			ex.getMessage();
		}

		return aws;
	}

	/**
	 * 
	 * Validates if the list is of type String
	 * 
	 * @param nodes
	 * @return
	 */
	public boolean stringValidation(List<String> nodes) {

		boolean aws = false;

		List<Object> moreThanOneDigits = new ArrayList<>();
		List<Object> oneDigits = new ArrayList<>();
		List<Boolean> isValid = new ArrayList<>();

		nodes.stream().filter(i -> i.length() >= 2).forEachOrdered(moreThanOneDigits::add);
		nodes.stream().filter(i -> i.length() < 2).forEachOrdered(oneDigits::add);

		for (Object o : moreThanOneDigits) {
			String objectStr = o.toString();
			for (int i = 0; i < objectStr.length(); i++) {
				String substring = objectStr.substring(i, i + 1);
				isValid.add(oneDigits.contains(substring));
			}

		}
		if (isValid.stream().allMatch(e -> e == Boolean.TRUE)) {
			return true;
		}
		isValid.removeAll(isValid);

		return aws;
	}

}