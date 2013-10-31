import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
public class Calcular {
	private static Text pantalla;
	
	// calculadora cientifica

	static double operacio;
	static double numero;
	static double numero2;
	static String operador;
	static double resultat;
	static boolean punt;
	static double executarOperacio() {
		// resultat = 0.0;
		// Operació: divisió
		if (operador.equals("/")) {
			resultat = numero / numero2;
			/*
			 * if (numero2.equals("0")) { pantalla.setText("ERROR"); resultat =
			 * 0; }
			 */
		}
		// Operació: multiplicació
		if (operador.equals("*")) {
			resultat = numero * numero2;
		}
		// Operació: resta
		if (operador.equals("-")) {
			resultat = numero - numero2;
		}
		// Operació: suma
		if (operador.equals("+")) {
			resultat = numero + numero2;
		}
		
		//resultatArreglat = new Decimal();

		return resultat;
	}
	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shlCalculator = new Shell();
		shlCalculator.setSize(295, 300);
		shlCalculator.setText("Calculator");
		Button tecla1 = new Button(shlCalculator, SWT.NONE);
		tecla1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				/**
				 * fiquem lo que hi ha a la pantalla + el numero 1
				 */
				pantalla.setText(pantalla.getText() + '1');
			}
		});
		tecla1.setBounds(18, 148, 43, 34);
		tecla1.setText("1");
		Button tecla2 = new Button(shlCalculator, SWT.NONE);
		tecla2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText() + '2');
			}
		});
		tecla2.setBounds(67, 148, 43, 34);
		tecla2.setText("2");
		Button tecla3 = new Button(shlCalculator, SWT.NONE);
		tecla3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText() + '3');
			}
		});
		tecla3.setBounds(116, 148, 43, 34);
		tecla3.setText("3");
		Button tecla4 = new Button(shlCalculator, SWT.NONE);
		tecla4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText() + '4');
			}
		});
		tecla4.setBounds(18, 108, 43, 34);
		tecla4.setText("4");
		Button tecla5 = new Button(shlCalculator, SWT.NONE);
		tecla5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText() + '5');
			}
		});
		tecla5.setBounds(67, 108, 43, 34);
		tecla5.setText("5");
		Button tecla6 = new Button(shlCalculator, SWT.NONE);
		tecla6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText() + '6');
			}
		});
		tecla6.setBounds(116, 108, 43, 34);
		tecla6.setText("6");
		Button tecla7 = new Button(shlCalculator, SWT.NONE);
		tecla7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText() + '7');
			}
		});
		tecla7.setBounds(18, 68, 43, 34);
		tecla7.setText("7");
		Button tecla8 = new Button(shlCalculator, SWT.NONE);
		tecla8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText() + '8');
			}
		});
		tecla8.setBounds(67, 68, 43, 34);
		tecla8.setText("8");
		Button tecla9 = new Button(shlCalculator, SWT.NONE);
		tecla9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText() + '9');
			}
		});
		tecla9.setBounds(116, 68, 43, 34);
		tecla9.setText("9");
		Button tecla0 = new Button(shlCalculator, SWT.NONE);
		tecla0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText() + '0');
			}
		});
		tecla0.setBounds(18, 188, 92, 42);
		tecla0.setText("0");
		Button tecla_punt = new Button(shlCalculator, SWT.NONE);
		tecla_punt.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (punt == false) {
					pantalla.setText(pantalla.getText() + '.');
					punt = true;	
				} else {
					// no fa res
				}

			}
		});
		tecla_punt.setBounds(116, 188, 43, 42);
		tecla_punt.setText(".");
		pantalla = new Text(shlCalculator, SWT.BORDER | SWT.RIGHT);
		pantalla.setFont(SWTResourceManager.getFont(
				"Open Sans Condensed Light", 18, SWT.NORMAL));
		pantalla.setBounds(18, 10, 240, 42);
		Button tecla_resta = new Button(shlCalculator, SWT.NONE);
		tecla_resta.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				numero = Float.parseFloat(pantalla.getText());
				pantalla.setText("");
				operador = "-";
				punt = false;
			}
		});
		tecla_resta.setBounds(165, 148, 43, 34);
		tecla_resta.setText("-");
		Button tecla_divideix = new Button(shlCalculator, SWT.NONE);
		tecla_divideix.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				numero = Float.parseFloat(pantalla.getText());
				pantalla.setText("");
				operador = "/";
				punt = false;
			}
		});
		tecla_divideix.setText("/");
		tecla_divideix.setBounds(165, 108, 43, 34);
		Button tecla_multiplica = new Button(shlCalculator, SWT.NONE);
		tecla_multiplica.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				numero = Float.parseFloat(pantalla.getText());
				pantalla.setText("");
				operador = "*";
				punt = false;
			}
		});
		tecla_multiplica.setText("*");
		tecla_multiplica.setBounds(165, 68, 43, 34);
		Button tecla_suma = new Button(shlCalculator, SWT.NONE);
		tecla_suma.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				numero = Float.parseFloat(pantalla.getText());
				pantalla.setText("");
				operador = "+";
				punt = false;
			}
		});
		tecla_suma.setText("+");
		tecla_suma.setBounds(165, 188, 43, 42);
		Button tecla_esborra = new Button(shlCalculator, SWT.NONE);
		tecla_esborra.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// netejem
				pantalla.setText("");
				numero = 0;
			}
		});
		tecla_esborra.setText("C");
		tecla_esborra.setBounds(215, 68, 43, 34);
		Button tecla_igual = new Button(shlCalculator, SWT.NONE);
		tecla_igual.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				/**
				 * IGUAL hem apretat igual, calculem el que hi ha per pantalla
				 */
				numero2 = Double.parseDouble(pantalla.getText());
				if (operador.equals("/") && numero2 == 0.0) {
					operador = "";
					numero = 0;
					pantalla.setText("ERROR");
				} else {
					double pantallazo = executarOperacio();
					pantalla.setText(Double.toString(pantallazo));
				}
			}
		});
		tecla_igual.setText("=");
		tecla_igual.setBounds(215, 148, 43, 82);
		shlCalculator.open();
		shlCalculator.layout();
		while (!shlCalculator.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
