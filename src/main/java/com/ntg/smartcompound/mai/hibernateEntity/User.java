package com.ntg.smartcompound.mai.hibernateEntity;

public class User  implements java.io.Serializable {


    private String fname;
    private String email;
    private String gender;
    private String lname;
    private String passwd;

   public User() {
   }

	
   public User(String fname) {
       this.fname = fname;
   }
   public User(String fname, String email, String gender, String lname, String passwd) {
      this.fname = fname;
      this.email = email;
      this.gender = gender;
      this.lname = lname;
      this.passwd = passwd;
   }
  
   public String getFname() {
       return this.fname;
   }
   
   public void setFname(String fname) {
       this.fname = fname;
   }
   public String getEmail() {
       return this.email;
   }
   
   public void setEmail(String email) {
       this.email = email;
   }
   public String getGender() {
       return this.gender;
   }
   
   public void setGender(String gender) {
       this.gender = gender;
   }
   public String getLname() {
       return this.lname;
   }
   
   public void setLname(String lname) {
       this.lname = lname;
   }
   public String getPasswd() {
       return this.passwd;
   }
   
   public void setPasswd(String passwd) {
       this.passwd = passwd;
   }




}