package app_main.views;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TransactionHistory {
	JFrame f;
	JTable j;
	TransactionHistory(){
		f = new JFrame();
		f.setTitle("Transaction History");
		String[][] data = {
			{ "Kundan Kumar Jha", "4031", "CSE" },
			{ "Anand Jha", "6014", "IT" },
			{ "Anand Jha", "6014", "IT" },
			{ "Anand Jha", "6014", "IT" },
			{ "Anand Jha", "6014", "IT" },
			{ "Anand Jha", "6014", "IT" },
			{ "Anand Jha", "6014", "IT" },
			{ "Anand Jha", "6014", "IT" },
			{ "Anand Jha", "6014", "IT" },
			{ "Anand Jha", "6014", "IT" },
			{ "Anand Jha", "6014", "IT" }
		};
		// String[] columnNames = { "Transaction ID", "Date" , "Account No", "Amount", "Remarks" };
		String[] columnNames = { "Account No", "Amount", "Remarks" };
		// Initializing the JTable
		j = new JTable(data, columnNames);
		j.setBounds(30, 40, 200, 300);

		// adding it to JScrollPane
		JScrollPane sp = new JScrollPane(j);
		f.add(sp);
		// Frame Size
		f.setSize(600, 400);
		// Frame Visible = true
		f.setVisible(true);
	}

	// Driver method
	public static void main(String[] args){
		new TransactionHistory();
	}
}
