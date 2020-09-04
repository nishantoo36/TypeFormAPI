package StepFiles;
import ActionClasses.CommonAPIAction;
;
import cucumber.api.java.en.When;
import cucumberHelper.TestContext;

public class PreconditionSteps extends Logging {

    TestContext testContext;
    CommonAPIAction commonAPIAction;

    public PreconditionSteps(TestContext context) {
        testContext = context;
        commonAPIAction = testContext.getPageObjectManger().getCommonAPIAction();
    }

    @When("^user set endPoint as \"([^\"]*)\"$")
    public void setEndPointAs(String endPoint) throws Throwable {
        log("Set End point as "+endPoint);
        commonAPIAction.setEndPoint(endPoint);
        log("Endpoint settled as "+endPoint);
    }


}
