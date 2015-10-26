package com.mossle.internal.whitelist.persistence.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * WhitelistApp .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "WHITELIST_APP")
public class WhitelistApp implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private WhitelistType whitelistType;

    /** null. */
    private String name;

    /** null. */
    private String userId;

    /** null. */
    private String description;

    /** null. */
    private Integer forceRelogin;

    /** null. */
    private String code;

    /** null. */
    private String username;

    /** null. */
    private String password;

    /** null. */
    private Integer level;

    /** null. */
    private String tenantId;

    /** . */
    private Set<WhitelistHost> whitelistHosts = new HashSet<WhitelistHost>(0);

    /** . */
    private Set<WhitelistIp> whitelistIps = new HashSet<WhitelistIp>(0);

    public WhitelistApp() {
    }

    public WhitelistApp(WhitelistType whitelistType, String name,
            String userId, String description, Integer forceRelogin,
            String code, String username, String password, Integer level,
            String tenantId, Set<WhitelistHost> whitelistHosts,
            Set<WhitelistIp> whitelistIps) {
        this.whitelistType = whitelistType;
        this.name = name;
        this.userId = userId;
        this.description = description;
        this.forceRelogin = forceRelogin;
        this.code = code;
        this.username = username;
        this.password = password;
        this.level = level;
        this.tenantId = tenantId;
        this.whitelistHosts = whitelistHosts;
        this.whitelistIps = whitelistIps;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TYPE_ID")
    public WhitelistType getWhitelistType() {
        return this.whitelistType;
    }

    /**
     * @param whitelistType
     *            null.
     */
    public void setWhitelistType(WhitelistType whitelistType) {
        this.whitelistType = whitelistType;
    }

    /** @return null. */
    @Column(name = "NAME", length = 50)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "USER_ID", length = 50)
    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            null.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** @return null. */
    @Column(name = "DESCRIPTION", length = 200)
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            null.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return null. */
    @Column(name = "FORCE_RELOGIN")
    public Integer getForceRelogin() {
        return this.forceRelogin;
    }

    /**
     * @param forceRelogin
     *            null.
     */
    public void setForceRelogin(Integer forceRelogin) {
        this.forceRelogin = forceRelogin;
    }

    /** @return null. */
    @Column(name = "CODE", length = 64)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            null.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return null. */
    @Column(name = "USERNAME", length = 64)
    public String getUsername() {
        return this.username;
    }

    /**
     * @param username
     *            null.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /** @return null. */
    @Column(name = "PASSWORD", length = 200)
    public String getPassword() {
        return this.password;
    }

    /**
     * @param password
     *            null.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /** @return null. */
    @Column(name = "LEVEL")
    public Integer getLevel() {
        return this.level;
    }

    /**
     * @param level
     *            null.
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /** @return null. */
    @Column(name = "TENANT_ID", length = 64)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            null.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "whitelistApp")
    public Set<WhitelistHost> getWhitelistHosts() {
        return this.whitelistHosts;
    }

    /**
     * @param whitelistHosts
     *            .
     */
    public void setWhitelistHosts(Set<WhitelistHost> whitelistHosts) {
        this.whitelistHosts = whitelistHosts;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "whitelistApp")
    public Set<WhitelistIp> getWhitelistIps() {
        return this.whitelistIps;
    }

    /**
     * @param whitelistIps
     *            .
     */
    public void setWhitelistIps(Set<WhitelistIp> whitelistIps) {
        this.whitelistIps = whitelistIps;
    }
}
