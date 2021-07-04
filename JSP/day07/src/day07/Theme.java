package day07;

public class Theme {
	private String backgroundColor;
	private String fontColor;
	
	public String getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public String getFontColor() {
		if(backgroundColor.equals("basic")) {
			this.backgroundColor = "black";
			fontColor = "white";
		}
		else if(backgroundColor.equals("salmon"))
			fontColor = "red";
		else if(backgroundColor.equals("blue"))
			fontColor = "skyblue";
		else if(backgroundColor.equals("yellow"))
			fontColor = "orange";
		return fontColor;
	}
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}
}
