package smartbus.tcc.models;

/**
 * Created by Rafael Magalhães on 05/10/2015 Outubro.
 */
public class NavItem
{
    private String titulo, subTitulo;
    private int resIcone;

    public NavItem(String titulo, String subTitulo, int resIcone) {
        super();
        this.titulo = titulo;
        this.subTitulo = subTitulo;
        this.resIcone = resIcone;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    public void setSubTitulo(String subTitulo) {
        this.subTitulo = subTitulo;
    }

    public int getResIcone() {
        return resIcone;
    }

    public void setResIcone(int resIcone) {
        this.resIcone = resIcone;
    }
}
