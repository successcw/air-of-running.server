
package com.successcw.emc;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.1
 * 2013-01-08T13:47:17.351+08:00
 * Generated source version: 2.7.1
 * 
 */
public final class IEnvAQIServeice_BasicHttpBindingIEnvAQIServeice_Client {

    private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "EnvAQIServeice");

    private IEnvAQIServeice_BasicHttpBindingIEnvAQIServeice_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = EnvAQIServeice.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        EnvAQIServeice ss = new EnvAQIServeice(wsdlURL, SERVICE_NAME);
        IEnvAQIServeice port = ss.getBasicHttpBindingIEnvAQIServeice();  
        
        {
        System.out.println("Invoking getAllAQIPublishLiveData...");
        com.successcw.emc.ArrayOfAQIDataPublishLiveInfo _getAllAQIPublishLiveData__return = port.getAllAQIPublishLiveData();
        System.out.println("getAllAQIPublishLiveData.result=" + _getAllAQIPublishLiveData__return);


        }
        {
        System.out.println("Invoking getAQIDataByCityName...");
        java.lang.String _getAQIDataByCityName_cityName = "";
        com.successcw.emc.ArrayOfAQIDataPublishLiveInfo _getAQIDataByCityName__return = port.getAQIDataByCityName(_getAQIDataByCityName_cityName);
        System.out.println("getAQIDataByCityName.result=" + _getAQIDataByCityName__return);


        }
        {
        System.out.println("Invoking getHistoryBySNandCODE...");
        java.lang.String _getHistoryBySNandCODE_positionName = "";
        java.lang.String _getHistoryBySNandCODE_pollutantCode = "";
        com.successcw.emc.ArrayOfAQIChartValue _getHistoryBySNandCODE__return = port.getHistoryBySNandCODE(_getHistoryBySNandCODE_positionName, _getHistoryBySNandCODE_pollutantCode);
        System.out.println("getHistoryBySNandCODE.result=" + _getHistoryBySNandCODE__return);


        }
        {
        System.out.println("Invoking getAQIDay...");
        java.lang.String _getAQIDay_cityName = "";
        com.successcw.emc.ArrayOfAQIDayBll _getAQIDay__return = port.getAQIDay(_getAQIDay_cityName);
        System.out.println("getAQIDay.result=" + _getAQIDay__return);


        }
        {
        System.out.println("Invoking pm25AndPM10...");
        com.successcw.emc.ArrayOfAQIDataPublishLiveInfo _pm25AndPM10_listOriData = null;
        com.successcw.emc.ArrayOfAQIDataPublishLiveInfo _pm25AndPM10__return = port.pm25AndPM10(_pm25AndPM10_listOriData);
        System.out.println("pm25AndPM10.result=" + _pm25AndPM10__return);


        }
        {
        System.out.println("Invoking getAllAQILiveData...");
        java.lang.String _getAllAQILiveData_provinceName = "";
        com.successcw.emc.ArrayOfAQIDataPublishLiveInfo _getAllAQILiveData__return = port.getAllAQILiveData(_getAllAQILiveData_provinceName);
        System.out.println("getAllAQILiveData.result=" + _getAllAQILiveData__return);


        }
        {
        System.out.println("Invoking getCityNameByPName...");
        java.lang.String _getCityNameByPName_provinceName = "";
        com.successcw.emc.ArrayOfCityInfo _getCityNameByPName__return = port.getCityNameByPName(_getCityNameByPName_provinceName);
        System.out.println("getCityNameByPName.result=" + _getCityNameByPName__return);


        }
        {
        System.out.println("Invoking getAQITip...");
        com.successcw.emc.ArrayOfKeyValueOfintstring _getAQITip__return = port.getAQITip();
        System.out.println("getAQITip.result=" + _getAQITip__return);


        }
        {
        System.out.println("Invoking setAQI24Layer...");
        java.lang.String _setAQI24Layer_param = "";
        java.lang.String _setAQI24Layer_url = "";
        java.lang.Boolean _setAQI24Layer__return = port.setAQI24Layer(_setAQI24Layer_param, _setAQI24Layer_url);
        System.out.println("setAQI24Layer.result=" + _setAQI24Layer__return);


        }
        {
        System.out.println("Invoking getAllHistoryByNameAndTime...");
        java.lang.String _getAllHistoryByNameAndTime_positionName = "";
        java.lang.String _getAllHistoryByNameAndTime_pollutantCode = "";
        java.lang.String _getAllHistoryByNameAndTime_startTime = "";
        java.lang.String _getAllHistoryByNameAndTime_endTime = "";
        com.successcw.emc.ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP _getAllHistoryByNameAndTime__return = port.getAllHistoryByNameAndTime(_getAllHistoryByNameAndTime_positionName, _getAllHistoryByNameAndTime_pollutantCode, _getAllHistoryByNameAndTime_startTime, _getAllHistoryByNameAndTime_endTime);
        System.out.println("getAllHistoryByNameAndTime.result=" + _getAllHistoryByNameAndTime__return);


        }
        {
        System.out.println("Invoking getAQICityStation...");
        java.lang.String _getAQICityStation_cityName = "";
        com.successcw.emc.ArrayOfAQICityStationInfo _getAQICityStation__return = port.getAQICityStation(_getAQICityStation_cityName);
        System.out.println("getAQICityStation.result=" + _getAQICityStation__return);


        }
        {
        System.out.println("Invoking getIaqiHistoryByNameAndTime...");
        java.lang.String _getIaqiHistoryByNameAndTime_positionName = "";
        java.lang.String _getIaqiHistoryByNameAndTime_pollutantCode = "";
        java.lang.String _getIaqiHistoryByNameAndTime_startTime = "";
        java.lang.String _getIaqiHistoryByNameAndTime_endTime = "";
        com.successcw.emc.ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP _getIaqiHistoryByNameAndTime__return = port.getIaqiHistoryByNameAndTime(_getIaqiHistoryByNameAndTime_positionName, _getIaqiHistoryByNameAndTime_pollutantCode, _getIaqiHistoryByNameAndTime_startTime, _getIaqiHistoryByNameAndTime_endTime);
        System.out.println("getIaqiHistoryByNameAndTime.result=" + _getIaqiHistoryByNameAndTime__return);


        }
        {
        System.out.println("Invoking getAQILayerHistory...");
        java.lang.String _getAQILayerHistory_poID = "";
        com.successcw.emc.ArrayOfAQILayerPublishHistoryInfo _getAQILayerHistory__return = port.getAQILayerHistory(_getAQILayerHistory_poID);
        System.out.println("getAQILayerHistory.result=" + _getAQILayerHistory__return);


        }
        {
        System.out.println("Invoking setIAQIPublishData...");
        com.successcw.emc.ArrayOfIAQIDataPublishLiveInfo _setIAQIPublishData_aqida = null;
        java.lang.Boolean _setIAQIPublishData__return = port.setIAQIPublishData(_setIAQIPublishData_aqida);
        System.out.println("setIAQIPublishData.result=" + _setIAQIPublishData__return);


        }
        {
        System.out.println("Invoking getAQIHistoryBySN...");
        java.lang.String _getAQIHistoryBySN_stationName = "";
        com.successcw.emc.ArrayOfAQIDataPublishHistoryInfo _getAQIHistoryBySN__return = port.getAQIHistoryBySN(_getAQIHistoryBySN_stationName);
        System.out.println("getAQIHistoryBySN.result=" + _getAQIHistoryBySN__return);


        }
        {
        System.out.println("Invoking setAQIPublishData...");
        com.successcw.emc.ArrayOfAQIDataPublishLiveInfo _setAQIPublishData_aqida = null;
        java.lang.Boolean _setAQIPublishData__return = port.setAQIPublishData(_setAQIPublishData_aqida);
        System.out.println("setAQIPublishData.result=" + _setAQIPublishData__return);


        }
        {
        System.out.println("Invoking getAllAQILayerURL...");
        com.successcw.emc.ArrayOfAQILayerPublishLiveInfo _getAllAQILayerURL__return = port.getAllAQILayerURL();
        System.out.println("getAllAQILayerURL.result=" + _getAllAQILayerURL__return);


        }
        {
        System.out.println("Invoking getAllAQIStation...");
        com.successcw.emc.ArrayOfStationInfo _getAllAQIStation__return = port.getAllAQIStation();
        System.out.println("getAllAQIStation.result=" + _getAllAQIStation__return);


        }
        {
        System.out.println("Invoking getAQILayer...");
        java.lang.String _getAQILayer_poID = "";
        com.successcw.emc.AQILayerPublishLiveInfo _getAQILayer__return = port.getAQILayer(_getAQILayer_poID);
        System.out.println("getAQILayer.result=" + _getAQILayer__return);


        }
        {
        System.out.println("Invoking getAllAQIPublish...");
        com.successcw.emc.ArrayOfAQIDataPublishLiveInfo _getAllAQIPublish__return = port.getAllAQIPublish();
        System.out.println("getAllAQIPublish.result=" + _getAllAQIPublish__return);


        }
        {
        System.out.println("Invoking upDatePolConLimits...");
        com.successcw.emc.ArrayOfAQIPollutantUpperLimitInfo _upDatePolConLimits_listUpPolLimit = null;
        java.lang.Boolean _upDatePolConLimits__return = port.upDatePolConLimits(_upDatePolConLimits_listUpPolLimit);
        System.out.println("upDatePolConLimits.result=" + _upDatePolConLimits__return);


        }
        {
        System.out.println("Invoking getStringUrlByTime...");
        java.lang.String _getStringUrlByTime_param = "";
        javax.xml.datatype.XMLGregorianCalendar _getStringUrlByTime_time = null;
        java.lang.String _getStringUrlByTime__return = port.getStringUrlByTime(_getStringUrlByTime_param, _getStringUrlByTime_time);
        System.out.println("getStringUrlByTime.result=" + _getStringUrlByTime__return);


        }
        {
        System.out.println("Invoking getAQIHistory...");
        java.lang.String _getAQIHistory_stationCode = "";
        javax.xml.datatype.XMLGregorianCalendar _getAQIHistory_beginTime = null;
        javax.xml.datatype.XMLGregorianCalendar _getAQIHistory_endTime = null;
        com.successcw.emc.ArrayOfAQIDataPublishHistoryInfo _getAQIHistory__return = port.getAQIHistory(_getAQIHistory_stationCode, _getAQIHistory_beginTime, _getAQIHistory_endTime);
        System.out.println("getAQIHistory.result=" + _getAQIHistory__return);


        }
        {
        System.out.println("Invoking getPolConLimits...");
        com.successcw.emc.ArrayOfAQIPollutantUpperLimitInfo _getPolConLimits__return = port.getPolConLimits();
        System.out.println("getPolConLimits.result=" + _getPolConLimits__return);


        }
        {
        System.out.println("Invoking getIAQIPublishEtyByCityName...");
        java.lang.String _getIAQIPublishEtyByCityName_cityName = "";
        com.successcw.emc.ArrayOfIAQIDataPublishLiveEty _getIAQIPublishEtyByCityName__return = port.getIAQIPublishEtyByCityName(_getIAQIPublishEtyByCityName_cityName);
        System.out.println("getIAQIPublishEtyByCityName.result=" + _getIAQIPublishEtyByCityName__return);


        }
        {
        System.out.println("Invoking getAQIData...");
        com.successcw.emc.ArrayOfAQIDataPublishLiveInfo _getAQIData__return = port.getAQIData();
        System.out.println("getAQIData.result=" + _getAQIData__return);


        }
        {
        System.out.println("Invoking getAQIPublishByTime...");
        javax.xml.datatype.XMLGregorianCalendar _getAQIPublishByTime_time = null;
        com.successcw.emc.ArrayOfAQIDataPublishHistoryInfo _getAQIPublishByTime__return = port.getAQIPublishByTime(_getAQIPublishByTime_time);
        System.out.println("getAQIPublishByTime.result=" + _getAQIPublishByTime__return);


        }
        {
        System.out.println("Invoking getCNByPName...");
        java.lang.String _getCNByPName_provinceName = "";
        com.successcw.emc.ArrayOfCityInfo _getCNByPName__return = port.getCNByPName(_getCNByPName_provinceName);
        System.out.println("getCNByPName.result=" + _getCNByPName__return);


        }
        {
        System.out.println("Invoking updateLayerUrl...");
        java.lang.String _updateLayerUrl_paramName = "";
        java.lang.String _updateLayerUrl_layerUrl = "";
        java.lang.Boolean _updateLayerUrl__return = port.updateLayerUrl(_updateLayerUrl_paramName, _updateLayerUrl_layerUrl);
        System.out.println("updateLayerUrl.result=" + _updateLayerUrl__return);


        }
        {
        System.out.println("Invoking getStringUrl...");
        java.lang.String _getStringUrl_param = "";
        java.lang.String _getStringUrl__return = port.getStringUrl(_getStringUrl_param);
        System.out.println("getStringUrl.result=" + _getStringUrl__return);


        }
        {
        System.out.println("Invoking getCityNameByPID...");
        java.lang.Integer _getCityNameByPID_pid = null;
        com.successcw.emc.ArrayOfCityInfo _getCityNameByPID__return = port.getCityNameByPID(_getCityNameByPID_pid);
        System.out.println("getCityNameByPID.result=" + _getCityNameByPID__return);


        }
        {
        System.out.println("Invoking getAQIPublishStation...");
        com.successcw.emc.ArrayOfAQICityInfo _getAQIPublishStation__return = port.getAQIPublishStation();
        System.out.println("getAQIPublishStation.result=" + _getAQIPublishStation__return);


        }
        {
        System.out.println("Invoking getHistoryByNameAndTime...");
        java.lang.String _getHistoryByNameAndTime_positionName = "";
        java.lang.String _getHistoryByNameAndTime_pollutantCode = "";
        java.lang.String _getHistoryByNameAndTime_startTime = "";
        java.lang.String _getHistoryByNameAndTime_endTime = "";
        com.successcw.emc.ArrayOfAQIChartValue _getHistoryByNameAndTime__return = port.getHistoryByNameAndTime(_getHistoryByNameAndTime_positionName, _getHistoryByNameAndTime_pollutantCode, _getHistoryByNameAndTime_startTime, _getHistoryByNameAndTime_endTime);
        System.out.println("getHistoryByNameAndTime.result=" + _getHistoryByNameAndTime__return);


        }
        {
        System.out.println("Invoking getCityStation...");
        java.lang.Integer _getCityStation_pid = null;
        com.successcw.emc.ArrayOfAQIDataPublishLiveInfo _getCityStation__return = port.getCityStation(_getCityStation_pid);
        System.out.println("getCityStation.result=" + _getCityStation__return);


        }
        {
        System.out.println("Invoking getAllIAQIPublishEty...");
        com.successcw.emc.ArrayOfIAQIDataPublishLiveEty _getAllIAQIPublishEty__return = port.getAllIAQIPublishEty();
        System.out.println("getAllIAQIPublishEty.result=" + _getAllIAQIPublishEty__return);


        }
        {
        System.out.println("Invoking getData...");
        java.lang.String _getData_indicatorCode = "";
        com.successcw.emc.ArrayOfAQILayerPublishHistoryInfo _getData__return = port.getData(_getData_indicatorCode);
        System.out.println("getData.result=" + _getData__return);


        }
        {
        System.out.println("Invoking getPid...");
        java.lang.String _getPid_cityname = "";
        java.lang.Integer _getPid__return = port.getPid(_getPid_cityname);
        System.out.println("getPid.result=" + _getPid__return);


        }

        System.exit(0);
    }

}
