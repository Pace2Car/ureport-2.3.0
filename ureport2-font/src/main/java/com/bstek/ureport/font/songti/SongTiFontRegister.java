package com.bstek.ureport.font.songti;

import com.bstek.ureport.export.pdf.font.FontRegister;
import com.bstek.ureport.utils.OSUtil;

/**
 * @author Jacky.gao
 * @since 2014年5月7日
 */
public class SongTiFontRegister implements FontRegister {

	public String getFontName() {
		return "宋体";
	}

	public String getFontPath() {
		if (OSUtil.isWindowsOs()) {
			return "com/bstek/ureport/font/fangsong/SIMFANG.TTF";
		}
		return "/home/somp/fonts/SIMSUN.TTC";
	}
}
