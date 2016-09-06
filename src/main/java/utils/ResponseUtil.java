
package utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 响应工具类
 */
public class ResponseUtil {
	
	public static ResponseVo buildVoByResultCode(Boolean success,ResultCode resultCode) {
		return buildVoByResultCode(success, resultCode, null);
	}
	
	public static ResponseVo buildVoByResultCode(Boolean success,String code, String msg) {
		ResponseVo vo = new ResponseVo();
		vo.setSuccess(success);
		vo.setErrorCode(Integer.valueOf(code));
		vo.setMsg(msg);
		return vo;
	}
	
	public static ResponseVo buildVoByResultCode(Boolean success, ResultCode resultCode, Object data){
		ResponseVo vo = new ResponseVo();
		if(data instanceof Map){
//			Map<String, Object> map = (Map<String, Object>)data;
//			vo.setData(JsonUtil.getMap(map, "data"));
			vo.setData(data);
		}else if(data instanceof List){
			List list = (List)data;
			vo.setData(getListJsonData(list, null));
		}else
			vo.setData(data);

		
		vo.setSuccess(success);
		vo.setErrorCode(resultCode.getCode());
		vo.setMsg(resultCode.getMsg());
		return vo;
	}
	/**
	 * 和上一个是list返回没有counts和rows字段
	 * @param success
	 * @param resultCode
	 * @param data
	 * @return
	 */
	public static ResponseVo buildVoByResultCodeList(Boolean success, ResultCode resultCode, Object data){
		ResponseVo vo = new ResponseVo();
		if(data instanceof Map){
//			Map<String, Object> map = (Map<String, Object>)data;
//			vo.setData(JsonUtil.getMap(map, "data"));
			vo.setData(data);
		}else if(data instanceof List){
			List list = (List)data;
			vo.setData(list);
		}else
			vo.setData(data);
		
		vo.setSuccess(success);
		vo.setErrorCode(resultCode.getCode());
		vo.setMsg(resultCode.getMsg());
		return vo;
	}
	
	public static ResponseVo buildVoByResultCode(Boolean success, ResultCode resultCode, Object data, int count){
		ResponseVo vo = new ResponseVo();
		if(data instanceof Map){
//			Map<String, Object> map = (Map<String, Object>)data;
//			vo.setData(JsonUtil.getMap(map, "data"));
			vo.setData(data);
		}else if(data instanceof List){
			List list = (List)data;
			vo.setData(getListJsonData(list, count));
		}else
			vo.setData(data);
		
		vo.setSuccess(success);
		vo.setErrorCode(resultCode.getCode());
		vo.setMsg(resultCode.getMsg());
		return vo;
	}
	
	private static Map getListJsonData(List list, Integer count) {
		Map map = new HashMap();
		if (count == null) {
			map.put("count", list.size());
		}
		else {
			map.put("count", count);
		}
		map.put("rows", list);
		return map;
	}
}
