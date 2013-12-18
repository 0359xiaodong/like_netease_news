package com.roboo.like.netease.utils;



import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
/**
 * ������
 * �޸��ˣ� �
 * �޸����ڣ�2013-1-29
 * �޸�ʱ�䣺����11:47:10
 */
public class PinYinUtils
{
	/***
	 * 
	 * @param str :��������
	 * @param format
	 *            �������ʽ����ĸ��д
	 * @return���������ĳ������Ƶĵ��׸����ֵ���ĸ
	 */
	public static String getPinYinHeadChar(String str, HanyuPinyinOutputFormat format)
	{
		char word = str.charAt(0);
		String convert = "";
		if (java.lang.Character.toString(word).matches("[\\u4E00-\\u9FA5]+"))
		{
			String[] pinyinArray = null;
			try
			{
				pinyinArray = PinyinHelper.toHanyuPinyinStringArray(word, format);
				if (pinyinArray != null)
				{
					convert += pinyinArray[0].charAt(0);
				} else
				{
					convert += word;
				}
				return convert;
			} catch (BadHanyuPinyinOutputFormatCombination e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		else
		{
			return str.toUpperCase();
		}
			return "";
	}

	/** 
     * ����ת��λ����ƴ����Ӣ���ַ����� 
     * @param chines ���� 
     * @return ƴ�� 
     */   
    public static String converterToSpell(String chines){            
         String pinyinName = "";    
        char[] nameChar = chines.toCharArray();    
         HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();    
         defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);    
         defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);    
        for (int i = 0; i < nameChar.length; i++) {    
            if (nameChar[i] > 128) {    
                try {    
                     pinyinName += PinyinHelper.toHanyuPinyinStringArray(nameChar[i], defaultFormat)[0];    
                 } catch (BadHanyuPinyinOutputFormatCombination e) {    
                     e.printStackTrace();    
                 }    
             }else{    
                 pinyinName += nameChar[i];    
             }    
         }    
        return pinyinName;    
     }    

}
