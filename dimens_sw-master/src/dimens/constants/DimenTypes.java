package dimens.constants;


public enum DimenTypes {

    //适配Android 3.2以上   大部分手机的sw值集中在  300-460之间
	 DP_sw__300(300),  // values-sw300
	 DP_sw__310(310),
	 DP_sw__320(320),
     DP_sw__330(330),
	 DP_sw__360(360),
	 DP_sw__380(380),
	 DP_sw__400(400),
	 DP_sw__420(420),
	 DP_sw__430(430),
	 DP_sw__440(440),
	 DP_sw__460(460),
	 DP_sw__480(480),
	 DP_sw__500(500),
	 DP_sw__600(600);
    // 想生成多少自己以此类推
  

    /**
     * 屏幕最小宽度
     */
    private int swWidthDp;




    DimenTypes(int swWidthDp) {

        this.swWidthDp = swWidthDp;
    }

    public int getSwWidthDp() {
        return swWidthDp;
    }

    public void setSwWidthDp(int swWidthDp) {
        this.swWidthDp = swWidthDp;
    }

}
