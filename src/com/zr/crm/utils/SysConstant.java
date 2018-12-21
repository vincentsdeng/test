package com.zr.crm.utils;


/**
 * 常量定义�? 
 * @date 2014-9-1
 */

public class SysConstant {
	public static final int SPORT_FOOTBALL_ID=1;//体育系统足球id
	
	public static final double MULTIBET_DOWN_RATIO=0.01;//综合过关大小，让球赔率降�?
	public static final int MULTIBET_MAX_BET = 10000;//综合过关�?大单�?
	public static final int MULTIBET_MIN_BET = 5;//综合过关�?小单�?
	
	public static final int MAX_BET_MINAMT = 200;//�?高投注上限最低金�?
	
	//---------------查找赛事时，�?带赛事状�?--------------------
	public static final int FIND_MATCH_COMMON = 1;//单式
	public static final int FIND_MATCH_LIVE = 2;//滚球
	public static final int FIND_MATCH_EARLY = 3;//早餐
	
    //public static final double INVALID_ODD = 0;//无效赔率标识
    
    public static final int MATCH_TIMEOUT = 3;//赛事过期时间,单位：小时（从开赛时间往后延迟MATCH_TIMEOUT小时�?
    
    /** 数据字典状�?�定�? */
    public static final int DICT_STATUS_Y = 1;// 已启�?
    public static final int DICT_STATUS_N = 2;// 已停�?

    /**
	 * 时间格式-赛事信息
	 */
	public static final String DATEFROMAT_MATCHINFO = "yyyy-MM-dd HH:mm:ss";
	
	//----------------�?盘游戏赛事状�?--------------
	public static final int MATCH_ACTIVE_YES = 1;//滚球
	public static final int MATCH_ACTIVE_NO = 0;//单式
	
	public static final int GAME_DATERANGE_FULL = 1;//全场
	public static final int GAME_DATERANGE_HALF = 2;//半场

    //----------------赛事状�??------------------
	
    /**
     * 赛事状�?�不限制
     */
    public static final int MATCH_STATUS_ALL = -1;

    /** 删除 */
    public static final int MATCH_STATUS_DEL = 0;

    /** 新建 */
    public static final int MATCH_STATUS_CREATE = 1;

    /** 准备 */
    public static final int MATCH_STATUS_READY = 2;

    /** 普�?�盘交易 */
    public static final int MATCH_STATUS_COMMON = 3;

    /** 滚球盘交�? */
    public static final int MATCH_STATUS_ROLLING = 4;

    /** 交易已停�? */
    public static final int MATCH_STATUS_STOP = 5;

    /** 结束 */
    public static final int MATCH_STATUS_FINISH = 6;
    

    /** 参与对象是主�? */
    public static final int MATCH_ATTENDER_IS_HOST_FLAG = 1;

    /** 参与对象不是主场 */
    public static final int MATCH_ATTENDER_IS_NOT_HOST_FLAG = 0;
    

    // -------------盘中信息相关------------------------
 	public static final int MATCHREALINFO_STATUS_ENABLE = 1;
 	/**
 	 * 盘中信息-信息类别-进球
 	 */
 	public static final int MATCHREALINFO_INFOTYPE_POT = 1;
 	/**
 	 * 盘中信息-角球
 	 */
 	public static final int MATCHREALINFO_INFOTYPE_CORNER = 2;
 	/**
 	 * 盘中信息-红牌
 	 */
 	public static final int MATCHREALINFO_INFOTYPE_RED = 3;
 	/**
 	 * 上半场结�?
 	 */
 	public static final int MATCHREALINFO_INFOTYPE_HALFOVER = 6;
 	/**
 	 * 盘中信息-信息类别-下半场开�?
 	 */
 	public static final int MATCHREALINFO_INFOTYPE_SECONDHALF = 7;
 	/**
 	 * 全场结束
 	 */
 	public static final int MATCHREALINFO_INFOTYPE_FULLOVER = 8;
 	
 	
 	//---------------滚球赛事安全/危险状�??--------------------
 	/**
 	 * 滚球赛事进攻状�?�：未知
 	 */
 	public static final int ACTIVE_MATCH_ATTACK_NUKNOW = 0;
 	/**
 	 * 滚球赛事进攻状�?�：安全
 	 */
 	public static final int ACTIVE_MATCH_ATTACK_NO = 1;
 	/**
 	 * 滚球赛事进攻状�?�：危险
 	 */
 	public static final int ACTIVE_MATCH_ATTACK_YES = 2;
 	
 	
    //---------------------游戏信息--------------------------------
    public static final int GAME_STATUS_WAITING = 5;
    /**
	 * 游戏-状�??-�?盘中
	 */
	public static final int GAME_STATUS_OPENING = 7;

	/**
	 * 游戏-状�??-暂停�?
	 */
	public static final int GAME_STATUS_SUSPEND = 8;
	
	/**
	 * 游戏-状�??-已收�?
	 */
	public static final int GAME_STATUS_CLOSEING = 10;
	
	/**
	 * 游戏-状�??-已停�?
	 */
	public static final int GAME_STATUS_STOPED = 12;
	/**
	 * 游戏-状�??-已结�?
	 */
	public static final int GAME_STATUS_OVER = 17;
	
    
    //--------------------- 玩法类型 ----------------------------
	/*public enum PlayType{
        N1X2(1),ALLOW(2),BIGSMALL(3),ONETWO(4),TOTALGOAL(5),DOUBLECHANGE(6),FULLHALF(7),SCORE(8);
        private int nCode;
        private PlayType(int _nCode) {
            this.nCode = _nCode;
        }
        @Override
        public String toString() {
            return String.valueOf(this.nCode);
        }        
	}*/
    /**
     * 标准�?
     */
    public static final int PLAY_TYPE_1X2 = 1;
    /**
     * 让球
     */
    public static final int PLAY_TYPE_ALLOW = 2;
    /**
     * 大小
     */
    public static final int PLAY_TYPE_BIGSMALL = 3;
    /**
     * 单双
     */
    public static final int PLAY_TYPE_ONETWO = 4;
    
    /**
     * 总进�?
     */
    public static final int PLAY_TYPE_TOTALGOAL = 5;
    
    /**
     * 双重机会
     */
    public static final int PLAY_TYPE_DOUBLECHANGE = 6;
    
    /**
     * 半全�?
     */
    public static final int PLAY_TYPE_FULLHALF = 7;
    
    /**
     * 波胆
     */
    public static final int PLAY_TYPE_SCORE = 8;
        
    /**
     * 综合过关
     */
    public static final int PLAY_TYPE_MULTIBET = 10;

    /**
	 * 用户Session
	 */
	public static final String USER_SESSION = "USER_SESSION";	
	/**
	 * 用户语言
	 */
	public static final String SESSION_USER_LANGUAGE = "WW_TRANS_I18N_LOCALE";
	//--------------------用户类型(信用/现金)---------------------------
	/**
	 * 用户类型：信用用�?
	 */
	public static final int USER_TYPE_CREDIT = 1;
	/**
	 * 用户类型：现金用�?
	 */
	public static final int USER_TYPE_CASH = 2;
	
	//-------------------用户模式---------------------------
	/**
	 * 利记模式用户
	 */
	public static final int USER_MODE_SBO = 1;
	/**
	 * 皇冠模式用户
	 */
	public static final int USER_MODE_HG = 2;
	//-------------------用户组，不同用户组对应不同组赔率-----------------
	public static final String USER_GROUP_A = "A"; 
	public static final String USER_GROUP_B = "B";
	public static final String USER_GROUP_C = "C";
	public static final String USER_GROUP_D = "D";
	
	//------------------用户状�??-----------------------------------
	/**
	 * 正常
	 */
	public static final int USER_STATUS_NORMAL = 1;
	/**
	 * 暂停
	 */
	public static final int USER_STATUS_PAUSE = 2;
	/**
	 * 删除
	 */
	public static final int USER_STATUS_DEL = 3;
	
	/**
	 * 数据同步分隔符▲
	 */
	public static final String SYNC_SIGN = "�?";
	/**
	 * 新增标识
	 */
	public static final char SYNC_ADD = '1';
	/**
	 * 更新标识
	 */
	public static final char SYNC_UPD = '2';
	/**
	 * 删除标识
	 */
	public static final char SYNC_DEL = '3';
	/**
	 * 没有对应表的信息�?
	 */
	public static final char SYNC_OTHER = '4';
	
//-------------------下注状�??--------------------------
	/**
	 * 下注状�?�：成功
	 */
	public static final int BET_STATUS_SUCCESS = 1;
	/**
	 * 下注状�?�：失败
	 */
	public static final int BET_STATUS_FAIL = 0;
	
	
//-------------------下注参数---------------------------
	/**
	 * 赔率不自适应
	 */
	public static final int BET_PARAM_RATIO_ADAPTION_NO = 0;
	/**
	 * 赔率自�?�应
	 */
	public static final int BET_PARAM_RATIO_ADAPTION_YES = 1;
	
	
//-------------------注单状�??---------------------------
	/**
	 * 注单状�?�：已确�?
	 */
	public static final int ORDER_STATUS_ACCEPT = 1;
	/**
	 * 注单状�?�：危险待确�?
	 */
	public static final int ORDER_STATUS_WAITING = 2;
	
	/**
	 * 注单状�??:已结�?
	 */
	public static final int ORDER_STATUS_SETTLED = 5;
	
	/**
	 * 注单状�?�：作废
	 */
	public static final int ORDER_STATUS_CANCEL = 8;
	

	//---------------市场类型-------------------------------
	/**
	 * 香港�?
	 */
	public static final int MARKET_TYPE_HK = 1;
	/**
	 * 印尼�?
	 */
	public static final int MARKET_TYPE_ID = 2;
	/**
	 * 马来�?
	 */
	public static final int MARKET_TYPE_MY = 3;
	/**
	 * 欧盘
	 */
	public static final int MARKET_TYPE_EU = 4;
	
	
	//-------------------注单作废原因-----------------------
	/**
	 * 进球取消
	 */
	public static final int ORDER_CANCEL_POT = 1;
	/**
	 * 红牌取消
	 */
	public static final int ORDER_CANCEL_RED = 2;
	/**
	 * 赔率出错取消
	 */
	public static final int ORDER_CANCEL_RATIOERR = 3;	
	
	/**
	 * 赛事腰斩
	 */
	public static final int ORDER_CANCEL_MATCHSTOP = 4;
	
	/**
	 * 赛事延期
	 */
	public static final int ORDER_CANCEL_MATCHDELAY = 8;
	
	/**
	 * 非正常投�?
	 */
	public static final int ORDER_CANCEL_NONORMAL = 5;
	
	/**
	 * 取消(其他原因)
	 */
	public static final int ORDER_CANCEL_OTHER = 6;
	
	
	
	
//-------------------投注失败错误�?---------------------------
	
	/**
	 * 赛事停止接受投注
	 */
	public static final int BET_ERR_MATCH_STOPBET = 1000;
	
	/**
	 * 赔率已变�?
	 */
	public static final int BET_ERR_RATIOCHANGE = 1001;
	
	/**
	 * 小于�?小投注额
	 */
	public static final int BET_ERR_DOWN_MINAMT = 1002;
	
	/**
	 * 大于�?大投注额
	 */
	public static final int BET_ERR_OVER_MAXAMT = 1003;
	
	/**
	 * 余额不足
	 */
	public static final int BET_ERR_CREDIT_NOT_ENOUGH = 1004;
	
	/**
	 * 超出上线受注总额(爆股�?)
	 */
	public static final int BET_ERR_OVER_HIGHER_TOTALAMT = 1005;
	
	/**
	 * 帐户已停�?
	 */
	public static final int BET_ERR_ACCOUNT_STOP = 1006;
	/**
	 * 盘口已关�?
	 */
	public static final int BET_ERR_GAME_CLOSE = 1007;
	
	/**
	 * 超出赛事总投注额
	 */
	public static final int BET_ERR_OVER_MATCH_TOTALAMT = 1008;
	
	/**
	 * 超出玩法总投注额
	 */
	public static final int BET_ERR_OVER_PLAY_TOTALAMT = 1011;
	
	/**
	 * 投注参数错误(0赔率�?)
	 */
	public static final int BET_ERR_INVALID_PARAM = 1009;
	/**
	 * 投注系统出错
	 */
	public static final int BET_ERR_SYSTEMERR = 1010;
	
	/**
	 * 投注出错，赛事已经转滚，请移置滚球下�?
	 */
	public static final int BET_ERR_MATCH_LIVING = 1012;
	
	//---------不同盘口对应的数组的索引�?---------------
	/*public enum Allow{
		HOME,GUEST		
	}*/
	public static final int ARRAY_INDEX_ALLOW_HOME=0;
	public static final int ARRAY_INDEX_ALLOW_AWAY=1;	
	
	/*public enum BigSmall{
		OVER,UNDER
	}*/
	public static final int ARRAY_INDEX_BIGSMALL_OVER=0;
	public static final int ARRAY_INDEX_BIGSMALL_UNDER=1;
	
	/*public enum ONETWO{
		ODD,ENEN
	}*/
	public static final int ARRAY_INDEX_ONETWO_ODD=0;
	public static final int ARRAY_INDEX_ONETWO_EVEN=1;
	
	/*public enum Normal{
		HOME,GUEST,DRAW
	}*/
	public static final int ARRAY_INDEX_1X2_HOME=0;
	public static final int ARRAY_INDEX_1X2_AWAY=1;
	public static final int ARRAY_INDEX_1X2_DRAW=2;
	
	/*public enum TotalGogal{
		G01,G23,G46,GOVER7
	}*/
	public static final int ARRAY_INDEX_TOTALGOAL_01=0;
	public static final int ARRAY_INDEX_TOTALGOAL_23=1;
	public static final int ARRAY_INDEX_TOTALGOAL_46=2;
	public static final int ARRAY_INDEX_TOTALGOAL_OVER7=3;
	
	/*public enum DoubleChange{
		W1X,W12,WX2
	}*/
	public static final int ARRAY_INDEX_DOUBLECHANGE_1X = 0;
	public static final int ARRAY_INDEX_DOUBLECHANGE_12 = 1;
	public static final int ARRAY_INDEX_DOUBLECHANGE_X2 = 2;
	
	/*public enum FullHalf{
		HH,HD,HG,DH,DD,DG,GH,GD,GG
	}*/
	public static final int ARRAY_INDEX_FULLHALF_HH=0;//主主
	public static final int ARRAY_INDEX_FULLHALF_HD=1;//主和
	public static final int ARRAY_INDEX_FULLHALF_HA=2;//主客
	public static final int ARRAY_INDEX_FULLHALF_DH=3;//和主
	public static final int ARRAY_INDEX_FULLHALF_DD=4;//和和
	public static final int ARRAY_INDEX_FULLHALF_DA=5;//和客
	public static final int ARRAY_INDEX_FULLHALF_AH=6;//客主
	public static final int ARRAY_INDEX_FULLHALF_AD=7;//客和
	public static final int ARRAY_INDEX_FULLHALF_AA=8;//客客
	
	/*public enum FullScore{
        S00,S01,S02,S03,S04,S10,S11,S12,S13,S14,S20,S21,S22,S23,S24,S30,S31,S32,S33,S34,S40,S41,S42,S43,S44,SOTHER        
    }*/
	public static final int array_index_FULL_SCORE_00=0;
	public static final int array_index_FULL_SCORE_01=1;
	public static final int array_index_FULL_SCORE_02=2;
	public static final int array_index_FULL_SCORE_03=3;
	public static final int array_index_FULL_SCORE_04=4;
	public static final int array_index_FULL_SCORE_10=5;
	public static final int array_index_FULL_SCORE_11=6;
	public static final int array_index_FULL_SCORE_12=7;
	public static final int array_index_FULL_SCORE_13=8;
	public static final int array_index_FULL_SCORE_14=9;
	public static final int array_index_FULL_SCORE_20=10;
	public static final int array_index_FULL_SCORE_21=11;
	public static final int array_index_FULL_SCORE_22=12;
	public static final int array_index_FULL_SCORE_23=13;
	public static final int array_index_FULL_SCORE_24=14;
	public static final int array_index_FULL_SCORE_30=15;
	public static final int array_index_FULL_SCORE_31=16;
	public static final int array_index_FULL_SCORE_32=17;
	public static final int array_index_FULL_SCORE_33=18;
	public static final int array_index_FULL_SCORE_34=19;
	public static final int array_index_FULL_SCORE_40=20;
	public static final int array_index_FULL_SCORE_41=21;
	public static final int array_index_FULL_SCORE_42=22;
	public static final int array_index_FULL_SCORE_43=23;
	public static final int array_index_FULL_SCORE_44=24;
	public static final int ARRAY_INDEX_FULL_SCORE_OTHER=25;
	
	public static final int array_index_HALF_SCORE_00=0;
	public static final int array_index_HALF_SCORE_01=1;
	public static final int array_index_HALF_SCORE_02=2;
	public static final int array_index_HALF_SCORE_03=3;	
	public static final int array_index_HALF_SCORE_10=4;
	public static final int array_index_HALF_SCORE_11=5;
	public static final int array_index_HALF_SCORE_12=6;
	public static final int array_index_HALF_SCORE_13=7;	
	public static final int array_index_HALF_SCORE_20=8;
	public static final int array_index_HALF_SCORE_21=9;
	public static final int array_index_HALF_SCORE_22=10;
	public static final int array_index_HALF_SCORE_23=11;	
	public static final int array_index_HALF_SCORE_30=12;
	public static final int array_index_HALF_SCORE_31=13;
	public static final int array_index_HALF_SCORE_32=14;
	public static final int array_index_HALF_SCORE_33=15;
	public static final int ARRAY_INDEX_HALF_SCORE_OTHER=16;
	
//------------------------------操作日志------------------------------
	public static final int OPLOG_RECORD =  1;//注单操作模块
	public static final int OPLOG_MATCH = 2;//赛事模块
	public static final int OPLOG_SYSTEM = 3;//系统设置模块
	
	/**
	 * 流水操作类型
	 */
	public static final int DEPOSIT_ORDER_BET=100;//投注
	public static final int DEPOSIT_ORDER_SETTLED=101;//结算
	public static final int DEPOSIT_ORDER_CANCEL=102;//取消注单
	public static final int DEPOSIT_ORDER_RECOVERY=103;//恢复注单
	public static final int DEPOSIT_ORDER_CANCEL_SETTLED=104;//取消结算
	public static final int DEPOSIT_ORDER_RE_SETTLED=105;//重结�?
}
