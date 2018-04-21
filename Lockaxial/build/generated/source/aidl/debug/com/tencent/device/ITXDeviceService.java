/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\workspace\\LockaxialQQ_xl\\LockaxialQQ-master\\Lockaxial\\src\\main\\aidl\\com\\tencent\\device\\ITXDeviceService.aidl
 */
package com.tencent.device;
public interface ITXDeviceService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.tencent.device.ITXDeviceService
{
private static final java.lang.String DESCRIPTOR = "com.tencent.device.ITXDeviceService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.tencent.device.ITXDeviceService interface,
 * generating a proxy if needed.
 */
public static com.tencent.device.ITXDeviceService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.tencent.device.ITXDeviceService))) {
return ((com.tencent.device.ITXDeviceService)iin);
}
return new com.tencent.device.ITXDeviceService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getSelfDin:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getSelfDin();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getVideoChatSignature:
{
data.enforceInterface(DESCRIPTOR);
byte[] _result = this.getVideoChatSignature();
reply.writeNoException();
reply.writeByteArray(_result);
return true;
}
case TRANSACTION_notifyVideoServiceStarted:
{
data.enforceInterface(DESCRIPTOR);
this.notifyVideoServiceStarted();
reply.writeNoException();
return true;
}
case TRANSACTION_sendVideoCall:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
byte[] _arg1;
_arg1 = data.createByteArray();
this.sendVideoCall(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_sendVideoCallM2M:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
byte[] _arg1;
_arg1 = data.createByteArray();
this.sendVideoCallM2M(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_sendVideoCMD:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
byte[] _arg1;
_arg1 = data.createByteArray();
this.sendVideoCMD(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.tencent.device.ITXDeviceService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public long getSelfDin() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSelfDin, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public byte[] getVideoChatSignature() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getVideoChatSignature, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void notifyVideoServiceStarted() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_notifyVideoServiceStarted, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendVideoCall(long peerUin, byte[] msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(peerUin);
_data.writeByteArray(msg);
mRemote.transact(Stub.TRANSACTION_sendVideoCall, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendVideoCallM2M(long peerUin, byte[] msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(peerUin);
_data.writeByteArray(msg);
mRemote.transact(Stub.TRANSACTION_sendVideoCallM2M, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void sendVideoCMD(long peerUin, byte[] msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(peerUin);
_data.writeByteArray(msg);
mRemote.transact(Stub.TRANSACTION_sendVideoCMD, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getSelfDin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getVideoChatSignature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_notifyVideoServiceStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_sendVideoCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_sendVideoCallM2M = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_sendVideoCMD = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public long getSelfDin() throws android.os.RemoteException;
public byte[] getVideoChatSignature() throws android.os.RemoteException;
public void notifyVideoServiceStarted() throws android.os.RemoteException;
public void sendVideoCall(long peerUin, byte[] msg) throws android.os.RemoteException;
public void sendVideoCallM2M(long peerUin, byte[] msg) throws android.os.RemoteException;
public void sendVideoCMD(long peerUin, byte[] msg) throws android.os.RemoteException;
}
