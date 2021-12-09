package picasso.parser.tokens.operations;

import picasso.parser.language.CharConstants;
import picasso.parser.tokens.chars.CharToken;

/**
 * Represents the Divide sign token
 * 
 */
public class DivideToken extends CharToken implements OperationInterface {
	public DivideToken() {
		super(CharConstants.SLASH);
	}
	/**
	 * @return the orderOP
	 */
	public final int getOrderOP() {
		return MULTIPLY_OR_DIVIDE;
	}
}
