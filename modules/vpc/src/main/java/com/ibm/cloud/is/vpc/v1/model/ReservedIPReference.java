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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ReservedIPReference.
 */
public class ReservedIPReference extends GenericModel {

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** subnet_reserved_ip. */
    String SUBNET_RESERVED_IP = "subnet_reserved_ip";
  }

  protected ReservedIPReferenceDeleted deleted;
  protected String href;
  protected String id;
  protected String name;
  @SerializedName("resource_type")
  protected String resourceType;

  /**
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public ReservedIPReferenceDeleted getDeleted() {
    return deleted;
  }

  /**
   * Gets the href.
   *
   * The URL for this reserved IP.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this reserved IP.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined or system-provided name for this reserved IP.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceType.
   *
   * The resource type.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }
}

