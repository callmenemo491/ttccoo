package com.google.android.gms.common.api;

/* loaded from: classes.dex */
public final class Status extends p270p6.AbstractC5367a implements p201l6.InterfaceC4188h, com.google.android.gms.common.internal.ReflectedParcelable {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Status> CREATOR = null;

    /* renamed from: d0 */
    @androidx.annotation.RecentlyNonNull
    public static final com.google.android.gms.common.api.Status f5532d0 = null;

    /* renamed from: e0 */
    @androidx.annotation.RecentlyNonNull
    public static final com.google.android.gms.common.api.Status f5533e0 = null;

    /* renamed from: f0 */
    @androidx.annotation.RecentlyNonNull
    public static final com.google.android.gms.common.api.Status f5534f0 = null;

    /* renamed from: Y */
    public final int f5535Y;

    /* renamed from: Z */
    public final int f5536Z;

    /* renamed from: a0 */
    public final java.lang.String f5537a0;

    /* renamed from: b0 */
    public final android.app.PendingIntent f5538b0;

    /* renamed from: c0 */
    public final p184k6.C3698b f5539c0;

    static {
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.Status.f5532d0 = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 14
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 8
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 15
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.Status.f5533e0 = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 16
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.Status.f5534f0 = r0
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 17
            r0.<init>(r1, r2)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 18
            r0.<init>(r1, r2)
            l6.l r0 = new l6.l
            r0.<init>()
            com.google.android.gms.common.api.Status.CREATOR = r0
            return
    }

    public Status(int r1, int r2, java.lang.String r3, android.app.PendingIntent r4, p184k6.C3698b r5) {
            r0 = this;
            r0.<init>()
            r0.f5535Y = r1
            r0.f5536Z = r2
            r0.f5537a0 = r3
            r0.f5538b0 = r4
            r0.f5539c0 = r5
            return
    }

    public Status(int r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f5535Y = r0
            r1.f5536Z = r2
            r1.f5537a0 = r3
            r2 = 0
            r1.f5538b0 = r2
            r1.f5539c0 = r2
            return
    }

    @Override // p201l6.InterfaceC4188h
    @androidx.annotation.RecentlyNonNull
    /* renamed from: F */
    public final com.google.android.gms.common.api.Status mo3030F() {
            r0 = this;
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    /* renamed from: a */
    public final java.lang.String m3041a() {
            r1 = this;
            java.lang.String r0 = r1.f5537a0
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r1.f5536Z
            java.lang.String r0 = p036c6.C0883f.m2597a(r0)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.common.api.Status
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.common.api.Status r4 = (com.google.android.gms.common.api.Status) r4
            int r0 = r3.f5535Y
            int r2 = r4.f5535Y
            if (r0 != r2) goto L34
            int r0 = r3.f5536Z
            int r2 = r4.f5536Z
            if (r0 != r2) goto L34
            java.lang.String r0 = r3.f5537a0
            java.lang.String r2 = r4.f5537a0
            boolean r0 = p248o6.C4924o.m11074a(r0, r2)
            if (r0 == 0) goto L34
            android.app.PendingIntent r0 = r3.f5538b0
            android.app.PendingIntent r2 = r4.f5538b0
            boolean r0 = p248o6.C4924o.m11074a(r0, r2)
            if (r0 == 0) goto L34
            k6.b r0 = r3.f5539c0
            k6.b r4 = r4.f5539c0
            boolean r4 = p248o6.C4924o.m11074a(r0, r4)
            if (r4 == 0) goto L34
            r4 = 1
            return r4
        L34:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.f5535Y
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.f5536Z
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = r3.f5537a0
            r2 = 2
            r0[r2] = r1
            android.app.PendingIntent r1 = r3.f5538b0
            r2 = 3
            r0[r2] = r1
            k6.b r1 = r3.f5539c0
            r2 = 4
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    public final java.lang.String toString() {
            r3 = this;
            o6.o$a r0 = new o6.o$a
            r1 = 0
            r0.<init>(r3, r1)
            java.lang.String r1 = r3.m3041a()
            java.lang.String r2 = "statusCode"
            r0.m11075a(r2, r1)
            android.app.PendingIntent r1 = r3.f5538b0
            java.lang.String r2 = "resolution"
            r0.m11075a(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r6, int r7) {
            r5 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            int r1 = r5.f5536Z
            r2 = 1
            r3 = 4
            p270p6.C5369c.m11724l(r6, r2, r3)
            r6.writeInt(r1)
            java.lang.String r1 = r5.f5537a0
            r2 = 2
            r4 = 0
            p270p6.C5369c.m11719g(r6, r2, r1, r4)
            android.app.PendingIntent r1 = r5.f5538b0
            r2 = 3
            p270p6.C5369c.m11718f(r6, r2, r1, r7, r4)
            k6.b r1 = r5.f5539c0
            p270p6.C5369c.m11718f(r6, r3, r1, r7, r4)
            int r7 = r5.f5535Y
            r1 = 1000(0x3e8, float:1.401E-42)
            p270p6.C5369c.m11724l(r6, r1, r3)
            r6.writeInt(r7)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
