package cl.praxis.intefacesSegregation;

/**
 * Esta interface no debiera existir, pq debe aplicarse el principio
 * de segregación de interfaces.
 */
public interface Machine {
  void fax(Document document);
  void print(Document document);
  Document scan();
}
