/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.is.vpc.v1.model;

/**
 * If `protocol` is either `tcp` or `udp`, then the rule may also contain `port_min` and
 * `port_max`. Either both should be set, or neither. When neither is set then traffic is allowed on all ports. For a
 * single port, set both to the same value.
 */
public class SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP extends SecurityGroupRulePrototype {

  /**
   * The direction of traffic to enforce, either `inbound` or `outbound`.
   */
  public interface Direction {
    /** inbound. */
    String INBOUND = "inbound";
    /** outbound. */
    String OUTBOUND = "outbound";
  }

  /**
   * The IP version to enforce. The format of `remote.address` or `remote.cidr_block` must match this field, if they are
   * used. Alternatively, if `remote` references a security group, then this rule only applies to IP addresses (network
   * interfaces) in that group matching this IP version.
   */
  public interface IpVersion {
    /** ipv4. */
    String IPV4 = "ipv4";
  }

  /**
   * The protocol to enforce.
   */
  public interface Protocol {
    /** tcp. */
    String TCP = "tcp";
    /** udp. */
    String UDP = "udp";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String direction;
    private String ipVersion;
    private SecurityGroupRuleRemotePrototype remote;
    private Long portMax;
    private Long portMin;
    private String protocol;

    public Builder(SecurityGroupRulePrototype securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudp) {
      this.direction = securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudp.direction;
      this.ipVersion = securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudp.ipVersion;
      this.remote = securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudp.remote;
      this.portMax = securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudp.portMax;
      this.portMin = securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudp.portMin;
      this.protocol = securityGroupRulePrototypeSecurityGroupRuleProtocolTcpudp.protocol;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param direction the direction
     * @param protocol the protocol
     */
    public Builder(String direction, String protocol) {
      this.direction = direction;
      this.protocol = protocol;
    }

    /**
     * Builds a SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP.
     *
     * @return the new SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP instance
     */
    public SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP build() {
      return new SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP(this);
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the ipVersion.
     *
     * @param ipVersion the ipVersion
     * @return the SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP builder
     */
    public Builder ipVersion(String ipVersion) {
      this.ipVersion = ipVersion;
      return this;
    }

    /**
     * Set the remote.
     *
     * @param remote the remote
     * @return the SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP builder
     */
    public Builder remote(SecurityGroupRuleRemotePrototype remote) {
      this.remote = remote;
      return this;
    }

    /**
     * Set the portMax.
     *
     * @param portMax the portMax
     * @return the SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP builder
     */
    public Builder portMax(long portMax) {
      this.portMax = portMax;
      return this;
    }

    /**
     * Set the portMin.
     *
     * @param portMin the portMin
     * @return the SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP builder
     */
    public Builder portMin(long portMin) {
      this.portMin = portMin;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }
  }

  protected SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.direction,
      "direction cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.protocol,
      "protocol cannot be null");
    direction = builder.direction;
    ipVersion = builder.ipVersion;
    remote = builder.remote;
    portMax = builder.portMax;
    portMin = builder.portMin;
    protocol = builder.protocol;
  }

  /**
   * New builder.
   *
   * @return a SecurityGroupRulePrototypeSecurityGroupRuleProtocolTCPUDP builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

