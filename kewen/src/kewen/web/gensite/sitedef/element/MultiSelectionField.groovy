/**
 * 
 */
package kewen.web.gensite.sitedef.element;

import kewen.web.gensite.sitedef.Element;

/**
 * @author mauro
 *
 */
public class MultiSelectionField extends Element {

	/*
	 * Fixed list has the form "value1,text1;value2,text2;...;valueN,textN"
	 */
	final static String attributeVALUELIST = "valueList";
	/*
	 * The value to return when no value is selected. 
	 */
	final static String attributeNULLVALUE = "nullValue";
	/*
	 * The selected values list in the form "value1;value2;...;valueN".
	 */
	final static String attributeSELECTEDVALUES = "selectedValueList";
	
	public MultiSelectionField() {
		registerAttribute(attributeVALUELIST, "Value List")
		registerAttribute(attributeNULLVALUE, "Value for NULL")
		registerAttribute(attributeSELECTEDVALUES, "selectedValueList")
	}
}
