package com.zr.crm.utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * JSON结果返回�?
 * 
 */
public class APIResponseResult {
	public static final String RESULT_FMT_JSON = "json";
	
	public static final String RESULT_FMT_XML = "xml";
	
	public static final Integer NEW_SPORT_APPID = 180000 ;
	
    /** API操作响应：操作成�?*/
	public static final Integer RESULT_SUCCESS = 180000 ;

    /** API操作响应：操作失�?*/
	public static final Integer RESULT_FAILED = 180001;

    /** API操作响应：URL参数错误*/
	public static final Integer RESULT_PARAMS_ERROR = 180002;
    
    /** API操作响应：签名错�?*/
	public static final Integer RESULT_SIGN_ERROR = 180003;
    
    /** API操作响：应用户授权错�? */
	public static final Integer RESULT_SIP_SESSION_ERROR = 180004;
    
    /** API操作响应：禁�? */
	public static final Integer RESULT_CANT_USE = 180005;
	
	/** API操作响应：金额不�? */
	public static final Integer RESULT_NO_ENOUGH_MENEY = 180100;
	
    /** API操作响应：未知错�?*/
	public static final Integer RESULT_UNKNOW_ERROR = 189999;

	/**
	 * 操作成功
	 * */
	public static final String SUCCESS = "success";

	/**
	 * 操作失败
	 * */
	public static final String FAILURE = "failure";
	
	/**
	 * 金额不足
	 */
	public static final String NO_ENOUGH_MONEY = "No enough meney";


    /** 状�? */
    private Integer code;

    /** 错误信息描述 */
    private String description;

    public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	protected APIResponseResult() {

    }

    private APIResponseResult(final Integer code, final String description) {
        super();
        this.code = code;
        this.description = description;
    }

    /**
     * 创建成功的JsonResult对象�?
     * 
     * @return
     */
    public static APIResponseResult createSuccess(String msg) {
        final APIResponseResult jsonResult = new APIResponseResult(APIResponseResult.RESULT_SUCCESS, msg);
        return jsonResult;
    }

    /**
     * 创建其他JsonResult对象�?
     * 
     * @return
     */
    public static APIResponseResult createOtherResult(Integer code, String description) {
        final APIResponseResult jsonResult = new APIResponseResult(code, description);
        return jsonResult;
    }

    /**
     * 创建失败的JsonResult对象�?
     * 
     * @return
     */
    public static APIResponseResult createFalied(final String msg) {
        final APIResponseResult jsonResult = new APIResponseResult(APIResponseResult.RESULT_FAILED, msg);
        return jsonResult;
    }

    public static String createXml(final Integer code,final String msg,final Map element) {
    	Document doc = DocumentHelper.createDocument();
		Element reqElement = doc.addElement("result");
		reqElement.addElement("code").addText(code.toString());
		reqElement.addElement("description").addText(msg);
		if(element !=null){
			String key = null;
			Iterator ite = element.keySet().iterator();
			while(ite.hasNext()){
				key = (String)ite.next();
				reqElement.addElement(key).addText(element.get(key).toString());
			}
		}
		return doc.asXML();
    }
   
    public String toJSONString(){
    	return JSON.toJSONString(this);
    }
    
    public static void main(String[] args) {
    	APIResponseResult apiResult = APIResponseResult.createSuccess("success");
		JSONObject json = (JSONObject)JSONObject.toJSON(apiResult);
		json.put("ttt", "abc");
		System.out.println(json.toJSONString());
		HashMap map = new HashMap();
		map.put("amount", 111);
		map.put("unuseamount", 222);
    	System.out.println(APIResponseResult.createXml(APIResponseResult.RESULT_SUCCESS,"success",map));
    }
 
}
