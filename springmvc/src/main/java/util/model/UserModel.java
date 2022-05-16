package util.model;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author WangBinRen
 * @Date 2022/5/8 20:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}