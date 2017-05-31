package utils;


import com.android.uiautomator.core.UiObject;

/**
 * Created by kuicui on 2017/4/19.
 */
public interface Selectable {

    /**
     * 获取UiObject 对象
     * @param locator
     * @param activity
     * @return
     */
    UiObject select(Locator locator, String activity);

    /**
     * 判断对象是否存在
     * @param object
     * @return
     */
    boolean  isExists(UiObject object);

}
