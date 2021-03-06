package vvg_upup.jbpm_oms;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Zaduzenje implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Long IDzaduzenje;
   @org.kie.api.definition.type.Label("Datum")
   private java.util.Date datum;

   @org.kie.api.definition.type.Label(value = "Bar Code sredstva")
   private java.lang.String barCodeSredstva;

   @org.kie.api.definition.type.Label(value = "OIB djelatnika")
   private java.lang.String OIBdjelatnika;

   @org.kie.api.definition.type.Label(value = "Bar Code lokacije")
   private java.lang.String barCodLokacija;

   public Zaduzenje()
   {
   }

   public java.lang.Long getIDzaduzenje()
   {
      return this.IDzaduzenje;
   }

   public void setIDzaduzenje(java.lang.Long IDzaduzenje)
   {
      this.IDzaduzenje = IDzaduzenje;
   }

   public java.util.Date getDatum()
   {
      return this.datum;
   }

   public void setDatum(java.util.Date datum)
   {
      this.datum = datum;
   }

   public java.lang.String getBarCodeSredstva()
   {
      return this.barCodeSredstva;
   }

   public void setBarCodeSredstva(java.lang.String barCodeSredstva)
   {
      this.barCodeSredstva = barCodeSredstva;
   }

   public java.lang.String getOIBdjelatnika()
   {
      return this.OIBdjelatnika;
   }

   public void setOIBdjelatnika(java.lang.String OIBdjelatnika)
   {
      this.OIBdjelatnika = OIBdjelatnika;
   }

   public java.lang.String getBarCodLokacija()
   {
      return this.barCodLokacija;
   }

   public void setBarCodLokacija(java.lang.String barCodLokacija)
   {
      this.barCodLokacija = barCodLokacija;
   }

   public Zaduzenje(java.lang.Long IDzaduzenje, java.util.Date datum,
         java.lang.String barCodeSredstva, java.lang.String OIBdjelatnika,
         java.lang.String barCodLokacija)
   {
      this.IDzaduzenje = IDzaduzenje;
      this.datum = datum;
      this.barCodeSredstva = barCodeSredstva;
      this.OIBdjelatnika = OIBdjelatnika;
      this.barCodLokacija = barCodLokacija;
   }

}