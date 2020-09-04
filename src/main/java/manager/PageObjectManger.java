package manager;


import ActionClasses.CommonAPIAction;
import ActionClasses.GetUserDataAPI;

public class PageObjectManger {

    public CommonAPIAction commonAPIAction;
    public GetUserDataAPI getUserDataAPI;

    public CommonAPIAction getCommonAPIAction() {
        return (commonAPIAction == null) ? commonAPIAction = new CommonAPIAction() : commonAPIAction;
    }

    public GetUserDataAPI getUserDataAPI() {
        return (getUserDataAPI == null) ? getUserDataAPI = new GetUserDataAPI() : getUserDataAPI;
    }

}


