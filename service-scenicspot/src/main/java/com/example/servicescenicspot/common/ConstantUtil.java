package com.example.servicescenicspot.common;

/**
 * @Author: liu.ly
 * @Date: 2019/3/7 16:15
 * @Description:
 */
public class ConstantUtil {


    public  static  final String DATE_FORMAT="yyyy-MM-dd HH24:mi:ss";
    public  static  final String USERID="99990000";



//    //--------------------------------课件-自定义属性--------------------------------------------------------------
//    //获取自定义属性列表
//    public static final  String GET_COURSEATTRIBUTELIST="getCourseAttributeList";
//    //删除自定义属性
//    public static final  String DEL_COURSEATTRIBUTE="delCourseAttribute";
//    //添加自定义属性
//    public static final  String ADD_COURSEATTRIBUTE="addCourseAttribute";
//    //更新自定义属性
//    public static final  String UPDATE_COURSEATTRIBUTE="updateCourseAttribute";
//    //查询指定自定义属性
//    public static final  String SELECT_COURSEATTRIBUTE="selectCourseAttribute";
//    //根据属性id获取课程列表
//    public static final  String GET_COURSELISTBYATTR="getCourseListByAttr";


//    //--------------------------------小助手-标签-------------------------------------------------------------
//    //获取标签列表
//    public static final  String GET_HELPER_LABLE_LIST="getHelperLableList";
//    //添加标签
//    public static final  String ADD_HELPER_LABLE="addHelperLable";
//    //更新标签
//    public static final  String UPDATE_HELPER_LABLE="updateHelperLable";
//    //删除标签
//    public static final  String DEl_HELPER_LABLE="delHelperLable";

//    //--------------------------------小助手-问题--------------------------------------------------------------
//    //获取问题列表
//    public static final  String GET_HELPER_QUESTION_LIST="getHelperQuestionList";
//    //添加问题
//    public static final  String ADD_HELPER_QUESTION="addHelperQuestion";
//    //更新问题
//    public static final  String UPDATE_HELPER_QUESTION="updateHelperQuestion";
//    //删除问题
//    public static final  String DEl_HELPER_QUESTION="delHelperQuestion";
//
//    //--------------------------------小助手-问题分类--------------------------------------------------------------
//    //获取问题列表
//    public static final  String GET_HELPER_QUESTION_ANSWER_TYPE_LIST="getHelperQuestionAnswerTypeList";
//    //添加问题
//    public static final  String ADD_HELPER_QUESTION_ANSWER_TYPE="addHelperQuestionAnswerType";
//    //更新问题
//    public static final  String UPDATE_HELPER_QUESTION_ANSWER_TYPE="updateHelperQuestionAnswerType";
//    //删除问题
//    public static final  String DEl_HELPER_QUESTION_ANSWER_TYPE="delHelperQuestionAnswerType";

    //-----------------------------------菜单-菜单管理------------------------------------------------------------------
    //新增菜单
    public static final String ADD_MENU="insertMenu";
    //更新菜单
    public static final String UPDATE_MENU="ModifyMenu";

    public static final String UPDATE_MENUTREE ="modifyMenuTree";
    //获取菜单
    public static final String GET_MENULIST="getMenuList";

    public static final String GET_MENU_LIST_BY_ID="getMenuListByID";

    public static final String GET_MENU_INFO_BY_ID="getMenuInfoByID";

    public static final String GET_MENU_BY_ROLEID="selectMenuByRoleId";

    public static final String GET_MENU_SECURITYINFO="getSecurityInfoAll";

    public static final String GET_MENU_BY_PARENTID= "selectMenuByParentId";

    public static final String SAVE_MENU_BY_ROLEID="saveMenuByRoleId";


    //--------------------------------角色管理-角色基本信息--------------------------------------------------------------
    //获取角色基本信息
    public static final  String GET_ROLE_BASE_MSG="getRole";
    //添加角色基本信息
    public static final  String ADD_ROLE_BASE_MSG="addRole";
    //更新角色基本信息
    public static final  String UPDATE_ROLE_BASE_MSG="updateRole";
    //删除角色基本信息
    public static final  String DELETE_ROLE_BASEMSG="deleteRole";
    //编码是否重复
    public static final  String CHECK_ROLE_CODE_BASEMSG="checkRoleCode";
    //名称是否重复
    public static final  String CHECK_ROLE_NAME_BASEMSG="checkRoleName";
    //判断该角色下是否有人员
    public static final  String IS_ROLE_USED="isRoleUsed";

    //根据角色id查属于该角色的用户信息
//    public static final  String SELECT_USER_BY_ID="selectUserByRoleId";
    //
//    public static final  String CHECK_USER_PASSWORD="vaildatorPassword";

//    public static final String UPDATE_USER_PASSWORD="editUserPassword";

//    public static final String GET_USER_AND_ROLES="getUserAndRoles";

//    public static final String DEL_USER_ROLES="delRoleforUser";


    //--------------------------------字典管理-字典基本信息--------------------------------------------------------------
    //获取字典基本信息
    public static final  String GET_Dictionary_BASE_MSG="getDictionaryInfo";
    //添加字典基本信息
    public static final  String ADD_Dictionary_BASE_MSG="addDictionary";
    //更新字典基本信息
    public static final  String UPDATE_Dictionary_BASE_MSG="updateDictionary";
    //删除字典基本信息
    public static final  String DELETE_Dictionary_BASEMSG="deleteDictionary";
    //下拉框选项大类
    public static final  String GETKIND_Dictionary_CODE_BASEMSG="getKindnameInfo";
    //添加大类
    public static final  String ADD_classDictionary_BASE_MSG="addclassDictionary";
    //判断大类名称是否重复
    public static final  String SelectNameDictionary_BASE_MSG="selectName";
    //判断id是否重复
    public static final  String SelectIdDictionary_BASE_MSG="selectId";
    //判断大类code编码是否重复
    public static final  String SelectCodeDictionary_BASE_MSG="selectCode";
    //判断名称是否重复
    public static final  String SelectName1Dictionary_BASE_MSG="selectName1";
    //判断code编码是否重复
    public static final  String SelectCode1Dictionary_BASE_MSG="selectCode1";


//
//    //--------------------------------热门活动--------------------------------------------------------------
//    //获取热门活动列表
//    public static final  String GET_HOTEVENTSLIST="getHotEventsList";
//    //新增热门活动
//    public static final  String ADD_HOTEVENTS="addHotEvents";
//    //更新热门活动
//    public static final  String UPDATE_HOTEVENTS="updateHotEvents";
//
//    //----------------------------------统计-----------------------------------------------------------------------------
//    //分行活跃度
//    public static final  String GET_BRANCHACTIVITY="getBranchActivity";
//    //点击量详情
//    public static final  String GET_CLICKDETAIL="getClickDetail";
//    //首页数据
//    public static final  String GET_HOMEINFO="getHomeInfo";
//    //登录明细
//    public static final  String GET_LOGINUSER="getLoginUser";
//    //Redis同步情况
//    public static final  String GET_REDISREFRESH="getRedisRefresh";
//    //用户明细
//    public static final  String GET_USERACTIVITY="getUserActivity";

    //--------------------------------人员管理-人员基本信息--------------------------------------------------------------


    //获取本机构下所有人员基本信息
    public static final  String GET_STAFF_BY_ID="getStaffById";
    //获取本机构下所有人员总数
    public static final  String GET_STAFF_SUM="getStaffSum";
    //添加人员信息
    public static final  String INSERT_STAFF="insertStaff";
    //根据名字获取人员基本信息
    public static final  String SELECT_BY_NAME="selectByName";
    //停用人员
    public static final  String DELETE_STAFF_INFO="deleteStaffInfo";
    //获取角色下拉框
    public static final  String SELECT_ROLE="selectRole";
    //获取学历或者类型下拉框
    public static final  String SELECT_EDUCATION_OR_TYPE="selectEducationOrType";
    //判断人员编号是否存在
    public static final  String IS_STAFFID_EXISTED="isStaffIdExisted";
    //判断人员登录名是否存在
    public static final  String IS_LOGINNAME_EXISTED="isStaffLoginNameExisted";
    //获取人员学历
    public static final  String SELECT_USER_EDUCATION="selectUserEdu";
    //获取人员部门经历
    public static final  String SELECT_USER_DEPARTMENT="selectUserDepart";
    //获取人员角色ID
    public static final  String SELECT_USER_ROLE_ID="selectUserRoleId";
    //获取人员角色NAME
    public static final  String SELECT_USER_ROLE_NAME="selectUserRoleName";
    //更新人员信息
    public static final  String UPDATE_STAFF="updateStaff";
    //人员excel上传之前 校验表格是否为空
    public static final String IMPORT_STAFF_BEFORE="importStaffBefore";
    //解析Excel并导入的文件信息
    public static final String INSERT_FILE_IMPORT="insertFileImport";
    //数据回显
    public static final String SHOW_STAFF_DATA="showStaffData";
    //导入User表
    public static final String INSERT_USER_DATA="insertUserData";
    //判断临时表ErrorMsg是否为空
    public static final String IS_EMPTY_ERRORMSG="isEmptyErrorMsg";
    //errorMsg
    public static final String SELECT_ERROR_MSG="selectErrorMsg";

    //--------------------------------部门管理--------------------------------------------------------------
    //根据机构Id获取该机构信息
    public static final String GET_DEPT_INFO_BY_DEPTID = "getDeptInfoByDeptId";
    //根据机构Id获取其下级机构列表
    public static final String GET_SUB_DEPTS_BY_DEPTID = "getSubDeptsByDeptId";
    //判断前端传入的部门机构Code是否重复
    public static final String IS_DEPT_CODE_EXISTED = "isDeptCodeExisted";
    //新增机构信息
    public static final String ADD_DEPT_INFO = "addDeptInfo";
    //修改机构信息
    public static final String EDIT_DEPT_INFO = "editDeptInfo";
    //获取下拉框类型的机构树
    public static final String GET_DEPT_TREE_BY_PARENTID = "getDeptTreeByParentId";

    //--------------------------------日志信息--------------------------------------------------------------
    public static final String GET_LOG_INFO_NUM = "getLoginfoNum";
    public static final String GET_LOG_INFO_LIST = "getLoginfoList";
    public static final String GET_LOG_INFO = "getLogInfo";
    public static final String GET_LOG_CHARTS = "getLogCharts";
    public static final String GET_LINE_CHART_COUNT = "getLineChartCount";
}
