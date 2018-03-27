/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class LocalStateData implements org.apache.thrift.TBase<LocalStateData, LocalStateData._Fields>, java.io.Serializable, Cloneable, Comparable<LocalStateData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LocalStateData");

  private static final org.apache.thrift.protocol.TField SERIALIZED_PARTS_FIELD_DESC = new org.apache.thrift.protocol.TField("serialized_parts", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LocalStateDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LocalStateDataTupleSchemeFactory());
  }

  private Map<String,ThriftSerializedObject> serialized_parts; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SERIALIZED_PARTS((short)1, "serialized_parts");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SERIALIZED_PARTS
          return SERIALIZED_PARTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SERIALIZED_PARTS, new org.apache.thrift.meta_data.FieldMetaData("serialized_parts", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftSerializedObject.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LocalStateData.class, metaDataMap);
  }

  public LocalStateData() {
  }

  public LocalStateData(
    Map<String,ThriftSerializedObject> serialized_parts)
  {
    this();
    this.serialized_parts = serialized_parts;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LocalStateData(LocalStateData other) {
    if (other.is_set_serialized_parts()) {
      Map<String,ThriftSerializedObject> __this__serialized_parts = new HashMap<String,ThriftSerializedObject>(other.serialized_parts.size());
      for (Map.Entry<String, ThriftSerializedObject> other_element : other.serialized_parts.entrySet()) {

        String other_element_key = other_element.getKey();
        ThriftSerializedObject other_element_value = other_element.getValue();

        String __this__serialized_parts_copy_key = other_element_key;

        ThriftSerializedObject __this__serialized_parts_copy_value = new ThriftSerializedObject(other_element_value);

        __this__serialized_parts.put(__this__serialized_parts_copy_key, __this__serialized_parts_copy_value);
      }
      this.serialized_parts = __this__serialized_parts;
    }
  }

  public LocalStateData deepCopy() {
    return new LocalStateData(this);
  }

  @Override
  public void clear() {
    this.serialized_parts = null;
  }

  public int get_serialized_parts_size() {
    return (this.serialized_parts == null) ? 0 : this.serialized_parts.size();
  }

  public void put_to_serialized_parts(String key, ThriftSerializedObject val) {
    if (this.serialized_parts == null) {
      this.serialized_parts = new HashMap<String,ThriftSerializedObject>();
    }
    this.serialized_parts.put(key, val);
  }

  public Map<String,ThriftSerializedObject> get_serialized_parts() {
    return this.serialized_parts;
  }

  public void set_serialized_parts(Map<String,ThriftSerializedObject> serialized_parts) {
    this.serialized_parts = serialized_parts;
  }

  public void unset_serialized_parts() {
    this.serialized_parts = null;
  }

  /** Returns true if field serialized_parts is set (has been assigned a value) and false otherwise */
  public boolean is_set_serialized_parts() {
    return this.serialized_parts != null;
  }

  public void set_serialized_parts_isSet(boolean value) {
    if (!value) {
      this.serialized_parts = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SERIALIZED_PARTS:
      if (value == null) {
        unset_serialized_parts();
      } else {
        set_serialized_parts((Map<String,ThriftSerializedObject>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SERIALIZED_PARTS:
      return get_serialized_parts();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SERIALIZED_PARTS:
      return is_set_serialized_parts();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LocalStateData)
      return this.equals((LocalStateData)that);
    return false;
  }

  public boolean equals(LocalStateData that) {
    if (that == null)
      return false;

    boolean this_present_serialized_parts = true && this.is_set_serialized_parts();
    boolean that_present_serialized_parts = true && that.is_set_serialized_parts();
    if (this_present_serialized_parts || that_present_serialized_parts) {
      if (!(this_present_serialized_parts && that_present_serialized_parts))
        return false;
      if (!this.serialized_parts.equals(that.serialized_parts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_serialized_parts = true && (is_set_serialized_parts());
    list.add(present_serialized_parts);
    if (present_serialized_parts)
      list.add(serialized_parts);

    return list.hashCode();
  }

  @Override
  public int compareTo(LocalStateData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_serialized_parts()).compareTo(other.is_set_serialized_parts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_serialized_parts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serialized_parts, other.serialized_parts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LocalStateData(");
    boolean first = true;

    sb.append("serialized_parts:");
    if (this.serialized_parts == null) {
      sb.append("null");
    } else {
      sb.append(this.serialized_parts);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_serialized_parts()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'serialized_parts' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LocalStateDataStandardSchemeFactory implements SchemeFactory {
    public LocalStateDataStandardScheme getScheme() {
      return new LocalStateDataStandardScheme();
    }
  }

  private static class LocalStateDataStandardScheme extends StandardScheme<LocalStateData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LocalStateData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SERIALIZED_PARTS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map782 = iprot.readMapBegin();
                struct.serialized_parts = new HashMap<String,ThriftSerializedObject>(2*_map782.size);
                String _key783;
                ThriftSerializedObject _val784;
                for (int _i785 = 0; _i785 < _map782.size; ++_i785)
                {
                  _key783 = iprot.readString();
                  _val784 = new ThriftSerializedObject();
                  _val784.read(iprot);
                  struct.serialized_parts.put(_key783, _val784);
                }
                iprot.readMapEnd();
              }
              struct.set_serialized_parts_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LocalStateData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.serialized_parts != null) {
        oprot.writeFieldBegin(SERIALIZED_PARTS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.serialized_parts.size()));
          for (Map.Entry<String, ThriftSerializedObject> _iter786 : struct.serialized_parts.entrySet())
          {
            oprot.writeString(_iter786.getKey());
            _iter786.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LocalStateDataTupleSchemeFactory implements SchemeFactory {
    public LocalStateDataTupleScheme getScheme() {
      return new LocalStateDataTupleScheme();
    }
  }

  private static class LocalStateDataTupleScheme extends TupleScheme<LocalStateData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LocalStateData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.serialized_parts.size());
        for (Map.Entry<String, ThriftSerializedObject> _iter787 : struct.serialized_parts.entrySet())
        {
          oprot.writeString(_iter787.getKey());
          _iter787.getValue().write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LocalStateData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map788 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.serialized_parts = new HashMap<String,ThriftSerializedObject>(2*_map788.size);
        String _key789;
        ThriftSerializedObject _val790;
        for (int _i791 = 0; _i791 < _map788.size; ++_i791)
        {
          _key789 = iprot.readString();
          _val790 = new ThriftSerializedObject();
          _val790.read(iprot);
          struct.serialized_parts.put(_key789, _val790);
        }
      }
      struct.set_serialized_parts_isSet(true);
    }
  }

}
