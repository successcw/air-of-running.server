
package com.successcw.emc;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.successcw.emc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAQIHistoryResponseGetAQIHistoryResult_QNAME = new QName("http://tempuri.org/", "GetAQIHistoryResult");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _AQIPollutantUpperLimitInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "AQIPollutantUpperLimitInfo");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _ArrayOfKeyValueOfintstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfintstring");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88cNA_P");
    private final static QName _AQIDataPublishLiveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "AQIDataPublishLiveInfo");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _BaseEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/Fundway.Env.DataAccess", "BaseEntity");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfAQIDataPublishHistoryInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "ArrayOfAQIDataPublishHistoryInfo");
    private final static QName _ArrayOfStationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "ArrayOfStationInfo");
    private final static QName _ArrayOfAQIPollutantUpperLimitInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "ArrayOfAQIPollutantUpperLimitInfo");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _CityInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "CityInfo");
    private final static QName _ArrayOfAQIChartValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", "ArrayOfAQIChartValue");
    private final static QName _ArrayOfCityInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "ArrayOfCityInfo");
    private final static QName _ArrayOfIAQIDataPublishLiveEty_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", "ArrayOfIAQIDataPublishLiveEty");
    private final static QName _AQICityStationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "AQICityStationInfo");
    private final static QName _ArrayOfAQIDataPublishLiveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "ArrayOfAQIDataPublishLiveInfo");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _StationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "StationInfo");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ArrayOfAQICityInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "ArrayOfAQICityInfo");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _AQICityInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "AQICityInfo");
    private final static QName _AQIDayBll_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", "AQIDayBll");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ArrayOfAQICityStationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "ArrayOfAQICityStationInfo");
    private final static QName _ArrayOfIAQIDataPublishLiveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "ArrayOfIAQIDataPublishLiveInfo");
    private final static QName _IAQIDataPublishLiveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "IAQIDataPublishLiveInfo");
    private final static QName _IAQIDataPublishLiveEty_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", "IAQIDataPublishLiveEty");
    private final static QName _AQIDataPublishHistoryInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "AQIDataPublishHistoryInfo");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _ArrayOfAQIDayBll_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", "ArrayOfAQIDayBll");
    private final static QName _AQILayerPublishLiveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "AQILayerPublishLiveInfo");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _AQIChartValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", "AQIChartValue");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfAQILayerPublishLiveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "ArrayOfAQILayerPublishLiveInfo");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfAQILayerPublishHistoryInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "ArrayOfAQILayerPublishHistoryInfo");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _AQILayerPublishHistoryInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "AQILayerPublishHistoryInfo");
    private final static QName _GetCityNameByPNameResponseGetCityNameByPNameResult_QNAME = new QName("http://tempuri.org/", "GetCityNameByPNameResult");
    private final static QName _GetAllAQIPublishResponseGetAllAQIPublishResult_QNAME = new QName("http://tempuri.org/", "GetAllAQIPublishResult");
    private final static QName _GetAQILayerHistoryPoID_QNAME = new QName("http://tempuri.org/", "PoID");
    private final static QName _PM25AndPM10ResponsePM25AndPM10Result_QNAME = new QName("http://tempuri.org/", "PM2_5AndPM10Result");
    private final static QName _GetHistoryByNameAndTimePositionName_QNAME = new QName("http://tempuri.org/", "PositionName");
    private final static QName _GetHistoryByNameAndTimePollutantCode_QNAME = new QName("http://tempuri.org/", "PollutantCode");
    private final static QName _GetHistoryByNameAndTimeStartTime_QNAME = new QName("http://tempuri.org/", "StartTime");
    private final static QName _GetHistoryByNameAndTimeEndTime_QNAME = new QName("http://tempuri.org/", "EndTime");
    private final static QName _AQILayerPublishLiveInfoLayerUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "LayerUrl");
    private final static QName _AQILayerPublishLiveInfoPollutantCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "PollutantCode");
    private final static QName _SetAQIPublishDataAqida_QNAME = new QName("http://tempuri.org/", "aqida");
    private final static QName _GetHistoryByNameAndTimeResponseGetHistoryByNameAndTimeResult_QNAME = new QName("http://tempuri.org/", "GetHistoryByNameAndTimeResult");
    private final static QName _GetAQILayerResponseGetAQILayerResult_QNAME = new QName("http://tempuri.org/", "GetAQILayerResult");
    private final static QName _UpdateLayerUrlParamName_QNAME = new QName("http://tempuri.org/", "paramName");
    private final static QName _UpdateLayerUrlLayerUrl_QNAME = new QName("http://tempuri.org/", "layerUrl");
    private final static QName _GetCNByPNameResponseGetCNByPNameResult_QNAME = new QName("http://tempuri.org/", "GetCNByPNameResult");
    private final static QName _GetIaqiHistoryByNameAndTimeResponseGetIaqiHistoryByNameAndTimeResult_QNAME = new QName("http://tempuri.org/", "GetIaqiHistoryByNameAndTimeResult");
    private final static QName _GetAQIDataByCityNameCityName_QNAME = new QName("http://tempuri.org/", "CityName");
    private final static QName _GetAQIHistoryBySNStationName_QNAME = new QName("http://tempuri.org/", "StationName");
    private final static QName _GetAllAQILiveDataResponseGetAllAQILiveDataResult_QNAME = new QName("http://tempuri.org/", "GetAllAQILiveDataResult");
    private final static QName _GetAQITipResponseGetAQITipResult_QNAME = new QName("http://tempuri.org/", "GetAQITipResult");
    private final static QName _GetAllHistoryByNameAndTimeResponseGetAllHistoryByNameAndTimeResult_QNAME = new QName("http://tempuri.org/", "GetAllHistoryByNameAndTimeResult");
    private final static QName _AQIDayBllQuality_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", "Quality");
    private final static QName _AQIDayBllPrimaryPollutant_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", "PrimaryPollutant");
    private final static QName _AQIDayBllPositionName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", "PositionName");
    private final static QName _AQIDayBllAQI_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", "AQI");
    private final static QName _SetAQI24LayerParam_QNAME = new QName("http://tempuri.org/", "param");
    private final static QName _SetAQI24LayerUrl_QNAME = new QName("http://tempuri.org/", "url");
    private final static QName _GetAllAQILayerURLResponseGetAllAQILayerURLResult_QNAME = new QName("http://tempuri.org/", "GetAllAQILayerURLResult");
    private final static QName _StationInfoYGCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "YGCode");
    private final static QName _StationInfoStationState_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "StationState");
    private final static QName _StationInfoGroupCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "GroupCode");
    private final static QName _StationInfoSKCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "SKCode");
    private final static QName _StationInfoIndicatorCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "IndicatorCode");
    private final static QName _StationInfoSubstation_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "Substation");
    private final static QName _StationInfoPositionName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "PositionName");
    private final static QName _StationInfoGKCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "GKCode");
    private final static QName _StationInfoCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "City");
    private final static QName _StationInfoAGCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "AGCode");
    private final static QName _StationInfoStationCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "StationCode");
    private final static QName _GetAllAQILiveDataProvinceName_QNAME = new QName("http://tempuri.org/", "provinceName");
    private final static QName _CityInfoCityName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "CityName");
    private final static QName _CityInfoCityJC_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "CityJC");
    private final static QName _AQICityInfoCityID_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "CityID");
    private final static QName _AQICityStationInfoStationID_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "StationID");
    private final static QName _AQICityStationInfoSMargin_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "SMargin");
    private final static QName _GetPidCityname_QNAME = new QName("http://tempuri.org/", "cityname");
    private final static QName _GetAQIHistoryStationCode_QNAME = new QName("http://tempuri.org/", "stationCode");
    private final static QName _IAQIDataPublishLiveInfoIO3_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "IO3");
    private final static QName _IAQIDataPublishLiveInfoICO_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "ICO");
    private final static QName _IAQIDataPublishLiveInfoArea_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "Area");
    private final static QName _IAQIDataPublishLiveInfoIPM10_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "IPM10");
    private final static QName _IAQIDataPublishLiveInfoIO38H_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "IO3_8h");
    private final static QName _IAQIDataPublishLiveInfoIPM25_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "IPM2_5");
    private final static QName _IAQIDataPublishLiveInfoLongitude_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "Longitude");
    private final static QName _IAQIDataPublishLiveInfoISO2_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "ISO2");
    private final static QName _IAQIDataPublishLiveInfoINO2_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "INO2");
    private final static QName _IAQIDataPublishLiveInfoLatitude_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "Latitude");
    private final static QName _UpDatePolConLimitsListUpPolLimit_QNAME = new QName("http://tempuri.org/", "ListUpPolLimit");
    private final static QName _GetAQIDataResponseGetAQIDataResult_QNAME = new QName("http://tempuri.org/", "GetAQIDataResult");
    private final static QName _AQIPollutantUpperLimitInfoPollutantName_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "PollutantName");
    private final static QName _GetStringUrlByTimeResponseGetStringUrlByTimeResult_QNAME = new QName("http://tempuri.org/", "GetStringUrlByTimeResult");
    private final static QName _GetAllIAQIPublishEtyResponseGetAllIAQIPublishEtyResult_QNAME = new QName("http://tempuri.org/", "GetAllIAQIPublishEtyResult");
    private final static QName _GetAQIDayResponseGetAQIDayResult_QNAME = new QName("http://tempuri.org/", "GetAQIDayResult");
    private final static QName _GetAQIDataByCityNameResponseGetAQIDataByCityNameResult_QNAME = new QName("http://tempuri.org/", "GetAQIDataByCityNameResult");
    private final static QName _AQIDataPublishHistoryInfoPM2524H_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "PM2_5_24h");
    private final static QName _AQIDataPublishHistoryInfoNO2_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "NO2");
    private final static QName _AQIDataPublishHistoryInfoSO2_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "SO2");
    private final static QName _AQIDataPublishHistoryInfoCO24H_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "CO_24h");
    private final static QName _AQIDataPublishHistoryInfoUnheathful_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "Unheathful");
    private final static QName _AQIDataPublishHistoryInfoCO_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "CO");
    private final static QName _AQIDataPublishHistoryInfoNO224H_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "NO2_24h");
    private final static QName _AQIDataPublishHistoryInfoQuality_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "Quality");
    private final static QName _AQIDataPublishHistoryInfoO38H_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "O3_8h");
    private final static QName _AQIDataPublishHistoryInfoPM10_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "PM10");
    private final static QName _AQIDataPublishHistoryInfoPrimaryPollutant_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "PrimaryPollutant");
    private final static QName _AQIDataPublishHistoryInfoO324H_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "O3_24h");
    private final static QName _AQIDataPublishHistoryInfoPM1024H_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "PM10_24h");
    private final static QName _AQIDataPublishHistoryInfoPM25_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "PM2_5");
    private final static QName _AQIDataPublishHistoryInfoAQI_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "AQI");
    private final static QName _AQIDataPublishHistoryInfoO3_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "O3");
    private final static QName _AQIDataPublishHistoryInfoSO224H_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "SO2_24h");
    private final static QName _AQIDataPublishHistoryInfoO38H24H_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.Model", "O3_8h_24h");
    private final static QName _GetIAQIPublishEtyByCityNameResponseGetIAQIPublishEtyByCityNameResult_QNAME = new QName("http://tempuri.org/", "GetIAQIPublishEtyByCityNameResult");
    private final static QName _GetPolConLimitsResponseGetPolConLimitsResult_QNAME = new QName("http://tempuri.org/", "GetPolConLimitsResult");
    private final static QName _GetAQIPublishByTimeResponseGetAQIPublishByTimeResult_QNAME = new QName("http://tempuri.org/", "GetAQIPublishByTimeResult");
    private final static QName _GetCityNameByPIDResponseGetCityNameByPIDResult_QNAME = new QName("http://tempuri.org/", "GetCityNameByPIDResult");
    private final static QName _GetHistoryBySNandCODEResponseGetHistoryBySNandCODEResult_QNAME = new QName("http://tempuri.org/", "GetHistoryBySNandCODEResult");
    private final static QName _GetAllAQIStationResponseGetAllAQIStationResult_QNAME = new QName("http://tempuri.org/", "GetAllAQIStationResult");
    private final static QName _GetAQIDayCityName_QNAME = new QName("http://tempuri.org/", "cityName");
    private final static QName _GetAQIHistoryBySNResponseGetAQIHistoryBySNResult_QNAME = new QName("http://tempuri.org/", "GetAQIHistoryBySNResult");
    private final static QName _PM25AndPM10ListOriData_QNAME = new QName("http://tempuri.org/", "ListOriData");
    private final static QName _GetAQIPublishStationResponseGetAQIPublishStationResult_QNAME = new QName("http://tempuri.org/", "GetAQIPublishStationResult");
    private final static QName _GetCityStationResponseGetCityStationResult_QNAME = new QName("http://tempuri.org/", "GetCityStationResult");
    private final static QName _GetAllAQIPublishLiveDataResponseGetAllAQIPublishLiveDataResult_QNAME = new QName("http://tempuri.org/", "GetAllAQIPublishLiveDataResult");
    private final static QName _GetAQICityStationResponseGetAQICityStationResult_QNAME = new QName("http://tempuri.org/", "GetAQICityStationResult");
    private final static QName _GetDataResponseGetDataResult_QNAME = new QName("http://tempuri.org/", "GetDataResult");
    private final static QName _GetAQILayerHistoryResponseGetAQILayerHistoryResult_QNAME = new QName("http://tempuri.org/", "GetAQILayerHistoryResult");
    private final static QName _GetDataIndicatorCode_QNAME = new QName("http://tempuri.org/", "IndicatorCode");
    private final static QName _GetStringUrlResponseGetStringUrlResult_QNAME = new QName("http://tempuri.org/", "GetStringUrlResult");
    private final static QName _AQIChartValueMovalue24_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", "Movalue24");
    private final static QName _AQIChartValueMonValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", "MonValue");
    private final static QName _AQIChartValueStationCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", "StationCode");
    private final static QName _AQIChartValueIsLimits_QNAME = new QName("http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", "IsLimits");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.successcw.emc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintstring }
     * 
     */
    public ArrayOfKeyValueOfintstring createArrayOfKeyValueOfintstring() {
        return new ArrayOfKeyValueOfintstring();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP }
     * 
     */
    public ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP createArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP() {
        return new ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP();
    }

    /**
     * Create an instance of {@link IAQIDataPublishLiveEty }
     * 
     */
    public IAQIDataPublishLiveEty createIAQIDataPublishLiveEty() {
        return new IAQIDataPublishLiveEty();
    }

    /**
     * Create an instance of {@link ArrayOfAQIChartValue }
     * 
     */
    public ArrayOfAQIChartValue createArrayOfAQIChartValue() {
        return new ArrayOfAQIChartValue();
    }

    /**
     * Create an instance of {@link AQIDayBll }
     * 
     */
    public AQIDayBll createAQIDayBll() {
        return new AQIDayBll();
    }

    /**
     * Create an instance of {@link AQIChartValue }
     * 
     */
    public AQIChartValue createAQIChartValue() {
        return new AQIChartValue();
    }

    /**
     * Create an instance of {@link ArrayOfAQIDayBll }
     * 
     */
    public ArrayOfAQIDayBll createArrayOfAQIDayBll() {
        return new ArrayOfAQIDayBll();
    }

    /**
     * Create an instance of {@link ArrayOfIAQIDataPublishLiveEty }
     * 
     */
    public ArrayOfIAQIDataPublishLiveEty createArrayOfIAQIDataPublishLiveEty() {
        return new ArrayOfIAQIDataPublishLiveEty();
    }

    /**
     * Create an instance of {@link BaseEntity }
     * 
     */
    public BaseEntity createBaseEntity() {
        return new BaseEntity();
    }

    /**
     * Create an instance of {@link ArrayOfAQILayerPublishHistoryInfo }
     * 
     */
    public ArrayOfAQILayerPublishHistoryInfo createArrayOfAQILayerPublishHistoryInfo() {
        return new ArrayOfAQILayerPublishHistoryInfo();
    }

    /**
     * Create an instance of {@link ArrayOfCityInfo }
     * 
     */
    public ArrayOfCityInfo createArrayOfCityInfo() {
        return new ArrayOfCityInfo();
    }

    /**
     * Create an instance of {@link CityInfo }
     * 
     */
    public CityInfo createCityInfo() {
        return new CityInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAQILayerPublishLiveInfo }
     * 
     */
    public ArrayOfAQILayerPublishLiveInfo createArrayOfAQILayerPublishLiveInfo() {
        return new ArrayOfAQILayerPublishLiveInfo();
    }

    /**
     * Create an instance of {@link IAQIDataPublishLiveInfo }
     * 
     */
    public IAQIDataPublishLiveInfo createIAQIDataPublishLiveInfo() {
        return new IAQIDataPublishLiveInfo();
    }

    /**
     * Create an instance of {@link AQICityStationInfo }
     * 
     */
    public AQICityStationInfo createAQICityStationInfo() {
        return new AQICityStationInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAQICityStationInfo }
     * 
     */
    public ArrayOfAQICityStationInfo createArrayOfAQICityStationInfo() {
        return new ArrayOfAQICityStationInfo();
    }

    /**
     * Create an instance of {@link ArrayOfIAQIDataPublishLiveInfo }
     * 
     */
    public ArrayOfIAQIDataPublishLiveInfo createArrayOfIAQIDataPublishLiveInfo() {
        return new ArrayOfIAQIDataPublishLiveInfo();
    }

    /**
     * Create an instance of {@link AQILayerPublishHistoryInfo }
     * 
     */
    public AQILayerPublishHistoryInfo createAQILayerPublishHistoryInfo() {
        return new AQILayerPublishHistoryInfo();
    }

    /**
     * Create an instance of {@link AQIDataPublishLiveInfo }
     * 
     */
    public AQIDataPublishLiveInfo createAQIDataPublishLiveInfo() {
        return new AQIDataPublishLiveInfo();
    }

    /**
     * Create an instance of {@link StationInfo }
     * 
     */
    public StationInfo createStationInfo() {
        return new StationInfo();
    }

    /**
     * Create an instance of {@link AQIDataPublishHistoryInfo }
     * 
     */
    public AQIDataPublishHistoryInfo createAQIDataPublishHistoryInfo() {
        return new AQIDataPublishHistoryInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAQIDataPublishLiveInfo }
     * 
     */
    public ArrayOfAQIDataPublishLiveInfo createArrayOfAQIDataPublishLiveInfo() {
        return new ArrayOfAQIDataPublishLiveInfo();
    }

    /**
     * Create an instance of {@link AQICityInfo }
     * 
     */
    public AQICityInfo createAQICityInfo() {
        return new AQICityInfo();
    }

    /**
     * Create an instance of {@link AQIPollutantUpperLimitInfo }
     * 
     */
    public AQIPollutantUpperLimitInfo createAQIPollutantUpperLimitInfo() {
        return new AQIPollutantUpperLimitInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAQIPollutantUpperLimitInfo }
     * 
     */
    public ArrayOfAQIPollutantUpperLimitInfo createArrayOfAQIPollutantUpperLimitInfo() {
        return new ArrayOfAQIPollutantUpperLimitInfo();
    }

    /**
     * Create an instance of {@link AQILayerPublishLiveInfo }
     * 
     */
    public AQILayerPublishLiveInfo createAQILayerPublishLiveInfo() {
        return new AQILayerPublishLiveInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAQIDataPublishHistoryInfo }
     * 
     */
    public ArrayOfAQIDataPublishHistoryInfo createArrayOfAQIDataPublishHistoryInfo() {
        return new ArrayOfAQIDataPublishHistoryInfo();
    }

    /**
     * Create an instance of {@link ArrayOfStationInfo }
     * 
     */
    public ArrayOfStationInfo createArrayOfStationInfo() {
        return new ArrayOfStationInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAQICityInfo }
     * 
     */
    public ArrayOfAQICityInfo createArrayOfAQICityInfo() {
        return new ArrayOfAQICityInfo();
    }

    /**
     * Create an instance of {@link GetAllHistoryByNameAndTime }
     * 
     */
    public GetAllHistoryByNameAndTime createGetAllHistoryByNameAndTime() {
        return new GetAllHistoryByNameAndTime();
    }

    /**
     * Create an instance of {@link SetIAQIPublishDataResponse }
     * 
     */
    public SetIAQIPublishDataResponse createSetIAQIPublishDataResponse() {
        return new SetIAQIPublishDataResponse();
    }

    /**
     * Create an instance of {@link GetAQILayerHistory }
     * 
     */
    public GetAQILayerHistory createGetAQILayerHistory() {
        return new GetAQILayerHistory();
    }

    /**
     * Create an instance of {@link UpdateLayerUrl }
     * 
     */
    public UpdateLayerUrl createUpdateLayerUrl() {
        return new UpdateLayerUrl();
    }

    /**
     * Create an instance of {@link GetAQITipResponse }
     * 
     */
    public GetAQITipResponse createGetAQITipResponse() {
        return new GetAQITipResponse();
    }

    /**
     * Create an instance of {@link GetAQIDayResponse }
     * 
     */
    public GetAQIDayResponse createGetAQIDayResponse() {
        return new GetAQIDayResponse();
    }

    /**
     * Create an instance of {@link GetAQIDataResponse }
     * 
     */
    public GetAQIDataResponse createGetAQIDataResponse() {
        return new GetAQIDataResponse();
    }

    /**
     * Create an instance of {@link GetDataResponse }
     * 
     */
    public GetDataResponse createGetDataResponse() {
        return new GetDataResponse();
    }

    /**
     * Create an instance of {@link GetAQIDay }
     * 
     */
    public GetAQIDay createGetAQIDay() {
        return new GetAQIDay();
    }

    /**
     * Create an instance of {@link GetCNByPName }
     * 
     */
    public GetCNByPName createGetCNByPName() {
        return new GetCNByPName();
    }

    /**
     * Create an instance of {@link GetCNByPNameResponse }
     * 
     */
    public GetCNByPNameResponse createGetCNByPNameResponse() {
        return new GetCNByPNameResponse();
    }

    /**
     * Create an instance of {@link GetCityNameByPNameResponse }
     * 
     */
    public GetCityNameByPNameResponse createGetCityNameByPNameResponse() {
        return new GetCityNameByPNameResponse();
    }

    /**
     * Create an instance of {@link PM25AndPM10Response }
     * 
     */
    public PM25AndPM10Response createPM25AndPM10Response() {
        return new PM25AndPM10Response();
    }

    /**
     * Create an instance of {@link GetAllAQILiveData }
     * 
     */
    public GetAllAQILiveData createGetAllAQILiveData() {
        return new GetAllAQILiveData();
    }

    /**
     * Create an instance of {@link GetHistoryByNameAndTimeResponse }
     * 
     */
    public GetHistoryByNameAndTimeResponse createGetHistoryByNameAndTimeResponse() {
        return new GetHistoryByNameAndTimeResponse();
    }

    /**
     * Create an instance of {@link GetAllAQIPublish }
     * 
     */
    public GetAllAQIPublish createGetAllAQIPublish() {
        return new GetAllAQIPublish();
    }

    /**
     * Create an instance of {@link GetAQIHistoryResponse }
     * 
     */
    public GetAQIHistoryResponse createGetAQIHistoryResponse() {
        return new GetAQIHistoryResponse();
    }

    /**
     * Create an instance of {@link SetIAQIPublishData }
     * 
     */
    public SetIAQIPublishData createSetIAQIPublishData() {
        return new SetIAQIPublishData();
    }

    /**
     * Create an instance of {@link GetAQITip }
     * 
     */
    public GetAQITip createGetAQITip() {
        return new GetAQITip();
    }

    /**
     * Create an instance of {@link GetAllAQILiveDataResponse }
     * 
     */
    public GetAllAQILiveDataResponse createGetAllAQILiveDataResponse() {
        return new GetAllAQILiveDataResponse();
    }

    /**
     * Create an instance of {@link GetAQIDataByCityName }
     * 
     */
    public GetAQIDataByCityName createGetAQIDataByCityName() {
        return new GetAQIDataByCityName();
    }

    /**
     * Create an instance of {@link GetAllIAQIPublishEty }
     * 
     */
    public GetAllIAQIPublishEty createGetAllIAQIPublishEty() {
        return new GetAllIAQIPublishEty();
    }

    /**
     * Create an instance of {@link GetAQIPublishStationResponse }
     * 
     */
    public GetAQIPublishStationResponse createGetAQIPublishStationResponse() {
        return new GetAQIPublishStationResponse();
    }

    /**
     * Create an instance of {@link GetAQIData }
     * 
     */
    public GetAQIData createGetAQIData() {
        return new GetAQIData();
    }

    /**
     * Create an instance of {@link GetStringUrlByTime }
     * 
     */
    public GetStringUrlByTime createGetStringUrlByTime() {
        return new GetStringUrlByTime();
    }

    /**
     * Create an instance of {@link GetIaqiHistoryByNameAndTimeResponse }
     * 
     */
    public GetIaqiHistoryByNameAndTimeResponse createGetIaqiHistoryByNameAndTimeResponse() {
        return new GetIaqiHistoryByNameAndTimeResponse();
    }

    /**
     * Create an instance of {@link GetCityStationResponse }
     * 
     */
    public GetCityStationResponse createGetCityStationResponse() {
        return new GetCityStationResponse();
    }

    /**
     * Create an instance of {@link GetAQIPublishStation }
     * 
     */
    public GetAQIPublishStation createGetAQIPublishStation() {
        return new GetAQIPublishStation();
    }

    /**
     * Create an instance of {@link GetAllAQIPublishLiveData }
     * 
     */
    public GetAllAQIPublishLiveData createGetAllAQIPublishLiveData() {
        return new GetAllAQIPublishLiveData();
    }

    /**
     * Create an instance of {@link GetIAQIPublishEtyByCityNameResponse }
     * 
     */
    public GetIAQIPublishEtyByCityNameResponse createGetIAQIPublishEtyByCityNameResponse() {
        return new GetIAQIPublishEtyByCityNameResponse();
    }

    /**
     * Create an instance of {@link SetAQI24LayerResponse }
     * 
     */
    public SetAQI24LayerResponse createSetAQI24LayerResponse() {
        return new SetAQI24LayerResponse();
    }

    /**
     * Create an instance of {@link GetStringUrlByTimeResponse }
     * 
     */
    public GetStringUrlByTimeResponse createGetStringUrlByTimeResponse() {
        return new GetStringUrlByTimeResponse();
    }

    /**
     * Create an instance of {@link GetAQIHistoryBySNResponse }
     * 
     */
    public GetAQIHistoryBySNResponse createGetAQIHistoryBySNResponse() {
        return new GetAQIHistoryBySNResponse();
    }

    /**
     * Create an instance of {@link SetAQI24Layer }
     * 
     */
    public SetAQI24Layer createSetAQI24Layer() {
        return new SetAQI24Layer();
    }

    /**
     * Create an instance of {@link GetAQILayerResponse }
     * 
     */
    public GetAQILayerResponse createGetAQILayerResponse() {
        return new GetAQILayerResponse();
    }

    /**
     * Create an instance of {@link GetCityNameByPID }
     * 
     */
    public GetCityNameByPID createGetCityNameByPID() {
        return new GetCityNameByPID();
    }

    /**
     * Create an instance of {@link GetAllAQILayerURLResponse }
     * 
     */
    public GetAllAQILayerURLResponse createGetAllAQILayerURLResponse() {
        return new GetAllAQILayerURLResponse();
    }

    /**
     * Create an instance of {@link GetAQICityStationResponse }
     * 
     */
    public GetAQICityStationResponse createGetAQICityStationResponse() {
        return new GetAQICityStationResponse();
    }

    /**
     * Create an instance of {@link GetAllHistoryByNameAndTimeResponse }
     * 
     */
    public GetAllHistoryByNameAndTimeResponse createGetAllHistoryByNameAndTimeResponse() {
        return new GetAllHistoryByNameAndTimeResponse();
    }

    /**
     * Create an instance of {@link GetStringUrlResponse }
     * 
     */
    public GetStringUrlResponse createGetStringUrlResponse() {
        return new GetStringUrlResponse();
    }

    /**
     * Create an instance of {@link GetAllAQIStationResponse }
     * 
     */
    public GetAllAQIStationResponse createGetAllAQIStationResponse() {
        return new GetAllAQIStationResponse();
    }

    /**
     * Create an instance of {@link GetCityNameByPIDResponse }
     * 
     */
    public GetCityNameByPIDResponse createGetCityNameByPIDResponse() {
        return new GetCityNameByPIDResponse();
    }

    /**
     * Create an instance of {@link GetCityNameByPName }
     * 
     */
    public GetCityNameByPName createGetCityNameByPName() {
        return new GetCityNameByPName();
    }

    /**
     * Create an instance of {@link GetHistoryByNameAndTime }
     * 
     */
    public GetHistoryByNameAndTime createGetHistoryByNameAndTime() {
        return new GetHistoryByNameAndTime();
    }

    /**
     * Create an instance of {@link GetHistoryBySNandCODEResponse }
     * 
     */
    public GetHistoryBySNandCODEResponse createGetHistoryBySNandCODEResponse() {
        return new GetHistoryBySNandCODEResponse();
    }

    /**
     * Create an instance of {@link GetPidResponse }
     * 
     */
    public GetPidResponse createGetPidResponse() {
        return new GetPidResponse();
    }

    /**
     * Create an instance of {@link PM25AndPM10 }
     * 
     */
    public PM25AndPM10 createPM25AndPM10() {
        return new PM25AndPM10();
    }

    /**
     * Create an instance of {@link GetAQIHistoryBySN }
     * 
     */
    public GetAQIHistoryBySN createGetAQIHistoryBySN() {
        return new GetAQIHistoryBySN();
    }

    /**
     * Create an instance of {@link UpdateLayerUrlResponse }
     * 
     */
    public UpdateLayerUrlResponse createUpdateLayerUrlResponse() {
        return new UpdateLayerUrlResponse();
    }

    /**
     * Create an instance of {@link GetAllAQIStation }
     * 
     */
    public GetAllAQIStation createGetAllAQIStation() {
        return new GetAllAQIStation();
    }

    /**
     * Create an instance of {@link GetAQILayer }
     * 
     */
    public GetAQILayer createGetAQILayer() {
        return new GetAQILayer();
    }

    /**
     * Create an instance of {@link GetAQILayerHistoryResponse }
     * 
     */
    public GetAQILayerHistoryResponse createGetAQILayerHistoryResponse() {
        return new GetAQILayerHistoryResponse();
    }

    /**
     * Create an instance of {@link GetData }
     * 
     */
    public GetData createGetData() {
        return new GetData();
    }

    /**
     * Create an instance of {@link GetAQIPublishByTime }
     * 
     */
    public GetAQIPublishByTime createGetAQIPublishByTime() {
        return new GetAQIPublishByTime();
    }

    /**
     * Create an instance of {@link SetAQIPublishData }
     * 
     */
    public SetAQIPublishData createSetAQIPublishData() {
        return new SetAQIPublishData();
    }

    /**
     * Create an instance of {@link UpDatePolConLimitsResponse }
     * 
     */
    public UpDatePolConLimitsResponse createUpDatePolConLimitsResponse() {
        return new UpDatePolConLimitsResponse();
    }

    /**
     * Create an instance of {@link GetAllIAQIPublishEtyResponse }
     * 
     */
    public GetAllIAQIPublishEtyResponse createGetAllIAQIPublishEtyResponse() {
        return new GetAllIAQIPublishEtyResponse();
    }

    /**
     * Create an instance of {@link GetIAQIPublishEtyByCityName }
     * 
     */
    public GetIAQIPublishEtyByCityName createGetIAQIPublishEtyByCityName() {
        return new GetIAQIPublishEtyByCityName();
    }

    /**
     * Create an instance of {@link GetAQICityStation }
     * 
     */
    public GetAQICityStation createGetAQICityStation() {
        return new GetAQICityStation();
    }

    /**
     * Create an instance of {@link GetCityStation }
     * 
     */
    public GetCityStation createGetCityStation() {
        return new GetCityStation();
    }

    /**
     * Create an instance of {@link GetHistoryBySNandCODE }
     * 
     */
    public GetHistoryBySNandCODE createGetHistoryBySNandCODE() {
        return new GetHistoryBySNandCODE();
    }

    /**
     * Create an instance of {@link GetAllAQILayerURL }
     * 
     */
    public GetAllAQILayerURL createGetAllAQILayerURL() {
        return new GetAllAQILayerURL();
    }

    /**
     * Create an instance of {@link GetAQIPublishByTimeResponse }
     * 
     */
    public GetAQIPublishByTimeResponse createGetAQIPublishByTimeResponse() {
        return new GetAQIPublishByTimeResponse();
    }

    /**
     * Create an instance of {@link GetAllAQIPublishLiveDataResponse }
     * 
     */
    public GetAllAQIPublishLiveDataResponse createGetAllAQIPublishLiveDataResponse() {
        return new GetAllAQIPublishLiveDataResponse();
    }

    /**
     * Create an instance of {@link GetPid }
     * 
     */
    public GetPid createGetPid() {
        return new GetPid();
    }

    /**
     * Create an instance of {@link GetStringUrl }
     * 
     */
    public GetStringUrl createGetStringUrl() {
        return new GetStringUrl();
    }

    /**
     * Create an instance of {@link GetAQIHistory }
     * 
     */
    public GetAQIHistory createGetAQIHistory() {
        return new GetAQIHistory();
    }

    /**
     * Create an instance of {@link GetPolConLimits }
     * 
     */
    public GetPolConLimits createGetPolConLimits() {
        return new GetPolConLimits();
    }

    /**
     * Create an instance of {@link GetAQIDataByCityNameResponse }
     * 
     */
    public GetAQIDataByCityNameResponse createGetAQIDataByCityNameResponse() {
        return new GetAQIDataByCityNameResponse();
    }

    /**
     * Create an instance of {@link GetIaqiHistoryByNameAndTime }
     * 
     */
    public GetIaqiHistoryByNameAndTime createGetIaqiHistoryByNameAndTime() {
        return new GetIaqiHistoryByNameAndTime();
    }

    /**
     * Create an instance of {@link GetPolConLimitsResponse }
     * 
     */
    public GetPolConLimitsResponse createGetPolConLimitsResponse() {
        return new GetPolConLimitsResponse();
    }

    /**
     * Create an instance of {@link UpDatePolConLimits }
     * 
     */
    public UpDatePolConLimits createUpDatePolConLimits() {
        return new UpDatePolConLimits();
    }

    /**
     * Create an instance of {@link SetAQIPublishDataResponse }
     * 
     */
    public SetAQIPublishDataResponse createSetAQIPublishDataResponse() {
        return new SetAQIPublishDataResponse();
    }

    /**
     * Create an instance of {@link GetAllAQIPublishResponse }
     * 
     */
    public GetAllAQIPublishResponse createGetAllAQIPublishResponse() {
        return new GetAllAQIPublishResponse();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfintstring.KeyValueOfintstring }
     * 
     */
    public ArrayOfKeyValueOfintstring.KeyValueOfintstring createArrayOfKeyValueOfintstringKeyValueOfintstring() {
        return new ArrayOfKeyValueOfintstring.KeyValueOfintstring();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP.KeyValueOfstringArrayOfAQIChartValueQi88CNAP }
     * 
     */
    public ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP.KeyValueOfstringArrayOfAQIChartValueQi88CNAP createArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAPKeyValueOfstringArrayOfAQIChartValueQi88CNAP() {
        return new ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP.KeyValueOfstringArrayOfAQIChartValueQi88CNAP();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishHistoryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAQIHistoryResult", scope = GetAQIHistoryResponse.class)
    public JAXBElement<ArrayOfAQIDataPublishHistoryInfo> createGetAQIHistoryResponseGetAQIHistoryResult(ArrayOfAQIDataPublishHistoryInfo value) {
        return new JAXBElement<ArrayOfAQIDataPublishHistoryInfo>(_GetAQIHistoryResponseGetAQIHistoryResult_QNAME, ArrayOfAQIDataPublishHistoryInfo.class, GetAQIHistoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AQIPollutantUpperLimitInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "AQIPollutantUpperLimitInfo")
    public JAXBElement<AQIPollutantUpperLimitInfo> createAQIPollutantUpperLimitInfo(AQIPollutantUpperLimitInfo value) {
        return new JAXBElement<AQIPollutantUpperLimitInfo>(_AQIPollutantUpperLimitInfo_QNAME, AQIPollutantUpperLimitInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfintstring")
    public JAXBElement<ArrayOfKeyValueOfintstring> createArrayOfKeyValueOfintstring(ArrayOfKeyValueOfintstring value) {
        return new JAXBElement<ArrayOfKeyValueOfintstring>(_ArrayOfKeyValueOfintstring_QNAME, ArrayOfKeyValueOfintstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88cNA_P")
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP> createArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP(ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP value) {
        return new JAXBElement<ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP>(_ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP_QNAME, ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AQIDataPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "AQIDataPublishLiveInfo")
    public JAXBElement<AQIDataPublishLiveInfo> createAQIDataPublishLiveInfo(AQIDataPublishLiveInfo value) {
        return new JAXBElement<AQIDataPublishLiveInfo>(_AQIDataPublishLiveInfo_QNAME, AQIDataPublishLiveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Fundway.Env.DataAccess", name = "BaseEntity")
    public JAXBElement<BaseEntity> createBaseEntity(BaseEntity value) {
        return new JAXBElement<BaseEntity>(_BaseEntity_QNAME, BaseEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishHistoryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "ArrayOfAQIDataPublishHistoryInfo")
    public JAXBElement<ArrayOfAQIDataPublishHistoryInfo> createArrayOfAQIDataPublishHistoryInfo(ArrayOfAQIDataPublishHistoryInfo value) {
        return new JAXBElement<ArrayOfAQIDataPublishHistoryInfo>(_ArrayOfAQIDataPublishHistoryInfo_QNAME, ArrayOfAQIDataPublishHistoryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "ArrayOfStationInfo")
    public JAXBElement<ArrayOfStationInfo> createArrayOfStationInfo(ArrayOfStationInfo value) {
        return new JAXBElement<ArrayOfStationInfo>(_ArrayOfStationInfo_QNAME, ArrayOfStationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIPollutantUpperLimitInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "ArrayOfAQIPollutantUpperLimitInfo")
    public JAXBElement<ArrayOfAQIPollutantUpperLimitInfo> createArrayOfAQIPollutantUpperLimitInfo(ArrayOfAQIPollutantUpperLimitInfo value) {
        return new JAXBElement<ArrayOfAQIPollutantUpperLimitInfo>(_ArrayOfAQIPollutantUpperLimitInfo_QNAME, ArrayOfAQIPollutantUpperLimitInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "CityInfo")
    public JAXBElement<CityInfo> createCityInfo(CityInfo value) {
        return new JAXBElement<CityInfo>(_CityInfo_QNAME, CityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIChartValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", name = "ArrayOfAQIChartValue")
    public JAXBElement<ArrayOfAQIChartValue> createArrayOfAQIChartValue(ArrayOfAQIChartValue value) {
        return new JAXBElement<ArrayOfAQIChartValue>(_ArrayOfAQIChartValue_QNAME, ArrayOfAQIChartValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "ArrayOfCityInfo")
    public JAXBElement<ArrayOfCityInfo> createArrayOfCityInfo(ArrayOfCityInfo value) {
        return new JAXBElement<ArrayOfCityInfo>(_ArrayOfCityInfo_QNAME, ArrayOfCityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIAQIDataPublishLiveEty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", name = "ArrayOfIAQIDataPublishLiveEty")
    public JAXBElement<ArrayOfIAQIDataPublishLiveEty> createArrayOfIAQIDataPublishLiveEty(ArrayOfIAQIDataPublishLiveEty value) {
        return new JAXBElement<ArrayOfIAQIDataPublishLiveEty>(_ArrayOfIAQIDataPublishLiveEty_QNAME, ArrayOfIAQIDataPublishLiveEty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AQICityStationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "AQICityStationInfo")
    public JAXBElement<AQICityStationInfo> createAQICityStationInfo(AQICityStationInfo value) {
        return new JAXBElement<AQICityStationInfo>(_AQICityStationInfo_QNAME, AQICityStationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "ArrayOfAQIDataPublishLiveInfo")
    public JAXBElement<ArrayOfAQIDataPublishLiveInfo> createArrayOfAQIDataPublishLiveInfo(ArrayOfAQIDataPublishLiveInfo value) {
        return new JAXBElement<ArrayOfAQIDataPublishLiveInfo>(_ArrayOfAQIDataPublishLiveInfo_QNAME, ArrayOfAQIDataPublishLiveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "StationInfo")
    public JAXBElement<StationInfo> createStationInfo(StationInfo value) {
        return new JAXBElement<StationInfo>(_StationInfo_QNAME, StationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQICityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "ArrayOfAQICityInfo")
    public JAXBElement<ArrayOfAQICityInfo> createArrayOfAQICityInfo(ArrayOfAQICityInfo value) {
        return new JAXBElement<ArrayOfAQICityInfo>(_ArrayOfAQICityInfo_QNAME, ArrayOfAQICityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AQICityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "AQICityInfo")
    public JAXBElement<AQICityInfo> createAQICityInfo(AQICityInfo value) {
        return new JAXBElement<AQICityInfo>(_AQICityInfo_QNAME, AQICityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AQIDayBll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", name = "AQIDayBll")
    public JAXBElement<AQIDayBll> createAQIDayBll(AQIDayBll value) {
        return new JAXBElement<AQIDayBll>(_AQIDayBll_QNAME, AQIDayBll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQICityStationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "ArrayOfAQICityStationInfo")
    public JAXBElement<ArrayOfAQICityStationInfo> createArrayOfAQICityStationInfo(ArrayOfAQICityStationInfo value) {
        return new JAXBElement<ArrayOfAQICityStationInfo>(_ArrayOfAQICityStationInfo_QNAME, ArrayOfAQICityStationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIAQIDataPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "ArrayOfIAQIDataPublishLiveInfo")
    public JAXBElement<ArrayOfIAQIDataPublishLiveInfo> createArrayOfIAQIDataPublishLiveInfo(ArrayOfIAQIDataPublishLiveInfo value) {
        return new JAXBElement<ArrayOfIAQIDataPublishLiveInfo>(_ArrayOfIAQIDataPublishLiveInfo_QNAME, ArrayOfIAQIDataPublishLiveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IAQIDataPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "IAQIDataPublishLiveInfo")
    public JAXBElement<IAQIDataPublishLiveInfo> createIAQIDataPublishLiveInfo(IAQIDataPublishLiveInfo value) {
        return new JAXBElement<IAQIDataPublishLiveInfo>(_IAQIDataPublishLiveInfo_QNAME, IAQIDataPublishLiveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IAQIDataPublishLiveEty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", name = "IAQIDataPublishLiveEty")
    public JAXBElement<IAQIDataPublishLiveEty> createIAQIDataPublishLiveEty(IAQIDataPublishLiveEty value) {
        return new JAXBElement<IAQIDataPublishLiveEty>(_IAQIDataPublishLiveEty_QNAME, IAQIDataPublishLiveEty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AQIDataPublishHistoryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "AQIDataPublishHistoryInfo")
    public JAXBElement<AQIDataPublishHistoryInfo> createAQIDataPublishHistoryInfo(AQIDataPublishHistoryInfo value) {
        return new JAXBElement<AQIDataPublishHistoryInfo>(_AQIDataPublishHistoryInfo_QNAME, AQIDataPublishHistoryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDayBll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", name = "ArrayOfAQIDayBll")
    public JAXBElement<ArrayOfAQIDayBll> createArrayOfAQIDayBll(ArrayOfAQIDayBll value) {
        return new JAXBElement<ArrayOfAQIDayBll>(_ArrayOfAQIDayBll_QNAME, ArrayOfAQIDayBll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AQILayerPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "AQILayerPublishLiveInfo")
    public JAXBElement<AQILayerPublishLiveInfo> createAQILayerPublishLiveInfo(AQILayerPublishLiveInfo value) {
        return new JAXBElement<AQILayerPublishLiveInfo>(_AQILayerPublishLiveInfo_QNAME, AQILayerPublishLiveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AQIChartValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", name = "AQIChartValue")
    public JAXBElement<AQIChartValue> createAQIChartValue(AQIChartValue value) {
        return new JAXBElement<AQIChartValue>(_AQIChartValue_QNAME, AQIChartValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQILayerPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "ArrayOfAQILayerPublishLiveInfo")
    public JAXBElement<ArrayOfAQILayerPublishLiveInfo> createArrayOfAQILayerPublishLiveInfo(ArrayOfAQILayerPublishLiveInfo value) {
        return new JAXBElement<ArrayOfAQILayerPublishLiveInfo>(_ArrayOfAQILayerPublishLiveInfo_QNAME, ArrayOfAQILayerPublishLiveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQILayerPublishHistoryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "ArrayOfAQILayerPublishHistoryInfo")
    public JAXBElement<ArrayOfAQILayerPublishHistoryInfo> createArrayOfAQILayerPublishHistoryInfo(ArrayOfAQILayerPublishHistoryInfo value) {
        return new JAXBElement<ArrayOfAQILayerPublishHistoryInfo>(_ArrayOfAQILayerPublishHistoryInfo_QNAME, ArrayOfAQILayerPublishHistoryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AQILayerPublishHistoryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "AQILayerPublishHistoryInfo")
    public JAXBElement<AQILayerPublishHistoryInfo> createAQILayerPublishHistoryInfo(AQILayerPublishHistoryInfo value) {
        return new JAXBElement<AQILayerPublishHistoryInfo>(_AQILayerPublishHistoryInfo_QNAME, AQILayerPublishHistoryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCityNameByPNameResult", scope = GetCityNameByPNameResponse.class)
    public JAXBElement<ArrayOfCityInfo> createGetCityNameByPNameResponseGetCityNameByPNameResult(ArrayOfCityInfo value) {
        return new JAXBElement<ArrayOfCityInfo>(_GetCityNameByPNameResponseGetCityNameByPNameResult_QNAME, ArrayOfCityInfo.class, GetCityNameByPNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllAQIPublishResult", scope = GetAllAQIPublishResponse.class)
    public JAXBElement<ArrayOfAQIDataPublishLiveInfo> createGetAllAQIPublishResponseGetAllAQIPublishResult(ArrayOfAQIDataPublishLiveInfo value) {
        return new JAXBElement<ArrayOfAQIDataPublishLiveInfo>(_GetAllAQIPublishResponseGetAllAQIPublishResult_QNAME, ArrayOfAQIDataPublishLiveInfo.class, GetAllAQIPublishResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PoID", scope = GetAQILayerHistory.class)
    public JAXBElement<String> createGetAQILayerHistoryPoID(String value) {
        return new JAXBElement<String>(_GetAQILayerHistoryPoID_QNAME, String.class, GetAQILayerHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PM2_5AndPM10Result", scope = PM25AndPM10Response.class)
    public JAXBElement<ArrayOfAQIDataPublishLiveInfo> createPM25AndPM10ResponsePM25AndPM10Result(ArrayOfAQIDataPublishLiveInfo value) {
        return new JAXBElement<ArrayOfAQIDataPublishLiveInfo>(_PM25AndPM10ResponsePM25AndPM10Result_QNAME, ArrayOfAQIDataPublishLiveInfo.class, PM25AndPM10Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PositionName", scope = GetHistoryByNameAndTime.class)
    public JAXBElement<String> createGetHistoryByNameAndTimePositionName(String value) {
        return new JAXBElement<String>(_GetHistoryByNameAndTimePositionName_QNAME, String.class, GetHistoryByNameAndTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PollutantCode", scope = GetHistoryByNameAndTime.class)
    public JAXBElement<String> createGetHistoryByNameAndTimePollutantCode(String value) {
        return new JAXBElement<String>(_GetHistoryByNameAndTimePollutantCode_QNAME, String.class, GetHistoryByNameAndTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StartTime", scope = GetHistoryByNameAndTime.class)
    public JAXBElement<String> createGetHistoryByNameAndTimeStartTime(String value) {
        return new JAXBElement<String>(_GetHistoryByNameAndTimeStartTime_QNAME, String.class, GetHistoryByNameAndTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EndTime", scope = GetHistoryByNameAndTime.class)
    public JAXBElement<String> createGetHistoryByNameAndTimeEndTime(String value) {
        return new JAXBElement<String>(_GetHistoryByNameAndTimeEndTime_QNAME, String.class, GetHistoryByNameAndTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "LayerUrl", scope = AQILayerPublishLiveInfo.class)
    public JAXBElement<String> createAQILayerPublishLiveInfoLayerUrl(String value) {
        return new JAXBElement<String>(_AQILayerPublishLiveInfoLayerUrl_QNAME, String.class, AQILayerPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PollutantCode", scope = AQILayerPublishLiveInfo.class)
    public JAXBElement<String> createAQILayerPublishLiveInfoPollutantCode(String value) {
        return new JAXBElement<String>(_AQILayerPublishLiveInfoPollutantCode_QNAME, String.class, AQILayerPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "aqida", scope = SetAQIPublishData.class)
    public JAXBElement<ArrayOfAQIDataPublishLiveInfo> createSetAQIPublishDataAqida(ArrayOfAQIDataPublishLiveInfo value) {
        return new JAXBElement<ArrayOfAQIDataPublishLiveInfo>(_SetAQIPublishDataAqida_QNAME, ArrayOfAQIDataPublishLiveInfo.class, SetAQIPublishData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIChartValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetHistoryByNameAndTimeResult", scope = GetHistoryByNameAndTimeResponse.class)
    public JAXBElement<ArrayOfAQIChartValue> createGetHistoryByNameAndTimeResponseGetHistoryByNameAndTimeResult(ArrayOfAQIChartValue value) {
        return new JAXBElement<ArrayOfAQIChartValue>(_GetHistoryByNameAndTimeResponseGetHistoryByNameAndTimeResult_QNAME, ArrayOfAQIChartValue.class, GetHistoryByNameAndTimeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AQILayerPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAQILayerResult", scope = GetAQILayerResponse.class)
    public JAXBElement<AQILayerPublishLiveInfo> createGetAQILayerResponseGetAQILayerResult(AQILayerPublishLiveInfo value) {
        return new JAXBElement<AQILayerPublishLiveInfo>(_GetAQILayerResponseGetAQILayerResult_QNAME, AQILayerPublishLiveInfo.class, GetAQILayerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "paramName", scope = UpdateLayerUrl.class)
    public JAXBElement<String> createUpdateLayerUrlParamName(String value) {
        return new JAXBElement<String>(_UpdateLayerUrlParamName_QNAME, String.class, UpdateLayerUrl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "layerUrl", scope = UpdateLayerUrl.class)
    public JAXBElement<String> createUpdateLayerUrlLayerUrl(String value) {
        return new JAXBElement<String>(_UpdateLayerUrlLayerUrl_QNAME, String.class, UpdateLayerUrl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCNByPNameResult", scope = GetCNByPNameResponse.class)
    public JAXBElement<ArrayOfCityInfo> createGetCNByPNameResponseGetCNByPNameResult(ArrayOfCityInfo value) {
        return new JAXBElement<ArrayOfCityInfo>(_GetCNByPNameResponseGetCNByPNameResult_QNAME, ArrayOfCityInfo.class, GetCNByPNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetIaqiHistoryByNameAndTimeResult", scope = GetIaqiHistoryByNameAndTimeResponse.class)
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP> createGetIaqiHistoryByNameAndTimeResponseGetIaqiHistoryByNameAndTimeResult(ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP value) {
        return new JAXBElement<ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP>(_GetIaqiHistoryByNameAndTimeResponseGetIaqiHistoryByNameAndTimeResult_QNAME, ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP.class, GetIaqiHistoryByNameAndTimeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CityName", scope = GetAQIDataByCityName.class)
    public JAXBElement<String> createGetAQIDataByCityNameCityName(String value) {
        return new JAXBElement<String>(_GetAQIDataByCityNameCityName_QNAME, String.class, GetAQIDataByCityName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StationName", scope = GetAQIHistoryBySN.class)
    public JAXBElement<String> createGetAQIHistoryBySNStationName(String value) {
        return new JAXBElement<String>(_GetAQIHistoryBySNStationName_QNAME, String.class, GetAQIHistoryBySN.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllAQILiveDataResult", scope = GetAllAQILiveDataResponse.class)
    public JAXBElement<ArrayOfAQIDataPublishLiveInfo> createGetAllAQILiveDataResponseGetAllAQILiveDataResult(ArrayOfAQIDataPublishLiveInfo value) {
        return new JAXBElement<ArrayOfAQIDataPublishLiveInfo>(_GetAllAQILiveDataResponseGetAllAQILiveDataResult_QNAME, ArrayOfAQIDataPublishLiveInfo.class, GetAllAQILiveDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAQITipResult", scope = GetAQITipResponse.class)
    public JAXBElement<ArrayOfKeyValueOfintstring> createGetAQITipResponseGetAQITipResult(ArrayOfKeyValueOfintstring value) {
        return new JAXBElement<ArrayOfKeyValueOfintstring>(_GetAQITipResponseGetAQITipResult_QNAME, ArrayOfKeyValueOfintstring.class, GetAQITipResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllHistoryByNameAndTimeResult", scope = GetAllHistoryByNameAndTimeResponse.class)
    public JAXBElement<ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP> createGetAllHistoryByNameAndTimeResponseGetAllHistoryByNameAndTimeResult(ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP value) {
        return new JAXBElement<ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP>(_GetAllHistoryByNameAndTimeResponseGetAllHistoryByNameAndTimeResult_QNAME, ArrayOfKeyValueOfstringArrayOfAQIChartValueQi88CNAP.class, GetAllHistoryByNameAndTimeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", name = "Quality", scope = AQIDayBll.class)
    public JAXBElement<String> createAQIDayBllQuality(String value) {
        return new JAXBElement<String>(_AQIDayBllQuality_QNAME, String.class, AQIDayBll.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", name = "PrimaryPollutant", scope = AQIDayBll.class)
    public JAXBElement<String> createAQIDayBllPrimaryPollutant(String value) {
        return new JAXBElement<String>(_AQIDayBllPrimaryPollutant_QNAME, String.class, AQIDayBll.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", name = "PositionName", scope = AQIDayBll.class)
    public JAXBElement<String> createAQIDayBllPositionName(String value) {
        return new JAXBElement<String>(_AQIDayBllPositionName_QNAME, String.class, AQIDayBll.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", name = "AQI", scope = AQIDayBll.class)
    public JAXBElement<String> createAQIDayBllAQI(String value) {
        return new JAXBElement<String>(_AQIDayBllAQI_QNAME, String.class, AQIDayBll.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "param", scope = SetAQI24Layer.class)
    public JAXBElement<String> createSetAQI24LayerParam(String value) {
        return new JAXBElement<String>(_SetAQI24LayerParam_QNAME, String.class, SetAQI24Layer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "url", scope = SetAQI24Layer.class)
    public JAXBElement<String> createSetAQI24LayerUrl(String value) {
        return new JAXBElement<String>(_SetAQI24LayerUrl_QNAME, String.class, SetAQI24Layer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "param", scope = GetStringUrlByTime.class)
    public JAXBElement<String> createGetStringUrlByTimeParam(String value) {
        return new JAXBElement<String>(_SetAQI24LayerParam_QNAME, String.class, GetStringUrlByTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQILayerPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllAQILayerURLResult", scope = GetAllAQILayerURLResponse.class)
    public JAXBElement<ArrayOfAQILayerPublishLiveInfo> createGetAllAQILayerURLResponseGetAllAQILayerURLResult(ArrayOfAQILayerPublishLiveInfo value) {
        return new JAXBElement<ArrayOfAQILayerPublishLiveInfo>(_GetAllAQILayerURLResponseGetAllAQILayerURLResult_QNAME, ArrayOfAQILayerPublishLiveInfo.class, GetAllAQILayerURLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "YGCode", scope = StationInfo.class)
    public JAXBElement<String> createStationInfoYGCode(String value) {
        return new JAXBElement<String>(_StationInfoYGCode_QNAME, String.class, StationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "StationState", scope = StationInfo.class)
    public JAXBElement<String> createStationInfoStationState(String value) {
        return new JAXBElement<String>(_StationInfoStationState_QNAME, String.class, StationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "GroupCode", scope = StationInfo.class)
    public JAXBElement<String> createStationInfoGroupCode(String value) {
        return new JAXBElement<String>(_StationInfoGroupCode_QNAME, String.class, StationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "SKCode", scope = StationInfo.class)
    public JAXBElement<String> createStationInfoSKCode(String value) {
        return new JAXBElement<String>(_StationInfoSKCode_QNAME, String.class, StationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "IndicatorCode", scope = StationInfo.class)
    public JAXBElement<String> createStationInfoIndicatorCode(String value) {
        return new JAXBElement<String>(_StationInfoIndicatorCode_QNAME, String.class, StationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "Substation", scope = StationInfo.class)
    public JAXBElement<String> createStationInfoSubstation(String value) {
        return new JAXBElement<String>(_StationInfoSubstation_QNAME, String.class, StationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PositionName", scope = StationInfo.class)
    public JAXBElement<String> createStationInfoPositionName(String value) {
        return new JAXBElement<String>(_StationInfoPositionName_QNAME, String.class, StationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "GKCode", scope = StationInfo.class)
    public JAXBElement<String> createStationInfoGKCode(String value) {
        return new JAXBElement<String>(_StationInfoGKCode_QNAME, String.class, StationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "City", scope = StationInfo.class)
    public JAXBElement<String> createStationInfoCity(String value) {
        return new JAXBElement<String>(_StationInfoCity_QNAME, String.class, StationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "AGCode", scope = StationInfo.class)
    public JAXBElement<String> createStationInfoAGCode(String value) {
        return new JAXBElement<String>(_StationInfoAGCode_QNAME, String.class, StationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "StationCode", scope = StationInfo.class)
    public JAXBElement<String> createStationInfoStationCode(String value) {
        return new JAXBElement<String>(_StationInfoStationCode_QNAME, String.class, StationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "provinceName", scope = GetAllAQILiveData.class)
    public JAXBElement<String> createGetAllAQILiveDataProvinceName(String value) {
        return new JAXBElement<String>(_GetAllAQILiveDataProvinceName_QNAME, String.class, GetAllAQILiveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "CityName", scope = CityInfo.class)
    public JAXBElement<String> createCityInfoCityName(String value) {
        return new JAXBElement<String>(_CityInfoCityName_QNAME, String.class, CityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "CityJC", scope = CityInfo.class)
    public JAXBElement<String> createCityInfoCityJC(String value) {
        return new JAXBElement<String>(_CityInfoCityJC_QNAME, String.class, CityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "CityName", scope = AQICityInfo.class)
    public JAXBElement<String> createAQICityInfoCityName(String value) {
        return new JAXBElement<String>(_CityInfoCityName_QNAME, String.class, AQICityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "CityID", scope = AQICityInfo.class)
    public JAXBElement<String> createAQICityInfoCityID(String value) {
        return new JAXBElement<String>(_AQICityInfoCityID_QNAME, String.class, AQICityInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "CityName", scope = AQICityStationInfo.class)
    public JAXBElement<String> createAQICityStationInfoCityName(String value) {
        return new JAXBElement<String>(_CityInfoCityName_QNAME, String.class, AQICityStationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "StationID", scope = AQICityStationInfo.class)
    public JAXBElement<String> createAQICityStationInfoStationID(String value) {
        return new JAXBElement<String>(_AQICityStationInfoStationID_QNAME, String.class, AQICityStationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PositionName", scope = AQICityStationInfo.class)
    public JAXBElement<String> createAQICityStationInfoPositionName(String value) {
        return new JAXBElement<String>(_StationInfoPositionName_QNAME, String.class, AQICityStationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "SMargin", scope = AQICityStationInfo.class)
    public JAXBElement<String> createAQICityStationInfoSMargin(String value) {
        return new JAXBElement<String>(_AQICityStationInfoSMargin_QNAME, String.class, AQICityStationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cityname", scope = GetPid.class)
    public JAXBElement<String> createGetPidCityname(String value) {
        return new JAXBElement<String>(_GetPidCityname_QNAME, String.class, GetPid.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "stationCode", scope = GetAQIHistory.class)
    public JAXBElement<String> createGetAQIHistoryStationCode(String value) {
        return new JAXBElement<String>(_GetAQIHistoryStationCode_QNAME, String.class, GetAQIHistory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "IO3", scope = IAQIDataPublishLiveInfo.class)
    public JAXBElement<String> createIAQIDataPublishLiveInfoIO3(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoIO3_QNAME, String.class, IAQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "ICO", scope = IAQIDataPublishLiveInfo.class)
    public JAXBElement<String> createIAQIDataPublishLiveInfoICO(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoICO_QNAME, String.class, IAQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "Area", scope = IAQIDataPublishLiveInfo.class)
    public JAXBElement<String> createIAQIDataPublishLiveInfoArea(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoArea_QNAME, String.class, IAQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "IPM10", scope = IAQIDataPublishLiveInfo.class)
    public JAXBElement<String> createIAQIDataPublishLiveInfoIPM10(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoIPM10_QNAME, String.class, IAQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "IO3_8h", scope = IAQIDataPublishLiveInfo.class)
    public JAXBElement<String> createIAQIDataPublishLiveInfoIO38H(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoIO38H_QNAME, String.class, IAQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "IPM2_5", scope = IAQIDataPublishLiveInfo.class)
    public JAXBElement<String> createIAQIDataPublishLiveInfoIPM25(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoIPM25_QNAME, String.class, IAQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PositionName", scope = IAQIDataPublishLiveInfo.class)
    public JAXBElement<String> createIAQIDataPublishLiveInfoPositionName(String value) {
        return new JAXBElement<String>(_StationInfoPositionName_QNAME, String.class, IAQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "Longitude", scope = IAQIDataPublishLiveInfo.class)
    public JAXBElement<String> createIAQIDataPublishLiveInfoLongitude(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoLongitude_QNAME, String.class, IAQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "ISO2", scope = IAQIDataPublishLiveInfo.class)
    public JAXBElement<String> createIAQIDataPublishLiveInfoISO2(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoISO2_QNAME, String.class, IAQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "INO2", scope = IAQIDataPublishLiveInfo.class)
    public JAXBElement<String> createIAQIDataPublishLiveInfoINO2(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoINO2_QNAME, String.class, IAQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "StationCode", scope = IAQIDataPublishLiveInfo.class)
    public JAXBElement<String> createIAQIDataPublishLiveInfoStationCode(String value) {
        return new JAXBElement<String>(_StationInfoStationCode_QNAME, String.class, IAQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "Latitude", scope = IAQIDataPublishLiveInfo.class)
    public JAXBElement<String> createIAQIDataPublishLiveInfoLatitude(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoLatitude_QNAME, String.class, IAQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIPollutantUpperLimitInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListUpPolLimit", scope = UpDatePolConLimits.class)
    public JAXBElement<ArrayOfAQIPollutantUpperLimitInfo> createUpDatePolConLimitsListUpPolLimit(ArrayOfAQIPollutantUpperLimitInfo value) {
        return new JAXBElement<ArrayOfAQIPollutantUpperLimitInfo>(_UpDatePolConLimitsListUpPolLimit_QNAME, ArrayOfAQIPollutantUpperLimitInfo.class, UpDatePolConLimits.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAQIDataResult", scope = GetAQIDataResponse.class)
    public JAXBElement<ArrayOfAQIDataPublishLiveInfo> createGetAQIDataResponseGetAQIDataResult(ArrayOfAQIDataPublishLiveInfo value) {
        return new JAXBElement<ArrayOfAQIDataPublishLiveInfo>(_GetAQIDataResponseGetAQIDataResult_QNAME, ArrayOfAQIDataPublishLiveInfo.class, GetAQIDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CityName", scope = GetIAQIPublishEtyByCityName.class)
    public JAXBElement<String> createGetIAQIPublishEtyByCityNameCityName(String value) {
        return new JAXBElement<String>(_GetAQIDataByCityNameCityName_QNAME, String.class, GetIAQIPublishEtyByCityName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PollutantName", scope = AQIPollutantUpperLimitInfo.class)
    public JAXBElement<String> createAQIPollutantUpperLimitInfoPollutantName(String value) {
        return new JAXBElement<String>(_AQIPollutantUpperLimitInfoPollutantName_QNAME, String.class, AQIPollutantUpperLimitInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStringUrlByTimeResult", scope = GetStringUrlByTimeResponse.class)
    public JAXBElement<String> createGetStringUrlByTimeResponseGetStringUrlByTimeResult(String value) {
        return new JAXBElement<String>(_GetStringUrlByTimeResponseGetStringUrlByTimeResult_QNAME, String.class, GetStringUrlByTimeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIAQIDataPublishLiveEty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllIAQIPublishEtyResult", scope = GetAllIAQIPublishEtyResponse.class)
    public JAXBElement<ArrayOfIAQIDataPublishLiveEty> createGetAllIAQIPublishEtyResponseGetAllIAQIPublishEtyResult(ArrayOfIAQIDataPublishLiveEty value) {
        return new JAXBElement<ArrayOfIAQIDataPublishLiveEty>(_GetAllIAQIPublishEtyResponseGetAllIAQIPublishEtyResult_QNAME, ArrayOfIAQIDataPublishLiveEty.class, GetAllIAQIPublishEtyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDayBll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAQIDayResult", scope = GetAQIDayResponse.class)
    public JAXBElement<ArrayOfAQIDayBll> createGetAQIDayResponseGetAQIDayResult(ArrayOfAQIDayBll value) {
        return new JAXBElement<ArrayOfAQIDayBll>(_GetAQIDayResponseGetAQIDayResult_QNAME, ArrayOfAQIDayBll.class, GetAQIDayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PositionName", scope = GetAllHistoryByNameAndTime.class)
    public JAXBElement<String> createGetAllHistoryByNameAndTimePositionName(String value) {
        return new JAXBElement<String>(_GetHistoryByNameAndTimePositionName_QNAME, String.class, GetAllHistoryByNameAndTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PollutantCode", scope = GetAllHistoryByNameAndTime.class)
    public JAXBElement<String> createGetAllHistoryByNameAndTimePollutantCode(String value) {
        return new JAXBElement<String>(_GetHistoryByNameAndTimePollutantCode_QNAME, String.class, GetAllHistoryByNameAndTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StartTime", scope = GetAllHistoryByNameAndTime.class)
    public JAXBElement<String> createGetAllHistoryByNameAndTimeStartTime(String value) {
        return new JAXBElement<String>(_GetHistoryByNameAndTimeStartTime_QNAME, String.class, GetAllHistoryByNameAndTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EndTime", scope = GetAllHistoryByNameAndTime.class)
    public JAXBElement<String> createGetAllHistoryByNameAndTimeEndTime(String value) {
        return new JAXBElement<String>(_GetHistoryByNameAndTimeEndTime_QNAME, String.class, GetAllHistoryByNameAndTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "provinceName", scope = GetCityNameByPName.class)
    public JAXBElement<String> createGetCityNameByPNameProvinceName(String value) {
        return new JAXBElement<String>(_GetAllAQILiveDataProvinceName_QNAME, String.class, GetCityNameByPName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAQIDataByCityNameResult", scope = GetAQIDataByCityNameResponse.class)
    public JAXBElement<ArrayOfAQIDataPublishLiveInfo> createGetAQIDataByCityNameResponseGetAQIDataByCityNameResult(ArrayOfAQIDataPublishLiveInfo value) {
        return new JAXBElement<ArrayOfAQIDataPublishLiveInfo>(_GetAQIDataByCityNameResponseGetAQIDataByCityNameResult_QNAME, ArrayOfAQIDataPublishLiveInfo.class, GetAQIDataByCityNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PM2_5_24h", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoPM2524H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoPM2524H_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "NO2", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoNO2(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoNO2_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "SO2", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoSO2(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoSO2_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "CO_24h", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoCO24H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoCO24H_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "Unheathful", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoUnheathful(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoUnheathful_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "CO", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoCO(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoCO_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "Longitude", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoLongitude(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoLongitude_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "NO2_24h", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoNO224H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoNO224H_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "StationCode", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoStationCode(String value) {
        return new JAXBElement<String>(_StationInfoStationCode_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "Latitude", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoLatitude(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoLatitude_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "Area", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoArea(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoArea_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "Quality", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoQuality(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoQuality_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "O3_8h", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoO38H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoO38H_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PM10", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoPM10(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoPM10_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PrimaryPollutant", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoPrimaryPollutant(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoPrimaryPollutant_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PositionName", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoPositionName(String value) {
        return new JAXBElement<String>(_StationInfoPositionName_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "O3_24h", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoO324H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoO324H_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PM10_24h", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoPM1024H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoPM1024H_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PM2_5", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoPM25(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoPM25_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "AQI", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoAQI(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoAQI_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "O3", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoO3(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoO3_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "SO2_24h", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoSO224H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoSO224H_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "O3_8h_24h", scope = AQIDataPublishHistoryInfo.class)
    public JAXBElement<String> createAQIDataPublishHistoryInfoO38H24H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoO38H24H_QNAME, String.class, AQIDataPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIAQIDataPublishLiveEty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetIAQIPublishEtyByCityNameResult", scope = GetIAQIPublishEtyByCityNameResponse.class)
    public JAXBElement<ArrayOfIAQIDataPublishLiveEty> createGetIAQIPublishEtyByCityNameResponseGetIAQIPublishEtyByCityNameResult(ArrayOfIAQIDataPublishLiveEty value) {
        return new JAXBElement<ArrayOfIAQIDataPublishLiveEty>(_GetIAQIPublishEtyByCityNameResponseGetIAQIPublishEtyByCityNameResult_QNAME, ArrayOfIAQIDataPublishLiveEty.class, GetIAQIPublishEtyByCityNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIPollutantUpperLimitInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPolConLimitsResult", scope = GetPolConLimitsResponse.class)
    public JAXBElement<ArrayOfAQIPollutantUpperLimitInfo> createGetPolConLimitsResponseGetPolConLimitsResult(ArrayOfAQIPollutantUpperLimitInfo value) {
        return new JAXBElement<ArrayOfAQIPollutantUpperLimitInfo>(_GetPolConLimitsResponseGetPolConLimitsResult_QNAME, ArrayOfAQIPollutantUpperLimitInfo.class, GetPolConLimitsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "param", scope = GetStringUrl.class)
    public JAXBElement<String> createGetStringUrlParam(String value) {
        return new JAXBElement<String>(_SetAQI24LayerParam_QNAME, String.class, GetStringUrl.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishHistoryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAQIPublishByTimeResult", scope = GetAQIPublishByTimeResponse.class)
    public JAXBElement<ArrayOfAQIDataPublishHistoryInfo> createGetAQIPublishByTimeResponseGetAQIPublishByTimeResult(ArrayOfAQIDataPublishHistoryInfo value) {
        return new JAXBElement<ArrayOfAQIDataPublishHistoryInfo>(_GetAQIPublishByTimeResponseGetAQIPublishByTimeResult_QNAME, ArrayOfAQIDataPublishHistoryInfo.class, GetAQIPublishByTimeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "LayerUrl", scope = AQILayerPublishHistoryInfo.class)
    public JAXBElement<String> createAQILayerPublishHistoryInfoLayerUrl(String value) {
        return new JAXBElement<String>(_AQILayerPublishLiveInfoLayerUrl_QNAME, String.class, AQILayerPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PollutantCode", scope = AQILayerPublishHistoryInfo.class)
    public JAXBElement<String> createAQILayerPublishHistoryInfoPollutantCode(String value) {
        return new JAXBElement<String>(_AQILayerPublishLiveInfoPollutantCode_QNAME, String.class, AQILayerPublishHistoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PositionName", scope = GetIaqiHistoryByNameAndTime.class)
    public JAXBElement<String> createGetIaqiHistoryByNameAndTimePositionName(String value) {
        return new JAXBElement<String>(_GetHistoryByNameAndTimePositionName_QNAME, String.class, GetIaqiHistoryByNameAndTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PollutantCode", scope = GetIaqiHistoryByNameAndTime.class)
    public JAXBElement<String> createGetIaqiHistoryByNameAndTimePollutantCode(String value) {
        return new JAXBElement<String>(_GetHistoryByNameAndTimePollutantCode_QNAME, String.class, GetIaqiHistoryByNameAndTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StartTime", scope = GetIaqiHistoryByNameAndTime.class)
    public JAXBElement<String> createGetIaqiHistoryByNameAndTimeStartTime(String value) {
        return new JAXBElement<String>(_GetHistoryByNameAndTimeStartTime_QNAME, String.class, GetIaqiHistoryByNameAndTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EndTime", scope = GetIaqiHistoryByNameAndTime.class)
    public JAXBElement<String> createGetIaqiHistoryByNameAndTimeEndTime(String value) {
        return new JAXBElement<String>(_GetHistoryByNameAndTimeEndTime_QNAME, String.class, GetIaqiHistoryByNameAndTime.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PoID", scope = GetAQILayer.class)
    public JAXBElement<String> createGetAQILayerPoID(String value) {
        return new JAXBElement<String>(_GetAQILayerHistoryPoID_QNAME, String.class, GetAQILayer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCityNameByPIDResult", scope = GetCityNameByPIDResponse.class)
    public JAXBElement<ArrayOfCityInfo> createGetCityNameByPIDResponseGetCityNameByPIDResult(ArrayOfCityInfo value) {
        return new JAXBElement<ArrayOfCityInfo>(_GetCityNameByPIDResponseGetCityNameByPIDResult_QNAME, ArrayOfCityInfo.class, GetCityNameByPIDResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIChartValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetHistoryBySNandCODEResult", scope = GetHistoryBySNandCODEResponse.class)
    public JAXBElement<ArrayOfAQIChartValue> createGetHistoryBySNandCODEResponseGetHistoryBySNandCODEResult(ArrayOfAQIChartValue value) {
        return new JAXBElement<ArrayOfAQIChartValue>(_GetHistoryBySNandCODEResponseGetHistoryBySNandCODEResult_QNAME, ArrayOfAQIChartValue.class, GetHistoryBySNandCODEResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllAQIStationResult", scope = GetAllAQIStationResponse.class)
    public JAXBElement<ArrayOfStationInfo> createGetAllAQIStationResponseGetAllAQIStationResult(ArrayOfStationInfo value) {
        return new JAXBElement<ArrayOfStationInfo>(_GetAllAQIStationResponseGetAllAQIStationResult_QNAME, ArrayOfStationInfo.class, GetAllAQIStationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "cityName", scope = GetAQIDay.class)
    public JAXBElement<String> createGetAQIDayCityName(String value) {
        return new JAXBElement<String>(_GetAQIDayCityName_QNAME, String.class, GetAQIDay.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PM2_5_24h", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoPM2524H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoPM2524H_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "NO2", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoNO2(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoNO2_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "SO2", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoSO2(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoSO2_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "CO_24h", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoCO24H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoCO24H_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "Unheathful", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoUnheathful(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoUnheathful_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "CO", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoCO(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoCO_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "Longitude", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoLongitude(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoLongitude_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "NO2_24h", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoNO224H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoNO224H_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "StationCode", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoStationCode(String value) {
        return new JAXBElement<String>(_StationInfoStationCode_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "Latitude", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoLatitude(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoLatitude_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "Area", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoArea(String value) {
        return new JAXBElement<String>(_IAQIDataPublishLiveInfoArea_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "Quality", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoQuality(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoQuality_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "O3_8h", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoO38H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoO38H_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PM10", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoPM10(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoPM10_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PrimaryPollutant", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoPrimaryPollutant(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoPrimaryPollutant_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PositionName", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoPositionName(String value) {
        return new JAXBElement<String>(_StationInfoPositionName_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "O3_24h", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoO324H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoO324H_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PM10_24h", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoPM1024H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoPM1024H_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "PM2_5", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoPM25(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoPM25_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "AQI", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoAQI(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoAQI_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "O3", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoO3(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoO3_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "SO2_24h", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoSO224H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoSO224H_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.Model", name = "O3_8h_24h", scope = AQIDataPublishLiveInfo.class)
    public JAXBElement<String> createAQIDataPublishLiveInfoO38H24H(String value) {
        return new JAXBElement<String>(_AQIDataPublishHistoryInfoO38H24H_QNAME, String.class, AQIDataPublishLiveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "provinceName", scope = GetCNByPName.class)
    public JAXBElement<String> createGetCNByPNameProvinceName(String value) {
        return new JAXBElement<String>(_GetAllAQILiveDataProvinceName_QNAME, String.class, GetCNByPName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CityName", scope = GetAQICityStation.class)
    public JAXBElement<String> createGetAQICityStationCityName(String value) {
        return new JAXBElement<String>(_GetAQIDataByCityNameCityName_QNAME, String.class, GetAQICityStation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishHistoryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAQIHistoryBySNResult", scope = GetAQIHistoryBySNResponse.class)
    public JAXBElement<ArrayOfAQIDataPublishHistoryInfo> createGetAQIHistoryBySNResponseGetAQIHistoryBySNResult(ArrayOfAQIDataPublishHistoryInfo value) {
        return new JAXBElement<ArrayOfAQIDataPublishHistoryInfo>(_GetAQIHistoryBySNResponseGetAQIHistoryBySNResult_QNAME, ArrayOfAQIDataPublishHistoryInfo.class, GetAQIHistoryBySNResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListOriData", scope = PM25AndPM10 .class)
    public JAXBElement<ArrayOfAQIDataPublishLiveInfo> createPM25AndPM10ListOriData(ArrayOfAQIDataPublishLiveInfo value) {
        return new JAXBElement<ArrayOfAQIDataPublishLiveInfo>(_PM25AndPM10ListOriData_QNAME, ArrayOfAQIDataPublishLiveInfo.class, PM25AndPM10 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQICityInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAQIPublishStationResult", scope = GetAQIPublishStationResponse.class)
    public JAXBElement<ArrayOfAQICityInfo> createGetAQIPublishStationResponseGetAQIPublishStationResult(ArrayOfAQICityInfo value) {
        return new JAXBElement<ArrayOfAQICityInfo>(_GetAQIPublishStationResponseGetAQIPublishStationResult_QNAME, ArrayOfAQICityInfo.class, GetAQIPublishStationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCityStationResult", scope = GetCityStationResponse.class)
    public JAXBElement<ArrayOfAQIDataPublishLiveInfo> createGetCityStationResponseGetCityStationResult(ArrayOfAQIDataPublishLiveInfo value) {
        return new JAXBElement<ArrayOfAQIDataPublishLiveInfo>(_GetCityStationResponseGetCityStationResult_QNAME, ArrayOfAQIDataPublishLiveInfo.class, GetCityStationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQIDataPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllAQIPublishLiveDataResult", scope = GetAllAQIPublishLiveDataResponse.class)
    public JAXBElement<ArrayOfAQIDataPublishLiveInfo> createGetAllAQIPublishLiveDataResponseGetAllAQIPublishLiveDataResult(ArrayOfAQIDataPublishLiveInfo value) {
        return new JAXBElement<ArrayOfAQIDataPublishLiveInfo>(_GetAllAQIPublishLiveDataResponseGetAllAQIPublishLiveDataResult_QNAME, ArrayOfAQIDataPublishLiveInfo.class, GetAllAQIPublishLiveDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQICityStationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAQICityStationResult", scope = GetAQICityStationResponse.class)
    public JAXBElement<ArrayOfAQICityStationInfo> createGetAQICityStationResponseGetAQICityStationResult(ArrayOfAQICityStationInfo value) {
        return new JAXBElement<ArrayOfAQICityStationInfo>(_GetAQICityStationResponseGetAQICityStationResult_QNAME, ArrayOfAQICityStationInfo.class, GetAQICityStationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIAQIDataPublishLiveInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "aqida", scope = SetIAQIPublishData.class)
    public JAXBElement<ArrayOfIAQIDataPublishLiveInfo> createSetIAQIPublishDataAqida(ArrayOfIAQIDataPublishLiveInfo value) {
        return new JAXBElement<ArrayOfIAQIDataPublishLiveInfo>(_SetAQIPublishDataAqida_QNAME, ArrayOfIAQIDataPublishLiveInfo.class, SetIAQIPublishData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQILayerPublishHistoryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataResult", scope = GetDataResponse.class)
    public JAXBElement<ArrayOfAQILayerPublishHistoryInfo> createGetDataResponseGetDataResult(ArrayOfAQILayerPublishHistoryInfo value) {
        return new JAXBElement<ArrayOfAQILayerPublishHistoryInfo>(_GetDataResponseGetDataResult_QNAME, ArrayOfAQILayerPublishHistoryInfo.class, GetDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAQILayerPublishHistoryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAQILayerHistoryResult", scope = GetAQILayerHistoryResponse.class)
    public JAXBElement<ArrayOfAQILayerPublishHistoryInfo> createGetAQILayerHistoryResponseGetAQILayerHistoryResult(ArrayOfAQILayerPublishHistoryInfo value) {
        return new JAXBElement<ArrayOfAQILayerPublishHistoryInfo>(_GetAQILayerHistoryResponseGetAQILayerHistoryResult_QNAME, ArrayOfAQILayerPublishHistoryInfo.class, GetAQILayerHistoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IndicatorCode", scope = GetData.class)
    public JAXBElement<String> createGetDataIndicatorCode(String value) {
        return new JAXBElement<String>(_GetDataIndicatorCode_QNAME, String.class, GetData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStringUrlResult", scope = GetStringUrlResponse.class)
    public JAXBElement<String> createGetStringUrlResponseGetStringUrlResult(String value) {
        return new JAXBElement<String>(_GetStringUrlResponseGetStringUrlResult_QNAME, String.class, GetStringUrlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PositionName", scope = GetHistoryBySNandCODE.class)
    public JAXBElement<String> createGetHistoryBySNandCODEPositionName(String value) {
        return new JAXBElement<String>(_GetHistoryByNameAndTimePositionName_QNAME, String.class, GetHistoryBySNandCODE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PollutantCode", scope = GetHistoryBySNandCODE.class)
    public JAXBElement<String> createGetHistoryBySNandCODEPollutantCode(String value) {
        return new JAXBElement<String>(_GetHistoryByNameAndTimePollutantCode_QNAME, String.class, GetHistoryBySNandCODE.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", name = "Movalue24", scope = AQIChartValue.class)
    public JAXBElement<String> createAQIChartValueMovalue24(String value) {
        return new JAXBElement<String>(_AQIChartValueMovalue24_QNAME, String.class, AQIChartValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", name = "MonValue", scope = AQIChartValue.class)
    public JAXBElement<String> createAQIChartValueMonValue(String value) {
        return new JAXBElement<String>(_AQIChartValueMonValue_QNAME, String.class, AQIChartValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", name = "PositionName", scope = AQIChartValue.class)
    public JAXBElement<String> createAQIChartValuePositionName(String value) {
        return new JAXBElement<String>(_AQIDayBllPositionName_QNAME, String.class, AQIChartValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", name = "StationCode", scope = AQIChartValue.class)
    public JAXBElement<String> createAQIChartValueStationCode(String value) {
        return new JAXBElement<String>(_AQIChartValueStationCode_QNAME, String.class, AQIChartValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EnvCriteria.BLL", name = "IsLimits", scope = AQIChartValue.class)
    public JAXBElement<String> createAQIChartValueIsLimits(String value) {
        return new JAXBElement<String>(_AQIChartValueIsLimits_QNAME, String.class, AQIChartValue.class, value);
    }

}
