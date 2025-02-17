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

import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceBySourceTemplate;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceTemplatePrototypeInstanceBySourceTemplate model.
 */
public class InstanceTemplatePrototypeInstanceBySourceTemplateTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceTemplatePrototypeInstanceBySourceTemplate() throws Throwable {
    KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
      .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
      .build();
    assertEquals(keyIdentityModel.id(), "a6b1a881-2ce8-41a3-80fc-36316a73f803");

    SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupIdentityModel.id(), "be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    NetworkInterfacePrototype networkInterfacePrototypeModel = new NetworkInterfacePrototype.Builder()
      .allowIpSpoofing(true)
      .name("my-network-interface")
      .primaryIpv4Address("10.0.0.5")
      .securityGroups(new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)))
      .subnet(subnetIdentityModel)
      .build();
    assertEquals(networkInterfacePrototypeModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(networkInterfacePrototypeModel.name(), "my-network-interface");
    assertEquals(networkInterfacePrototypeModel.primaryIpv4Address(), "10.0.0.5");
    assertEquals(networkInterfacePrototypeModel.securityGroups(), new java.util.ArrayList<SecurityGroupIdentity>(java.util.Arrays.asList(securityGroupIdentityModel)));
    assertEquals(networkInterfacePrototypeModel.subnet(), subnetIdentityModel);

    InstanceProfileIdentityByName instanceProfileIdentityModel = new InstanceProfileIdentityByName.Builder()
      .name("cc1-16x32")
      .build();
    assertEquals(instanceProfileIdentityModel.name(), "cc1-16x32");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityById volumeAttachmentVolumePrototypeInstanceContextModel = new VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityById.Builder()
      .id("1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();
    assertEquals(volumeAttachmentVolumePrototypeInstanceContextModel.id(), "1a6b7274-678d-4dfb-8981-c71dd9d4daa5");

    VolumeAttachmentPrototypeInstanceContext volumeAttachmentPrototypeInstanceContextModel = new VolumeAttachmentPrototypeInstanceContext.Builder()
      .deleteVolumeOnInstanceDelete(true)
      .name("my-volume-attachment")
      .volume(volumeAttachmentVolumePrototypeInstanceContextModel)
      .build();
    assertEquals(volumeAttachmentPrototypeInstanceContextModel.deleteVolumeOnInstanceDelete(), Boolean.valueOf(true));
    assertEquals(volumeAttachmentPrototypeInstanceContextModel.name(), "my-volume-attachment");
    assertEquals(volumeAttachmentPrototypeInstanceContextModel.volume(), volumeAttachmentVolumePrototypeInstanceContextModel);

    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "4727d842-f94f-4a2d-824a-9bc9b02c523b");

    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("general-purpose")
      .build();
    assertEquals(volumeProfileIdentityModel.name(), "general-purpose");

    VolumePrototypeInstanceByImageContext volumePrototypeInstanceByImageContextModel = new VolumePrototypeInstanceByImageContext.Builder()
      .capacity(Long.valueOf("100"))
      .encryptionKey(encryptionKeyIdentityModel)
      .iops(Long.valueOf("10000"))
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .build();
    assertEquals(volumePrototypeInstanceByImageContextModel.capacity(), Long.valueOf("100"));
    assertEquals(volumePrototypeInstanceByImageContextModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(volumePrototypeInstanceByImageContextModel.iops(), Long.valueOf("10000"));
    assertEquals(volumePrototypeInstanceByImageContextModel.name(), "my-volume");
    assertEquals(volumePrototypeInstanceByImageContextModel.profile(), volumeProfileIdentityModel);

    VolumeAttachmentPrototypeInstanceByImageContext volumeAttachmentPrototypeInstanceByImageContextModel = new VolumeAttachmentPrototypeInstanceByImageContext.Builder()
      .deleteVolumeOnInstanceDelete(true)
      .name("my-volume-attachment")
      .volume(volumePrototypeInstanceByImageContextModel)
      .build();
    assertEquals(volumeAttachmentPrototypeInstanceByImageContextModel.deleteVolumeOnInstanceDelete(), Boolean.valueOf(true));
    assertEquals(volumeAttachmentPrototypeInstanceByImageContextModel.name(), "my-volume-attachment");
    assertEquals(volumeAttachmentPrototypeInstanceByImageContextModel.volume(), volumePrototypeInstanceByImageContextModel);

    ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
      .id("72b27b5c-f4b0-48bb-b954-5becc7c1dcb8")
      .build();
    assertEquals(imageIdentityModel.id(), "72b27b5c-f4b0-48bb-b954-5becc7c1dcb8");

    InstanceTemplateIdentityById instanceTemplateIdentityModel = new InstanceTemplateIdentityById.Builder()
      .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
      .build();
    assertEquals(instanceTemplateIdentityModel.id(), "a6b1a881-2ce8-41a3-80fc-36316a73f803");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    InstanceTemplatePrototypeInstanceBySourceTemplate instanceTemplatePrototypeInstanceBySourceTemplateModel = new InstanceTemplatePrototypeInstanceBySourceTemplate.Builder()
      .keys(new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)))
      .name("my-instance")
      .networkInterfaces(new java.util.ArrayList<NetworkInterfacePrototype>(java.util.Arrays.asList(networkInterfacePrototypeModel)))
      .profile(instanceProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .userData("testString")
      .volumeAttachments(new java.util.ArrayList<VolumeAttachmentPrototypeInstanceContext>(java.util.Arrays.asList(volumeAttachmentPrototypeInstanceContextModel)))
      .vpc(vpcIdentityModel)
      .bootVolumeAttachment(volumeAttachmentPrototypeInstanceByImageContextModel)
      .image(imageIdentityModel)
      .primaryNetworkInterface(networkInterfacePrototypeModel)
      .sourceTemplate(instanceTemplateIdentityModel)
      .zone(zoneIdentityModel)
      .build();
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModel.keys(), new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)));
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModel.name(), "my-instance");
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModel.networkInterfaces(), new java.util.ArrayList<NetworkInterfacePrototype>(java.util.Arrays.asList(networkInterfacePrototypeModel)));
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModel.profile(), instanceProfileIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModel.userData(), "testString");
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModel.volumeAttachments(), new java.util.ArrayList<VolumeAttachmentPrototypeInstanceContext>(java.util.Arrays.asList(volumeAttachmentPrototypeInstanceContextModel)));
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModel.vpc(), vpcIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModel.bootVolumeAttachment(), volumeAttachmentPrototypeInstanceByImageContextModel);
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModel.image(), imageIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModel.primaryNetworkInterface(), networkInterfacePrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModel.sourceTemplate(), instanceTemplateIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModel.zone(), zoneIdentityModel);

    String json = TestUtilities.serialize(instanceTemplatePrototypeInstanceBySourceTemplateModel);

    InstanceTemplatePrototypeInstanceBySourceTemplate instanceTemplatePrototypeInstanceBySourceTemplateModelNew = TestUtilities.deserialize(json, InstanceTemplatePrototypeInstanceBySourceTemplate.class);
    assertTrue(instanceTemplatePrototypeInstanceBySourceTemplateModelNew instanceof InstanceTemplatePrototypeInstanceBySourceTemplate);
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModelNew.name(), "my-instance");
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModelNew.profile().toString(), instanceProfileIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModelNew.userData(), "testString");
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModelNew.vpc().toString(), vpcIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModelNew.bootVolumeAttachment().toString(), volumeAttachmentPrototypeInstanceByImageContextModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModelNew.image().toString(), imageIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModelNew.primaryNetworkInterface().toString(), networkInterfacePrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModelNew.sourceTemplate().toString(), instanceTemplateIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceBySourceTemplateModelNew.zone().toString(), zoneIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceTemplatePrototypeInstanceBySourceTemplateError() throws Throwable {
    new InstanceTemplatePrototypeInstanceBySourceTemplate.Builder().build();
  }

}