package kewen.web.gensite.sitedef

final class Page extends Container {

	@Override
	public void report(ReportWriter writer, int offset) {
		writer.writeLn("<page id='" + id + "'>", offset )
		super.report(writer, offset + Constants.indentationOffset )
		writer.writeLn("</page>", offset )
	}
	
	
}
