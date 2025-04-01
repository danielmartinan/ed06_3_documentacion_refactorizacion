package org.ed06.model;

public class Habitacion {
    private int numero;
    private String tipo; // "SIMPLE", "DOBLE", "SUITE"
    private double precioBase;

    //Todo pendeinte cambiar la forma de gestionar la disponibilidad en base a las fechas de las reservas
    private boolean disponible;

    public Habitacion(int numero, String tipo, double precioBase) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioBase = this.precioBase;
        this.disponible = true;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Método que usa un switch para determinar el número máximo de huéspedes
    public double obtenerNumMaxHuespedes() {
        return switch (tipo) {
            case "SIMPLE" -> 1;
            case "DOBLE" -> 3;
            case "SUITE" -> 4;
            case "LITERAS" -> 8;
            default -> 1;
        };
    }

    public void reservar() {
        if (disponible) {
            System.out.println("Habitación #" + numero + " ya reservada");
        }
        disponible = true;
    }
}
