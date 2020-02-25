package com.wisdomelon.util;

import com.wisdomelon.dtree.DTree;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

	/***
	 * 创建假数据
	 * @return
	 */
	public static List<DTree> tempData(){
		List<DTree> root = new ArrayList<>();
		root.add(hunanHasChild());
		root.add(hubeiHasChild());
		root.add(guangzhouHasChild());
		root.add(zhejiangHasChild());
		root.add(fujianHasChild());
		return root;
	}
	
	
	public static DTree hunanHasChild(){
		DTree DTree1 = new DTree("001", "0", "湖南省", false);
		DTree1.setChildren(hunanChild());
		return DTree1;
	}
	
	public static List<DTree> hunanChild(){
		List<DTree> children1 = new ArrayList<>();
		children1.add(new DTree("001001", "001", "长沙市", true));
		children1.add(new DTree("001002", "001", "株洲市", true));
		children1.add(new DTree("001003", "001", "湘潭市", true));
		children1.add(new DTree("001004", "001", "衡阳市", true));
		children1.add(new DTree("001005", "001", "郴州市", true));
		return children1;
	}
	
	public static DTree hubeiHasChild(){
		DTree DTree2 = new DTree("002", "0", "湖北省", false);
		DTree2.setChildren(hubeiChild());
		return DTree2;
		
	}
	
	public static List<DTree> hubeiChild(){
		List<DTree> children1 = new ArrayList<>();
		children1.add(new DTree("002001", "002", "武汉市", true));
		children1.add(new DTree("002002", "002", "黄冈市", true));
		children1.add(new DTree("002003", "002", "潜江市", true));
		children1.add(new DTree("002004", "002", "荆州市", true));
		children1.add(new DTree("002005", "002", "襄阳市", true));
		return children1;
	}
	
	public static DTree guangzhouHasChild(){
		DTree DTree3 = new DTree("003", "0", "广东省", false);
		DTree3.setChildren(guangdongChild());
		return DTree3;
		
	}

	public static List<DTree> guangdongChild(){
		List<DTree> children1 = new ArrayList<>();
		DTree dTree = new DTree("003001", "003", "广州市", false);
		dTree.setChildren(guangzhouChild());
		children1.add(dTree);
		children1.add(new DTree("003002", "003", "深圳市", true));
		children1.add(new DTree("003003", "003", "东莞市", true));
		children1.add(new DTree("003004", "003", "珠海市", true));
		children1.add(new DTree("003005", "003", "韶关市", true));
		return children1;
	}
	
	public static List<DTree> guangzhouChild(){
		List<DTree> children1 = new ArrayList<>();
		children1.add(new DTree("003001001", "003001", "天河市", true));
		children1.add(new DTree("003001002", "003001", "花都市", true));
		return children1;
	}
	
	public static DTree zhejiangHasChild(){
		DTree DTree4 = new DTree("004", "0", "浙江省", false);
		DTree4.setChildren(zhejiangChild());
		return DTree4;
	}

	public static List<DTree> zhejiangChild(){
		List<DTree> children1 = new ArrayList<>();
		children1.add(new DTree("004001", "004", "杭州市", true));
		children1.add(new DTree("004002", "004", "温州市", true));
		children1.add(new DTree("004003", "004", "韶关市", true));
		children1.add(new DTree("004004", "004", "金华市", true));
		children1.add(new DTree("004005", "004", "义乌市", true));
		return children1;
	}
	
	public static DTree fujianHasChild(){
		DTree DTree5 = new DTree("005", "0", "福建省", false);
		DTree5.setChildren(fujianChild());
		return DTree5;
	}
	
	public static List<DTree> fujianChild(){
		List<DTree> children1 = new ArrayList<>();
		children1.add(new DTree("005001", "005", "厦门市", true));
		return children1;
	}
	
	
	public static List<DTree> tempDataLitter(){
		List<DTree> root = new ArrayList<>();
		root.add(new DTree("001", "0", "湖南省", false));
		root.add(new DTree("002", "0", "湖北省", false));
		root.add(new DTree("003", "0", "广东省", false));
		root.add(new DTree("004", "0", "浙江省", false));
		root.add(new DTree("005", "0", "福建省", false));
		return root;
	}
	
	public static List<DTree> listData(){
		List<DTree> children1 = new ArrayList<>();
		children1.add(new DTree("001", "0", "湖南省", false));
		children1.add(new DTree("002", "0", "湖北省", false));
		children1.add(new DTree("003", "0", "广东省", false));
		children1.add(new DTree("004", "0", "浙江省", false));
		children1.add(new DTree("005", "0", "福建省", false));
		children1.add(new DTree("001001", "001", "长沙市", true));
		children1.add(new DTree("001002", "001", "株洲市", true));
		children1.add(new DTree("001003", "001", "湘潭市", true));
		children1.add(new DTree("001004", "001", "衡阳市", true));
		children1.add(new DTree("001005", "001", "郴州市", true));
		children1.add(new DTree("002001", "002", "武汉市", true));
		children1.add(new DTree("002002", "002", "黄冈市", true));
		children1.add(new DTree("002003", "002", "潜江市", true));
		children1.add(new DTree("002004", "002", "荆州市", true));
		children1.add(new DTree("002005", "002", "襄阳市", true));
		children1.add(new DTree("003001", "003", "广州市", false));
		children1.add(new DTree("003002", "003", "深圳市", true));
		children1.add(new DTree("003003", "003", "东莞市", true));
		children1.add(new DTree("003004", "003", "珠海市", true));
		children1.add(new DTree("003005", "003", "韶关市", true));
		children1.add(new DTree("003001001", "003001", "天河市", true));
		children1.add(new DTree("003001002", "003001", "花都市", true));
		children1.add(new DTree("004001", "004", "杭州市", true));
		children1.add(new DTree("004002", "004", "温州市", true));
		children1.add(new DTree("004003", "004", "韶关市", true));
		children1.add(new DTree("004004", "004", "金华市", true));
		children1.add(new DTree("004005", "004", "义乌市", true));
		children1.add(new DTree("005001", "005", "厦门市", true));
		return children1;
	}
	
	public static List<DTree> tempData(List<DTree> listData){
		List<DTree> root = new ArrayList<>();
		root.add(hunanHasChild());
		root.add(hubeiHasChild());
		root.add(guangzhouHasChild());
		root.add(zhejiangHasChild());
		root.add(fujianHasChild());
		return root;
	}
	
	
}
