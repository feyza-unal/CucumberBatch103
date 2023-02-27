package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.DataTablesPage;
import utilities.Driver;
public class DataTablesStepDefinitions {
    DataTablesPage dataTablesPage = new DataTablesPage();
    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
    }
    @When("kullanici new butonuna tiklar")
    public void kullanici_new_butonuna_tiklar() {
//        dataTablesPage.newButon.click();
        Driver.waitAndClick(dataTablesPage.newButon,10);//dinamic olarak 10 saniyeye kadar element tiklanmasi icin bekler
    }
    @When("kullanici first name {string} girer")
    public void kullanici_first_name_girer(String string) {
//        dataTablesPage.firstName.sendKeys(string);
        Driver.waitAndSendText(dataTablesPage.firstName,string,10);//firstName e yazi yazabilmek icin 10 saniye dinamik olarak beklicez
    }
    @When("kullanici last name {string} girer")
    public void kullanici_last_name_girer(String string) {
        dataTablesPage.lastName.sendKeys(string);
    }
    @When("kullanici positions {string} girer")
    public void kullanici_positions_girer(String string) {
        dataTablesPage.position.sendKeys(string);
    }
    @When("kullanici office {string} girer")
    public void kullanici_office_girer(String string) {
        dataTablesPage.office.sendKeys(string);
    }
    @When("kullanici extension {string} girer")
    public void kullanici_extension_girer(String string) {
        dataTablesPage.extension.sendKeys(string);
    }
    @When("kullanici start_date {string} girer")
    public void kullanici_start_date_girer(String string) {
        dataTablesPage.startDate.sendKeys(string);
    }
    @When("kullanici salary {string} girer")
    public void kullanici_salary_girer(String string) {
        dataTablesPage.salary.sendKeys(string);
    }
    @When("kullanici create buttonuna basar")
    public void kullanici_create_buttonuna_basar() {
        dataTablesPage.create.click();
    }
}