package utp.ac.pa.sistema.domain;

public class Turno {
    private int idTurno;
    private String horaInicio;
    private String horaFin;

    public Turno(int idTurno, String horaInicio, String horaFin) {
        this.idTurno = idTurno;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public void iniciarTurno() {
        System.out.println("Turno " + idTurno + " iniciado.");
    }

    public void cerrarTurno() {
        System.out.println("Turno " + idTurno + " cerrado.");
    }
}