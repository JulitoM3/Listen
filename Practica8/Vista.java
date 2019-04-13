package Practica8;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
public class Vista extends JFrame implements KeyListener{
	JTextArea texto;
	JTextArea copia;
	JScrollPane delTexto;
	JScrollPane delCopia;
	String letras = "";
	
	public Vista(){
		setLayout(null);
		Componentes();
		setVisible(true);
		setResizable(false);
		setBounds(300,100,540,400);
		setAlwaysOnTop(true);
	}
	
	private void Componentes(){
		copia = new JTextArea("");
		copia.setLineWrap(true);
		copia.setEditable(false);
		copia.addKeyListener(this);
		
		delCopia = new JScrollPane();
		delCopia.setBounds(10, 10, 513, 350);
		delCopia.setViewportView(copia);
		
		add(delCopia);
	}

	
	public void keyPressed(KeyEvent e) {
			
			if(e.VK_0 == e.getKeyCode()){
				letras += "0";
			}
			if(e.VK_1 == e.getKeyCode()){
				letras += "1";
			}
			if (e.VK_2 == e.getKeyCode()){
				letras +="2";
			}
			if(e.VK_3 == e.getKeyCode()){
				letras +="3";
			}
			if(e.VK_4 == e.getKeyCode()){
				letras +="4";
			}
			if (e.VK_5 == e.getKeyCode()){
				letras +="5";
			}
			if (e.VK_6 == e.getKeyCode()){
				letras +="6";
			}
			if (e.VK_7 == e.getKeyCode()){
				letras +="7";
			}
			if (e.VK_8 == e.getKeyCode()){
				letras += "8";
			}
			if (e.VK_9 == e.getKeyCode()){
				letras +="9";
			}
			if(e.getKeyChar() == 'A'){
				letras += "A";
			}
			if(e.getKeyChar() == 'B'){
				letras +="B";
			}
			if (e.getKeyChar() == 'C'){
				letras += "C";
			}
			if (e.getKeyChar() == 'D'){
				letras+="D";
			}
			if (e.getKeyChar() == 'E'){
				letras+="E";
			}
			if (e.getKeyChar() == 'F'){
				letras+="F";
			}
			if(e.getKeyChar() == 'G'){
				letras +="G";
			}
			if(e.getKeyChar() == 'H'){
				letras +="H";
			}
			if(e.getKeyChar() == 'I'){
				letras +="I";
			}
			if(e.getKeyChar() == 'K'){
				letras +="K";
			}
			if(e.getKeyChar() == 'L'){
				letras +="L";
			}
			if(e.getKeyChar() == 'M'){
				letras +="M";
			}
			if(e.getKeyChar() == 'N'){
				letras +="N";
			}
			if(e.getKeyChar() == 'O'){
				letras +="O";
			}
			if(e.getKeyChar() =='P'){
				letras +="P";
			}
			if(e.getKeyChar() =='Q'){
				letras +="Q";
			}
			if(e.getKeyChar() == 'R'){
				letras +="R";
			}
			if(e.getKeyChar() == 'S'){
				letras +="S";
			}
			if(e.getKeyChar() == 'T'){
				letras +="T";
			}
			if(e.getKeyChar() =='U'){
				letras +="U";
			}
			if(e.getKeyChar() == 'V'){
				letras +="V";
			}
			if(e.getKeyChar() == 'W'){
				letras +="W";
			}
			if(e.getKeyChar() == 'X'){
				letras +="X";
			}
			if(e.getKeyChar() == 'Y'){
				letras +="Y";
			}
			if(e.getKeyChar() == 'Z'){
				letras +="Z";
			}
			if(e.getKeyChar() == 'a'){
				letras += "a";
			}
			if(e.getKeyChar() == 'b'){
				letras +="b";
			}
			if (e.getKeyChar() == 'c'){
				letras += "c";
			}
			if (e.getKeyChar() == 'd'){
				letras+="d";
			}
			if (e.getKeyChar() == 'e'){
				letras+="e";
			}
			if (e.getKeyChar() == 'f'){
				letras+="f";
			}
			if(e.getKeyChar() == 'g'){
				letras +="g";
			}
			if(e.getKeyChar() == 'h'){
				letras +="h";
			}
			if(e.getKeyChar() == 'i'){
				letras +="i";
			}
			if (e.getKeyChar() == 'j'){
				letras +="j";
			}
			if(e.getKeyChar() == 'k'){
				letras +="k";
			}
			if(e.getKeyChar() == 'l'){
				letras +="l";
			}
			if(e.getKeyChar() == 'm'){
				letras +="m";
			}
			if(e.getKeyChar() == 'n'){
				letras +="n";
			}
			if(e.getKeyChar() == 'o'){
				letras +="o";
			}
			if(e.getKeyChar() =='p'){
				letras +="p";
			}
			if(e.getKeyChar() =='q'){
				letras +="q";
			}
			if(e.getKeyChar() == 'r'){
				letras +="r";
			}
			if(e.getKeyChar() == 's'){
				letras +="s";
			}
			if(e.getKeyChar() == 't'){
				letras +="t";
			}
			if(e.getKeyChar() =='u'){
				letras +="u";
			}
			if(e.getKeyChar() == 'v'){
				letras +="v";
			}
			if(e.getKeyChar() == 'w'){
				letras +="w";
			}
			if(e.getKeyChar() == 'x'){
				letras +="x";
			}
			if(e.getKeyChar() == 'y'){
				letras +="y";
			}
			if(e.getKeyChar() == 'z'){
				letras +="z";
			}
			if(e.VK_LEFT == e.getKeyCode()){
				letras +=" IZQUIERDA";
			}
			if(e.VK_RIGHT == e.getKeyCode()){
				letras += " DERECHA";
			}
			if(e.VK_UP == e.getKeyCode()){
				letras +=" ARRIBA";
			}
			if(e.VK_DOWN == e.getKeyCode()){
				letras += " ABAJO";
			}
			if (e.VK_ENTER == e.getKeyCode()){
				letras+=" ENTER";
			}
			if(e.VK_SHIFT == e.getKeyCode()){
				letras += " SHIFT";
			}
			if(e.VK_ESCAPE == e.getKeyCode()){
				letras += "ESC";
			}
			
			copia.setText(letras==null?"":letras);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
	
	}

}
