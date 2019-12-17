package com.zking.core.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class ShiroRealm extends AuthorizingRealm{
    @Autowired
   // private ILoginInfoService loginInfoService;


    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //认证
//        String username = token.getPrincipal().toString();
//        SysUser sysUser = loginInfoService.listSingleUser(username);//sysUser.getUsername(),sysUser.getPassword(), ByteSource.Util.bytes(sysUser.getSalt()),this.getName()
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo();
        return simpleAuthenticationInfo;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        String username = principalCollection.getPrimaryPrincipal().toString();
//        Set<String> roles = sysUserService.listRolesByUserName(username);
//        Set<String> permission = sysUserService.listPermissionByUserName(username);

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        simpleAuthorizationInfo.setRoles(roles);
//        simpleAuthorizationInfo.setStringPermissions(permission);

        return simpleAuthorizationInfo;
    }
}
