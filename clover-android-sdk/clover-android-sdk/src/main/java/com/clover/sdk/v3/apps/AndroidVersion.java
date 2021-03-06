/**
 * Copyright (C) 2015 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */

package com.clover.sdk.v3.apps;

import com.clover.sdk.GenericClient;

@SuppressWarnings("all")
public final class AndroidVersion implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  public java.lang.String getId() {
    return genClient.cacheGet(CacheKey.id);
  }
 /**
  * Creation timestamp
  */
  public java.lang.Long getCreatedAt() {
    return genClient.cacheGet(CacheKey.createdAt);
  }
 /**
  * Unique identifier
  */
  public java.lang.Long getVersion() {
    return genClient.cacheGet(CacheKey.version);
  }
  public java.lang.String getVersionName() {
    return genClient.cacheGet(CacheKey.versionName);
  }
  public java.lang.Boolean getApproved() {
    return genClient.cacheGet(CacheKey.approved);
  }
  public java.lang.String getHash() {
    return genClient.cacheGet(CacheKey.hash);
  }
  public java.lang.Long getDeviceInstallCount() {
    return genClient.cacheGet(CacheKey.deviceInstallCount);
  }
  public java.lang.String getHashOriginal() {
    return genClient.cacheGet(CacheKey.hashOriginal);
  }
  public com.clover.sdk.v3.base.ApprovalStatus getApprovalStatus() {
    return genClient.cacheGet(CacheKey.approvalStatus);
  }
 /**
  * VirusTotal scan status
  */
  public com.clover.sdk.v3.apps.ScanStatus getScanStatus() {
    return genClient.cacheGet(CacheKey.scanStatus);
  }
 /**
  * VirusTotal scan_id field, which is the sha256 hash joined with the timestamp by a hyphen
  */
  public java.lang.String getScanId() {
    return genClient.cacheGet(CacheKey.scanId);
  }
 /**
  * The minSdkVersion attribute parsed from the AndroidManifest.xml
  */
  public java.lang.Long getMinSdkVersion() {
    return genClient.cacheGet(CacheKey.minSdkVersion);
  }
 /**
  * The algorithm used to create the developer signature
  */
  public java.lang.String getSigAlg() {
    return genClient.cacheGet(CacheKey.sigAlg);
  }
 /**
  * Url to download the APK
  */
  public java.lang.String getApkUrl() {
    return genClient.cacheGet(CacheKey.apkUrl);
  }
 /**
  * List of android permissions
  */
  public java.util.List<java.lang.String> getPermissions() {
    return genClient.cacheGet(CacheKey.permissions);
  }
 /**
  * Reference to the app this Android version belongs to
  */
  public com.clover.sdk.v3.base.Reference getApp() {
    return genClient.cacheGet(CacheKey.app);
  }


  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<AndroidVersion> {
    id {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractOther("id", java.lang.String.class);
      }
    },
    createdAt {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractOther("createdAt", java.lang.Long.class);
      }
    },
    version {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractOther("version", java.lang.Long.class);
      }
    },
    versionName {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractOther("versionName", java.lang.String.class);
      }
    },
    approved {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractOther("approved", java.lang.Boolean.class);
      }
    },
    hash {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractOther("hash", java.lang.String.class);
      }
    },
    deviceInstallCount {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractOther("deviceInstallCount", java.lang.Long.class);
      }
    },
    hashOriginal {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractOther("hashOriginal", java.lang.String.class);
      }
    },
    approvalStatus {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractEnum("approvalStatus", com.clover.sdk.v3.base.ApprovalStatus.class);
      }
    },
    scanStatus {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractEnum("scanStatus", com.clover.sdk.v3.apps.ScanStatus.class);
      }
    },
    scanId {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractOther("scanId", java.lang.String.class);
      }
    },
    minSdkVersion {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractOther("minSdkVersion", java.lang.Long.class);
      }
    },
    sigAlg {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractOther("sigAlg", java.lang.String.class);
      }
    },
    apkUrl {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractOther("apkUrl", java.lang.String.class);
      }
    },
    permissions {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractListOther("permissions", java.lang.String.class);
      }
    },
    app {
      @Override
      public Object extractValue(AndroidVersion instance) {
        return instance.genClient.extractRecord("app", com.clover.sdk.v3.base.Reference.JSON_CREATOR);
      }
    },
    ;
  }

  private GenericClient<AndroidVersion> genClient = new GenericClient<AndroidVersion>(this);

  /**
   * Constructs a new empty instance.
   */
  public AndroidVersion() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public AndroidVersion(String json) throws IllegalArgumentException {
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public AndroidVersion(org.json.JSONObject jsonObject) {
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public AndroidVersion(AndroidVersion src) {
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }


  @Override
  public void validate() {
    genClient.validateLength(getId(), 13);

    genClient.validateLength(getVersionName(), 255);

    genClient.validateLength(getHash(), 64);

    genClient.validateLength(getHashOriginal(), 64);
  }

  /** Checks whether the 'id' field is set and is not null */
  public boolean isNotNullId() {
    return genClient.cacheValueIsNotNull(CacheKey.id);
  }

  /** Checks whether the 'createdAt' field is set and is not null */
  public boolean isNotNullCreatedAt() {
    return genClient.cacheValueIsNotNull(CacheKey.createdAt);
  }

  /** Checks whether the 'version' field is set and is not null */
  public boolean isNotNullVersion() {
    return genClient.cacheValueIsNotNull(CacheKey.version);
  }

  /** Checks whether the 'versionName' field is set and is not null */
  public boolean isNotNullVersionName() {
    return genClient.cacheValueIsNotNull(CacheKey.versionName);
  }

  /** Checks whether the 'approved' field is set and is not null */
  public boolean isNotNullApproved() {
    return genClient.cacheValueIsNotNull(CacheKey.approved);
  }

  /** Checks whether the 'hash' field is set and is not null */
  public boolean isNotNullHash() {
    return genClient.cacheValueIsNotNull(CacheKey.hash);
  }

  /** Checks whether the 'deviceInstallCount' field is set and is not null */
  public boolean isNotNullDeviceInstallCount() {
    return genClient.cacheValueIsNotNull(CacheKey.deviceInstallCount);
  }

  /** Checks whether the 'hashOriginal' field is set and is not null */
  public boolean isNotNullHashOriginal() {
    return genClient.cacheValueIsNotNull(CacheKey.hashOriginal);
  }

  /** Checks whether the 'approvalStatus' field is set and is not null */
  public boolean isNotNullApprovalStatus() {
    return genClient.cacheValueIsNotNull(CacheKey.approvalStatus);
  }

  /** Checks whether the 'scanStatus' field is set and is not null */
  public boolean isNotNullScanStatus() {
    return genClient.cacheValueIsNotNull(CacheKey.scanStatus);
  }

  /** Checks whether the 'scanId' field is set and is not null */
  public boolean isNotNullScanId() {
    return genClient.cacheValueIsNotNull(CacheKey.scanId);
  }

  /** Checks whether the 'minSdkVersion' field is set and is not null */
  public boolean isNotNullMinSdkVersion() {
    return genClient.cacheValueIsNotNull(CacheKey.minSdkVersion);
  }

  /** Checks whether the 'sigAlg' field is set and is not null */
  public boolean isNotNullSigAlg() {
    return genClient.cacheValueIsNotNull(CacheKey.sigAlg);
  }

  /** Checks whether the 'apkUrl' field is set and is not null */
  public boolean isNotNullApkUrl() {
    return genClient.cacheValueIsNotNull(CacheKey.apkUrl);
  }

  /** Checks whether the 'permissions' field is set and is not null */
  public boolean isNotNullPermissions() {
    return genClient.cacheValueIsNotNull(CacheKey.permissions);
  }

  /** Checks whether the 'permissions' field is set and is not null and is not empty */
  public boolean isNotEmptyPermissions() { return isNotNullPermissions() && !getPermissions().isEmpty(); }

  /** Checks whether the 'app' field is set and is not null */
  public boolean isNotNullApp() {
    return genClient.cacheValueIsNotNull(CacheKey.app);
  }


  /** Checks whether the 'id' field has been set, however the value could be null */
  public boolean hasId() {
    return genClient.cacheHasKey(CacheKey.id);
  }

  /** Checks whether the 'createdAt' field has been set, however the value could be null */
  public boolean hasCreatedAt() {
    return genClient.cacheHasKey(CacheKey.createdAt);
  }

  /** Checks whether the 'version' field has been set, however the value could be null */
  public boolean hasVersion() {
    return genClient.cacheHasKey(CacheKey.version);
  }

  /** Checks whether the 'versionName' field has been set, however the value could be null */
  public boolean hasVersionName() {
    return genClient.cacheHasKey(CacheKey.versionName);
  }

  /** Checks whether the 'approved' field has been set, however the value could be null */
  public boolean hasApproved() {
    return genClient.cacheHasKey(CacheKey.approved);
  }

  /** Checks whether the 'hash' field has been set, however the value could be null */
  public boolean hasHash() {
    return genClient.cacheHasKey(CacheKey.hash);
  }

  /** Checks whether the 'deviceInstallCount' field has been set, however the value could be null */
  public boolean hasDeviceInstallCount() {
    return genClient.cacheHasKey(CacheKey.deviceInstallCount);
  }

  /** Checks whether the 'hashOriginal' field has been set, however the value could be null */
  public boolean hasHashOriginal() {
    return genClient.cacheHasKey(CacheKey.hashOriginal);
  }

  /** Checks whether the 'approvalStatus' field has been set, however the value could be null */
  public boolean hasApprovalStatus() {
    return genClient.cacheHasKey(CacheKey.approvalStatus);
  }

  /** Checks whether the 'scanStatus' field has been set, however the value could be null */
  public boolean hasScanStatus() {
    return genClient.cacheHasKey(CacheKey.scanStatus);
  }

  /** Checks whether the 'scanId' field has been set, however the value could be null */
  public boolean hasScanId() {
    return genClient.cacheHasKey(CacheKey.scanId);
  }

  /** Checks whether the 'minSdkVersion' field has been set, however the value could be null */
  public boolean hasMinSdkVersion() {
    return genClient.cacheHasKey(CacheKey.minSdkVersion);
  }

  /** Checks whether the 'sigAlg' field has been set, however the value could be null */
  public boolean hasSigAlg() {
    return genClient.cacheHasKey(CacheKey.sigAlg);
  }

  /** Checks whether the 'apkUrl' field has been set, however the value could be null */
  public boolean hasApkUrl() {
    return genClient.cacheHasKey(CacheKey.apkUrl);
  }

  /** Checks whether the 'permissions' field has been set, however the value could be null */
  public boolean hasPermissions() {
    return genClient.cacheHasKey(CacheKey.permissions);
  }

  /** Checks whether the 'app' field has been set, however the value could be null */
  public boolean hasApp() {
    return genClient.cacheHasKey(CacheKey.app);
  }


  /**
   * Sets the field 'id'.
   */
  public AndroidVersion setId(java.lang.String id) {
    return genClient.setOther(id, CacheKey.id);
  }

  /**
   * Sets the field 'createdAt'.
   */
  public AndroidVersion setCreatedAt(java.lang.Long createdAt) {
    return genClient.setOther(createdAt, CacheKey.createdAt);
  }

  /**
   * Sets the field 'version'.
   */
  public AndroidVersion setVersion(java.lang.Long version) {
    return genClient.setOther(version, CacheKey.version);
  }

  /**
   * Sets the field 'versionName'.
   */
  public AndroidVersion setVersionName(java.lang.String versionName) {
    return genClient.setOther(versionName, CacheKey.versionName);
  }

  /**
   * Sets the field 'approved'.
   */
  public AndroidVersion setApproved(java.lang.Boolean approved) {
    return genClient.setOther(approved, CacheKey.approved);
  }

  /**
   * Sets the field 'hash'.
   */
  public AndroidVersion setHash(java.lang.String hash) {
    return genClient.setOther(hash, CacheKey.hash);
  }

  /**
   * Sets the field 'deviceInstallCount'.
   */
  public AndroidVersion setDeviceInstallCount(java.lang.Long deviceInstallCount) {
    return genClient.setOther(deviceInstallCount, CacheKey.deviceInstallCount);
  }

  /**
   * Sets the field 'hashOriginal'.
   */
  public AndroidVersion setHashOriginal(java.lang.String hashOriginal) {
    return genClient.setOther(hashOriginal, CacheKey.hashOriginal);
  }

  /**
   * Sets the field 'approvalStatus'.
   */
  public AndroidVersion setApprovalStatus(com.clover.sdk.v3.base.ApprovalStatus approvalStatus) {
    return genClient.setOther(approvalStatus, CacheKey.approvalStatus);
  }

  /**
   * Sets the field 'scanStatus'.
   */
  public AndroidVersion setScanStatus(com.clover.sdk.v3.apps.ScanStatus scanStatus) {
    return genClient.setOther(scanStatus, CacheKey.scanStatus);
  }

  /**
   * Sets the field 'scanId'.
   */
  public AndroidVersion setScanId(java.lang.String scanId) {
    return genClient.setOther(scanId, CacheKey.scanId);
  }

  /**
   * Sets the field 'minSdkVersion'.
   */
  public AndroidVersion setMinSdkVersion(java.lang.Long minSdkVersion) {
    return genClient.setOther(minSdkVersion, CacheKey.minSdkVersion);
  }

  /**
   * Sets the field 'sigAlg'.
   */
  public AndroidVersion setSigAlg(java.lang.String sigAlg) {
    return genClient.setOther(sigAlg, CacheKey.sigAlg);
  }

  /**
   * Sets the field 'apkUrl'.
   */
  public AndroidVersion setApkUrl(java.lang.String apkUrl) {
    return genClient.setOther(apkUrl, CacheKey.apkUrl);
  }

  /**
   * Sets the field 'permissions'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public AndroidVersion setPermissions(java.util.List<java.lang.String> permissions) {
    return genClient.setArrayOther(permissions, CacheKey.permissions);
  }

  /**
   * Sets the field 'app'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public AndroidVersion setApp(com.clover.sdk.v3.base.Reference app) {
    return genClient.setRecord(app, CacheKey.app);
  }


  /** Clears the 'id' field, the 'has' method for this field will now return false */
  public void clearId() {
    genClient.clear(CacheKey.id);
  }
  /** Clears the 'createdAt' field, the 'has' method for this field will now return false */
  public void clearCreatedAt() {
    genClient.clear(CacheKey.createdAt);
  }
  /** Clears the 'version' field, the 'has' method for this field will now return false */
  public void clearVersion() {
    genClient.clear(CacheKey.version);
  }
  /** Clears the 'versionName' field, the 'has' method for this field will now return false */
  public void clearVersionName() {
    genClient.clear(CacheKey.versionName);
  }
  /** Clears the 'approved' field, the 'has' method for this field will now return false */
  public void clearApproved() {
    genClient.clear(CacheKey.approved);
  }
  /** Clears the 'hash' field, the 'has' method for this field will now return false */
  public void clearHash() {
    genClient.clear(CacheKey.hash);
  }
  /** Clears the 'deviceInstallCount' field, the 'has' method for this field will now return false */
  public void clearDeviceInstallCount() {
    genClient.clear(CacheKey.deviceInstallCount);
  }
  /** Clears the 'hashOriginal' field, the 'has' method for this field will now return false */
  public void clearHashOriginal() {
    genClient.clear(CacheKey.hashOriginal);
  }
  /** Clears the 'approvalStatus' field, the 'has' method for this field will now return false */
  public void clearApprovalStatus() {
    genClient.clear(CacheKey.approvalStatus);
  }
  /** Clears the 'scanStatus' field, the 'has' method for this field will now return false */
  public void clearScanStatus() {
    genClient.clear(CacheKey.scanStatus);
  }
  /** Clears the 'scanId' field, the 'has' method for this field will now return false */
  public void clearScanId() {
    genClient.clear(CacheKey.scanId);
  }
  /** Clears the 'minSdkVersion' field, the 'has' method for this field will now return false */
  public void clearMinSdkVersion() {
    genClient.clear(CacheKey.minSdkVersion);
  }
  /** Clears the 'sigAlg' field, the 'has' method for this field will now return false */
  public void clearSigAlg() {
    genClient.clear(CacheKey.sigAlg);
  }
  /** Clears the 'apkUrl' field, the 'has' method for this field will now return false */
  public void clearApkUrl() {
    genClient.clear(CacheKey.apkUrl);
  }
  /** Clears the 'permissions' field, the 'has' method for this field will now return false */
  public void clearPermissions() {
    genClient.clear(CacheKey.permissions);
  }
  /** Clears the 'app' field, the 'has' method for this field will now return false */
  public void clearApp() {
    genClient.clear(CacheKey.app);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public AndroidVersion copyChanges() {
    AndroidVersion copy = new AndroidVersion();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(AndroidVersion src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new AndroidVersion(src).getJSONObject(), src.genClient);
    }
  }

  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    return genClient.getBundle();
  }

  @Override
  public String toString() {
    return genClient.toString();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
    genClient.writeToParcel(dest, flags);
  }

  public static final android.os.Parcelable.Creator<AndroidVersion> CREATOR = new android.os.Parcelable.Creator<AndroidVersion>() {
    @Override
    public AndroidVersion createFromParcel(android.os.Parcel in) {
      AndroidVersion instance = new AndroidVersion(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public AndroidVersion[] newArray(int size) {
      return new AndroidVersion[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<AndroidVersion> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<AndroidVersion>() {
    @Override
    public AndroidVersion create(org.json.JSONObject jsonObject) {
      return new AndroidVersion(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean ID_IS_REQUIRED = false;
    public static final long ID_MAX_LEN = 13;

    public static final boolean CREATEDAT_IS_REQUIRED = false;

    public static final boolean VERSION_IS_REQUIRED = false;

    public static final boolean VERSIONNAME_IS_REQUIRED = false;
    public static final long VERSIONNAME_MAX_LEN = 255;

    public static final boolean APPROVED_IS_REQUIRED = false;

    public static final boolean HASH_IS_REQUIRED = false;
    public static final long HASH_MAX_LEN = 64;

    public static final boolean DEVICEINSTALLCOUNT_IS_REQUIRED = false;

    public static final boolean HASHORIGINAL_IS_REQUIRED = false;
    public static final long HASHORIGINAL_MAX_LEN = 64;

    public static final boolean APPROVALSTATUS_IS_REQUIRED = false;

    public static final boolean SCANSTATUS_IS_REQUIRED = false;

    public static final boolean SCANID_IS_REQUIRED = false;

    public static final boolean MINSDKVERSION_IS_REQUIRED = false;

    public static final boolean SIGALG_IS_REQUIRED = false;

    public static final boolean APKURL_IS_REQUIRED = false;

    public static final boolean PERMISSIONS_IS_REQUIRED = false;

    public static final boolean APP_IS_REQUIRED = false;

  }

}
