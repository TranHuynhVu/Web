	import javax.swing.*;
	import java.awt.*;
public class mIN {


	public class ScrollPaneExample {
		 public static void main(String[] args) {
		        SwingUtilities.invokeLater(() -> {
		            JFrame frame = new JFrame("JScrollPane Example with Null Layout");
		            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		            JPanel contentPanel = new JPanel();
		            contentPanel.setLayout(null);

		            // Tạo nội dung cho JPanel (nội dung lớn hơn kích thước JPanel)
		            int labelHeight = 20;
		            for (int i = 1; i <= 20; i++) {
		                JLabel label = new JLabel("Label " + i);
		                label.setBounds(10, (i - 1) * labelHeight, 100, labelHeight);
		                contentPanel.add(label);
		            }

		            JScrollPane scrollPane = new JScrollPane(contentPanel);
		            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		            frame.getContentPane().add(scrollPane);
		            frame.setSize(300, 200);
		            frame.setLocationRelativeTo(null);
		            frame.setVisible(true);
		        });
		    }
	}

}
