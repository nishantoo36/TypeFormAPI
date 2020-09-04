package StepFiles;


import ActionClasses.GetUserDataAPI;
import cucumber.api.java.en.Then;
import cucumberHelper.TestContext;
import org.testng.Assert;

public class GetUserDetailsAPISteps extends Logging {
    TestContext testContext;
    GetUserDataAPI getUserDataAPI;

    public GetUserDetailsAPISteps(TestContext context) {
        testContext = context;
        getUserDataAPI = testContext.getPageObjectManger().getUserDataAPI();
    }

    @Then("^verify sttusCode as \"([^\"]*)\"$")
    public void verifyStatusCodeAs(String statusCode) {
        log("Verify that statusCode should appear as " + statusCode + " in response");
        Assert.assertTrue(getUserDataAPI.isStatusCode(Integer.parseInt(statusCode)), "statusCode is not matched as " + statusCode + " in response");
        log("Verification pass successfully, statusCode appear as " + statusCode);
    }

    @Then("^verify name as \"([^\"]*)\"$")
    public void verifyNameAs(String name) {
        log("Verify that name should appear as " + name + " in response");
        Assert.assertTrue(getUserDataAPI.isName(name), "Name is not matched as " + name + " in response");
        log("Verification pass successfully, name appear as " + name);
    }

    @Then("^verify height as \"([^\"]*)\"$")
    public void verifyHeightAs(String height) {
        log("Verify that height should appear as " + height + " in response");
        Assert.assertTrue(getUserDataAPI.isHeight(height), "Height is not matched as " + height + " in response");
        log("Verification pass successfully, height appear as " + height);
    }

    @Then("^verify mass as \"([^\"]*)\"$")
    public void verifyMassAs(String mass) {
        log("Verify that mass should appear as " + mass + " in response");
        Assert.assertTrue(getUserDataAPI.isMass(mass), "Mass is not matched as " + mass + " in response");
        log("Verification pass successfully, mass appear as " + mass);
    }

    @Then("^verify hair_color as \"([^\"]*)\"$")
    public void verifyHair_colorAs(String hair_color) {
        log("Verify that hair_color should appear as " + hair_color + " in response");
        Assert.assertTrue(getUserDataAPI.isHair_color(hair_color), "Hair_color is not matched as " + hair_color + " in response");
        log("Verification pass successfully, hair_color appear as " + hair_color);
    }

    @Then("^verify skin_color as \"([^\"]*)\"$")
    public void verifySkin_colorAs(String skin_color) {
        log("Verify that skin_color should appear as " + skin_color + " in response");
        Assert.assertTrue(getUserDataAPI.isSkin_color(skin_color), "Skin_color is not matched as " + skin_color + " in response");
        log("Verification pass successfully, skin_color appear as " + skin_color);
    }

    @Then("^verify eye_color as \"([^\"]*)\"$")
    public void verifyEye_colorAs(String eye_color) {
        log("Verify that eye_color should appear as " + eye_color + " in response");
        Assert.assertTrue(getUserDataAPI.isEye_color(eye_color), "Eye_color is not matched as " + eye_color + " in response");
        log("Verification pass successfully, eye_color appear as " + eye_color);
    }

    @Then("^verify birth_year as \"([^\"]*)\"$")
    public void verifyBirth_yearAs(String birth_year) {
        log("Verify that birth_year should appear as " + birth_year + " in response");
        Assert.assertTrue(getUserDataAPI.isBirth_year(birth_year), "Birth_year is not matched as " + birth_year + " in response");
        log("Verification pass successfully, birth_year appear as " + birth_year);
    }
    @Then("^verify gender as \"([^\"]*)\"$")
    public void verifyGenderAs(String gender) {
        log("Verify that gender should appear as " + gender + " in response");
        Assert.assertTrue(getUserDataAPI.isGender(gender), "Gender is not matched as " + gender + " in response");
        log("Verification pass successfully, Gender appear as " + gender);
    }

    @Then("^verify homeworld as \"([^\"]*)\"$")
    public void verifyHomeworldAs(String homeworld) {
        log("Verify that homeworld should appear as " + homeworld + " in response");
        Assert.assertTrue(getUserDataAPI.isHomeworld(homeworld), "Homeworld is not matched as " + homeworld + " in response");
        log("Verification pass successfully, homeworld appear as " + homeworld);
    }

    @Then("^verify film as \"([^\"]*)\"$")
    public void verifyfilmAs(String films) {
        log("Verify that films should appear as " + films + " in response");
        Assert.assertTrue(getUserDataAPI.isFilm(films), "films is not matched as " + films + " in response");
        log("Verification pass successfully, films appear as " + films);
    }

    @Then("^verify vehicle as \"([^\"]*)\"$")
    public void verifyVehicleAs(String vehicle) {
        log("Verify that specie should appear as " + vehicle + " in response");
        Assert.assertTrue(getUserDataAPI.isVehicle(vehicle), "vehicle is not matched as " + vehicle + " in response");
        log("Verification pass successfully, specie appear as " + vehicle);
    }

    @Then("^verify starship as \"([^\"]*)\"$")
    public void verifyStarshipAs(String starship) {
        log("Verify that specie should appear as " + starship + " in response");
        Assert.assertTrue(getUserDataAPI.isStarships(starship), "starship is not matched as " + starship + " in response");
        log("Verification pass successfully, starship appear as " + starship);
    }

    @Then("^verify created is not Empty")
    public void verifyCreatedIsNotEmpty() {
        log("Verify that Created should appear in response with some Data");
        Assert.assertTrue(getUserDataAPI.isCreatedNotEmpty(), "Created is not appeared or blank in response");
        log("Verification pass successfully, Created is appear in response with some data");
    }

    @Then("^verify edited is not Empty")
    public void verifyEditedIsNotEmpty() {
        log("Verify that Edited should appear in response with some Data");
        Assert.assertTrue(getUserDataAPI.isEditedNotEmpty(), "Edited is not appeared or blank in response");
        log("Verification pass successfully, Edited is appear in response with some data");
    }

    @Then("^verify Url as \"([^\"]*)\"$")
    public void verifyUrlAs(String url) {
        log("Verify that url should appear as " + url + " in response");
        Assert.assertTrue(getUserDataAPI.isURL(url), "url is not matched as " + url + " in response");
        log("Verification pass successfully, url appear as " + url);
    }
}
