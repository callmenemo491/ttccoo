package p036c6;

/* renamed from: c6.a */
/* loaded from: classes.dex */
public class C0871a extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0871a> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f4712Y;

    /* renamed from: Z */
    public final java.lang.String f4713Z;

    /* renamed from: a0 */
    public final long f4714a0;

    /* renamed from: b0 */
    public final java.lang.String f4715b0;

    /* renamed from: c0 */
    public final java.lang.String f4716c0;

    /* renamed from: d0 */
    public final java.lang.String f4717d0;

    /* renamed from: e0 */
    public java.lang.String f4718e0;

    /* renamed from: f0 */
    public final java.lang.String f4719f0;

    /* renamed from: g0 */
    public final java.lang.String f4720g0;

    /* renamed from: h0 */
    public final long f4721h0;

    /* renamed from: i0 */
    public final java.lang.String f4722i0;

    /* renamed from: j0 */
    public final p036c6.C0909s f4723j0;

    /* renamed from: k0 */
    public org.json.JSONObject f4724k0;

    static {
            c6.u r0 = new c6.u
            r0.<init>()
            p036c6.C0871a.CREATOR = r0
            return
    }

    public C0871a(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, long r11, java.lang.String r13, p036c6.C0909s r14) {
            r0 = this;
            r0.<init>()
            r0.f4712Y = r1
            r0.f4713Z = r2
            r0.f4714a0 = r3
            r0.f4715b0 = r5
            r0.f4716c0 = r6
            r0.f4717d0 = r7
            r0.f4718e0 = r8
            r0.f4719f0 = r9
            r0.f4720g0 = r10
            r0.f4721h0 = r11
            r0.f4722i0 = r13
            r0.f4723j0 = r14
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L4e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2b
            java.lang.String r2 = r0.f4718e0     // Catch: org.json.JSONException -> L2b
            r1.<init>(r2)     // Catch: org.json.JSONException -> L2b
            r0.f4724k0 = r1     // Catch: org.json.JSONException -> L2b
            return
        L2b:
            r1 = move-exception
            java.util.Locale r2 = java.util.Locale.ROOT
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.String r1 = r1.getMessage()
            r3[r4] = r1
            java.lang.String r1 = "Error creating AdBreakClipInfo: %s"
            java.lang.String r1 = java.lang.String.format(r2, r1, r3)
            java.lang.String r2 = "AdBreakClipInfo"
            android.util.Log.w(r2, r1)
            r1 = 0
            r0.f4718e0 = r1
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L4b:
            r0.f4724k0 = r1
            return
        L4e:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            goto L4b
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p036c6.C0871a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.a r8 = (p036c6.C0871a) r8
            java.lang.String r1 = r7.f4712Y
            java.lang.String r3 = r8.f4712Y
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L81
            java.lang.String r1 = r7.f4713Z
            java.lang.String r3 = r8.f4713Z
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L81
            long r3 = r7.f4714a0
            long r5 = r8.f4714a0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r1 = r7.f4715b0
            java.lang.String r3 = r8.f4715b0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L81
            java.lang.String r1 = r7.f4716c0
            java.lang.String r3 = r8.f4716c0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L81
            java.lang.String r1 = r7.f4717d0
            java.lang.String r3 = r8.f4717d0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L81
            java.lang.String r1 = r7.f4718e0
            java.lang.String r3 = r8.f4718e0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L81
            java.lang.String r1 = r7.f4719f0
            java.lang.String r3 = r8.f4719f0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L81
            java.lang.String r1 = r7.f4720g0
            java.lang.String r3 = r8.f4720g0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L81
            long r3 = r7.f4721h0
            long r5 = r8.f4721h0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L81
            java.lang.String r1 = r7.f4722i0
            java.lang.String r3 = r8.f4722i0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L81
            c6.s r1 = r7.f4723j0
            c6.s r8 = r8.f4723j0
            boolean r8 = p123h6.C2487a.m6368g(r1, r8)
            if (r8 == 0) goto L81
            return r0
        L81:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 12
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.f4712Y
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.f4713Z
            r2 = 1
            r0[r2] = r1
            long r1 = r3.f4714a0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = r3.f4715b0
            r2 = 3
            r0[r2] = r1
            java.lang.String r1 = r3.f4716c0
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = r3.f4717d0
            r2 = 5
            r0[r2] = r1
            java.lang.String r1 = r3.f4718e0
            r2 = 6
            r0[r2] = r1
            java.lang.String r1 = r3.f4719f0
            r2 = 7
            r0[r2] = r1
            java.lang.String r1 = r3.f4720g0
            r2 = 8
            r0[r2] = r1
            long r1 = r3.f4721h0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 9
            r0[r2] = r1
            java.lang.String r1 = r3.f4722i0
            r2 = 10
            r0[r2] = r1
            c6.s r1 = r3.f4723j0
            r2 = 11
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r7, int r8) {
            r6 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r7, r0)
            r1 = 2
            java.lang.String r2 = r6.f4712Y
            r3 = 0
            p270p6.C5369c.m11719g(r7, r1, r2, r3)
            r1 = 3
            java.lang.String r2 = r6.f4713Z
            p270p6.C5369c.m11719g(r7, r1, r2, r3)
            r1 = 4
            long r4 = r6.f4714a0
            r2 = 8
            p270p6.C5369c.m11724l(r7, r1, r2)
            r7.writeLong(r4)
            r1 = 5
            java.lang.String r4 = r6.f4715b0
            p270p6.C5369c.m11719g(r7, r1, r4, r3)
            r1 = 6
            java.lang.String r4 = r6.f4716c0
            p270p6.C5369c.m11719g(r7, r1, r4, r3)
            r1 = 7
            java.lang.String r4 = r6.f4717d0
            p270p6.C5369c.m11719g(r7, r1, r4, r3)
            java.lang.String r1 = r6.f4718e0
            p270p6.C5369c.m11719g(r7, r2, r1, r3)
            r1 = 9
            java.lang.String r4 = r6.f4719f0
            p270p6.C5369c.m11719g(r7, r1, r4, r3)
            r1 = 10
            java.lang.String r4 = r6.f4720g0
            p270p6.C5369c.m11719g(r7, r1, r4, r3)
            r1 = 11
            long r4 = r6.f4721h0
            p270p6.C5369c.m11724l(r7, r1, r2)
            r7.writeLong(r4)
            r1 = 12
            java.lang.String r2 = r6.f4722i0
            p270p6.C5369c.m11719g(r7, r1, r2, r3)
            r1 = 13
            c6.s r2 = r6.f4723j0
            p270p6.C5369c.m11718f(r7, r1, r2, r8, r3)
            p270p6.C5369c.m11726n(r7, r0)
            return
    }
}
