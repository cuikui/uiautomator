package cases;

import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import pages.LoginPages;
import utils.TimeUtil;

import java.io.IOException;

/**
 * Created by kuicui on 2017/4/19.
 */
public class LoginCase  extends UiAutomatorTestCase{

    public void testLogin(){
        String cmd = "am start com.yongche/.ui.login.LoadingActivity";
        try {
            Runtime.getRuntime().exec(cmd);
            TimeUtil.sleep(10000);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LoginPages loginPages = new LoginPages();
        System.out.println("开始执行用例:"+loginPages.getTestCaseName());
        try {
            loginPages.login();
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void tearDown() throws Exception {
        try {
            System.out.println("关闭司机端");
            Runtime.getRuntime().exec(" pm  clean com.yongche");
            TimeUtil.sleep(10000);
            System.out.println("执行成功......");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
