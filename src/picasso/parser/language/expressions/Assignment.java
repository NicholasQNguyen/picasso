package picasso.parser.language.expressions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import picasso.parser.language.ExpressionTreeNode;

/**
 * Represents the Assignment operator in the Picasso language.
 * 
 * @author John Adekola
 */
public class Assignment extends Variable {
	private static Map<String, ExpressionTreeNode> assignment = new HashMap<>();
	private String param;
	private ExpressionTreeNode param2;

//Enforoce must be an identifier token

	/**
	 * Create an Assignment expression that takes as a parameter two  given expressions
	 * 
	 * @param variable the first expression
	 * @param2 param2 the second expression
	 */
	public Assignment(String variable, ExpressionTreeNode expression) {
		super (variable);
		this.param = variable;
		this.param2 = expression;
		System.out.println("VARIABLE: " + variable);
		System.out.println("EXPRESSION: " + expression);
		assignment.put(variable, expression);
		System.out.println("DICTIONARY: " + assignment);

	}
	
	

	/**
	 * Evaluates this expression at the given x,y point by evaluating the expression of
	 * the function's parameters.
	 * 
	 * @return the color from evaluating the expression's parameters
	 */
	@Override
	public RGBColor evaluate(double x, double y) {
		
		Iterator hm = assignment.entrySet().iterator();
		for(Map.Entry mapElement : assignment.entrySet()) {
			String key = (String)mapElement.getKey();
		}
		
		//RGBColor result2 = param2.evaluate(x, y);
		
//		double red = result2.getRed();
//		double green = result2.getGreen();
//		double blue = result2.getBlue();

		return new RGBColor(1, 1, 1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Assignment)) {
			return false;
		}
		Assignment f = (Assignment) obj;
		if( !param.equals(f.param)) {
			return false;
		}
		return param2.equals(f.param2);
	}

	public static Map<String, ExpressionTreeNode> getHashMap()
	{
		return assignment;
	}
}
