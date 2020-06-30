package com.galaxyt.normae.security.provider;

import com.galaxyt.normae.core.annotation.NotWrapper;
import com.galaxyt.normae.core.util.json.GsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * 用于向外部提供本项目全部接口地址及权限的端点
 * @author zhouqi
 * @date 2020/6/9 17:06
 * @version v1.0.0
 * @Description
 *
 * Modification History:
 * Date                 Author          Version          Description
---------------------------------------------------------------------------------*
 * 2020/6/9 17:06     zhouqi          v1.0.0           Created
 *
 */
@RestController
@RequestMapping("/endpoint/authority")
public class AuthorityEndpoint {

    @Autowired
    private RequestMappingProcessor requestMappingProcessor;


    @NotWrapper
    @GetMapping
    public Collection<RequestMappingWrapper> notifications() {
        Collection<RequestMappingWrapper> collection = this.requestMappingProcessor.findAll();
        return collection;
    }

}
