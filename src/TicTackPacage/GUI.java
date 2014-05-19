package TicTackPacage;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Shell;

public class GUI {
	/**
	 * @param <String>
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
		final Shell shell = new Shell(display);
		
		final Button button1 = new Button(shell, SWT.PUSH);
	    button1.setBounds(10, 10, 80, 40);
	    button1.setText("");
	    button1.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

	    });
	    final Button button2 = new Button(shell, SWT.PUSH);
	    button2.setBounds(10, 10, 80, 40);
	    button2.setText("");
	    button2.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

	    });
	    final Button button3 = new Button(shell, SWT.PUSH);
	    button3.setBounds(10, 10, 80, 40);
	    button3.setText("");
	    button3.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

	    });
	    final Button button4 = new Button(shell, SWT.PUSH);
	    button4.setBounds(10, 10, 80, 40);
	    button4.setText("");
	    button4.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

	    });
	    final Button button5 = new Button(shell, SWT.PUSH);
	    button5.setBounds(10, 10, 80, 40);
	    button5.setText("");
	    button5.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

	    });
	    final Button button6 = new Button(shell, SWT.PUSH);
	    button6.setBounds(10, 10, 80, 40);
	    button6.setText("");
	    button6.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

	    });
	    final Button button7 = new Button(shell, SWT.PUSH);
	    button7.setBounds(10, 10, 80, 40);
	    button7.setText("");
	    button7.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

	    });
	    final Button button8 = new Button(shell, SWT.PUSH);
	    button8.setBounds(10, 10, 80, 40);
	    button8.setText("");
	    button8.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

	    });
	    final Button button9 = new Button(shell, SWT.PUSH);
	    button9.setBounds(10, 10, 80, 40);
	    button9.setText("");
	    button9.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
			}

	    });
		shell.setText("TIC TAC TOE");
		GridLayout layout = new GridLayout();
		layout.numColumns=3;
		shell.setLayout(layout);
		GridData data = new GridData();
		data.horizontalAlignment=SWT.FILL;
		data.verticalAlignment=SWT.FILL;
		data.grabExcessHorizontalSpace=true;
		data.grabExcessVerticalSpace=true;
		button1.setLayoutData(data);  
		button2.setLayoutData(data);
		button3.setLayoutData(data);
		button4.setLayoutData(data);
		button5.setLayoutData(data);
		button6.setLayoutData(data);
		button7.setLayoutData(data);
		button8.setLayoutData(data);
		button9.setLayoutData(data);
		shell.setBounds(10, 10, 800, 600);
		shell.pack();
		shell.open();
		while (!shell.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		display.dispose();

	}
}

