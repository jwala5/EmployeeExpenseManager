package Dao;
import java.io.*;
import java.util.*;
import utility.*;
import java.sql.*; 
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
public class ConvertToPDF {
public void ConverToPDF(String Em_id, String name) throws SQLException, ClassNotFoundException, FileNotFoundException, DocumentException {
	 
	Connection con = ConnectionManager.getConnection();
	 PreparedStatement st = con.prepareStatement("SELECT * FROM salary where Em_id =?");
	 st.setString(1,Em_id);
     ResultSet query_set = st.executeQuery();
   
     Document my_pdf_report = new Document();
   
     PdfWriter.getInstance(my_pdf_report, new FileOutputStream("EmpDetails.pdf"));
     my_pdf_report.open();            
    
     Paragraph p1 = new Paragraph( name +"  Salary Details \n");
     p1.setAlignment(Paragraph.ALIGN_CENTER);
     my_pdf_report.add(p1);
     Paragraph l = new Paragraph("__________________________________________________________________________\n\n");
	 my_pdf_report.add(l);
//     PdfPTable my_report_table = new PdfPTable(6);
//     PdfPCell table_cell,cell;
     
//     String h1 = "Salary_id";
//     table_cell=new PdfPCell(new Phrase(h1));
//     my_report_table.addCell(table_cell);
//     String h2 = "Date";
//     table_cell=new PdfPCell(new Phrase(h2));
//     my_report_table.addCell(table_cell);
//     String h3 = "Amount ";
//     table_cell=new PdfPCell(new Phrase(h3));
//     my_report_table.addCell(table_cell);
//     String h4 = "Em_Id";
//     table_cell=new PdfPCell(new Phrase(h4));
//     my_report_table.addCell(table_cell);
//     String h5 = "Expense";
//     table_cell=new PdfPCell(new Phrase(h5));
//     my_report_table.addCell(table_cell);
//     String h6 = "TotSal";
//     table_cell=new PdfPCell(new Phrase(h6));
//     my_report_table.addCell(table_cell);
 
    
     while (query_set.next()) {                
                     String sid = query_set.getString(1);
                     Paragraph g1 = new Paragraph( "Salary id       =   "+sid+ "\n");
                     my_pdf_report.add(g1);
                     String dis = query_set.getString(2);
                     Paragraph g2 = new Paragraph( "Date Distributed =   "+dis+ "\n");
                     my_pdf_report.add(g2);
                     String big = query_set.getString(3);
                     Paragraph g3 = new Paragraph( "Amount          =   " +big+ "\n");
                     my_pdf_report.add(g3);
                     String mig = query_set.getString(4);
                     Paragraph g4 = new Paragraph( "Employee id     =   "+mig+ "\n");
                     my_pdf_report.add(g4);
                     String dig = query_set.getString(5);
                     Paragraph g5 = new Paragraph( "Expense         =   "+dig+ "\n");
                     my_pdf_report.add(g5);
                     String fig = query_set.getString(6);
                     Paragraph g6 = new Paragraph( "Total Salary     =   "+fig+ "\n");
                     my_pdf_report.add(g6);
                     Paragraph g7 = new Paragraph("  Thank You \n");
                     g7.setAlignment(Paragraph.ALIGN_CENTER);
                     my_pdf_report.add(g7);
                     
                     }
     
//     my_pdf_report.add(my_report_table);                       
     my_pdf_report.close();
     
     
     query_set.close();
     st.close(); 
     con.close();               
	}
}