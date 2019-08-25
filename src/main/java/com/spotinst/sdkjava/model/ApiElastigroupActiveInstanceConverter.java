package com.spotinst.sdkjava.model;


import com.spotinst.sdkjava.enums.AwsInstanceLifecycleEnum;
import com.spotinst.sdkjava.enums.AwsInstanceTypeEnum;

/**
 * Created by talzur on 12/12/2016.
 */
class ApiElastigroupActiveInstanceConverter {
    static ElastigroupActiveInstance dalToBl(ApiElastigroupActiveInstance apiElastigroupActiveInstance) {
        ElastigroupActiveInstance retVal = new ElastigroupActiveInstance();
        retVal.setInstanceId(apiElastigroupActiveInstance.getInstanceId());
        retVal.setGroupId(apiElastigroupActiveInstance.getGroupId());
        retVal.setAvailabilityZone(apiElastigroupActiveInstance.getAvailabilityZone());
        retVal.setPrivateIp(apiElastigroupActiveInstance.getPrivateIp());
        retVal.setInstanceType(AwsInstanceTypeEnum.fromName(apiElastigroupActiveInstance.getInstanceType()));

        if (apiElastigroupActiveInstance.getSpotInstanceRequestId() != null) {
            retVal.setLifeCycle(AwsInstanceLifecycleEnum.SPOT);
        } else {
            retVal.setLifeCycle(AwsInstanceLifecycleEnum.ON_DEMAND);
        }

        retVal.setCreatedAt(apiElastigroupActiveInstance.getCreatedAt());
        retVal.setStatus(apiElastigroupActiveInstance.getStatus());
        retVal.setProduct(apiElastigroupActiveInstance.getProduct());
        retVal.setSpotInstanceRequestId(apiElastigroupActiveInstance.getSpotInstanceRequestId());
        return retVal;
    }
}
