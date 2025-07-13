package p249o7;

/* renamed from: o7.p6 */
/* loaded from: classes.dex */
public final class C5076p6 extends p270p6.AbstractC5367a {
    public static final android.os.Parcelable.Creator<p249o7.C5076p6> CREATOR = null;

    /* renamed from: Y */
    public final int f19944Y;

    /* renamed from: Z */
    public final java.lang.String f19945Z;

    /* renamed from: a0 */
    public final long f19946a0;

    /* renamed from: b0 */
    public final java.lang.Long f19947b0;

    /* renamed from: c0 */
    public final java.lang.String f19948c0;

    /* renamed from: d0 */
    public final java.lang.String f19949d0;

    /* renamed from: e0 */
    public final java.lang.Double f19950e0;

    static {
            o7.q6 r0 = new o7.q6
            r0.<init>()
            p249o7.C5076p6.CREATOR = r0
            return
    }

    public C5076p6(int r1, java.lang.String r2, long r3, java.lang.Long r5, java.lang.Float r6, java.lang.String r7, java.lang.String r8, java.lang.Double r9) {
            r0 = this;
            r0.<init>()
            r0.f19944Y = r1
            r0.f19945Z = r2
            r0.f19946a0 = r3
            r0.f19947b0 = r5
            r2 = 1
            if (r1 != r2) goto L1d
            if (r6 == 0) goto L19
            double r1 = r6.doubleValue()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            goto L1a
        L19:
            r1 = 0
        L1a:
            r0.f19950e0 = r1
            goto L1f
        L1d:
            r0.f19950e0 = r9
        L1f:
            r0.f19948c0 = r7
            r0.f19949d0 = r8
            return
    }

    public C5076p6(java.lang.String r2, long r3, java.lang.Object r5, java.lang.String r6) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r0 = 2
            r1.f19944Y = r0
            r1.f19945Z = r2
            r1.f19946a0 = r3
            r1.f19949d0 = r6
            r2 = 0
            if (r5 != 0) goto L19
            r1.f19947b0 = r2
            r1.f19950e0 = r2
            r1.f19948c0 = r2
            return
        L19:
            boolean r3 = r5 instanceof java.lang.Long
            if (r3 == 0) goto L26
            java.lang.Long r5 = (java.lang.Long) r5
            r1.f19947b0 = r5
            r1.f19950e0 = r2
            r1.f19948c0 = r2
            return
        L26:
            boolean r3 = r5 instanceof java.lang.String
            if (r3 == 0) goto L33
            r1.f19947b0 = r2
            r1.f19950e0 = r2
            java.lang.String r5 = (java.lang.String) r5
            r1.f19948c0 = r5
            return
        L33:
            boolean r3 = r5 instanceof java.lang.Double
            if (r3 == 0) goto L40
            r1.f19947b0 = r2
            java.lang.Double r5 = (java.lang.Double) r5
            r1.f19950e0 = r5
            r1.f19948c0 = r2
            return
        L40:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "User attribute given of un-supported type"
            r2.<init>(r3)
            throw r2
    }

    public C5076p6(p249o7.C5092r6 r7) {
            r6 = this;
            java.lang.String r1 = r7.f19982c
            long r2 = r7.f19983d
            java.lang.Object r4 = r7.f19984e
            java.lang.String r5 = r7.f19981b
            r0 = r6
            r0.<init>(r1, r2, r4, r5)
            return
    }

    /* renamed from: X */
    public final java.lang.Object m11412X() {
            r1 = this;
            java.lang.Long r0 = r1.f19947b0
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Double r0 = r1.f19950e0
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.String r0 = r1.f19948c0
            if (r0 == 0) goto Lf
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            p249o7.C5084q6.m11414a(r0, r1, r2)
            return
    }
}
