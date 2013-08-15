package kewen.web.gensite.sitedef.element

import kewen.web.gensite.sitedef.AttributeValue;
import kewen.web.gensite.sitedef.Element;

class Label extends Element {

	final static String attributeTEXT = "Text" 
	
	public Label() {
		registerAttribute(attributeTEXT, "Label Text")
	}

	
}
