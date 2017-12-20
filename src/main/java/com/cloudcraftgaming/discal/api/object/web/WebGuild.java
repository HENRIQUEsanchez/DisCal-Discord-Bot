package com.cloudcraftgaming.discal.api.object.web;

import com.cloudcraftgaming.discal.Main;
import com.cloudcraftgaming.discal.api.database.DatabaseManager;
import com.cloudcraftgaming.discal.api.object.GuildSettings;
import sx.blah.discord.handle.obj.IGuild;

/**
 * Created by Nova Fox on 12/19/17.
 * Website: www.cloudcraftgaming.com
 * For Project: DisCal-Discord-Bot
 */
public class WebGuild {
	private String id;
	private String name;
	private String iconUrl;

	//Bot settings
	private String botNick;
	private String prefix;
	private String lang;

	//Getters
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getIcon() {
		return iconUrl;
	}

	public String getBotNick() {
		return botNick;
	}

	public String getPrefix() {
		return prefix;
	}

	public String getLang() {
		return lang;
	}

	//Setters
	public void setId(String _id) {
		id = _id;
	}

	public void setName(String _name) {
		name = _name;
	}

	public void setIcon(String _url) {
		iconUrl = _url;
	}

	public void setBotNick(String _nick) {
		botNick = _nick;
	}

	public void setPrefix(String _prefix) {
		prefix = _prefix;
	}

	public void setLang(String _lang) {
		lang = _lang;
	}


	//Functions
	public WebGuild fromGuild(IGuild g) {
		id = g.getStringID();
		name = g.getName();
		iconUrl = g.getIconURL();
		botNick = Main.client.getOurUser().getNicknameForGuild(g);

		GuildSettings s = DatabaseManager.getManager().getSettings(g.getLongID());
		prefix = s.getPrefix();
		lang = s.getLang();

		return this;
	}
}