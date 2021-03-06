package cuentas;

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    public String getNombre() {
    	return this.nombre;
    }
    
    public String getCuenta() {
    	return this.cuenta;
    }
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    public double getTipoInterés() {
    	return this.tipoInterés;
    }
    
    public void setNombre(String n) {
    	this.nombre = n;
    }
    
    public void setCuenta(String c) {
    	this.cuenta = c;
    }
    
    public void setSaldo(double s) {
    	this.saldo = s;
    }
    
    public void setTipoInterés(double t) {
    	this.tipoInterés = t;
    }
    
}

