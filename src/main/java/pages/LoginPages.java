package pages;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import pageuis.LoginUiPage;
import utils.LocationBehaviourUtil;
import utils.Locator;
import utils.TimeUtil;
import utils.UiScrollBehaviourUtil;

/**
 * Created by kuicui on 2017/4/19.
 */
public class LoginPages {
    private    String testCaseName = "LoginPages";
    public LocationBehaviourUtil locationUtil = LocationBehaviourUtil.getLocationUtilInstance();
    private UiScrollBehaviourUtil uiScrollBehaviourUtil = new UiScrollBehaviourUtil();

    public  String getTestCaseName() {
        return testCaseName;
    }

    /**
     * 登陆流程
     * @throws UiObjectNotFoundException
     */
    public  void  login() throws UiObjectNotFoundException {

//        UiScrollable scrollbanner = new UiScrollable(new UiSelector().scrollable(true));
        UiScrollable scrollbanner = uiScrollBehaviourUtil.isScrollable(Locator.BY_RESOURCEID);
        scrollbanner.setAsHorizontalList();
        TimeUtil.sleep(2000);
        System.out.println("滑动屏幕");
        scrollbanner.scrollForward();

        TimeUtil.sleep(2000);
        scrollbanner.click();
        TimeUtil.sleep(2000);
        scrollbanner.click();

        UiObject closeBanner = locationUtil.select(Locator.BY_RESOURCEID, LoginUiPage.closeBanner);
        if(locationUtil.isExists(closeBanner)){
            closeBanner.click();
            TimeUtil.sleep(2000);
        }

        UiObject carLogin = locationUtil.select(Locator.BY_RESOURCEID, LoginUiPage.carLogin);
        if(locationUtil.isExists(carLogin)){
            carLogin.click();
            TimeUtil.sleep(2000);
        }

        System.out.println("等待10s......");
        TimeUtil.sleep(5000);

        System.out.println("进入登陆页面");

        UiObject cellphone=locationUtil.select(Locator.BY_RESOURCEID, LoginUiPage.cellphone);
        if(locationUtil.isExists(cellphone)){
            System.out.println("输入手机号");
            cellphone.setText("16820160309");
            TimeUtil.sleep(2000);
        }
        UiObject getSmsCode=locationUtil.select(Locator.BY_RESOURCEID, LoginUiPage.getSmsCode);
        if(locationUtil.isExists(getSmsCode)){
            getSmsCode.click();
            TimeUtil.sleep(2000);
        }

        UiObject loginButton = locationUtil.select(Locator.BY_RESOURCEID, LoginUiPage.loginButton);
        if(locationUtil.isExists(loginButton)){
            loginButton.click();
            TimeUtil.sleep(2000);
        }
    }

}
