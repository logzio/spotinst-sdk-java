package com.spotinst.sdkjava.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

/**
 * Created by talzur on 12/12/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class ApiElastigroupActiveInstance {
    //region Members
    private String instanceId;
    private String spotInstanceRequestId;
    private String instanceType;
    private String product;
    private String groupId;
    private String availabilityZone;
    private String privateIp;
    private String status;
    private Date createdAt;
    //endregion

    //region Getter and setter methods

    String getInstanceId() {
        return instanceId;
    }

    void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    String getSpotInstanceRequestId() {
        return spotInstanceRequestId;
    }

    void setSpotInstanceRequestId(String spotInstanceRequestId) {
        this.spotInstanceRequestId = spotInstanceRequestId;
    }

    String getInstanceType() {
        return instanceType;
    }

    void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    String getProduct() {
        return product;
    }

    void setProduct(String product) {
        this.product = product;
    }

    String getGroupId() {
        return groupId;
    }

    void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    String getAvailabilityZone() {
        return availabilityZone;
    }

    void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    String getPrivateIp() {
        return privateIp;
    }

    void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    //endregion
}
