package top.flobby.tools.common;

/**
 * @author Flobby
 * @description 视频分区类型
 */

public enum TypeEnum {

    /**
     * 视频类型
     */
    DONG_HUA(1,"动画"),
    DONG_WU_QUAN(2,"动物圈"),
    FAN_JU(3,"番剧"),
    GUI_CHU(4,"鬼畜"),
    MEI_SHI(5,"美食"),
    SHENG_HUO(6,"生活"),
    SHI_SHANG(7,"时尚"),
    SHU_MA(8,"数码"),
    WU_DAO(9,"舞蹈"),
    XIN_REN(10,"新人"),
    YIN_YUE(11,"音乐"),
    YING_SHI(12,"影视"),
    YOU_XI(13,"游戏"),
    YU_LE(14,"娱乐"),
    YUAN_CHUANG(15,"原创"),
    ZHI_SHI(16,"知识");

    TypeEnum(Integer id,String type){
        this.id = id;
        this.type = type;
    }

    private final Integer id;
    private final String type;

    public int getId(){return id;}
    public String getType(){return type;}
}
