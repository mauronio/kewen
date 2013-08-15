/**
 * 
 */
package kewen.web.gensite.sitedef.element;

import kewen.web.gensite.sitedef.Element;
import kewen.web.gensite.sitedef.AttributeValue;

/**
 * @author mauro
 *
 */
public class SelectionField extends Element {

	/*
	 * Fixed list has the form "value1,text1;value2,text2;...;valueN,textN"
	 */
	final static String attributeVALUELIST = "valueList";
	/*
	 * The value to return when no value is selected. 
	 */
	final static String attributeNULLVALUE = "nullValue";
	/*
	 * The selected value by default. 
	 */
	final static String attributeDEFAULTVALUE = "defaulValue";
	/*
	 * The selected value.
	 */
	final static String attributeSELECTEDVALUE = "selectedValue";

    public SelectionField() {
		registerAttribute(attributeVALUELIST, "Value List")
		registerAttribute(attributeNULLVALUE, "Value for NULL")
		registerAttribute(attributeDEFAULTVALUE, "Default Value")
		registerAttribute(attributeSELECTEDVALUE, "Selected Value")
		
	}
}
