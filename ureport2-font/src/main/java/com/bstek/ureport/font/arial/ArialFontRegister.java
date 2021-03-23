package com.bstek.ureport.font.arial;

import com.bstek.ureport.export.pdf.font.FontRegister;
import com.bstek.ureport.utils.OSUtil;


/**
 * @author Jacky.gao
 * @since 2014年5月7日
 */
public class ArialFontRegister implements FontRegister {

	public String getFontName() {
		return "Arial";
	}

	public String getFontPath() {
		if (OSUtil.isWindowsOs()) {
			return "com/bstek/ureport/font/fangsong/SIMFANG.TTF";
		}
		return "/home/somp/fonts/ARIAL.TTF";
	}
}
