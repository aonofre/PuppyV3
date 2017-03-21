package mx.com.onofre.alejandro.puppy;

/**
 * Created by 472185 on 07/02/2017.
 */

public class Mascota {
    private String nombre;
    private int foto;
    private int ranking;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public Mascota (String nombre, int foto, int ranking)
    {
        this.nombre = nombre;
        this.foto = foto;
        this.ranking = ranking;
    }
}
