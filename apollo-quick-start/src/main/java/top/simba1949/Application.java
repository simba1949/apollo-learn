package top.simba1949;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;

/**
 * @author Anthony
 * @date 2020/7/24 16:22
 */
public class Application {
    /**
     * 需要在环境参数配置或者配置文件配置
     * 环境参数配置：
     * 需要在 VM Options 指定app.id 、evn、dev_meta地址
     * -Dapp.id=app-learn -Denv=DEV -Ddev_meta=http://192.168.8.12:8080
     *
     * 配置文件配置：
     *
     * @param args
     */
    public static void main(String[] args) {
        while (true){
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Config config = ConfigService.getAppConfig();
            Boolean smsEnable = config.getBooleanProperty("sms.enable", null);
            System.out.println("smsEnable is " + smsEnable);
        }
    }
}
