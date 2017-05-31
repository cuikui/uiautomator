package utils;

import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;

import java.util.AbstractCollection;

/**
 * Created by kuicui on 2017/4/19.
 */
public class UiScrollBehaviourUtil implements Scrollable{

    @Override
    public UiScrollable isScrollable(Locator locator) {

        UiScrollable uiScrollable=null;
        switch (locator){
            case BY_RESOURCEID:
                uiScrollable = new UiScrollable(new UiSelector().scrollable(true));
                break;
            case BY_CALSSNAME:
                uiScrollable = new UiScrollable(new UiSelector().text(String.valueOf(true)));
                break;
            case BY_DESCRIPTION:
                uiScrollable = new UiScrollable(new UiSelector().description(String.valueOf(true)));
                break;
            case BY_TEXT:
                uiScrollable = new UiScrollable(new UiSelector().scrollable(true));
                break;
        }

        return uiScrollable;
    }
}
