
package test;

import test.model.FileInfo;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Function description.
 *
 * @author xxxxxxx
 * @since 2019-10-24
 */
public class PublishApiDemo {

    /**
     * Token domain name.
     */
    private static String domain = "https://connect-api.cloud.huawei.com/api";

    /**
     * clientId
     */
    private static String clientId = "345466383275918528";

    /**
     * clientSecret
     */
    private static String clientSecret = "对应的appSecret";

    /**
     * App ID.
     */
    private static String appId = "对应开发者后台的appId";

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        // Obtain the token.
        String token = GetToken.getToken(domain, clientId, clientSecret);

        System.out.println(token);

        // Query app information.
//        GetAppInfo.getAppInfo(domain, clientId, token, appId);

        // Update app information.
//        UpdateAppInfo.updateAppInfo(domain, clientId, token, appId);

        // Upload the file.
        List<FileInfo> files = UploadFile.uploadFile(domain, clientId, token, appId, "apk");

        // After file upload, call the API for updating app file information.
        UploadAppFileInfo.updateAppFileInfo(domain, clientId, token, appId, files);

        // Submit for review.
//        SubmitAudit.submit(domain, clientId, token, appId);
    }

}
