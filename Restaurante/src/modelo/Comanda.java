package modelo;


public class Comanda {
    private String data;
    private String horario;
    private String prato;

    public Comanda(String data, String horario, String prato) {
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }


    public Comanda(String data, String horario, String prato, Integer precoDoPrato) {
        this.data = data;
        this.horario = horario;
        this.prato = prato;

    }

}
