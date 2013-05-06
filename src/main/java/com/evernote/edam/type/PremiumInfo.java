/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.evernote.edam.type;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import com.evernote.thrift.*;
import com.evernote.thrift.protocol.*;

/**
 *  This structure is used to provide information about a user's Premium account.
 * <dl>
 *  <dt>currentTime</dt>
 *    <dd>
 *    The server-side date and time when this data was generated.
 *    </dd>
 *  <dt>premium</dt>
 *    <dd>
 *    True if the user's account is Premium.
 *    </dd>
 *  <dt>premiumRecurring</dt>
 *    <dd>
 *    True if the user's account is Premium and has a recurring payment method.
 *    </dd>
 *  <dt>premiumExpirationDate</dt>
 *    <dd>
 *    The date when the user's Premium account expires, or the date when the
 *    user's account is due for payment if it has a recurring payment method.
 *    </dd>
 *  <dt>premiumExtendable</dt>
 *    <dd>
 *    True if the user is eligible for purchasing Premium account extensions.
 *    </dd>
 *  <dt>premiumPending</dt>
 *    <dd>
 *    True if the user's Premium account is pending payment confirmation
 *    </dd>
 *  <dt>premiumCancellationPending</dt>
 *    <dd>
 *    True if the user has requested that no further charges to be made; the
 *    Premium account will remain active until it expires.
 *    </dd>
 *  <dt>canPurchaseUploadAllowance</dt>
 *    <dd>
 *    True if the user is eligible for purchasing additional upload allowance.
 *    </dd>
 *  <dt>sponsoredGroupName</dt>
 *    <dd>
 *    The name of the sponsored group that the user is part of.
 *    </dd>
 *  <dt>sponsoredGroupRole</dt>
 *    <dd>
 *    DEPRECATED - will be removed in a future update.
 *    </dd>
 *  <dt>premiumUpgradable</dt>
 *    <dd>
 *    True if the user is eligible for purchasing Premium account upgrade.
 *    </dd>
 *  </dl>
 */
public class PremiumInfo implements TBase<PremiumInfo>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("PremiumInfo");

  private static final TField CURRENT_TIME_FIELD_DESC = new TField("currentTime", TType.I64, (short)1);
  private static final TField PREMIUM_FIELD_DESC = new TField("premium", TType.BOOL, (short)2);
  private static final TField PREMIUM_RECURRING_FIELD_DESC = new TField("premiumRecurring", TType.BOOL, (short)3);
  private static final TField PREMIUM_EXPIRATION_DATE_FIELD_DESC = new TField("premiumExpirationDate", TType.I64, (short)4);
  private static final TField PREMIUM_EXTENDABLE_FIELD_DESC = new TField("premiumExtendable", TType.BOOL, (short)5);
  private static final TField PREMIUM_PENDING_FIELD_DESC = new TField("premiumPending", TType.BOOL, (short)6);
  private static final TField PREMIUM_CANCELLATION_PENDING_FIELD_DESC = new TField("premiumCancellationPending", TType.BOOL, (short)7);
  private static final TField CAN_PURCHASE_UPLOAD_ALLOWANCE_FIELD_DESC = new TField("canPurchaseUploadAllowance", TType.BOOL, (short)8);
  private static final TField SPONSORED_GROUP_NAME_FIELD_DESC = new TField("sponsoredGroupName", TType.STRING, (short)9);
  private static final TField SPONSORED_GROUP_ROLE_FIELD_DESC = new TField("sponsoredGroupRole", TType.I32, (short)10);
  private static final TField PREMIUM_UPGRADABLE_FIELD_DESC = new TField("premiumUpgradable", TType.BOOL, (short)11);

  private long currentTime;
  private boolean premium;
  private boolean premiumRecurring;
  private long premiumExpirationDate;
  private boolean premiumExtendable;
  private boolean premiumPending;
  private boolean premiumCancellationPending;
  private boolean canPurchaseUploadAllowance;
  private String sponsoredGroupName;
  private SponsoredGroupRole sponsoredGroupRole;
  private boolean premiumUpgradable;


  // isset id assignments
  private static final int __CURRENTTIME_ISSET_ID = 0;
  private static final int __PREMIUM_ISSET_ID = 1;
  private static final int __PREMIUMRECURRING_ISSET_ID = 2;
  private static final int __PREMIUMEXPIRATIONDATE_ISSET_ID = 3;
  private static final int __PREMIUMEXTENDABLE_ISSET_ID = 4;
  private static final int __PREMIUMPENDING_ISSET_ID = 5;
  private static final int __PREMIUMCANCELLATIONPENDING_ISSET_ID = 6;
  private static final int __CANPURCHASEUPLOADALLOWANCE_ISSET_ID = 7;
  private static final int __PREMIUMUPGRADABLE_ISSET_ID = 8;
  private boolean[] __isset_vector = new boolean[9];

  public PremiumInfo() {
  }

  public PremiumInfo(
    long currentTime,
    boolean premium,
    boolean premiumRecurring,
    boolean premiumExtendable,
    boolean premiumPending,
    boolean premiumCancellationPending,
    boolean canPurchaseUploadAllowance)
  {
    this();
    this.currentTime = currentTime;
    setCurrentTimeIsSet(true);
    this.premium = premium;
    setPremiumIsSet(true);
    this.premiumRecurring = premiumRecurring;
    setPremiumRecurringIsSet(true);
    this.premiumExtendable = premiumExtendable;
    setPremiumExtendableIsSet(true);
    this.premiumPending = premiumPending;
    setPremiumPendingIsSet(true);
    this.premiumCancellationPending = premiumCancellationPending;
    setPremiumCancellationPendingIsSet(true);
    this.canPurchaseUploadAllowance = canPurchaseUploadAllowance;
    setCanPurchaseUploadAllowanceIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PremiumInfo(PremiumInfo other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.currentTime = other.currentTime;
    this.premium = other.premium;
    this.premiumRecurring = other.premiumRecurring;
    this.premiumExpirationDate = other.premiumExpirationDate;
    this.premiumExtendable = other.premiumExtendable;
    this.premiumPending = other.premiumPending;
    this.premiumCancellationPending = other.premiumCancellationPending;
    this.canPurchaseUploadAllowance = other.canPurchaseUploadAllowance;
    if (other.isSetSponsoredGroupName()) {
      this.sponsoredGroupName = other.sponsoredGroupName;
    }
    if (other.isSetSponsoredGroupRole()) {
      this.sponsoredGroupRole = other.sponsoredGroupRole;
    }
    this.premiumUpgradable = other.premiumUpgradable;
  }

  public PremiumInfo deepCopy() {
    return new PremiumInfo(this);
  }

  public void clear() {
    setCurrentTimeIsSet(false);
    this.currentTime = 0;
    setPremiumIsSet(false);
    this.premium = false;
    setPremiumRecurringIsSet(false);
    this.premiumRecurring = false;
    setPremiumExpirationDateIsSet(false);
    this.premiumExpirationDate = 0;
    setPremiumExtendableIsSet(false);
    this.premiumExtendable = false;
    setPremiumPendingIsSet(false);
    this.premiumPending = false;
    setPremiumCancellationPendingIsSet(false);
    this.premiumCancellationPending = false;
    setCanPurchaseUploadAllowanceIsSet(false);
    this.canPurchaseUploadAllowance = false;
    this.sponsoredGroupName = null;
    this.sponsoredGroupRole = null;
    setPremiumUpgradableIsSet(false);
    this.premiumUpgradable = false;
  }

  public long getCurrentTime() {
    return this.currentTime;
  }

  public void setCurrentTime(long currentTime) {
    this.currentTime = currentTime;
    setCurrentTimeIsSet(true);
  }

  public void unsetCurrentTime() {
    __isset_vector[__CURRENTTIME_ISSET_ID] = false;
  }

  /** Returns true if field currentTime is set (has been asigned a value) and false otherwise */
  public boolean isSetCurrentTime() {
    return __isset_vector[__CURRENTTIME_ISSET_ID];
  }

  public void setCurrentTimeIsSet(boolean value) {
    __isset_vector[__CURRENTTIME_ISSET_ID] = value;
  }

  public boolean isPremium() {
    return this.premium;
  }

  public void setPremium(boolean premium) {
    this.premium = premium;
    setPremiumIsSet(true);
  }

  public void unsetPremium() {
    __isset_vector[__PREMIUM_ISSET_ID] = false;
  }

  /** Returns true if field premium is set (has been asigned a value) and false otherwise */
  public boolean isSetPremium() {
    return __isset_vector[__PREMIUM_ISSET_ID];
  }

  public void setPremiumIsSet(boolean value) {
    __isset_vector[__PREMIUM_ISSET_ID] = value;
  }

  public boolean isPremiumRecurring() {
    return this.premiumRecurring;
  }

  public void setPremiumRecurring(boolean premiumRecurring) {
    this.premiumRecurring = premiumRecurring;
    setPremiumRecurringIsSet(true);
  }

  public void unsetPremiumRecurring() {
    __isset_vector[__PREMIUMRECURRING_ISSET_ID] = false;
  }

  /** Returns true if field premiumRecurring is set (has been asigned a value) and false otherwise */
  public boolean isSetPremiumRecurring() {
    return __isset_vector[__PREMIUMRECURRING_ISSET_ID];
  }

  public void setPremiumRecurringIsSet(boolean value) {
    __isset_vector[__PREMIUMRECURRING_ISSET_ID] = value;
  }

  public long getPremiumExpirationDate() {
    return this.premiumExpirationDate;
  }

  public void setPremiumExpirationDate(long premiumExpirationDate) {
    this.premiumExpirationDate = premiumExpirationDate;
    setPremiumExpirationDateIsSet(true);
  }

  public void unsetPremiumExpirationDate() {
    __isset_vector[__PREMIUMEXPIRATIONDATE_ISSET_ID] = false;
  }

  /** Returns true if field premiumExpirationDate is set (has been asigned a value) and false otherwise */
  public boolean isSetPremiumExpirationDate() {
    return __isset_vector[__PREMIUMEXPIRATIONDATE_ISSET_ID];
  }

  public void setPremiumExpirationDateIsSet(boolean value) {
    __isset_vector[__PREMIUMEXPIRATIONDATE_ISSET_ID] = value;
  }

  public boolean isPremiumExtendable() {
    return this.premiumExtendable;
  }

  public void setPremiumExtendable(boolean premiumExtendable) {
    this.premiumExtendable = premiumExtendable;
    setPremiumExtendableIsSet(true);
  }

  public void unsetPremiumExtendable() {
    __isset_vector[__PREMIUMEXTENDABLE_ISSET_ID] = false;
  }

  /** Returns true if field premiumExtendable is set (has been asigned a value) and false otherwise */
  public boolean isSetPremiumExtendable() {
    return __isset_vector[__PREMIUMEXTENDABLE_ISSET_ID];
  }

  public void setPremiumExtendableIsSet(boolean value) {
    __isset_vector[__PREMIUMEXTENDABLE_ISSET_ID] = value;
  }

  public boolean isPremiumPending() {
    return this.premiumPending;
  }

  public void setPremiumPending(boolean premiumPending) {
    this.premiumPending = premiumPending;
    setPremiumPendingIsSet(true);
  }

  public void unsetPremiumPending() {
    __isset_vector[__PREMIUMPENDING_ISSET_ID] = false;
  }

  /** Returns true if field premiumPending is set (has been asigned a value) and false otherwise */
  public boolean isSetPremiumPending() {
    return __isset_vector[__PREMIUMPENDING_ISSET_ID];
  }

  public void setPremiumPendingIsSet(boolean value) {
    __isset_vector[__PREMIUMPENDING_ISSET_ID] = value;
  }

  public boolean isPremiumCancellationPending() {
    return this.premiumCancellationPending;
  }

  public void setPremiumCancellationPending(boolean premiumCancellationPending) {
    this.premiumCancellationPending = premiumCancellationPending;
    setPremiumCancellationPendingIsSet(true);
  }

  public void unsetPremiumCancellationPending() {
    __isset_vector[__PREMIUMCANCELLATIONPENDING_ISSET_ID] = false;
  }

  /** Returns true if field premiumCancellationPending is set (has been asigned a value) and false otherwise */
  public boolean isSetPremiumCancellationPending() {
    return __isset_vector[__PREMIUMCANCELLATIONPENDING_ISSET_ID];
  }

  public void setPremiumCancellationPendingIsSet(boolean value) {
    __isset_vector[__PREMIUMCANCELLATIONPENDING_ISSET_ID] = value;
  }

  public boolean isCanPurchaseUploadAllowance() {
    return this.canPurchaseUploadAllowance;
  }

  public void setCanPurchaseUploadAllowance(boolean canPurchaseUploadAllowance) {
    this.canPurchaseUploadAllowance = canPurchaseUploadAllowance;
    setCanPurchaseUploadAllowanceIsSet(true);
  }

  public void unsetCanPurchaseUploadAllowance() {
    __isset_vector[__CANPURCHASEUPLOADALLOWANCE_ISSET_ID] = false;
  }

  /** Returns true if field canPurchaseUploadAllowance is set (has been asigned a value) and false otherwise */
  public boolean isSetCanPurchaseUploadAllowance() {
    return __isset_vector[__CANPURCHASEUPLOADALLOWANCE_ISSET_ID];
  }

  public void setCanPurchaseUploadAllowanceIsSet(boolean value) {
    __isset_vector[__CANPURCHASEUPLOADALLOWANCE_ISSET_ID] = value;
  }

  public String getSponsoredGroupName() {
    return this.sponsoredGroupName;
  }

  public void setSponsoredGroupName(String sponsoredGroupName) {
    this.sponsoredGroupName = sponsoredGroupName;
  }

  public void unsetSponsoredGroupName() {
    this.sponsoredGroupName = null;
  }

  /** Returns true if field sponsoredGroupName is set (has been asigned a value) and false otherwise */
  public boolean isSetSponsoredGroupName() {
    return this.sponsoredGroupName != null;
  }

  public void setSponsoredGroupNameIsSet(boolean value) {
    if (!value) {
      this.sponsoredGroupName = null;
    }
  }

  /**
   * 
   * @see SponsoredGroupRole
   */
  public SponsoredGroupRole getSponsoredGroupRole() {
    return this.sponsoredGroupRole;
  }

  /**
   * 
   * @see SponsoredGroupRole
   */
  public void setSponsoredGroupRole(SponsoredGroupRole sponsoredGroupRole) {
    this.sponsoredGroupRole = sponsoredGroupRole;
  }

  public void unsetSponsoredGroupRole() {
    this.sponsoredGroupRole = null;
  }

  /** Returns true if field sponsoredGroupRole is set (has been asigned a value) and false otherwise */
  public boolean isSetSponsoredGroupRole() {
    return this.sponsoredGroupRole != null;
  }

  public void setSponsoredGroupRoleIsSet(boolean value) {
    if (!value) {
      this.sponsoredGroupRole = null;
    }
  }

  public boolean isPremiumUpgradable() {
    return this.premiumUpgradable;
  }

  public void setPremiumUpgradable(boolean premiumUpgradable) {
    this.premiumUpgradable = premiumUpgradable;
    setPremiumUpgradableIsSet(true);
  }

  public void unsetPremiumUpgradable() {
    __isset_vector[__PREMIUMUPGRADABLE_ISSET_ID] = false;
  }

  /** Returns true if field premiumUpgradable is set (has been asigned a value) and false otherwise */
  public boolean isSetPremiumUpgradable() {
    return __isset_vector[__PREMIUMUPGRADABLE_ISSET_ID];
  }

  public void setPremiumUpgradableIsSet(boolean value) {
    __isset_vector[__PREMIUMUPGRADABLE_ISSET_ID] = value;
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PremiumInfo)
      return this.equals((PremiumInfo)that);
    return false;
  }

  public boolean equals(PremiumInfo that) {
    if (that == null)
      return false;

    boolean this_present_currentTime = true;
    boolean that_present_currentTime = true;
    if (this_present_currentTime || that_present_currentTime) {
      if (!(this_present_currentTime && that_present_currentTime))
        return false;
      if (this.currentTime != that.currentTime)
        return false;
    }

    boolean this_present_premium = true;
    boolean that_present_premium = true;
    if (this_present_premium || that_present_premium) {
      if (!(this_present_premium && that_present_premium))
        return false;
      if (this.premium != that.premium)
        return false;
    }

    boolean this_present_premiumRecurring = true;
    boolean that_present_premiumRecurring = true;
    if (this_present_premiumRecurring || that_present_premiumRecurring) {
      if (!(this_present_premiumRecurring && that_present_premiumRecurring))
        return false;
      if (this.premiumRecurring != that.premiumRecurring)
        return false;
    }

    boolean this_present_premiumExpirationDate = true && this.isSetPremiumExpirationDate();
    boolean that_present_premiumExpirationDate = true && that.isSetPremiumExpirationDate();
    if (this_present_premiumExpirationDate || that_present_premiumExpirationDate) {
      if (!(this_present_premiumExpirationDate && that_present_premiumExpirationDate))
        return false;
      if (this.premiumExpirationDate != that.premiumExpirationDate)
        return false;
    }

    boolean this_present_premiumExtendable = true;
    boolean that_present_premiumExtendable = true;
    if (this_present_premiumExtendable || that_present_premiumExtendable) {
      if (!(this_present_premiumExtendable && that_present_premiumExtendable))
        return false;
      if (this.premiumExtendable != that.premiumExtendable)
        return false;
    }

    boolean this_present_premiumPending = true;
    boolean that_present_premiumPending = true;
    if (this_present_premiumPending || that_present_premiumPending) {
      if (!(this_present_premiumPending && that_present_premiumPending))
        return false;
      if (this.premiumPending != that.premiumPending)
        return false;
    }

    boolean this_present_premiumCancellationPending = true;
    boolean that_present_premiumCancellationPending = true;
    if (this_present_premiumCancellationPending || that_present_premiumCancellationPending) {
      if (!(this_present_premiumCancellationPending && that_present_premiumCancellationPending))
        return false;
      if (this.premiumCancellationPending != that.premiumCancellationPending)
        return false;
    }

    boolean this_present_canPurchaseUploadAllowance = true;
    boolean that_present_canPurchaseUploadAllowance = true;
    if (this_present_canPurchaseUploadAllowance || that_present_canPurchaseUploadAllowance) {
      if (!(this_present_canPurchaseUploadAllowance && that_present_canPurchaseUploadAllowance))
        return false;
      if (this.canPurchaseUploadAllowance != that.canPurchaseUploadAllowance)
        return false;
    }

    boolean this_present_sponsoredGroupName = true && this.isSetSponsoredGroupName();
    boolean that_present_sponsoredGroupName = true && that.isSetSponsoredGroupName();
    if (this_present_sponsoredGroupName || that_present_sponsoredGroupName) {
      if (!(this_present_sponsoredGroupName && that_present_sponsoredGroupName))
        return false;
      if (!this.sponsoredGroupName.equals(that.sponsoredGroupName))
        return false;
    }

    boolean this_present_sponsoredGroupRole = true && this.isSetSponsoredGroupRole();
    boolean that_present_sponsoredGroupRole = true && that.isSetSponsoredGroupRole();
    if (this_present_sponsoredGroupRole || that_present_sponsoredGroupRole) {
      if (!(this_present_sponsoredGroupRole && that_present_sponsoredGroupRole))
        return false;
      if (!this.sponsoredGroupRole.equals(that.sponsoredGroupRole))
        return false;
    }

    boolean this_present_premiumUpgradable = true && this.isSetPremiumUpgradable();
    boolean that_present_premiumUpgradable = true && that.isSetPremiumUpgradable();
    if (this_present_premiumUpgradable || that_present_premiumUpgradable) {
      if (!(this_present_premiumUpgradable && that_present_premiumUpgradable))
        return false;
      if (this.premiumUpgradable != that.premiumUpgradable)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(PremiumInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PremiumInfo typedOther = (PremiumInfo)other;

    lastComparison = Boolean.valueOf(isSetCurrentTime()).compareTo(typedOther.isSetCurrentTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrentTime()) {      lastComparison = TBaseHelper.compareTo(this.currentTime, typedOther.currentTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPremium()).compareTo(typedOther.isSetPremium());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPremium()) {      lastComparison = TBaseHelper.compareTo(this.premium, typedOther.premium);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPremiumRecurring()).compareTo(typedOther.isSetPremiumRecurring());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPremiumRecurring()) {      lastComparison = TBaseHelper.compareTo(this.premiumRecurring, typedOther.premiumRecurring);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPremiumExpirationDate()).compareTo(typedOther.isSetPremiumExpirationDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPremiumExpirationDate()) {      lastComparison = TBaseHelper.compareTo(this.premiumExpirationDate, typedOther.premiumExpirationDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPremiumExtendable()).compareTo(typedOther.isSetPremiumExtendable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPremiumExtendable()) {      lastComparison = TBaseHelper.compareTo(this.premiumExtendable, typedOther.premiumExtendable);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPremiumPending()).compareTo(typedOther.isSetPremiumPending());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPremiumPending()) {      lastComparison = TBaseHelper.compareTo(this.premiumPending, typedOther.premiumPending);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPremiumCancellationPending()).compareTo(typedOther.isSetPremiumCancellationPending());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPremiumCancellationPending()) {      lastComparison = TBaseHelper.compareTo(this.premiumCancellationPending, typedOther.premiumCancellationPending);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCanPurchaseUploadAllowance()).compareTo(typedOther.isSetCanPurchaseUploadAllowance());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCanPurchaseUploadAllowance()) {      lastComparison = TBaseHelper.compareTo(this.canPurchaseUploadAllowance, typedOther.canPurchaseUploadAllowance);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSponsoredGroupName()).compareTo(typedOther.isSetSponsoredGroupName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSponsoredGroupName()) {      lastComparison = TBaseHelper.compareTo(this.sponsoredGroupName, typedOther.sponsoredGroupName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSponsoredGroupRole()).compareTo(typedOther.isSetSponsoredGroupRole());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSponsoredGroupRole()) {      lastComparison = TBaseHelper.compareTo(this.sponsoredGroupRole, typedOther.sponsoredGroupRole);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPremiumUpgradable()).compareTo(typedOther.isSetPremiumUpgradable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPremiumUpgradable()) {      lastComparison = TBaseHelper.compareTo(this.premiumUpgradable, typedOther.premiumUpgradable);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // CURRENT_TIME
          if (field.type == TType.I64) {
            this.currentTime = iprot.readI64();
            setCurrentTimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // PREMIUM
          if (field.type == TType.BOOL) {
            this.premium = iprot.readBool();
            setPremiumIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // PREMIUM_RECURRING
          if (field.type == TType.BOOL) {
            this.premiumRecurring = iprot.readBool();
            setPremiumRecurringIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // PREMIUM_EXPIRATION_DATE
          if (field.type == TType.I64) {
            this.premiumExpirationDate = iprot.readI64();
            setPremiumExpirationDateIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // PREMIUM_EXTENDABLE
          if (field.type == TType.BOOL) {
            this.premiumExtendable = iprot.readBool();
            setPremiumExtendableIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // PREMIUM_PENDING
          if (field.type == TType.BOOL) {
            this.premiumPending = iprot.readBool();
            setPremiumPendingIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // PREMIUM_CANCELLATION_PENDING
          if (field.type == TType.BOOL) {
            this.premiumCancellationPending = iprot.readBool();
            setPremiumCancellationPendingIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // CAN_PURCHASE_UPLOAD_ALLOWANCE
          if (field.type == TType.BOOL) {
            this.canPurchaseUploadAllowance = iprot.readBool();
            setCanPurchaseUploadAllowanceIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // SPONSORED_GROUP_NAME
          if (field.type == TType.STRING) {
            this.sponsoredGroupName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // SPONSORED_GROUP_ROLE
          if (field.type == TType.I32) {
            this.sponsoredGroupRole = SponsoredGroupRole.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 11: // PREMIUM_UPGRADABLE
          if (field.type == TType.BOOL) {
            this.premiumUpgradable = iprot.readBool();
            setPremiumUpgradableIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(CURRENT_TIME_FIELD_DESC);
    oprot.writeI64(this.currentTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PREMIUM_FIELD_DESC);
    oprot.writeBool(this.premium);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PREMIUM_RECURRING_FIELD_DESC);
    oprot.writeBool(this.premiumRecurring);
    oprot.writeFieldEnd();
    if (isSetPremiumExpirationDate()) {
      oprot.writeFieldBegin(PREMIUM_EXPIRATION_DATE_FIELD_DESC);
      oprot.writeI64(this.premiumExpirationDate);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(PREMIUM_EXTENDABLE_FIELD_DESC);
    oprot.writeBool(this.premiumExtendable);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PREMIUM_PENDING_FIELD_DESC);
    oprot.writeBool(this.premiumPending);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(PREMIUM_CANCELLATION_PENDING_FIELD_DESC);
    oprot.writeBool(this.premiumCancellationPending);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(CAN_PURCHASE_UPLOAD_ALLOWANCE_FIELD_DESC);
    oprot.writeBool(this.canPurchaseUploadAllowance);
    oprot.writeFieldEnd();
    if (this.sponsoredGroupName != null) {
      if (isSetSponsoredGroupName()) {
        oprot.writeFieldBegin(SPONSORED_GROUP_NAME_FIELD_DESC);
        oprot.writeString(this.sponsoredGroupName);
        oprot.writeFieldEnd();
      }
    }
    if (this.sponsoredGroupRole != null) {
      if (isSetSponsoredGroupRole()) {
        oprot.writeFieldBegin(SPONSORED_GROUP_ROLE_FIELD_DESC);
        oprot.writeI32(this.sponsoredGroupRole.getValue());
        oprot.writeFieldEnd();
      }
    }
    if (isSetPremiumUpgradable()) {
      oprot.writeFieldBegin(PREMIUM_UPGRADABLE_FIELD_DESC);
      oprot.writeBool(this.premiumUpgradable);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PremiumInfo(");
    boolean first = true;

    sb.append("currentTime:");
    sb.append(this.currentTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("premium:");
    sb.append(this.premium);
    first = false;
    if (!first) sb.append(", ");
    sb.append("premiumRecurring:");
    sb.append(this.premiumRecurring);
    first = false;
    if (isSetPremiumExpirationDate()) {
      if (!first) sb.append(", ");
      sb.append("premiumExpirationDate:");
      sb.append(this.premiumExpirationDate);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("premiumExtendable:");
    sb.append(this.premiumExtendable);
    first = false;
    if (!first) sb.append(", ");
    sb.append("premiumPending:");
    sb.append(this.premiumPending);
    first = false;
    if (!first) sb.append(", ");
    sb.append("premiumCancellationPending:");
    sb.append(this.premiumCancellationPending);
    first = false;
    if (!first) sb.append(", ");
    sb.append("canPurchaseUploadAllowance:");
    sb.append(this.canPurchaseUploadAllowance);
    first = false;
    if (isSetSponsoredGroupName()) {
      if (!first) sb.append(", ");
      sb.append("sponsoredGroupName:");
      if (this.sponsoredGroupName == null) {
        sb.append("null");
      } else {
        sb.append(this.sponsoredGroupName);
      }
      first = false;
    }
    if (isSetSponsoredGroupRole()) {
      if (!first) sb.append(", ");
      sb.append("sponsoredGroupRole:");
      if (this.sponsoredGroupRole == null) {
        sb.append("null");
      } else {
        sb.append(this.sponsoredGroupRole);
      }
      first = false;
    }
    if (isSetPremiumUpgradable()) {
      if (!first) sb.append(", ");
      sb.append("premiumUpgradable:");
      sb.append(this.premiumUpgradable);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (!isSetCurrentTime()) {
      throw new TProtocolException("Required field 'currentTime' is unset! Struct:" + toString());
    }

    if (!isSetPremium()) {
      throw new TProtocolException("Required field 'premium' is unset! Struct:" + toString());
    }

    if (!isSetPremiumRecurring()) {
      throw new TProtocolException("Required field 'premiumRecurring' is unset! Struct:" + toString());
    }

    if (!isSetPremiumExtendable()) {
      throw new TProtocolException("Required field 'premiumExtendable' is unset! Struct:" + toString());
    }

    if (!isSetPremiumPending()) {
      throw new TProtocolException("Required field 'premiumPending' is unset! Struct:" + toString());
    }

    if (!isSetPremiumCancellationPending()) {
      throw new TProtocolException("Required field 'premiumCancellationPending' is unset! Struct:" + toString());
    }

    if (!isSetCanPurchaseUploadAllowance()) {
      throw new TProtocolException("Required field 'canPurchaseUploadAllowance' is unset! Struct:" + toString());
    }

  }

}

