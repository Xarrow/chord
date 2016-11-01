package shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @Author zhangjian5
 * @Time 2016/10/18
 */
public class ShiroDbRealm extends AuthorizingRealm{
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        if(authenticationToken.getPrincipal().toString().equals("zhangsan")&&new String((char[])authenticationToken.getCredentials()).equals("zhangsan")) {
            return new SimpleAuthenticationInfo(authenticationToken.getPrincipal(),authenticationToken.getCredentials(),"shiroDbRealm");
        } else {
            return null;
        }
    }
}
