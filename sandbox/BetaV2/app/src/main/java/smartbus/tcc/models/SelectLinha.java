package smartbus.tcc.models;

/**
 * Created by Rafael Magalhães on 08/10/2015 Outubro.
 */
public class SelectLinha
{
    private String texto;
    private int iconeSelectLinha;

    public SelectLinha()
    {
        this("", -1);
    }

    public SelectLinha(String texto, int iconeSelectLinha)
    {
        this.texto = texto;
        this.iconeSelectLinha = iconeSelectLinha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getIconeSelectLinha() {
        return iconeSelectLinha;
    }

    public void setIconeSelectLinha(int iconeSelectLinha) {
        this.iconeSelectLinha = iconeSelectLinha;
    }
}
