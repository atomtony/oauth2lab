package io.spring2go.jwtresourceserver.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping("/api/userinfo")
    public ResponseEntity<UserInfo> getUerInfo() {

        UserInfo userInfo = new UserInfo("aa", "bb");

        return ResponseEntity.ok(userInfo);
    }

    @RequestMapping(value = "/api/createUser",method = RequestMethod.POST)
    public ResponseEntity<UserInfo> getUerInfo(@RequestBody @Validated UserInfo userInfo) {
        return ResponseEntity.ok(userInfo);
    }

}
