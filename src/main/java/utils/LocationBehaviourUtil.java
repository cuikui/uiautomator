package utils;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

/**
 * Created by kuicui on 2017/4/19.
 */
public class LocationBehaviourUtil extends UiAutomatorTestCase implements Selectable {


    private LocationBehaviourUtil() {

    }

    private static class LocationUtilHelper {
        static final LocationBehaviourUtil locationUtil = new LocationBehaviourUtil();
    }

    public static LocationBehaviourUtil getLocationUtilInstance() {
        return LocationUtilHelper.locationUtil;
    }


    @Override
    public UiObject select(Locator locator, String activity) {
        if (activity == null) {
            return null;
        }

        UiObject uiObject = null;
        switch (locator) {
            case BY_TEXT:
                uiObject = new UiObject(new UiSelector().text(activity));
                break;
            case BY_CALSSNAME:
                uiObject = new UiObject(new UiSelector().className(activity));
                break;
            case BY_DESCRIPTION:
                uiObject = new UiObject(new UiSelector().description(activity));
                break;
            case BY_RESOURCEID:
                uiObject = new UiObject(new UiSelector().resourceId(activity));
                break;
        }

        return uiObject;
    }

    @Override
    public boolean isExists(UiObject object) {
        if (object == null) {
            return false;
        }
        try {
            return object.exists() && object.isEnabled() ? true : false;
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

}
