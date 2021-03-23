package com.bstek.ureport.font.couriernew;

import com.bstek.ureport.export.pdf.font.FontRegister;
import com.bstek.ureport.utils.OSUtil;

/**
 * @author Jacky.gao
 * @since 2014年5月7日
 */
public class CourierNewFontRegister implements FontRegister {

	public String getFontName() {
		return "Courier New";
	}

	public String getFontPath() {
		if (OSUtil.isWindowsOs()) {
			return "com/bstek/ureport/font/fangsong/SIMFANG.TTF";
		}
		return "/home/somp/fonts/COUR.TTF";
	}
}
