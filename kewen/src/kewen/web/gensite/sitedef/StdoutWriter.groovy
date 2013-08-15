package kewen.web.gensite.sitedef

class StdoutWriter extends ReportWriter {

	@Override
	public void writeLn(String line, int indentation) {
		println line.padLeft(indentation)
		
	}

}
