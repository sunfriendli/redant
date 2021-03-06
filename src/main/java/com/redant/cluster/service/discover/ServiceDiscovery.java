package com.redant.cluster.service.discover;

import com.redant.cluster.node.Node;

/**
 * @author gris.wang
 * @since 2017/11/20
 **/
public interface ServiceDiscovery {

    /**
     * 监听Slave节点
     */
    void watchSlave();

    /**
     * 发现可用的Slave节点
     * @return
     */
    Node discover();

}
