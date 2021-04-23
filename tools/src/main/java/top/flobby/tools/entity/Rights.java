package top.flobby.tools.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/11
 * @description :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rights {
    private Integer bp;
    private Integer elec;
    private Integer download;
    private Integer movie;
    private Integer pay;
    private Integer hd5;
    private Integer no_reprint;
    private Integer autoplay;
    private Integer ugc_pay;
    private Integer is_cooperation;
    private Integer ugc_pay_preview;
    private Integer no_background;
}
