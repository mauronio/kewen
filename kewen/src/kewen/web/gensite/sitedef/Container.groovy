package kewen.web.gensite.sitedef

class Container extends Component {

	public boolean framed = false
	public String frameTitle
	public List<Component> members
	
	@Override
	public void report(ReportWriter writer, int offset) {
		writer.writeLn("<container id='" + id + "'>", offset )
		super.report(writer, offset + Constants.indentationOffset )
		members.each{member -> member.report(writer, offset + Constants.indentationOffset) }
		writer.writeLn("</container>", offset )
	}

}
