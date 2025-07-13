package p124h7;

/* renamed from: h7.xe */
/* loaded from: classes.dex */
public final class C2950xe extends p270p6.AbstractC5367a implements p124h7.InterfaceC2534ad {
    public static final android.os.Parcelable.Creator<p124h7.C2950xe> CREATOR = null;

    /* renamed from: Y */
    public final java.lang.String f12023Y;

    /* renamed from: Z */
    public final long f12024Z;

    /* renamed from: a0 */
    public final boolean f12025a0;

    /* renamed from: b0 */
    public final java.lang.String f12026b0;

    /* renamed from: c0 */
    public final java.lang.String f12027c0;

    /* renamed from: d0 */
    public final java.lang.String f12028d0;

    /* renamed from: e0 */
    public final boolean f12029e0;

    /* renamed from: f0 */
    public final java.lang.String f12030f0;

    /* renamed from: g0 */
    public p124h7.C2625fd f12031g0;

    static {
            h7.ye r0 = new h7.ye
            r0.<init>()
            p124h7.C2950xe.CREATOR = r0
            return
    }

    public C2950xe(java.lang.String r1, long r2, boolean r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, java.lang.String r9) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            r0.f12023Y = r1
            r0.f12024Z = r2
            r0.f12025a0 = r4
            r0.f12026b0 = r5
            r0.f12027c0 = r6
            r0.f12028d0 = r7
            r0.f12029e0 = r8
            r0.f12030f0 = r9
            return
    }

    @Override // p124h7.InterfaceC2534ad
    /* renamed from: a */
    public final java.lang.String mo27a() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r3.f12023Y
            java.lang.String r2 = "phoneNumber"
            r0.put(r2, r1)
            java.lang.String r1 = r3.f12027c0
            if (r1 == 0) goto L15
            java.lang.String r2 = "tenantId"
            r0.put(r2, r1)
        L15:
            java.lang.String r1 = r3.f12028d0
            if (r1 == 0) goto L1e
            java.lang.String r2 = "recaptchaToken"
            r0.put(r2, r1)
        L1e:
            h7.fd r1 = r3.f12031g0
            if (r1 == 0) goto L2b
            org.json.JSONObject r1 = r1.m6721b()
            java.lang.String r2 = "autoRetrievalInfo"
            r0.put(r2, r1)
        L2b:
            java.lang.String r1 = r3.f12030f0
            if (r1 == 0) goto L34
            java.lang.String r2 = "safetyNetToken"
            r0.put(r2, r1)
        L34:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            r7 = 20293(0x4f45, float:2.8437E-41)
            int r7 = p270p6.C5369c.m11723k(r6, r7)
            r0 = 1
            java.lang.String r1 = r5.f12023Y
            r2 = 0
            p270p6.C5369c.m11719g(r6, r0, r1, r2)
            r0 = 2
            long r3 = r5.f12024Z
            r1 = 8
            p270p6.C5369c.m11724l(r6, r0, r1)
            r6.writeLong(r3)
            r0 = 3
            boolean r3 = r5.f12025a0
            r4 = 4
            p270p6.C5369c.m11724l(r6, r0, r4)
            r6.writeInt(r3)
            java.lang.String r0 = r5.f12026b0
            p270p6.C5369c.m11719g(r6, r4, r0, r2)
            r0 = 5
            java.lang.String r3 = r5.f12027c0
            p270p6.C5369c.m11719g(r6, r0, r3, r2)
            r0 = 6
            java.lang.String r3 = r5.f12028d0
            p270p6.C5369c.m11719g(r6, r0, r3, r2)
            r0 = 7
            boolean r3 = r5.f12029e0
            p270p6.C5369c.m11724l(r6, r0, r4)
            r6.writeInt(r3)
            java.lang.String r0 = r5.f12030f0
            p270p6.C5369c.m11719g(r6, r1, r0, r2)
            p270p6.C5369c.m11726n(r6, r7)
            return
    }
}
