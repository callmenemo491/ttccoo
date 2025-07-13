package com.google.android.gms.cast;

/* loaded from: classes.dex */
public class CastDevice extends p270p6.AbstractC5367a implements com.google.android.gms.common.internal.ReflectedParcelable {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<com.google.android.gms.cast.CastDevice> CREATOR = null;

    /* renamed from: Y */
    public java.lang.String f5350Y;

    /* renamed from: Z */
    public java.lang.String f5351Z;

    /* renamed from: a0 */
    public java.net.InetAddress f5352a0;

    /* renamed from: b0 */
    public java.lang.String f5353b0;

    /* renamed from: c0 */
    public java.lang.String f5354c0;

    /* renamed from: d0 */
    public java.lang.String f5355d0;

    /* renamed from: e0 */
    public int f5356e0;

    /* renamed from: f0 */
    public java.util.List<p233n6.C4691a> f5357f0;

    /* renamed from: g0 */
    public int f5358g0;

    /* renamed from: h0 */
    public int f5359h0;

    /* renamed from: i0 */
    public java.lang.String f5360i0;

    /* renamed from: j0 */
    public final java.lang.String f5361j0;

    /* renamed from: k0 */
    public int f5362k0;

    /* renamed from: l0 */
    public final java.lang.String f5363l0;

    /* renamed from: m0 */
    public byte[] f5364m0;

    /* renamed from: n0 */
    public final java.lang.String f5365n0;

    /* renamed from: o0 */
    public final boolean f5366o0;

    static {
            c6.b1 r0 = new c6.b1
            r0.<init>()
            com.google.android.gms.cast.CastDevice.CREATOR = r0
            return
    }

    public CastDevice(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, java.util.List<p233n6.C4691a> r14, int r15, int r16, java.lang.String r17, java.lang.String r18, int r19, java.lang.String r20, byte[] r21, java.lang.String r22, boolean r23) {
            r7 = this;
            r1 = r7
            r7.<init>()
            java.lang.String r2 = ""
            if (r8 != 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r8
        Lb:
            r1.f5350Y = r0
            if (r9 != 0) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r9
        L12:
            r1.f5351Z = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = r1.f5351Z     // Catch: java.net.UnknownHostException -> L23
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch: java.net.UnknownHostException -> L23
            r1.f5352a0 = r0     // Catch: java.net.UnknownHostException -> L23
            goto L5b
        L23:
            r0 = move-exception
            java.lang.String r3 = r1.f5351Z
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 48
            int r4 = r4 + r5
            r6.<init>(r4)
            java.lang.String r4 = "Unable to convert host address ("
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = ") to ipaddress: "
            r6.append(r3)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r3 = "CastDevice"
            android.util.Log.i(r3, r0)
        L5b:
            if (r10 != 0) goto L5f
            r0 = r2
            goto L60
        L5f:
            r0 = r10
        L60:
            r1.f5353b0 = r0
            if (r11 != 0) goto L66
            r0 = r2
            goto L67
        L66:
            r0 = r11
        L67:
            r1.f5354c0 = r0
            if (r12 != 0) goto L6d
            r0 = r2
            goto L6e
        L6d:
            r0 = r12
        L6e:
            r1.f5355d0 = r0
            r3 = r13
            r1.f5356e0 = r3
            if (r14 == 0) goto L77
            r0 = r14
            goto L7c
        L77:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L7c:
            r1.f5357f0 = r0
            r3 = r15
            r1.f5358g0 = r3
            r3 = r16
            r1.f5359h0 = r3
            if (r17 != 0) goto L88
            goto L8a
        L88:
            r2 = r17
        L8a:
            r1.f5360i0 = r2
            r2 = r18
            r1.f5361j0 = r2
            r2 = r19
            r1.f5362k0 = r2
            r2 = r20
            r1.f5363l0 = r2
            r2 = r21
            r1.f5364m0 = r2
            r2 = r22
            r1.f5365n0 = r2
            r2 = r23
            r1.f5366o0 = r2
            return
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: X */
    public static com.google.android.gms.cast.CastDevice m2927X(android.os.Bundle r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.Class<com.google.android.gms.cast.CastDevice> r1 = com.google.android.gms.cast.CastDevice.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 != 0) goto Ld
            return r0
        Ld:
            r2.setClassLoader(r1)
            java.lang.String r0 = "com.google.android.gms.cast.EXTRA_CAST_DEVICE"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            com.google.android.gms.cast.CastDevice r2 = (com.google.android.gms.cast.CastDevice) r2
            return r2
    }

    /* renamed from: Y */
    public boolean m2928Y(int r2) {
            r1 = this;
            int r0 = r1.f5358g0
            r0 = r0 & r2
            if (r0 != r2) goto L7
            r2 = 1
            return r2
        L7:
            r2 = 0
            return r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.cast.CastDevice
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.cast.CastDevice r5 = (com.google.android.gms.cast.CastDevice) r5
            java.lang.String r1 = r4.f5350Y
            if (r1 != 0) goto L16
            java.lang.String r5 = r5.f5350Y
            if (r5 != 0) goto L15
            return r0
        L15:
            return r2
        L16:
            java.lang.String r3 = r5.f5350Y
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc3
            java.net.InetAddress r1 = r4.f5352a0
            java.net.InetAddress r3 = r5.f5352a0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc3
            java.lang.String r1 = r4.f5354c0
            java.lang.String r3 = r5.f5354c0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc3
            java.lang.String r1 = r4.f5353b0
            java.lang.String r3 = r5.f5353b0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc3
            java.lang.String r1 = r4.f5355d0
            java.lang.String r3 = r5.f5355d0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc3
            int r1 = r4.f5356e0
            int r3 = r5.f5356e0
            if (r1 != r3) goto Lc3
            java.util.List<n6.a> r1 = r4.f5357f0
            java.util.List<n6.a> r3 = r5.f5357f0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc3
            int r1 = r4.f5358g0
            int r3 = r5.f5358g0
            if (r1 != r3) goto Lc3
            int r1 = r4.f5359h0
            int r3 = r5.f5359h0
            if (r1 != r3) goto Lc3
            java.lang.String r1 = r4.f5360i0
            java.lang.String r3 = r5.f5360i0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc3
            int r1 = r4.f5362k0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r3 = r5.f5362k0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc3
            java.lang.String r1 = r4.f5363l0
            java.lang.String r3 = r5.f5363l0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc3
            java.lang.String r1 = r4.f5361j0
            java.lang.String r3 = r5.f5361j0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc3
            java.lang.String r1 = r4.f5355d0
            java.lang.String r3 = r5.f5355d0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc3
            int r1 = r4.f5356e0
            int r3 = r5.f5356e0
            if (r1 != r3) goto Lc3
            byte[] r1 = r4.f5364m0
            if (r1 != 0) goto Laa
            byte[] r3 = r5.f5364m0
            if (r3 == 0) goto Lb2
        Laa:
            byte[] r3 = r5.f5364m0
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto Lc3
        Lb2:
            java.lang.String r1 = r4.f5365n0
            java.lang.String r3 = r5.f5365n0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto Lc3
            boolean r1 = r4.f5366o0
            boolean r5 = r5.f5366o0
            if (r1 != r5) goto Lc3
            return r0
        Lc3:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f5350Y
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    public java.lang.String toString() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.f5353b0
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.f5350Y
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "\"%s\" (%s)"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r5, int r6) {
            r4 = this;
            r6 = 20293(0x4f45, float:2.8437E-41)
            int r6 = p270p6.C5369c.m11723k(r5, r6)
            java.lang.String r0 = r4.f5350Y
            r1 = 2
            r2 = 0
            p270p6.C5369c.m11719g(r5, r1, r0, r2)
            java.lang.String r0 = r4.f5351Z
            r1 = 3
            p270p6.C5369c.m11719g(r5, r1, r0, r2)
            java.lang.String r0 = r4.f5353b0
            r1 = 4
            p270p6.C5369c.m11719g(r5, r1, r0, r2)
            java.lang.String r0 = r4.f5354c0
            r3 = 5
            p270p6.C5369c.m11719g(r5, r3, r0, r2)
            java.lang.String r0 = r4.f5355d0
            r3 = 6
            p270p6.C5369c.m11719g(r5, r3, r0, r2)
            int r0 = r4.f5356e0
            r3 = 7
            p270p6.C5369c.m11724l(r5, r3, r1)
            r5.writeInt(r0)
            java.util.List<n6.a> r0 = r4.f5357f0
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r3 = 8
            p270p6.C5369c.m11722j(r5, r3, r0, r2)
            int r0 = r4.f5358g0
            r3 = 9
            p270p6.C5369c.m11724l(r5, r3, r1)
            r5.writeInt(r0)
            int r0 = r4.f5359h0
            r3 = 10
            p270p6.C5369c.m11724l(r5, r3, r1)
            r5.writeInt(r0)
            java.lang.String r0 = r4.f5360i0
            r3 = 11
            p270p6.C5369c.m11719g(r5, r3, r0, r2)
            java.lang.String r0 = r4.f5361j0
            r3 = 12
            p270p6.C5369c.m11719g(r5, r3, r0, r2)
            int r0 = r4.f5362k0
            r3 = 13
            p270p6.C5369c.m11724l(r5, r3, r1)
            r5.writeInt(r0)
            java.lang.String r0 = r4.f5363l0
            r3 = 14
            p270p6.C5369c.m11719g(r5, r3, r0, r2)
            byte[] r0 = r4.f5364m0
            if (r0 != 0) goto L71
            goto L7d
        L71:
            r3 = 15
            int r3 = p270p6.C5369c.m11723k(r5, r3)
            r5.writeByteArray(r0)
            p270p6.C5369c.m11726n(r5, r3)
        L7d:
            r0 = 16
            java.lang.String r3 = r4.f5365n0
            p270p6.C5369c.m11719g(r5, r0, r3, r2)
            r0 = 17
            boolean r2 = r4.f5366o0
            p270p6.C5369c.m11724l(r5, r0, r1)
            r5.writeInt(r2)
            p270p6.C5369c.m11726n(r5, r6)
            return
    }
}
