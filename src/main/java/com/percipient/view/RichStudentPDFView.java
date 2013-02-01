package com.percipient.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfAction;
import com.lowagie.text.pdf.PdfDestination;
import com.lowagie.text.pdf.PdfWriter;
import com.percipient.bean.Student;

public class RichStudentPDFView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model,
			Document document, PdfWriter writer, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		Student student = (Student) model.get("stud");

		Table table = new Table(2);
		table.addCell("First Name");
		table.addCell("Last Name");

		table.addCell(student.getFirstName());
		table.addCell(student.getLastName());

		document.add(table);

		// to open the PDF in 100% zoom
		writer.setOpenAction(PdfAction.gotoLocalPage(1, new PdfDestination(
				PdfDestination.XYZ, 0, 10000, 1), writer));
	}
}
