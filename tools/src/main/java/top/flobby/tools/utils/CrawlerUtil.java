//package top.flobby.tools.utils;
//
//import org.apache.http.HttpEntity;
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.protocol.HttpClientContext;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//import top.flobby.tools.entity.Rank;
//
//import java.text.ParseException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author :Flobby
// * @version :1.0
// * @date :2021/4/2
// * @description :
// */
//
//public class CrawlerUtil {
//    public static final int SUCCESS = 200;
//
//    /**
//     * 爬取b站排⾏榜数据
//     *
//     * @return List<Rank>
//     */
//    public static List<Rank> getRanks() throws ParseException {
//        List<Rank> ranks = new ArrayList<>();
//        String url =
//                "https://www.mosoteach.cn/web/index.php?c=member&m=index&clazz_course_id=A08A7E37-DF79-45F5-8897-22D33247D5E7";
//        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64)" +
//                " AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.190 Safari/537.36";
//        CloseableHttpClient httpClient =
//                HttpClients.createDefault();
//        try {
//            HttpGet httpGet = new HttpGet(url);
//            //设置请求头
//            httpGet.setHeader("user-agent", userAgent);
//            httpGet.setHeader("Cookie","_uab_collina=161460389180455990142055; " +
//                    "login_token=c1606c72883394c280999943cb67c9d82ed42d2dcc43aed020f9585319778744; " +
//                    "acw_tc=2f624a6d16176187953592638e3f56c5e5e8f1832c2cd477f1e198bb907e91; " +
//                    "teachweb=6bb5a89f77619431d9a754a2b7f238bae9b1b446; " +
//                    "SERVERID=f83e20313967653971d0618a2ae74747|1617618864|1617618795");
//            HttpClientContext context =
//                    HttpClientContext.create();
//            //发起get请求
//            CloseableHttpResponse response =
//                    httpClient.execute(httpGet, context);
//            int statusCode =
//                    response.getStatusLine().getStatusCode();
//            if (statusCode == SUCCESS) {
//                HttpEntity entity = response.getEntity();
//                if (entity != null) {
//                    String res =
//                            EntityUtils.toString(entity);
////                    System.out.println(res);
//                    Document document = Jsoup.parse(res);
//                    System.out.println(document);
//                    Elements elements =
//                            document.select("div[class=members-list-data]").select("ul");
//                    System.out.println(elements.size());
//                    for (Element element : elements) {
//                        String name = element.select(".full-name").text();
//                        String stuId = element.select(".student-no").text();
//                        String avatar = element.select(".avatar-url").text();
//                        String score = element.select(".score").text();
//                        String ranking = element.select(".ranking").text();
//                        //创建Rank对象
//                        Rank rank = Rank.builder().stuId(stuId)
//                                .name(name)
//                                .avatar(avatar)
//                                .score(score)
//                                .ranking(ranking)
//                                .build();
//                        ranks.add(rank);
//                    }
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return ranks;
//    }
//
//    public static void main(String[] args) throws ParseException {
//        List<Rank> ranks = CrawlerUtil.getRanks();
//        ranks.forEach(System.out::println);
//    }
//}
