package com.wisdomelon.controller;

import com.wisdomelon.dtree.DTree;
import com.wisdomelon.dtree.DTreeResponse;
import com.wisdomelon.dtree.Status;
import com.wisdomelon.util.DataUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/toolbar")
public class ToolbarController {

	@SuppressWarnings("unchecked")
	@RequestMapping("/queryAll")
	public DTreeResponse queryAll(@RequestParam(value="nodeId", required=false, defaultValue="0") String nodeId, HttpSession session){
		DTreeResponse resp = new DTreeResponse();
		List<DTree> dataList = (List<DTree>) session.getAttribute("dataList");
		if(dataList == null) {
			dataList = DataUtil.listData();
		}
		resp.setData(dataList);
		return resp;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/query")
	public DTreeResponse query(@RequestParam(value="nodeId", required=false, defaultValue="0") String nodeId, HttpSession session){
		DTreeResponse resp = new DTreeResponse();
		List<DTree> data = new ArrayList<>();
		session.setMaxInactiveInterval(60);
		List<DTree> dataList = (List<DTree>) session.getAttribute("dataList");
		if(dataList == null) {
			dataList = DataUtil.listData();
		}
		
		for (DTree dTree : dataList) {
			if(nodeId.equals(dTree.getParentId())) {
				data.add(dTree);
			}
		}
		
		resp.setData(data);
		return resp;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/insert")
	public Status insert(String nodeId, String parentId, String addNodeName, HttpSession session){
		DTree dTree = new DTree(nodeId, parentId, addNodeName, true);
		
		List<DTree> dataList = (List<DTree>) session.getAttribute("dataList");
		if(dataList == null) {
			dataList = DataUtil.listData();
		}
		
		for (DTree dTree2 : dataList) {
			if(parentId.equals(dTree2.getId())) {
				dTree2.setIsLast(false);
			}
		}
		
		dataList.add(dTree);
		session.setAttribute("dataList", dataList);
		
		return new Status();
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/update")
	public Status update(String nodeId, String parentId, String editNodeName, HttpSession session){
		
		List<DTree> dataList = (List<DTree>) session.getAttribute("dataList");
		if(dataList == null) {
			dataList = DataUtil.listData();
		}
		
		for (DTree dTree : dataList) {
			if(nodeId.equals(dTree.getId())) {
				dTree.setTitle(editNodeName);
			}
		}
		
		session.setAttribute("dataList", dataList);
		
		return new Status();
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/delete")
	public Status delete(String nodeId, HttpSession session){
		
		List<DTree> dataList = (List<DTree>) session.getAttribute("dataList");
		if(dataList == null) {
			dataList = DataUtil.listData();
		}
		
		for (int i = 0; i < dataList.size(); i++) {
			DTree dTree = dataList.get(i);
			if(nodeId.equals(dTree.getId())){
				dataList.remove(i);
				break;
			}
		}
		
		session.setAttribute("dataList", dataList);
		
		return new Status();
	}
	
}
