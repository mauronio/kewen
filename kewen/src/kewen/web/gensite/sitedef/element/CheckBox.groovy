package kewen.web.gensite.sitedef.element

import kewen.web.gensite.sitedef.Element

class CheckBox extends Element {

	final static String attributeTEXT = "Text"
	final static String attributeSELECTED = "Selected"
	
	public CheckBox() {
		registerAttribute(attributeTEXT, "Label Text")
		registerAttribute(attributeSELECTED, "Selected: T True, F False")
	}
}
