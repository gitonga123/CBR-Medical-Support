/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalsupport;

/**
 *
 * @author danmutwiri
 */
public class user {
          private String textemail, textfirstname, textpassword1, txtpassword2,
            textphonenumber,textphysicaladdress,textsecondname, textsurname,
            textusername;

    /**
     * @return the textemail
     */
    public String getTextemail() {
        return textemail;
    }

    /**
     * @param textemail the textemail to set
     */
    public void setTextemail(String textemail) {
        this.textemail = textemail;
    }

    /**
     * @return the textfirstname
     */
    public String getTextfirstname() {
        return textfirstname;
    }

    /**
     * @param textfirstname the textfirstname to set
     */
    public void setTextfirstname(String textfirstname) {
        this.textfirstname = textfirstname;
    }

    /**
     * @return the textpassword1
     */
    public String getTextpassword1() {
        return textpassword1;
    }

    /**
     * @param textpassword1 the textpassword1 to set
     */
    public void setTextpassword1(String textpassword1) {
        this.textpassword1 = textpassword1;
    }

    /**
     * @return the txtpassword2
     */
    public String getTxtpassword2() {
        return txtpassword2;
    }

    /**
     * @param txtpassword2 the txtpassword2 to set
     */
    public void setTxtpassword2(String txtpassword2) {
        this.txtpassword2 = txtpassword2;
    }

    /**
     * @return the textphonenumber
     */
    public String getTextphonenumber() {
        return textphonenumber;
    }

    /**
     * @param textphonenumber the textphonenumber to set
     */
    public void setTextphonenumber(String textphonenumber) {
        this.textphonenumber = textphonenumber;
    }

    /**
     * @return the textphysicaladdress
     */
    public String getTextphysicaladdress() {
        return textphysicaladdress;
    }

    /**
     * @param textphysicaladdress the textphysicaladdress to set
     */
    public void setTextphysicaladdress(String textphysicaladdress) {
        this.textphysicaladdress = textphysicaladdress;
    }

    /**
     * @return the textsecondname
     */
    public String getTextsecondname() {
        return textsecondname;
    }

    /**
     * @param textsecondname the textsecondname to set
     */
    public void setTextsecondname(String textsecondname) {
        this.textsecondname = textsecondname;
    }

    /**
     * @return the textsurname
     */
    public String getTextsurname() {
        return textsurname;
    }

    /**
     * @param textsurname the textsurname to set
     */
    public void setTextsurname(String textsurname) {
        this.textsurname = textsurname;
    }

    /**
     * @return the textusername
     */
    public String getTextusername() {
        return textusername;
    }

    /**
     * @param textusername the textusername to set
     */
    public void setTextusername(String textusername) {
        this.textusername = textusername;
    }
     public String toString(){
         return this.textemail + "" + this.textfirstname + ""+ this.textpassword1+ "" + this.textphonenumber+ "" 
                 + this.textphysicaladdress+ ""+ this.textsecondname+ ""+this.textsurname + ""+ this.txtpassword2;
     }   
}
