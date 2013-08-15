package kewen.web.gensite.sitedef.element

import kewen.web.gensite.sitedef.AttributeValue;
import kewen.web.gensite.sitedef.Element;

class TextField extends Element {

	final static String attributeTEXT = "Text" 
	final static String attributeMAXLENGTH = "MaxLength"
	final static String attributeMask = "Mask"
	final static String attributeMaskDescription = "MaskDescription"
	
	public TextField() {
		registerAttribute(attributeTEXT, "Initial Text")
		registerAttribute(attributeMAXLENGTH, "Text maximum length")
		registerAttribute(attributeMask, "Input Mask")
		registerAttribute(attributeMaskDescription, "Input Mask Description for User")
	}


}
