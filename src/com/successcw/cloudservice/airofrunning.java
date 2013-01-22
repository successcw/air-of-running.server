package com.successcw.cloudservice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.successcw.emc.AQIDataPublishLiveInfo;
import com.successcw.emc.ArrayOfAQIDataPublishLiveInfo;
import com.successcw.emc.EnvAQIServeice;
import com.successcw.emc.IEnvAQIServeice;
import com.successcw.nettool.NetTool;


public class airofrunning extends HttpServlet {
	private String[] city = {
		"北京",
		"天津",
		"石家庄",
		"秦皇岛",
		"邯郸",
		"邢台",
		"保定",
		"承德",
		"衡水",
		"张家口",
		"廊坊",
		"唐山",
		"沧州",
		"太原",
		"呼和浩特",
		"沈阳",
		"大连",
		"长春",
		"哈尔滨",
		"上海",
		"南京",
		"无锡",
		"徐州",
		"常州",
		"苏州",
		"南通",
		"连云港",
		"淮安",
		"盐城",
		"扬州",
		"镇江",
		"泰州",
		"宿迁",
		"杭州",
		"宁波",
		"温州",
		"嘉兴",
		"湖州",
		"衢州",
		"舟山",
		"台州",
		"丽水",
		"绍兴",
		"金华",
		"合肥",
		"福州",
		"厦门",
		"南昌",
		"济南",
		"青岛",
		"郑州",
		"武汉",
		"长沙",
		"广州",
		"深圳",
		"珠海",
		"佛山",
		"江门",
		"肇庆",
		"惠州",
		"东莞",
		"中山",
		"南宁",
		"海口",
		"重庆",
		"成都",
		"贵阳",
		"昆明",
		"拉萨",
		"西安",
		"兰州",
		"西宁",
		"银川",
		"乌鲁木齐"
	};
	private String[] beijingStation = {
        "永定门内",
        "榆垡",
        "植物园",
        "丰台花园",
        "顺义",
        "延庆",
        "平谷",
        "房山",
        "亦庄",
        "云岗",
        "密云水库",
        "怀柔",
        "八达岭",
        "万寿西宫",
        "昌平",
        "门头沟",
        "通州",
        "大兴",
        "定陵",
        "前门",
        "东四",
        "天坛",
        "奥体中心",
        "农展馆",
        "密云",
        "古城",
        "官园",
        "南三环",
        "北部新区",
        "万柳",
        "永乐店",
        "琉璃河",
        "东高村",
        "东四环",
        "西直门北"
	};
	private String[] beijingStationUnicode = {
		"\u6c38\u5b9a\u95e8\u5185",
		"\u6986\u57a1",
		"\u690d\u7269\u56ed",
		"\u4e30\u53f0\u82b1\u56ed",
		"\u987a\u4e49",
		"\u5ef6\u5e86",
		"\u5e73\u8c37",
		"\u623f\u5c71",
		"\u4ea6\u5e84",
		"\u4e91\u5c97",
		"\u5bc6\u4e91\u6c34\u5e93",
		"\u6000\u67d4",
		"\u516b\u8fbe\u5cad",
		"\u4e07\u5bff\u897f\u5bab",
		"\u660c\u5e73",
		"\u95e8\u5934\u6c9f",
		"\u901a\u5dde",
		"\u5927\u5174",
		"\u5b9a\u9675",
		"\u524d\u95e8",
		"\u4e1c\u56db",
		"\u5929\u575b",
		"\u5965\u4f53\u4e2d\u5fc3",
		"\u519c\u5c55\u9986",
		"\u5bc6\u4e91",
		"\u53e4\u57ce",
		"\u5b98\u56ed",
		"\u5357\u4e09\u73af",
		"\u5317\u90e8\u65b0\u533a",
		"\u4e07\u67f3",
		"\u6c38\u4e50\u5e97",
		"\u7409\u7483\u6cb3",
		"\u4e1c\u9ad8\u6751",
		"\u4e1c\u56db\u73af",
		"\u897f\u76f4\u95e8\u5317"
	};
	public static Integer TryParseInt(String str) {
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException ex) {
            return null;
        }
	}
	 public static String toUnicode(String s) {
		 String s1 = "";
		 for (int i = 0; i < s.length(); i++) {
			 s1 +="\\u" +  Integer.toHexString(s.charAt(i) & 0xffff);
		 }
		 return s1;
	 }

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		int averageAQI = 0;
		int count = 0;
		String beijingAQI;
		String beijingPM25;
		int reqCity;
		int reqStation;

		if(req.getParameter("city") == null) {
		
			resp.setContentType("text/html");
			resp.setCharacterEncoding("utf-8");
		    PrintWriter out = resp.getWriter();;
		    out.println("<html>");
		    out.println("<head><title>demolet</title></head>");
		    out.println("<body>");
		    out.println("<p>hello,world!.</p>");
		    out.println("</body></html>");
		    out.close();
			
//			resp.setContentType("text/plain");
//			resp.setCharacterEncoding("utf-8");
//		    PrintWriter out = out;
//		    
//		    for(int i=0; i< beijingStation.length; i++) {
//		    	out.print("\"");
//		    	out.print(toUnicode(beijingStation[i]));
//		    	out.println("\",");
//		    }
			
			//out.println("welcome!");
		} else if(req.getParameter("city") != null && req.getParameter("station") != null) {
			resp.setContentType("text/html");
			resp.setCharacterEncoding("utf-8");
			reqCity = Integer.valueOf(req.getParameter("city"));
			reqStation = Integer.valueOf(req.getParameter("station"));
		    PrintWriter out = resp.getWriter();
	//        EnvAQIServeice emc = new EnvAQIServeice();
	//        IEnvAQIServeice client = emc.getBasicHttpBindingIEnvAQIServeice();
	//        ArrayOfAQIDataPublishLiveInfo o = client.getCityStation(Integer.valueOf(req.getParameter("city")));
	//        List<AQIDataPublishLiveInfo> strList = o.getAQIDataPublishLiveInfo();
	//
	//        for(int i=0; i < strList.size(); i++) {
	//           out.println(strList.get(i).getAQI().getValue());
	//           out.println(strList.get(i).getArea().getValue());
	//           out.println(strList.get(i).getCO().getValue());
	//           out.println(strList.get(i).getCO24H().getValue());
	//           out.println(strList.get(i).getID());
	//           out.println(strList.get(i).getLatitude().getValue());
	//           out.println(strList.get(i).getLongitude() .getValue());
	//           out.println(strList.get(i).getNO2().getValue());
	//           out.println(strList.get(i).getNO224H().getValue());
	//           out.println(strList.get(i).getO38H24H().getValue());
	//           out.println(strList.get(i).getPM10().getValue());
	//           out.println(strList.get(i).getPM1024H().getValue());
	//           out.println(strList.get(i).getPM25().getValue());
	//           out.println(strList.get(i).getPM2524H().getValue());
	//           out.println(strList.get(i).getPositionName().getValue());
	//           out.println(strList.get(i).getPrimaryPollutant() .getValue());
	//           out.println(strList.get(i).getQuality().getValue());
	//           out.println(strList.get(i).getSO2().getValue());
	//           out.println(strList.get(i).getSO224H().getValue());
	//           out.println(strList.get(i).getStationCode().getValue());
	//           out.println(strList.get(i).getTimePoint().toString());
	//           out.println(strList.get(i).getUnheathful().getValue());
	//           out.println("\n");
	//           
	//        }
			if(reqCity == 1) {//beijing	
				try {
				beijingAQI = NetTool.getHtml("http://zx.bjmemc.com.cn/ashx/Data.ashx?Action=GetAQIClose1h", "UTF-8");
				JSONArray jsonObjRecv = new JSONArray(beijingAQI);

				beijingPM25 = 
						NetTool.getHtml("http://zx.bjmemc.com.cn/ashx/Data.ashx?Action=GetChartData_ByStationAndWRWType&StationName="
								+ beijingStation[reqStation] + "&WRWType=pm2.5","UTF-8");
				
				JSONObject jsonobjRecvPM25 = new JSONObject(beijingPM25);
				int length = jsonobjRecvPM25.getJSONArray("Datas").length();
				for(int i = length -1; i >= 0; i--) {
					beijingPM25 = jsonobjRecvPM25.getJSONArray("Datas").getJSONObject(i).get("Value").toString();
					if(!(beijingPM25.equals("") || beijingPM25.equals("-9999")))
						break;
				}
						
				for(int i = 0; i < jsonObjRecv.length(); i++)
				{
					if(jsonObjRecv.getJSONObject(i).getString("StationName").equals(beijingStationUnicode[reqStation])) {
						reqStation = i;
						break;
					}
				}
				//out.println(jsonobjRecvPM25.toString());
				
				//out.println(jsonObjRecv.toString());
				out.print("{\"averageAQI\":\"");
				out.print(" ");
				out.print("\",");
				out.print("\"AQI\":\"");
				out.print(jsonObjRecv.getJSONObject(reqStation).getString("AQIValue"));
				out.print("\",");
				out.print("\"time\":\"");
				out.print(jsonObjRecv.getJSONObject(reqStation).getString("Time"));
				out.print("\",");
				out.print("\"station\":\"");
				out.print(jsonObjRecv.getJSONObject(reqStation).getString("StationName"));
				out.print("\",");
				out.print("\"quality\":\"");
				out.print(jsonObjRecv.getJSONObject(reqStation).getString("Quality"));
				out.print("\",");
				out.print("\"PM2_5\":\"");	      	
				out.print(beijingPM25);
				out.print("\",");
				out.print("\"area\":\"");
				out.print("北京");
				out.print("\"}");
				out.close();
				
				}catch(Exception e){
					out.println(e.toString());
				}
				
				
			}else{//other cities
				
				EnvAQIServeice emc = new EnvAQIServeice();
				IEnvAQIServeice client = emc.getBasicHttpBindingIEnvAQIServeice();
				ArrayOfAQIDataPublishLiveInfo o = client.getAQIDataByCityName(city[reqCity-1]);
				List<AQIDataPublishLiveInfo> strList = o.getAQIDataPublishLiveInfo();
			      
		
				for(int i=0; i < strList.size(); i++) {
					Integer temp = TryParseInt(strList.get(i).getAQI().getValue());
					if (temp != null) {
						averageAQI+= Integer.valueOf(temp);
						count++;
					}
				}

				out.print("{\"averageAQI\":\"");
				out.print(String.valueOf(averageAQI/count));
				out.print("\",");
				out.print("\"AQI\":\"");
				out.print(strList.get(reqStation).getAQI().getValue());
				out.print("\",");
				out.print("\"time\":\"");
				out.print(strList.get(reqStation).getTimePoint().toString());
				out.print("\",");
				out.print("\"station\":\"");
				out.print(strList.get(reqStation).getPositionName().getValue());
				out.print("\",");
				out.print("\"quality\":\"");
				out.print(strList.get(reqStation).getQuality().getValue());
				out.print("\",");
				out.print("\"PM2_5\":\"");	      	
				out.print(strList.get(reqStation).getPM25().getValue());
				out.print("\",");
				out.print("\"area\":\"");
				out.print(strList.get(reqStation).getArea().getValue());
				out.print("\"}");
				out.close();
			}

		}
	}
        

	public void doPost (HttpServletRequest req, HttpServletResponse res)
        throws IOException
	{
		res.getWriter().println(req.getParameterNames());
	
	}

}