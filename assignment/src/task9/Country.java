package task9;

public class Country {
  private String name;
  private String capital;
  private int population;

  public Country(String name, String capital, int population) {
    this.name = name;
    this.capital = capital;
    this.population = population;
  }

  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getCapital() {
    return this.capital;
  }
  public void setCapital(String capital) {
    this.capital = capital;
  }
  public int getPopulation() {
    return this.population;
  }
  public void setPopulation(int population) {
    this.population = population;
  }

}
