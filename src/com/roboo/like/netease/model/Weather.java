package com.roboo.like.netease.model;



import java.io.Serializable;

import android.os.Parcel;
import android.os.Parcelable;

public class Weather implements Parcelable,Serializable
{
	private static final long serialVersionUID = 123453453523L;
	private String weatherCityCode = "010100";// ����
	private String week = "";
	private String date = "";
	private String temp = "";
	private String weatherDescription = "";// �絽����
	private String weatherIcon = ""; 
	private String wind = "";// ����
	private String windLevel = "";// ���ټ���
	private String weatherCityName = "����";
	
	public Weather()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public String getWeatherCityName()
	{
		return weatherCityName;
	}
	public void setWeatherCityName(String weatherCityName)
	{
		this.weatherCityName = weatherCityName;
	}
	public String getWeatherCityCode()
	{
		return weatherCityCode;
	}
	public void setWeatherCityCode(String weatherCityCode)
	{
		this.weatherCityCode = weatherCityCode;
	}
	public String getWeek()
	{
		return week;
	}
	public void setWeek(String week)
	{
		this.week = week;
	}
	public String getDate()
	{
		return date;
	}
	public void setDate(String date)
	{
		this.date = date;
	}
	public String getTemp()
	{
		return temp;
	}
	public void setTemp(String temp)
	{
		this.temp = temp;
	}
	public String getWeatherDescription()
	{
		return weatherDescription;
	}
	public void setWeatherDescription(String weatherDescription)
	{
		this.weatherDescription = weatherDescription;
	}
	public String getWeatherIcon()
	{
		return weatherIcon;
	}
	public void setWeatherIcon(String weatherIcon)
	{
		this.weatherIcon = weatherIcon;
	}
	public String getWind()
	{
		return wind;
	}
	public void setWind(String wind)
	{
		this.wind = wind;
	}
	public String getWindLevel()
	{
		return windLevel;
	}
	public void setWindLevel(String windLevel)
	{
		this.windLevel = windLevel;
	}
	@Override
	public String toString()
	{
		return this.weatherCityName + " :: "+ this.date + " :: " + this.week + " :: " + this.weatherCityCode +
				" :: " + this.temp + " :: " + this.weatherDescription + " :: " +
				this.wind + " :: " + this.windLevel;
	}
	 
	      public int describeContents() {
	    	// ���������ӿڣ��������ù�
	          return 0;
	      }
	  
	      @Override
	      public void writeToParcel(Parcel dest, int flags) {
	    	// ��ȡ�ӿڣ�Ŀ����Ҫ��Parcel�й���һ��ʵ����parcelable�����ʵ��������Ϊʵ���������ﻹ�ǲ���֪�ģ�������Ҫ�õ�ģ��ķ�ʽ���̳�����ͨ��ģ��������롣

	          // 1.���밴��Ա����������˳���װ���ݣ���Ȼ����ֻ�ȡ���ݳ���
	          // 2.���л�����
//				private String weatherCityCode = "010100";// ����
//				private String week = "";
//				private String date = "";
//				private String temp = "";
//				private String weatherDescription = "";// �絽����
//				private String weatherIcon = "";
//				private String wind = "";// ����
//				private String windLevel = "";// ���ټ���
	    	  dest.writeString(weatherCityCode);
	    	  dest.writeString(week);
	    	  dest.writeString(date);
	    	  dest.writeString(temp);
	    	  dest.writeString(weatherDescription);
	    	  dest.writeString(weatherIcon);
	    	  dest.writeString(wind);
	    	  dest.writeString(windLevel);
	    	  dest.writeString(weatherCityName);
	      }


	// Ϊ���ܹ�ʵ��ģ������Ĵ��룬���ﶨ��CreatorǶ��ӿ�,�ں������ӿں����ֱ𷵻ص����Ͷ���̳���ʵ����
	public static final Parcelable.Creator<Weather> CREATOR = new Parcelable.Creator()
	{
		public Weather createFromParcel(Parcel source)
		{
			// TODO Auto-generated method stub
			// ���밴��Ա����������˳���ȡ���ݣ���Ȼ����ֻ�ȡ���ݳ���
			Weather weather = new Weather();			
//			private String weatherCityCode = "010100";// ����
//			private String week = "";
//			private String date = "";
//			private String temp = "";
//			private String weatherDescription = "";// �絽����
//			private String weatherIcon = "";
//			private String wind = "";// ����
//			private String windLevel = "";// ���ټ���
			weather.setWeatherCityCode(source.readString());
			weather.setWeek(source.readString());
			weather.setDate(source.readString());
			weather.setTemp(source.readString());
			weather.setWeatherDescription(source.readString());
			weather.setWeatherIcon(source.readString());
			weather.setWind(source.readString());
			weather.setWindLevel(source.readString());
			weather.setWeatherCityName(source.readString());
			return weather;
		}

		public Weather[] newArray(int size)
		{
			// TODO Auto-generated method stub
			return new Weather[size];
		}
	};
}
