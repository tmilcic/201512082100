package vvg_upup.jbpm_oms;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Registracija implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long ID_Registracija;
   @org.kie.api.definition.type.Label(value = "Korisnicko ime")
   private java.lang.String korisnickoIme;
   @org.kie.api.definition.type.Label(value = "Zaporka")
   private java.lang.String zaporka;

   public Registracija()
   {
   }

   public java.lang.Long getID_Registracija()
   {
      return this.ID_Registracija;
   }

   public void setID_Registracija(java.lang.Long ID_Registracija)
   {
      this.ID_Registracija = ID_Registracija;
   }

   public java.lang.String getKorisnickoIme()
   {
      return this.korisnickoIme;
   }

   public void setKorisnickoIme(java.lang.String korisnickoIme)
   {
      this.korisnickoIme = korisnickoIme;
   }

   public java.lang.String getZaporka()
   {
      return this.zaporka;
   }

   public void setZaporka(java.lang.String zaporka)
   {
      this.zaporka = zaporka;
   }

   public Registracija(java.lang.Long ID_Registracija,
         java.lang.String korisnickoIme, java.lang.String zaporka)
   {
      this.ID_Registracija = ID_Registracija;
      this.korisnickoIme = korisnickoIme;
      this.zaporka = zaporka;
   }

}