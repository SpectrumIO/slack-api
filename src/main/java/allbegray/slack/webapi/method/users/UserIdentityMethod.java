package allbegray.slack.webapi.method.users;

import allbegray.slack.validation.ValidationError;
import allbegray.slack.webapi.SlackWebApiConstants;
import allbegray.slack.webapi.method.AbstractMethod;

import java.util.List;
import java.util.Map;

public class UserIdentityMethod extends AbstractMethod {
    private String user;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String getMethodName() {
        return SlackWebApiConstants.USERS_IDENTITY_GET;
    }

    @Override
    public void validate(List<ValidationError> errors) {}

    @Override
    protected void createParameters(Map<String, String> parameters) {}
}
