package com.menu.function;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.book.dao.BookDaoImpl;
import com.model.Book;
import com.util.BookUtil;
import com.util.StringUtil;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookUpdateJFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the frame.
	 */
	public BookUpdateJFrame() {
		setResizable(false);
		setBounds(100, 100, 887, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("图书修改功能");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 40));

		JLabel lblNewLabel_1 = new JLabel("书号");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 26));

		textField = new JTextField();
		textField.setFont(new Font("宋体", Font.PLAIN, 26));
		textField.setColumns(15);

		JLabel lblNewLabel_2 = new JLabel("书名");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 26));

		textField_1 = new JTextField();
		textField_1.setFont(new Font("宋体", Font.PLAIN, 26));
		textField_1.setColumns(15);

		JLabel lblNewLabel_3 = new JLabel("作者");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 26));

		textField_2 = new JTextField();
		textField_2.setFont(new Font("宋体", Font.PLAIN, 26));
		textField_2.setColumns(15);

		JLabel lblNewLabel_4 = new JLabel("类型");
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 26));

		textField_3 = new JTextField();
		textField_3.setFont(new Font("宋体", Font.PLAIN, 26));
		textField_3.setColumns(15);

		JLabel lblNewLabel_5 = new JLabel("出版社");
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 26));

		textField_4 = new JTextField();
		textField_4.setFont(new Font("宋体", Font.PLAIN, 26));
		textField_4.setColumns(15);

		JButton btnNewButton = new JButton("确认修改");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField.getText();
				String name = textField_1.getText();
				String author = textField_2.getText();
				String type = textField_3.getText();
				String press = textField_4.getText();
				Book book = new Book();
				if (StringUtil.isEmpty(id)) {
					JOptionPane.showMessageDialog(null, "书号不能为空");
				} else {
					book.setId(id);
					book.setName(name);
					book.setAuthor(author);
					book.setType(type);
					book.setPress(press);
					if (!BookUtil.bookSelect(book)) {
						JOptionPane.showMessageDialog(null, "该书不存在");
					} else {
						if (new BookDaoImpl().update(book)) {
							JOptionPane.showMessageDialog(null, "修改成功");
							dispose();
						}
					}
				}
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 26));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(289)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
						.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2).addComponent(lblNewLabel_3).addComponent(lblNewLabel_4))
						.addGap(22))
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblNewLabel_5)
								.addPreferredGap(ComponentPlacement.RELATED)))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addContainerGap(285, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING,
						gl_contentPane.createSequentialGroup().addContainerGap(417, Short.MAX_VALUE)
								.addComponent(btnNewButton).addGap(329))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
						.addContainerGap(338, Short.MAX_VALUE).addComponent(lblNewLabel).addGap(305)));
		gl_contentPane
				.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(45).addComponent(lblNewLabel).addGap(29)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1).addComponent(textField, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_2).addComponent(textField_1,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_3)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(textField_2, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(textField_3, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblNewLabel_4))))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_5))
								.addGap(18).addComponent(btnNewButton).addContainerGap(76, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
		setVisible(true);
	}
}
