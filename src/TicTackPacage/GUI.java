package TicTackPacage;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class GUI {
	/**
	 * @param <String>
	 * @param args
	 */
	static Machine machine = new Machine();
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Display display = new Display();
		final Shell shell = new Shell(display);

		final Button button1 = new Button(shell, SWT.PUSH);
		button1.setBounds(10, 10, 80, 40);
		button1.setText("1");

		final Button button2 = new Button(shell, SWT.PUSH);
		button2.setBounds(10, 10, 80, 40);
		button2.setText("2");

		final Button button3 = new Button(shell, SWT.PUSH);
		button3.setBounds(10, 10, 80, 40);
		button3.setText("3");

		final Button button4 = new Button(shell, SWT.PUSH);
		button4.setBounds(10, 10, 80, 40);
		button4.setText("4");

		final Button button5 = new Button(shell, SWT.PUSH);
		button5.setBounds(10, 10, 80, 40);
		button5.setText("5");

		final Button button6 = new Button(shell, SWT.PUSH);
		button6.setBounds(10, 10, 80, 40);
		button6.setText("6");

		final Button button7 = new Button(shell, SWT.PUSH);
		button7.setBounds(10, 10, 80, 40);
		button7.setText("7");

		final Button button8 = new Button(shell, SWT.PUSH);
		button8.setBounds(10, 10, 80, 40);
		button8.setText("8");

		final Button button9 = new Button(shell, SWT.PUSH);
		button9.setBounds(10, 10, 80, 40);
		button9.setText("9");
		
		final Button startbutton = new Button(shell, SWT.PUSH);
		startbutton.setBounds(10, 10, 80, 40);
		startbutton.setText("Start");
		
		final Label scoreField = new Label(shell, SWT.CENTER);
		final Button resetbutton = new Button(shell, SWT.PUSH);
		resetbutton.setBounds(10, 10, 80, 40);
		resetbutton.setText("Reset");
		
		shell.setText("TIC TAC TOE");
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		shell.setLayout(layout);
		GridData data = new GridData();
		data.horizontalAlignment = SWT.FILL;
		data.verticalAlignment = SWT.FILL;
		data.grabExcessHorizontalSpace = true;
		data.grabExcessVerticalSpace = true;
		button1.setLayoutData(data);
		button2.setLayoutData(data);
		button3.setLayoutData(data);
		button4.setLayoutData(data);
		button5.setLayoutData(data);
		button6.setLayoutData(data);
		button7.setLayoutData(data);
		button8.setLayoutData(data);
		button9.setLayoutData(data);
		startbutton.setLayoutData(data);
		scoreField.setLayoutData(data);
		resetbutton.setLayoutData(data);
		startbutton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				machine.GameStart();
				button1.setText(Character.toString(machine.Board.getField(0)));
				button2.setText(Character.toString(machine.Board.getField(1)));
				button3.setText(Character.toString(machine.Board.getField(2)));
				button4.setText(Character.toString(machine.Board.getField(3)));
				button5.setText(Character.toString(machine.Board.getField(4)));
				button6.setText(Character.toString(machine.Board.getField(5)));
				button7.setText(Character.toString(machine.Board.getField(6)));
				button8.setText(Character.toString(machine.Board.getField(7)));
				button9.setText(Character.toString(machine.Board.getField(8)));
				scoreField.setText(Integer.toString(machine.Player1.getScore())+"|"+Integer.toString(machine.Player2.getScore()));
			}

		});
		resetbutton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				machine.ResetGame();
				button1.setText(Character.toString(machine.Board.getField(0)));
				button2.setText(Character.toString(machine.Board.getField(1)));
				button3.setText(Character.toString(machine.Board.getField(2)));
				button4.setText(Character.toString(machine.Board.getField(3)));
				button5.setText(Character.toString(machine.Board.getField(4)));
				button6.setText(Character.toString(machine.Board.getField(5)));
				button7.setText(Character.toString(machine.Board.getField(6)));
				button8.setText(Character.toString(machine.Board.getField(7)));
				button9.setText(Character.toString(machine.Board.getField(8)));
				scoreField.setText(Integer.toString(machine.Player1.getScore())+"|"+Integer.toString(machine.Player2.getScore()));
			}

		});
		
		button1.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				machine.Mark(0);
				button1.setText(Character.toString(machine.Board.getField(0)));
				button2.setText(Character.toString(machine.Board.getField(1)));
				button3.setText(Character.toString(machine.Board.getField(2)));
				button4.setText(Character.toString(machine.Board.getField(3)));
				button5.setText(Character.toString(machine.Board.getField(4)));
				button6.setText(Character.toString(machine.Board.getField(5)));
				button7.setText(Character.toString(machine.Board.getField(6)));
				button8.setText(Character.toString(machine.Board.getField(7)));
				button9.setText(Character.toString(machine.Board.getField(8)));
				scoreField.setText(Integer.toString(machine.Player1.getScore())+"|"+Integer.toString(machine.Player2.getScore()));
			}

		});
		
		button2.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				machine.Mark(1);
				button1.setText(Character.toString(machine.Board.getField(0)));
				button2.setText(Character.toString(machine.Board.getField(1)));
				button3.setText(Character.toString(machine.Board.getField(2)));
				button4.setText(Character.toString(machine.Board.getField(3)));
				button5.setText(Character.toString(machine.Board.getField(4)));
				button6.setText(Character.toString(machine.Board.getField(5)));
				button7.setText(Character.toString(machine.Board.getField(6)));
				button8.setText(Character.toString(machine.Board.getField(7)));
				button9.setText(Character.toString(machine.Board.getField(8)));
				scoreField.setText(Integer.toString(machine.Player1.getScore())+"|"+Integer.toString(machine.Player2.getScore()));
			}

		});
		
		button3.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				machine.Mark(2);
				button1.setText(Character.toString(machine.Board.getField(0)));
				button2.setText(Character.toString(machine.Board.getField(1)));
				button3.setText(Character.toString(machine.Board.getField(2)));
				button4.setText(Character.toString(machine.Board.getField(3)));
				button5.setText(Character.toString(machine.Board.getField(4)));
				button6.setText(Character.toString(machine.Board.getField(5)));
				button7.setText(Character.toString(machine.Board.getField(6)));
				button8.setText(Character.toString(machine.Board.getField(7)));
				button9.setText(Character.toString(machine.Board.getField(8)));
				scoreField.setText(Integer.toString(machine.Player1.getScore())+"|"+Integer.toString(machine.Player2.getScore()));
			}

		});
		
		button4.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				machine.Mark(3);
				button1.setText(Character.toString(machine.Board.getField(0)));
				button2.setText(Character.toString(machine.Board.getField(1)));
				button3.setText(Character.toString(machine.Board.getField(2)));
				button4.setText(Character.toString(machine.Board.getField(3)));
				button5.setText(Character.toString(machine.Board.getField(4)));
				button6.setText(Character.toString(machine.Board.getField(5)));
				button7.setText(Character.toString(machine.Board.getField(6)));
				button8.setText(Character.toString(machine.Board.getField(7)));
				button9.setText(Character.toString(machine.Board.getField(8)));
				scoreField.setText(Integer.toString(machine.Player1.getScore())+"|"+Integer.toString(machine.Player2.getScore()));
			}

		});
		
		button5.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				machine.Mark(4);
				button1.setText(Character.toString(machine.Board.getField(0)));
				button2.setText(Character.toString(machine.Board.getField(1)));
				button3.setText(Character.toString(machine.Board.getField(2)));
				button4.setText(Character.toString(machine.Board.getField(3)));
				button5.setText(Character.toString(machine.Board.getField(4)));
				button6.setText(Character.toString(machine.Board.getField(5)));
				button7.setText(Character.toString(machine.Board.getField(6)));
				button8.setText(Character.toString(machine.Board.getField(7)));
				button9.setText(Character.toString(machine.Board.getField(8)));
				scoreField.setText(Integer.toString(machine.Player1.getScore())+"|"+Integer.toString(machine.Player2.getScore()));
			}

		});
		
		button6.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				machine.Mark(5);
				button1.setText(Character.toString(machine.Board.getField(0)));
				button2.setText(Character.toString(machine.Board.getField(1)));
				button3.setText(Character.toString(machine.Board.getField(2)));
				button4.setText(Character.toString(machine.Board.getField(3)));
				button5.setText(Character.toString(machine.Board.getField(4)));
				button6.setText(Character.toString(machine.Board.getField(5)));
				button7.setText(Character.toString(machine.Board.getField(6)));
				button8.setText(Character.toString(machine.Board.getField(7)));
				button9.setText(Character.toString(machine.Board.getField(8)));
				scoreField.setText(Integer.toString(machine.Player1.getScore())+"|"+Integer.toString(machine.Player2.getScore()));
			}

		});
		
		button7.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				machine.Mark(6);
				button1.setText(Character.toString(machine.Board.getField(0)));
				button2.setText(Character.toString(machine.Board.getField(1)));
				button3.setText(Character.toString(machine.Board.getField(2)));
				button4.setText(Character.toString(machine.Board.getField(3)));
				button5.setText(Character.toString(machine.Board.getField(4)));
				button6.setText(Character.toString(machine.Board.getField(5)));
				button7.setText(Character.toString(machine.Board.getField(6)));
				button8.setText(Character.toString(machine.Board.getField(7)));
				button9.setText(Character.toString(machine.Board.getField(8)));
				scoreField.setText(Integer.toString(machine.Player1.getScore())+"|"+Integer.toString(machine.Player2.getScore()));
			}

		});
		
		button8.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				machine.Mark(7);
				button1.setText(Character.toString(machine.Board.getField(0)));
				button2.setText(Character.toString(machine.Board.getField(1)));
				button3.setText(Character.toString(machine.Board.getField(2)));
				button4.setText(Character.toString(machine.Board.getField(3)));
				button5.setText(Character.toString(machine.Board.getField(4)));
				button6.setText(Character.toString(machine.Board.getField(5)));
				button7.setText(Character.toString(machine.Board.getField(6)));
				button8.setText(Character.toString(machine.Board.getField(7)));
				button9.setText(Character.toString(machine.Board.getField(8)));
				scoreField.setText(Integer.toString(machine.Player1.getScore())+"|"+Integer.toString(machine.Player2.getScore()));
			}

		});
		
		button9.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				machine.Mark(8);
				button1.setText(Character.toString(machine.Board.getField(0)));
				button2.setText(Character.toString(machine.Board.getField(1)));
				button3.setText(Character.toString(machine.Board.getField(2)));
				button4.setText(Character.toString(machine.Board.getField(3)));
				button5.setText(Character.toString(machine.Board.getField(4)));
				button6.setText(Character.toString(machine.Board.getField(5)));
				button7.setText(Character.toString(machine.Board.getField(6)));
				button8.setText(Character.toString(machine.Board.getField(7)));
				button9.setText(Character.toString(machine.Board.getField(8)));
				scoreField.setText(Integer.toString(machine.Player1.getScore())+"|"+Integer.toString(machine.Player2.getScore()));
			}

		});
		
		shell.setBounds(10, 10, 800, 600);
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();

	}
}
