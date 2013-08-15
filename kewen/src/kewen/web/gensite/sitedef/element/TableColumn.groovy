package kewen.web.gensite.sitedef.element

import kewen.web.gensite.sitedef.Element

class TableColumn extends Element {

	/*
	 * Column ID
	 */
	final static String attributeCOLUMNID = "columnID"
	/*
	 * Column title text
	 */
	final static String attributeCOLUMNTEXT = "columnText"
	/*
	 * Column type: L Label, I Input, A Action
	 */
	final static String attributeCOLUMNTYPE = "columnType"
	
	public TableColumn() {
		registerAttribute(attributeCOLUMNID, "Column ID")
		registerAttribute(attributeCOLUMNTEXT, "Column title text")
		registerAttribute(attributeCOLUMNTYPE, "Column type: L Label, I Input, A Action")
	}
}
