package com.jorge.javasol;

//import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "player")
public class Player {
    private String playerName;
    boolean isAdmin = false;
    boolean hasContract = false;
    String[] avatars = {};
    private int numCode;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    protected void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean getContract() {
        return hasContract;
    }

    protected void setContract(boolean hasContract) {
        this.hasContract = hasContract;
    }

    public int getNumCode() {
        return numCode;
    }

    protected void setNumCode(int num_code) {
        this.numCode = num_code;
    }

    public int getNumAvatar() {
        return this.avatars.length;
    }

    public String[] getAvatars() {
        return avatars;
    }

    protected void setAvatars(String[] avatars) {
        this.avatars = avatars;
    }

    @Override
    public String toString() {
        String avatarsStr = "";
        for (int i = 0; i < avatars.length; i++) {
            avatarsStr += avatars[i] + " ";
        }
        return this.numCode + "::" + this.name + "::" + avatarsStr + "::" + isAdmin + "::" + hasContract;
    }

}
