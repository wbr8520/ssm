package util.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author WangBinRen
 * @Date 2022/5/8 20:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleModel {
    private Integer aid;
    private String title;
    private String text;
}