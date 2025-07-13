package com.google.android.gms.common.internal;

@com.google.android.gms.common.annotation.KeepName
/* loaded from: classes.dex */
public final class BinderWrapper implements android.os.Parcelable {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.BinderWrapper> CREATOR = null;

    /* renamed from: Y */
    public android.os.IBinder f5631Y;

    static {
            o6.g0 r0 = new o6.g0
            r0.<init>()
            com.google.android.gms.common.internal.BinderWrapper.CREATOR = r0
            return
    }

    public BinderWrapper(@androidx.annotation.RecentlyNonNull android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.f5631Y = r1
            return
    }

    public BinderWrapper(android.os.Parcel r1, p248o6.C4909g0 r2) {
            r0 = this;
            r0.<init>()
            android.os.IBinder r1 = r1.readStrongBinder()
            r0.f5631Y = r1
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r1, int r2) {
            r0 = this;
            android.os.IBinder r2 = r0.f5631Y
            r1.writeStrongBinder(r2)
            return
    }
}
