package com.flf.continuacaoterceirosemestre.aula01;

public class AreaQuadrado {
	private int l1;
	private int l2;
	private int l3;
	private int l4;
	public AreaQuadrado(int l1, int l2, int l3, int l4) {
		super();
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
	}
	public int getL1() {
		return l1;
	}
	public void setL1(int l1) {
		this.l1 = l1;
	}
	public int getL2() {
		return l2;
	}
	public void setL2(int l2) {
		this.l2 = l2;
	}
	public int getL3() {
		return l3;
	}
	public void setL3(int l3) {
		this.l3 = l3;
	}
	public int getL4() {
		return l4;
	}
	public void setL4(int l4) {
		this.l4 = l4;
	}
	public int area() {
		return l1 * l2;
	}
	public void saberQuadrado() {
		if (l1 == l2 && l1 == l3 && l1 == l4) {
			System.out.println("è um quadrado......");
		} else {
			System.out.println("Não é um quadrado......");
		}
	}
}
