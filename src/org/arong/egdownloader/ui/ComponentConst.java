package org.arong.egdownloader.ui;

import java.util.HashMap;
import java.util.Map;

import org.arong.egdownloader.version.Version;

/**
 * 定义各个window的title值<br>
 * 定义用于在监听器中标识swing组件对象的name值<br>
 * 定义各个组件的text值<br>
 * @author 阿荣
 * @since 2013-8-18
 *
 */
public final class ComponentConst {
	public final static int CLIENT_WIDTH = 1024;//主窗口宽
	
	public final static int CLIENT_HEIGHT = 480;//主窗口高
	
	public final static int MARGIN_X = 32;//组件之间水平相隔
	
	public final static int MARGIN_y = 32;//组件之间垂直间隔
	
	public final static String DATA_PATH = "data";//数据目录
	
	public final static String SETTING_DATA_PATH = DATA_PATH + "/setting.db";//配置文件保存路径
	
	public final static String TASK_DATA_PATH = DATA_PATH + "/task.db";//任务数据保存路径
	
	public final static String PICTURE_DATA_PATH = DATA_PATH + "/picture.db";//图片数据保存路径
	
	public final static String SETTING_XML_DATA_PATH = DATA_PATH + "/setting.xml";//配置文件保存路径
	
	public final static String TASK_XML_DATA_PATH = DATA_PATH + "/task.xml";//任务数据保存路径
	
	public final static String PICTURE_XML_DATA_PATH = DATA_PATH + "/picture.xml";//图片数据保存路径
	
	public final static String RESOURCES_PATH = "/resources/";
	
	public final static String ICON_PATH = RESOURCES_PATH + "icon/";
	
	public final static String[] TASK_TABLE_HEADER = {"", "名称", "数目(P)", "语言", "类别", "已下载", "状态"};
	
	public final static String[] PICTURE_TABLE_HEADER = {"序号", "名称", "大小", "状态", "地址", "下载时间"};
	
	public final static int MAX_TASK_PAGE = 14;//一页显示任务数
	
	public final static int SKIN_NUM = 1;//皮肤编号
	
	public final static Map<String, String> SKIN_ICON = new HashMap<String, String>();
	
	static{
		SKIN_ICON.put("add", "_add.png");
		SKIN_ICON.put("delete", "_delete.png");
		SKIN_ICON.put("setting", "_setting.png");
		SKIN_ICON.put("download", "_download.png");
		SKIN_ICON.put("select", "_select.png");
		SKIN_ICON.put("folder", "_folder.png");
		SKIN_ICON.put("size", "_size.png");
		SKIN_ICON.put("tool", "_tool.png");
		SKIN_ICON.put("picture", "_picture.png");
		SKIN_ICON.put("user", "_user.png");
		SKIN_ICON.put("empty", "_empty.png");
		SKIN_ICON.put("save", "_save.png");
		SKIN_ICON.put("opera", "_opera.png");
		SKIN_ICON.put("detail", "_detail.png");
		SKIN_ICON.put("copy", "_copy.png");
		SKIN_ICON.put("browse", "_browse.png");
		SKIN_ICON.put("check", "_check.png");
		SKIN_ICON.put("change", "_change.png");
		SKIN_ICON.put("reset", "_reset.png");
		SKIN_ICON.put("ok", "_ok.png");
	}
	/*MainWindow内的组件*/
	//组件的name值
	
	
	//组件的text值
	
	
	/*公共的*/
	public final static String QUERY_BUTTON_TEXT = "查询";
	/*MainWindow内的组件*/
	//组件的name值
	public final static String SETTING_MENU_NAME = "settingMenu";
	public final static String TOOLS_MENU_NAME = "toolsMenu";
	public final static String ABOUT_MENU_NAME = "aboutMenu";
	public final static String DECODE_AND_ENCODE_MENUITEM_NAME = "docodeAndEncodeMenuItem";
	
	//组件的text值
	public final static String ADD_MENU_TEXT = "新建";
	public final static String START_MENU_TEXT = "开始";
	public final static String STOP_MENU_TEXT = "暂停";
	public final static String DELETE_MENU_TEXT = "删除";
	public final static String SETTING_MENU_TEXT = "配置";
	public final static String OPERA_MENU_TEXT = "操作";
	public final static String SEARCH_MENU_TEXT = "搜索";
	public final static String CONSOLE_MENU_TEXT = "控制台";
	public final static String ABOUT_MENU_TEXT = "关于";
	public final static String DECODE_AND_ENCODE_TAB_TEXT = "加密/解密";
	
	public final static String POPUP_START_MENU_TEXT = "开始任务   ";
	public final static String POPUP_STOP_MENU_TEXT = "暂停任务   ";
	public final static String POPUP_DETAIL_MENU_TEXT = "详细信息   ";
	public final static String POPUP_COPYURL_MENU_TEXT = "复制地址   ";
	public final static String POPUP_OPENFOLDER_MENU_TEXT = "打开文件夹   ";
	public final static String POPUP_OPENWEBPAGE_MENU_TEXT = "浏览下载页   ";
	public final static String POPUP_DOWNLOADCOVER_MENU_TEXT = "下载封面   ";
	public final static String POPUP_CHECKRESET_MENU_TEXT = "查漏补缺   ";
	public final static String POPUP_CHANGEREADED_MENU_TEXT = "更改状态   ";
	public final static String POPUP_EDIT_MENU_TEXT = "编辑任务   ";
	public final static String POPUP_RESET_MENU_TEXT = "重置任务   ";
	public final static String POPUP_COMPLETED_MENU_TEXT = "完成任务   ";
	
	
	/*AboutMenuWindow内的组件*/
	public final static String ABOUT_TEXTPANE_TEXT ="<h3>" + Version.NAME +
			"</h3>作&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;者：<b>" +
			Version.AUTHOR + "</b><br>版&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;本：<b>" +
			Version.VERSION +"</b><br>更新时间：<b>" + Version.MODIFLIED +
			"</b><br>项目地址：https://github.com/dipoo/egdownloader" + 
			"<br/><font color='blue'>有任何问题，请到项目托管地址发issue。</font>";
	
}
