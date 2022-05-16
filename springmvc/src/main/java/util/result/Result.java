package util.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 公共返回对象
 *
 * @Author WangBinRen
 * @Date 2022/1/1 21:32
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private long code;
    private String message;
    private T data;

    /**
     * 成功返回
     *
     * @param message
     * @return
     */
    public static <T> Result<T> success(String message) {
        return new Result<>(200, message, null);
    }

    /**
     * 成功返回结果
     *
     * @param message
     * @return
     */
    public static <T> Result<T> success(String message, T data) {
        return new Result<>(200, message, data);
    }

    /**
     * 失败返回
     *
     * @param message
     * @return
     */
    public static <T> Result<T> error(String message) {
        return new Result<>(500, message, null);
    }

    /**
     * 失败返回结果
     *
     * @param message
     * @return
     */
    public static <T> Result<T> error(String message, T data) {
        return new Result<>(500, message, data);
    }

}
