package com.abin.lee.mongo.cluster.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by abin
 * Be Created in 2016/8/24.
 * 消息实体Bean，从MessagePacket转换而成，是TCP协议经过JSON解析后的消息实体Bean。
 *
 */

//指定使用mongodb的Message集合，spring操作该对象的时候知道存取哪个集合
@Document(collection = "Message")
public class Message implements Serializable, Comparable<Message> {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * 文档id
     */
    @Id
    private String id;


    /**
     * 消息id
     */
    private String messageId;

    /**
     * 发送者id
     */
    private String from;

    /**
     * 接收者id
     */
    private String to;

    /**
     * 发送时间
     */
    private Long sendate;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 消息类型
     */
    private int genre;

    /**
     * 发送者昵称
     */
    private String sender;

    /**
     * 序列号
     */
    private Long sequence;


    /**
     * at列表
     */
    private String remind;

    /**
     * header_id
     */
    private String header_id;

    /**
     * header_from
     */
    private String header_from;

    /**
     * header_to
     */
    private String header_to;

    /**
     * header_opCode
     */
    private String header_opCode;

    /**
     * version
     */
    private String version;

    /**
     * protocol
     */
    private String protocol;

    /**
     * body
     */
    private String body;

    /**
     * org
     */
    private String org;

    /**
     * createTime
     */
    private Long createTime;

    /**
     * 状态
     */
    private int status;

    /**
     * userid,domain,resource
     */
    private String from_fulljid;

    private String to_fulljid;
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the messageId
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * @param messageId the messageId to set
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Long getSendate() {
        return sendate;
    }

    public void setSendate(Long sendate) {
        this.sendate = sendate;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRemind() {
        return remind;
    }

    public void setRemind(String remind) {
        this.remind = remind;
    }

    public String getHeader_id() {
        return header_id;
    }

    public void setHeader_id(String header_id) {
        this.header_id = header_id;
    }

    public String getHeader_from() {
        return header_from;
    }

    public void setHeader_from(String header_from) {
        this.header_from = header_from;
    }

    public String getHeader_to() {
        return header_to;
    }

    public void setHeader_to(String header_to) {
        this.header_to = header_to;
    }

    public String getHeader_opCode() {
        return header_opCode;
    }

    public void setHeader_opCode(String header_opCode) {
        this.header_opCode = header_opCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public int compareTo(Message o) {
        if (o.sequence < this.sequence)
            return 1;
        else if (o.sequence > this.sequence)
            return -1;
        else
            return 0;
    }

    //此处影响性能
    @Override
    public String toString(){
        return this.messageId + "|" + this.from + "|" + this.to + "|"+this.sendate+"|"
                +(this.content!=null?this.content.replaceAll("\n", ""):"")+"|"+this.genre+"|"+this.sender+"|"+this.sequence+"|"
                + this.header_from+"|"+this.header_opCode+"|" +this.remind+"|"+(this.body!=null?this.body.replaceAll("\n", ""):"");
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getFrom_fulljid() {
        return from_fulljid;
    }

    public void setFrom_fulljid(String from_fulljid) {
        this.from_fulljid = from_fulljid;
    }

    public String getTo_fulljid() {
        return to_fulljid;
    }

    public void setTo_fulljid(String to_fulljid) {
        this.to_fulljid = to_fulljid;
    }

}

