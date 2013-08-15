package kewen.web.gensite.sitedef

abstract class ExtensibleDefinition {
	
	public String name
	public Map extendedAttributes
		
	void report(ReportWriter writer, int offset) {
		writer.writeLn("<extension object-name='" + name + "'>", offset)
		extendedAttributes.each{key, value -> writer.writeLn("<attribute id='" + key + "' value='" + value +"'/>", offset + Constants.indentationOffset)}
		writer.writeLn("</extension>", offset)
	}
}
