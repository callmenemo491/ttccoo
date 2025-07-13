package p185k7;

/* renamed from: k7.f1 */
/* loaded from: classes.dex */
public final class C3796f1 extends p185k7.AbstractRunnableC3852j1 {

    /* renamed from: c0 */
    public final /* synthetic */ int f16624c0;

    /* renamed from: d0 */
    public final /* synthetic */ java.lang.String f16625d0;

    /* renamed from: e0 */
    public final /* synthetic */ java.lang.String f16626e0;

    /* renamed from: f0 */
    public final /* synthetic */ boolean f16627f0;

    /* renamed from: g0 */
    public final /* synthetic */ java.lang.Object f16628g0;

    /* renamed from: h0 */
    public final /* synthetic */ p185k7.C3918o1 f16629h0;

    public C3796f1(p185k7.C3918o1 r2, java.lang.String r3, java.lang.String r4, java.lang.Object r5, boolean r6) {
            r1 = this;
            r0 = 1
            r1.f16624c0 = r0
            r1.f16629h0 = r2
            r1.f16625d0 = r3
            r1.f16626e0 = r4
            r1.f16628g0 = r5
            r1.f16627f0 = r6
            r1.<init>(r2, r0)
            return
    }

    public C3796f1(p185k7.C3918o1 r2, java.lang.String r3, java.lang.String r4, boolean r5, p185k7.BinderC3865k0 r6) {
            r1 = this;
            r0 = 0
            r1.f16624c0 = r0
            r1.f16629h0 = r2
            r1.f16625d0 = r3
            r1.f16626e0 = r4
            r1.f16627f0 = r5
            r1.f16628g0 = r6
            r3 = 1
            r1.<init>(r2, r3)
            return
    }

    @Override // p185k7.AbstractRunnableC3852j1
    /* renamed from: a */
    public final void mo8181a() {
            r9 = this;
            int r0 = r9.f16624c0
            java.lang.String r1 = "null reference"
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L1d
        L8:
            k7.o1 r0 = r9.f16629h0
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.String r1 = r9.f16625d0
            java.lang.String r2 = r9.f16626e0
            boolean r3 = r9.f16627f0
            java.lang.Object r4 = r9.f16628g0
            k7.k0 r4 = (p185k7.BinderC3865k0) r4
            r0.getUserProperties(r1, r2, r3, r4)
            return
        L1d:
            k7.o1 r0 = r9.f16629h0
            k7.o0 r2 = r0.f16796f
            java.util.Objects.requireNonNull(r2, r1)
            java.lang.String r3 = r9.f16625d0
            java.lang.String r4 = r9.f16626e0
            java.lang.Object r0 = r9.f16628g0
            x6.b r5 = new x6.b
            r5.<init>(r0)
            boolean r6 = r9.f16627f0
            long r7 = r9.f16698Y
            r2.setUserProperty(r3, r4, r5, r6, r7)
            return
    }

    @Override // p185k7.AbstractRunnableC3852j1
    /* renamed from: b */
    public void mo8182b() {
            r2 = this;
            int r0 = r2.f16624c0
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r0 = r2.f16628g0
            k7.k0 r0 = (p185k7.BinderC3865k0) r0
            r1 = 0
            r0.mo8749D(r1)
            return
    }
}
