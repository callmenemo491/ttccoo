package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public final class Scope extends p270p6.AbstractC5367a implements com.google.android.gms.common.internal.ReflectedParcelable {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Scope> CREATOR = null;

    /* renamed from: Y */
    public final int f5530Y;

    /* renamed from: Z */
    public final java.lang.String f5531Z;

    static {
            l6.k r0 = new l6.k
            r0.<init>()
            com.google.android.gms.common.api.Scope.CREATOR = r0
            return
    }

    public Scope(int r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "scopeUri must not be null or empty"
            com.google.android.gms.common.internal.C1101a.m3101f(r3, r0)
            r1.f5530Y = r2
            r1.f5531Z = r3
            return
    }

    public Scope(@androidx.annotation.RecentlyNonNull java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "scopeUri must not be null or empty"
            com.google.android.gms.common.internal.C1101a.m3101f(r2, r0)
            r0 = 1
            r1.f5530Y = r0
            r1.f5531Z = r2
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof com.google.android.gms.common.api.Scope
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.String r0 = r1.f5531Z
            com.google.android.gms.common.api.Scope r2 = (com.google.android.gms.common.api.Scope) r2
            java.lang.String r2 = r2.f5531Z
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f5531Z
            int r0 = r0.hashCode()
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f5531Z
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r4, int r5) {
            r3 = this;
            r5 = 20293(0x4f45, float:2.8437E-41)
            int r5 = p270p6.C5369c.m11723k(r4, r5)
            r0 = 1
            int r1 = r3.f5530Y
            r2 = 4
            p270p6.C5369c.m11724l(r4, r0, r2)
            r4.writeInt(r1)
            r0 = 2
            java.lang.String r1 = r3.f5531Z
            r2 = 0
            p270p6.C5369c.m11719g(r4, r0, r1, r2)
            p270p6.C5369c.m11726n(r4, r5)
            return
    }
}
