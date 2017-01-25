package cn.itcast.server.bean;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table QQMESSAGE.
 */
public class QQMessage extends ProtocalObj {

    private Long id;
    public Long sendtime = System.currentTimeMillis();
    public String content;
    public Long to;
    public Integer fromAvatar;
    public String fromNick;
    public Long from;
    public String type = QQMessageType.MSG_TYPE_CHAT_P2P;
    private String session_id;
    private String session_name;

    public QQMessage() {
    }

    public QQMessage(Long id) {
        this.id = id;
    }

    public QQMessage(Long id, Long sendtime, String content, Long to, Integer fromAvatar, String fromNick, Long from, String type, String session_id, String session_name) {
        this.id = id;
        this.sendtime = sendtime;
        this.content = content;
        this.to = to;
        this.fromAvatar = fromAvatar;
        this.fromNick = fromNick;
        this.from = from;
        this.type = type;
        this.session_id = session_id;
        this.session_name = session_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSendtime() {
        return sendtime;
    }

    public void setSendtime(Long sendtime) {
        this.sendtime = sendtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public Integer getFromAvatar() {
        return fromAvatar;
    }

    public void setFromAvatar(Integer fromAvatar) {
        this.fromAvatar = fromAvatar;
    }

    public String getFromNick() {
        return fromNick;
    }

    public void setFromNick(String fromNick) {
        this.fromNick = fromNick;
    }

    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getSession_name() {
        return session_name;
    }

    public void setSession_name(String session_name) {
        this.session_name = session_name;
    }

}
