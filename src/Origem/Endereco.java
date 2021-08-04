package Origem;


public class Endereco {
  private int idEnderco;
  private String cidade;
  private String estado;
  private String rua;

    public int getIdEnderco() {
        return idEnderco;
    }

    public void setIdEnderco(int idEnderco) {
        this.idEnderco = idEnderco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
