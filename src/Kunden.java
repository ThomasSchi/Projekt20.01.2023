
public class Kunden {
  private String name;
  private int alter;
  private String sicherheiten;
  private int telefonnummer;
  private String kundentyp;


  public Kunden (String Name, int Alter, String Sicherheiten, int Telefonnummer, String Kundentyp){
      this.name = Name;
      this.alter = Alter;
      this.sicherheiten = Sicherheiten;
      this.telefonnummer = Telefonnummer;
      this.kundentyp = Kundentyp;
  }
  public String getName(){
      return name;

  }
  public  int getAlter(){
      return alter;
  }
  public String getsicherheiten(){
      return sicherheiten;
  }
  public int getTelefonnummer(){
      return telefonnummer;
  }
  public void autovermieten(Autos Auto, Lagerbestand Anzahl){
      if (Auto.getVerfuegbarkeit() == true){
          Auto.setVerfuegbarkeit(false);
      }
  }}

