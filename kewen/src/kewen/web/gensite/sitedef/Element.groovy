package kewen.web.gensite.sitedef

abstract class Element extends Component {

	String type
	
	Map<String, AttributeValue> attributes
	
	void registerAttribute(String name, String description) {
		AttributeValue textAttribute = new AttributeValue()
		textAttribute.name = name
		textAttribute.description = description

		attributes.put(name, textAttribute)
	}
	
	void updateAttribute(String name, String value ) {
		AttributeValue attribute = attributes.get(name)
		attribute.value = value
	}
	
	
	@Override
	public void report(ReportWriter writer, int offset) {
		writer.writeLn("<element id='" + id + "' type='" + this.class.name + "'>", offset )
		super.report(writer, offset + Constants.indentationOffset )
		writer.writeLn("<attributes>", offset + Constants.indentationOffset + Constants.indentationOffset )
		attributes.each{key, attribute -> attribute.report(writer, offset + Constants.indentationOffset) }
		writer.writeLn("<attributes/>", offset + Constants.indentationOffset + Constants.indentationOffset )
		writer.writeLn("</element>", offset )
	}
}
