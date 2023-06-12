import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class Calculator implements ActionListener {
    double number, answer;
    int calculation;

    JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");
    JButton buttonSin = new JButton("sin");
    JButton buttonCos = new JButton("cos");
    JButton buttonTan = new JButton("tan");
    JButton buttonLog = new JButton("log");
    JButton buttonExp = new JButton("e^x");
    JButton buttonCube = new JButton("x\u00B3");
    JButton buttonFactorial = new JButton("!");
    JButton buttonPow = new JButton("x^y");

    ;

    Calculator() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(310, 610);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        buttonLog.setBounds(10, 160, 60, 40);
        buttonLog.setFont(new Font("Arial", Font.BOLD, 15));
        buttonLog.setBackground(new Color(77,106,255));
        frame.add(buttonLog);

        buttonPow.setBounds(80, 160, 60, 40);
        buttonPow.setFont(new Font("Arial", Font.BOLD, 15));
        buttonPow.setBackground(new Color(77,106,255));
        frame.add(buttonPow);
        
        buttonCube.setBounds(150, 160, 60, 40);
        buttonCube.setFont(new Font("Arial", Font.BOLD, 15));
        buttonCube.setBackground(new Color(77,106,255));
        frame.add(buttonCube);

        buttonFactorial.setBounds(220, 160, 60, 40);
        buttonFactorial.setFont(new Font("Arial", Font.BOLD, 18));
        buttonFactorial.setBackground(new Color(77,106,255));
        frame.add(buttonFactorial);

        buttonSin.setBounds(10, 280, 60, 40);
        buttonSin.setFont(new Font("Arial", Font.BOLD, 15));
        buttonSin.setBackground(new Color(77,106,255));
        frame.add(buttonSin);

        buttonCos.setBounds(80, 280, 60, 40);
        buttonCos.setFont(new Font("Arial", Font.BOLD, 13));
        buttonCos.setBackground(new Color(77,106,255));
        frame.add(buttonCos);

        buttonTan.setBounds(150, 280, 60, 40);
        buttonTan.setFont(new Font("Arial", Font.BOLD, 15));
        buttonTan.setBackground(new Color(77,106,255));
        frame.add(buttonTan);


        buttonSeven.setBounds(10, 340, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 340, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);

        buttonNine.setBounds(150, 340, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNine);

        buttonFour.setBounds(10, 400, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFour);

        buttonFive.setBounds(80, 400, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFive);

        buttonSix.setBounds(150, 400, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSix);

        buttonOne.setBounds(10, 460, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 460, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 460, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonThree);

        buttonDot.setBounds(150, 520, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDot);

        buttonExp.setBounds(10, 520, 60, 40);
        buttonExp.setFont(new Font("Arial", Font.BOLD, 15));
        buttonExp.setBackground(new Color(77,106,255));
        frame.add(buttonExp);

        buttonZero.setBounds(80, 520, 60, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonZero);

        buttonEqual.setBounds(220, 460, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(new Color(0, 188, 2));
        frame.add(buttonEqual);

        buttonDiv.setBounds(220, 220, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(new Color(239, 188, 2));
        frame.add(buttonDiv);

        buttonSqrt.setBounds(10, 220, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        buttonSqrt.setBackground(new Color(77,106,255));
        frame.add(buttonSqrt);

        buttonMul.setBounds(220, 340, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(new Color(239, 188, 2));
        frame.add(buttonMul);

        buttonMinus.setBounds(220, 280, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(new Color(239, 188, 2));
        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 400, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(new Color(239, 188, 2));
        frame.add(buttonPlus);

        buttonSquare.setBounds(80, 220, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSquare.setBackground(new Color(77,106,255));
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(150, 220, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        buttonReciprocal.setBackground(new Color(77,106,255));
        frame.add(buttonReciprocal);

        buttonDelete.setBounds(150, 100, 130, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        frame.add(buttonDelete);

        buttonClear.setBounds(10, 100, 130, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        frame.add(buttonClear);
    }

    public void addActionEvent() {
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonSin.addActionListener(this);
        buttonCos.addActionListener(this);
        buttonTan.addActionListener(this);
        buttonLog.addActionListener(this);
        buttonExp.addActionListener(this);
         buttonCube.addActionListener(this);
        buttonFactorial.addActionListener(this);
        buttonPow.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonClear) {
            label.setText("");
            textField.setText("");
        } else if (source == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;


            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }

        } else if (source == buttonPlus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (source == buttonMinus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == buttonMul) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculation = 3;
        } else if (source == buttonDiv) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;
        } else if (source == buttonSqrt) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));

        } else if (source == buttonSquare) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            label.setText("(sqr)" + str);
        } else if (source == buttonReciprocal) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        }
        if (e.getSource() == buttonSin) {
            number = Double.parseDouble(textField.getText());
            calculation = 8;
            label.setText("sin(" + number + ")");
        }
        if (e.getSource() == buttonCos) {
            number = Double.parseDouble(textField.getText());
            calculation = 9;
            label.setText("cos(" + number + ")");
        }
        if (e.getSource() == buttonTan) {
            number = Double.parseDouble(textField.getText());
            calculation = 10;
            label.setText("tan(" + number + ")");
        } if (e.getSource() == buttonLog) {
            number = Double.parseDouble(textField.getText());
            calculation = 11;
            label.setText("log(" + number + ")");
        }
        if (e.getSource() == buttonExp) {
            number = Double.parseDouble(textField.getText());
            calculation = 12;
            label.setText("e^" + number);
        }
        else if (e.getSource() == buttonFactorial) {
    
    int n = Integer.parseInt(textField.getText());
    calculation = 14;
    if (n >= 0) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        textField.setText(factorial.toString());
    } else {
        textField.setText("Error: Factorial of a negative number");
    }
}
    else if (e.getSource() == buttonCube) {
        
        number = Double.parseDouble(textField.getText());
        calculation = 13;
        answer = number * number * number;
        textField.setText(Double.toString(answer));
    }
    else if (source == buttonPow) {
    calculation = 15; 
    number = Double.parseDouble(textField.getText());
    label.setText(textField.getText() + "^"); 
    textField.setText(""); 
}

         else if (source == buttonEqual) {
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 8: 
                    answer = Math.sin(number);
                    textField.setText(Double.toString(answer));
                    break;
                case 9: 
                    answer = Math.cos(number);
                    textField.setText(Double.toString(answer));
                    break;
                case 10: 
                    answer = Math.tan(number);
                    textField.setText(Double.toString(answer));
                    break;
                case 11: 
                    answer = Math.log10(number);
                    textField.setText(Double.toString(answer));
                    break;
                case 12: 
                    answer = Math.exp(number);
                    textField.setText(Double.toString(answer));
                    break;
                 case 13:
            
                    int n = Integer.parseInt(textField.getText());
                    if (n >= 0) {
                        int factorial = 1;
                        for (int i = 1; i <= n; i++) {
                            factorial *= i;
                        }
                        textField.setText(Integer.toString(factorial));
                        label.setText("");
                    } else {
                        textField.setText("Error: Factorial of a negative number");
                    }
                    break;
            case 14:
           
                    double cube = number * number * number;
                    textField.setText(Double.toString(cube));
                    label.setText("");
                    break;
                
            case 15:
           
                    double power = Math.pow(number, Double.parseDouble(textField.getText()));
                    textField.setText(Double.toString(power));
                    label.setText("");
                    break;
        
            default:
                    break;
            }
        }


    }
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
  

