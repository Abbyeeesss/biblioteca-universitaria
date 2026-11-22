import java.util.Objects;

/**
 * Representa un libro de la biblioteca universitaria que puede prestarse y devolverse.
 */
public class Libro {

  private String titulo;
  private String autor;
  private boolean disponible = true;

  /**
   * Crea un libro disponible para préstamo.
   *
   * @param titulo título del libro
   * @param autor autor del libro
   */
  public Libro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public boolean estaDisponible() {
    return disponible;
  }

  /**
   * Presta el libro, marcándolo como no disponible.
   *
   * @throws IllegalStateException si el libro ya está prestado
   */
  public void prestar() {
    if (!disponible) {
      throw new IllegalStateException(
          "Libro no disponible"
      );
    }

    disponible = false;
  }

  /**
   * Devuelve el libro, marcándolo como disponible.
   */
  public void devolver() {
    disponible = true;
  }

  /**
   * Indica si el título del libro coincide en contenido con otro título.
   *
   * @param otroTitulo título a comparar
   * @return {@code true} si ambos títulos son iguales
   */
  public boolean esMismoTitulo(String otroTitulo) {
    return Objects.equals(titulo, otroTitulo);
  }
}
