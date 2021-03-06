package cn.imcao.ess.entity.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ImCaO
 * @description 用户登录 VO
 * @date Created at 2021/11/16 16:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginVO {

    private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
}
