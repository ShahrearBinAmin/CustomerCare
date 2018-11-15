/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercare.model;

/**
 *
 * @author Shahrear
 */
public class User {
    private String name,lastname,username,password,email,mobile,cardnumber,gender,pin,atm;
    private String islamiBank="0",cityBank="0",standardChartered="0",bankAsia="0",dbbl="0",bracBank="0",Money="0";
    private String airtime="0";
    private int megabyte=0,minute=0;
    private String pinIslamiBank="0",pinCityBank="0",pinStandardChartred="0",pinBankAsia="0",pinDbbl="0",pinBracBank="0";
    private String idIslamiBank="0",idCityBank="0",idStandardChartred="0",idBankAsia="0",idDbbl="0",idBracBank="0";

    public String getPinIslamiBank() {
        return pinIslamiBank;
    }

    public void setPinIslamiBank(String pinIslamiBank) {
        this.pinIslamiBank = pinIslamiBank;
    }

    public String getPinCityBank() {
        return pinCityBank;
    }

    public void setPinCityBank(String pinCityBank) {
        this.pinCityBank = pinCityBank;
    }

    public String getPinStandardChartred() {
        return pinStandardChartred;
    }

    public void setPinStandardChartred(String pinStandardChartred) {
        this.pinStandardChartred = pinStandardChartred;
    }

    public String getPinBankAsia() {
        return pinBankAsia;
    }

    public void setPinBankAsia(String pinBankAsia) {
        this.pinBankAsia = pinBankAsia;
    }

    public String getPinDbbl() {
        return pinDbbl;
    }

    public void setPinDbbl(String pinDbbl) {
        this.pinDbbl = pinDbbl;
    }

    public String getPinBracBank() {
        return pinBracBank;
    }

    public void setPinBracBank(String pinBracBank) {
        this.pinBracBank = pinBracBank;
    }

    public String getIdIslamiBank() {
        return idIslamiBank;
    }

    public void setIdIslamiBank(String idIslamiBank) {
        this.idIslamiBank = idIslamiBank;
    }

    public String getIdCityBank() {
        return idCityBank;
    }

    public void setIdCityBank(String idCityBank) {
        this.idCityBank = idCityBank;
    }

    public String getIdStandardChartred() {
        return idStandardChartred;
    }

    public void setIdStandardChartred(String idStandardChartred) {
        this.idStandardChartred = idStandardChartred;
    }

    public String getIdBankAsia() {
        return idBankAsia;
    }

    public void setIdBankAsia(String idBankAsia) {
        this.idBankAsia = idBankAsia;
    }

    public String getIdDbbl() {
        return idDbbl;
    }

    public void setIdDbbl(String idDbbl) {
        this.idDbbl = idDbbl;
    }

    public String getIdBracBank() {
        return idBracBank;
    }

    public void setIdBracBank(String idBracBank) {
        this.idBracBank = idBracBank;
    }

    public int getMegabyte() {
        return megabyte;
    }

    public void setMegabyte(int megabyte) {
        this.megabyte = megabyte;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String getAirtime() {
        return airtime;
    }

    public void setAirtime(String airtime) {
        this.airtime = airtime;
    }
    

    public String getEmail() {
        return email;
    }

    public String getIslamiBank() {
        return islamiBank;
    }

    public void setIslamiBank(String islamiBank) {
        this.islamiBank = islamiBank;
    }

    public String getCityBank() {
        return cityBank;
    }

    public void setCityBank(String cityBank) {
        this.cityBank = cityBank;
    }

    public String getStandardChartered() {
        return standardChartered;
    }

    public void setStandardChartered(String standardChartered) {
        this.standardChartered = standardChartered;
    }

    public String getBankAsia() {
        return bankAsia;
    }

    public void setBankAsia(String bankAsia) {
        this.bankAsia = bankAsia;
    }

    public String getDbbl() {
        return dbbl;
    }

    public void setDbbl(String dbbl) {
        this.dbbl = dbbl;
    }

    public String getBracBank() {
        return bracBank;
    }

    public void setBracBank(String bracBank) {
        this.bracBank = bracBank;
    }

    public String getMoney() {
        return Money;
    }

    public void setMoney(String Money) {
        this.Money = Money;
    }

    public String getAtm() {
        return atm;
    }

    public void setAtm(String atm) {
        this.atm = atm;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString()
    {
        return this.name+", "+this.lastname+", "+this.username+".";
    }
    
}
