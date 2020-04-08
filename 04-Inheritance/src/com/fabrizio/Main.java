package com.fabrizio;

public class Main {
    // access modifiers
    public static void main(String[] args) {
	var control = new UIControl(true);
	var textBox = new TextBox();
	show(textBox);

    }
    public static void show(UIControl control){
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);
        System.out.println(point1 == point2);
    }
}
