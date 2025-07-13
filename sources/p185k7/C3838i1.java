package p185k7;

/* renamed from: k7.i1 */
/* loaded from: classes.dex */
public final class C3838i1 extends p185k7.AbstractRunnableC3852j1 {

    /* renamed from: c0 */
    public final /* synthetic */ java.lang.Long f16671c0;

    /* renamed from: d0 */
    public final /* synthetic */ java.lang.String f16672d0;

    /* renamed from: e0 */
    public final /* synthetic */ java.lang.String f16673e0;

    /* renamed from: f0 */
    public final /* synthetic */ android.os.Bundle f16674f0;

    /* renamed from: g0 */
    public final /* synthetic */ boolean f16675g0;

    /* renamed from: h0 */
    public final /* synthetic */ boolean f16676h0;

    /* renamed from: i0 */
    public final /* synthetic */ p185k7.C3918o1 f16677i0;

    public C3838i1(p185k7.C3918o1 r1, java.lang.Long r2, java.lang.String r3, java.lang.String r4, android.os.Bundle r5, boolean r6, boolean r7) {
            r0 = this;
            r0.f16677i0 = r1
            r0.f16671c0 = r2
            r0.f16672d0 = r3
            r0.f16673e0 = r4
            r0.f16674f0 = r5
            r0.f16675g0 = r6
            r0.f16676h0 = r7
            r2 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // p185k7.AbstractRunnableC3852j1
    /* renamed from: a */
    public final void mo8181a() {
            r10 = this;
            java.lang.Long r0 = r10.f16671c0
            if (r0 != 0) goto L7
            long r0 = r10.f16698Y
            goto Lb
        L7:
            long r0 = r0.longValue()
        Lb:
            r8 = r0
            k7.o1 r0 = r10.f16677i0
            k7.o0 r2 = r0.f16796f
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r3 = r10.f16672d0
            java.lang.String r4 = r10.f16673e0
            android.os.Bundle r5 = r10.f16674f0
            boolean r6 = r10.f16675g0
            boolean r7 = r10.f16676h0
            r2.logEvent(r3, r4, r5, r6, r7, r8)
            return
    }
}
