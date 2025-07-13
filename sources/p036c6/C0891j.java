package p036c6;

/* renamed from: c6.j */
/* loaded from: classes.dex */
public class C0891j extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0891j> CREATOR = null;

    /* renamed from: Y */
    public final com.google.android.gms.cast.MediaInfo f4778Y;

    /* renamed from: Z */
    public final p036c6.C0897m f4779Z;

    /* renamed from: a0 */
    public final java.lang.Boolean f4780a0;

    /* renamed from: b0 */
    public final long f4781b0;

    /* renamed from: c0 */
    public final double f4782c0;

    /* renamed from: d0 */
    public final long[] f4783d0;

    /* renamed from: e0 */
    public java.lang.String f4784e0;

    /* renamed from: f0 */
    public final org.json.JSONObject f4785f0;

    /* renamed from: g0 */
    public final java.lang.String f4786g0;

    /* renamed from: h0 */
    public final java.lang.String f4787h0;

    /* renamed from: i0 */
    public final java.lang.String f4788i0;

    /* renamed from: j0 */
    public final java.lang.String f4789j0;

    /* renamed from: k0 */
    public long f4790k0;

    static {
            java.lang.String r0 = "MediaLoadRequestData"
            java.lang.String r1 = "The log tag cannot be null or empty."
            com.google.android.gms.common.internal.C1101a.m3101f(r0, r1)
            c6.m0 r0 = new c6.m0
            r0.<init>()
            p036c6.C0891j.CREATOR = r0
            return
    }

    public C0891j(com.google.android.gms.cast.MediaInfo r1, p036c6.C0897m r2, java.lang.Boolean r3, long r4, double r6, long[] r8, org.json.JSONObject r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, long r14) {
            r0 = this;
            r0.<init>()
            r0.f4778Y = r1
            r0.f4779Z = r2
            r0.f4780a0 = r3
            r0.f4781b0 = r4
            r0.f4782c0 = r6
            r0.f4783d0 = r8
            r0.f4785f0 = r9
            r0.f4786g0 = r10
            r0.f4787h0 = r11
            r0.f4788i0 = r12
            r0.f4789j0 = r13
            r0.f4790k0 = r14
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p036c6.C0891j
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.j r8 = (p036c6.C0891j) r8
            org.json.JSONObject r1 = r7.f4785f0
            org.json.JSONObject r3 = r8.f4785f0
            boolean r1 = p353u6.C6344g.m12994a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.google.android.gms.cast.MediaInfo r1 = r7.f4778Y
            com.google.android.gms.cast.MediaInfo r3 = r8.f4778Y
            boolean r1 = p248o6.C4924o.m11074a(r1, r3)
            if (r1 == 0) goto L80
            c6.m r1 = r7.f4779Z
            c6.m r3 = r8.f4779Z
            boolean r1 = p248o6.C4924o.m11074a(r1, r3)
            if (r1 == 0) goto L80
            java.lang.Boolean r1 = r7.f4780a0
            java.lang.Boolean r3 = r8.f4780a0
            boolean r1 = p248o6.C4924o.m11074a(r1, r3)
            if (r1 == 0) goto L80
            long r3 = r7.f4781b0
            long r5 = r8.f4781b0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L80
            double r3 = r7.f4782c0
            double r5 = r8.f4782c0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L80
            long[] r1 = r7.f4783d0
            long[] r3 = r8.f4783d0
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L80
            java.lang.String r1 = r7.f4786g0
            java.lang.String r3 = r8.f4786g0
            boolean r1 = p248o6.C4924o.m11074a(r1, r3)
            if (r1 == 0) goto L80
            java.lang.String r1 = r7.f4787h0
            java.lang.String r3 = r8.f4787h0
            boolean r1 = p248o6.C4924o.m11074a(r1, r3)
            if (r1 == 0) goto L80
            java.lang.String r1 = r7.f4788i0
            java.lang.String r3 = r8.f4788i0
            boolean r1 = p248o6.C4924o.m11074a(r1, r3)
            if (r1 == 0) goto L80
            java.lang.String r1 = r7.f4789j0
            java.lang.String r3 = r8.f4789j0
            boolean r1 = p248o6.C4924o.m11074a(r1, r3)
            if (r1 == 0) goto L80
            long r3 = r7.f4790k0
            long r5 = r8.f4790k0
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L80
            return r0
        L80:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 12
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.cast.MediaInfo r1 = r3.f4778Y
            r2 = 0
            r0[r2] = r1
            c6.m r1 = r3.f4779Z
            r2 = 1
            r0[r2] = r1
            java.lang.Boolean r1 = r3.f4780a0
            r2 = 2
            r0[r2] = r1
            long r1 = r3.f4781b0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            double r1 = r3.f4782c0
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            long[] r1 = r3.f4783d0
            r2 = 5
            r0[r2] = r1
            org.json.JSONObject r1 = r3.f4785f0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            java.lang.String r1 = r3.f4786g0
            r2 = 7
            r0[r2] = r1
            java.lang.String r1 = r3.f4787h0
            r2 = 8
            r0[r2] = r1
            java.lang.String r1 = r3.f4788i0
            r2 = 9
            r0[r2] = r1
            java.lang.String r1 = r3.f4789j0
            r2 = 10
            r0[r2] = r1
            long r1 = r3.f4790k0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 11
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r6, int r7) {
            r5 = this;
            org.json.JSONObject r0 = r5.f4785f0
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = r0.toString()
        La:
            r5.f4784e0 = r0
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            r1 = 2
            com.google.android.gms.cast.MediaInfo r2 = r5.f4778Y
            r3 = 0
            p270p6.C5369c.m11718f(r6, r1, r2, r7, r3)
            r1 = 3
            c6.m r2 = r5.f4779Z
            p270p6.C5369c.m11718f(r6, r1, r2, r7, r3)
            r7 = 4
            java.lang.Boolean r1 = r5.f4780a0
            p270p6.C5369c.m11713a(r6, r7, r1, r3)
            r7 = 5
            long r1 = r5.f4781b0
            r4 = 8
            p270p6.C5369c.m11724l(r6, r7, r4)
            r6.writeLong(r1)
            r7 = 6
            double r1 = r5.f4782c0
            p270p6.C5369c.m11724l(r6, r7, r4)
            r6.writeDouble(r1)
            r7 = 7
            long[] r1 = r5.f4783d0
            p270p6.C5369c.m11716d(r6, r7, r1, r3)
            java.lang.String r7 = r5.f4784e0
            p270p6.C5369c.m11719g(r6, r4, r7, r3)
            r7 = 9
            java.lang.String r1 = r5.f4786g0
            p270p6.C5369c.m11719g(r6, r7, r1, r3)
            r7 = 10
            java.lang.String r1 = r5.f4787h0
            p270p6.C5369c.m11719g(r6, r7, r1, r3)
            r7 = 11
            java.lang.String r1 = r5.f4788i0
            p270p6.C5369c.m11719g(r6, r7, r1, r3)
            r7 = 12
            java.lang.String r1 = r5.f4789j0
            p270p6.C5369c.m11719g(r6, r7, r1, r3)
            r7 = 13
            long r1 = r5.f4790k0
            p270p6.C5369c.m11724l(r6, r7, r4)
            r6.writeLong(r1)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
