package com.zr.crm.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.alibaba.fastjson.JSON;

/**
* @ClassName: DWZJsonResponseResult 
* @Description: DWZ�ķ�����Ӧ
* @author chenjk
* @date 2014-9-24 ����2:51:37 
*
 */
public class DWZJsonResponseResult{
   

    /** ״̬ */
    private Integer statusCode;

    /** ������Ϣ���� */
    private String message;
    
    /**�ص���������*/
    private String callbackType;
    
    /**�ص���������*/
    private String navTabId;
    
    private DWZJsonResponseResult(){
    }
    
    private String loginUrl;
    
    private String html;
    
    private long time;
    
    /**��Ҫ���ص�����*/
    private final List<Object> data = new ArrayList<Object>();

    @SuppressWarnings("unchecked")
    public void addDataAll(List list) {
        data.addAll(list);
    }
    

    public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCallbackType() {
		return callbackType;
	}

	public void setCallbackType(String callbackType) {
		this.callbackType = callbackType;
	}

	public String getNavTabId() {
		return navTabId;
	}

	public void setNavTabId(String navTabId) {
		this.navTabId = navTabId;
	}

	/**
     * �����ɹ���JsonResult����
     * 
     * @return
     */
    public static String createSuccess() {
        StringBuffer sb = new StringBuffer();
        // "{\"message\":\"�����ɹ�\",\"statusCode\":\"200\"}";
        sb.append("{\"").append(DWZJsonConstant.DWZ_JSON_MESSAGE).append("\":\"").append(DWZJsonConstant.DWZ_JSON_MESSAGE_SUCCESS)
        .append("\",\"").append(DWZJsonConstant.DWZ_JSON_CODE).append("\":\"").append(DWZJsonConstant.DWZ_JSON_RESULT_SUCCESS)
        .append("\"}");
        return sb.toString();
    }
    
    /**
     * �����ɹ���JsonResult����
     * 
     * @return
     */
    public static String createSuccessClose() {
        StringBuffer sb = new StringBuffer();
        // "{\"message\":\"�����ɹ�\",\"statusCode\":\"200\"}";
        sb.append("{\"").append(DWZJsonConstant.DWZ_JSON_MESSAGE).append("\":\"").append(DWZJsonConstant.DWZ_JSON_MESSAGE_SUCCESS)
        .append("\",\"").append(DWZJsonConstant.DWZ_JSON_CODE).append("\":\"").append(DWZJsonConstant.DWZ_JSON_RESULT_SUCCESS)
        .append("\",\"").append(DWZJsonConstant.DWZ_JSON_CALLBACK).append("\":\"").append(DWZJsonConstant.DWZ_JSON_CLOSE)
        .append("\"}");
        return sb.toString();
    }
    
    /**
     * �����ɹ���JsonResult����
     * 
     * @return
     */
    public static String createSuccessClose(String msg) {
        StringBuffer sb = new StringBuffer();
        // "{\"message\":\"�����ɹ�\",\"statusCode\":\"200\"}";
        sb.append("{\"").append(DWZJsonConstant.DWZ_JSON_MESSAGE).append("\":\"").append(msg)
        .append("\",\"").append(DWZJsonConstant.DWZ_JSON_CODE).append("\":\"").append(DWZJsonConstant.DWZ_JSON_RESULT_SUCCESS)
        .append("\",\"").append(DWZJsonConstant.DWZ_JSON_CALLBACK).append("\":\"").append(DWZJsonConstant.DWZ_JSON_CLOSE)
        .append("\"}");
        return sb.toString();
    }

    /**
     * �����ɹ���JsonResult����
     * 
     * @return
     */
    public static String createSuccess(String msg) {
    	StringBuffer sb = new StringBuffer();
        // "{\"message\":\"�����ɹ�\",\"statusCode\":\"200\"}";
        sb.append("{\"").append(DWZJsonConstant.DWZ_JSON_MESSAGE).append("\":\"").append(msg)
        .append("\",\"").append(DWZJsonConstant.DWZ_JSON_CODE).append("\":\"").append(DWZJsonConstant.DWZ_JSON_RESULT_SUCCESS)
        .append("\"}");
        return sb.toString();
    }
    
    /**
     * �����ɹ���JsonResult����
     * 
     * @return
     */
    public static DWZJsonResponseResult initSuccess() {
    	DWZJsonResponseResult json = new DWZJsonResponseResult();
		json.setCallbackType(DWZJsonConstant.DWZ_JSON_CLOSE);
		json.setStatusCode(DWZJsonConstant.DWZ_JSON_RESULT_SUCCESS);
		json.setMessage(DWZJsonConstant.DWZ_JSON_MESSAGE_SUCCESS);
		return json;
    }

   
    /**
     * ����ʧ�ܵ�JsonResult����
     * 
     * @return
     */
    public static String createFalied(final String msg) {
    	StringBuffer sb = new StringBuffer();
        // "{\"message\":\"�����ɹ�\",\"statusCode\":\"200\"}";
        sb.append("{\"").append(DWZJsonConstant.DWZ_JSON_MESSAGE).append("\":\"").append(msg)
        .append("\",\"").append(DWZJsonConstant.DWZ_JSON_CODE).append("\":\"").append(DWZJsonConstant.DWZ_JSON_RESULT_FAILED)
        .append("\"}");
        return sb.toString();
    }

    /**
     * ����ʧ�ܵ�JsonResult����
     * 
     * @return
     */
    public static String createFalied() {
    	StringBuffer sb = new StringBuffer();
        // "{\"message\":\"�����ɹ�\",\"statusCode\":\"200\"}";
        sb.append("{\"").append(DWZJsonConstant.DWZ_JSON_MESSAGE).append("\":\"").append(DWZJsonConstant.DWZ_JSON_MESSAGE_FAIL)
        .append("\",\"").append(DWZJsonConstant.DWZ_JSON_CODE).append("\":\"").append(DWZJsonConstant.DWZ_JSON_RESULT_FAILED)
        .append("\"}");
        return sb.toString();
    }
    
    public String toJSONString(){
    	return JSON.toJSONString(this);
    }
    
    public static String toJSONString(DWZJsonResponseResult res){
    	return JSON.toJSONString(res);
    }
    
    public void addData(final Object obj) {
        data.add(obj);
    }
    
    public List<Object> getData() {
		return data;
	}

	public String getLoginUrl() {
		return loginUrl;
	}


	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	

	public String getHtml() {
		return html;
	}


	public void setHtml(String html) {
		this.html = html;
	}


	public long getTime() {
		return time;
	}


	public void setTime(long time) {
		this.time = time;
	}


	public static void main(String args[]){
    	System.out.println(DWZJsonResponseResult.createSuccess());
    	System.out.println(DWZJsonResponseResult.createSuccessClose());
    	List<String> ll = new ArrayList<String>();
    	ll.add("ʧ�����𣿣���");
    	DWZJsonResponseResult d = new DWZJsonResponseResult();
    	
    	d.setCallbackType("cccc");
    	d.setMessage("ʧ����");
    	d.setStatusCode(301);
    	d.addDataAll(ll);
    	
    	System.out.println(createSuccessClose("�ر�ҳ��"));
    	
    	HashMap<String, String> m = JSON.parseObject(createSuccessClose("�ر�ҳ��"), HashMap.class);
    	System.out.println(m);
    	String str = JSON.toJSONString(d);
    	System.out.println(d.toJSONString());
    	System.out.println(DWZJsonResponseResult.toJSONString(d));
    }
}
