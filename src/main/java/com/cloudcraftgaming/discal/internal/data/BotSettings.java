package com.cloudcraftgaming.discal.internal.data;

/**
 * Created by Nova Fox on 3/29/2017.
 * Website: www.cloudcraftgaming.com
 * For Project: DisCal
 */
public class BotSettings {
    private String botToken;

    private String dbHostName;
    private String dbPort;
    private String dbDatabase;
    private String dbPrefix;
    private String dbUser;
    private String dbPass;

    private String emailUser;
    private String emailPass;

    private String botsPwToken;

    private String googleClientId;
    private String googleClientSecret;

    public BotSettings() {}

    //Getters
    public String getBotToken() {
        return botToken;
    }

    public String getDbHostName() {
        return dbHostName;
    }

    public String getDbPort() {
        return dbPort;
    }

    public String getDbDatabase() {
        return dbDatabase;
    }

    public String getDbPrefix() {
        return dbPrefix;
    }

    public String getDbUser() {
        return dbUser;
    }

    public String getDbPass() {
        return dbPass;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public String getEmailPass() {
        return emailPass;
    }

    public String getBotsPwToken() {
        return botsPwToken;
    }

    public String getGoogleClientId() {
        return googleClientId;
    }

    public String getGoogleClientSecret() {
        return googleClientSecret;
    }

    //Setters
    public void setBotToken(String _botToken) {
        botToken = _botToken;
    }

    public void setDbHostName(String _dbHostName) {
        dbHostName = _dbHostName;
    }

    public void setDbPort(String _port) {
        dbPort = _port;
    }

    public void setDbDatabase(String _database) {
        dbDatabase = _database;
    }

    public void setDbPrefix(String _prefix) {
        dbPrefix = _prefix;
    }

    public void setDbUser(String _user) {
        dbUser = _user;
    }

    public void setDbPass(String _pass) {
        dbPass = _pass;
    }

    public void setEmailUser(String _user) {
        emailUser = _user;
    }

    public void setEmailPass(String _pass) {
        emailPass = _pass;
    }

    public void setBotsPwToken(String _token) {
        botsPwToken = _token;
    }

    public void setGoogleClientId(String _id) {
        googleClientId = _id;
    }

    public void setGoogleClientSecret(String _secret) {
        googleClientSecret = _secret;
    }
}