package p185k7;

/* renamed from: k7.a1 */
/* loaded from: classes.dex */
public final class C3726a1 extends p185k7.AbstractRunnableC3852j1 {

    /* renamed from: c0 */
    public final /* synthetic */ int f16446c0;

    /* renamed from: d0 */
    public final /* synthetic */ java.lang.String f16447d0;

    /* renamed from: e0 */
    public final /* synthetic */ java.lang.String f16448e0;

    /* renamed from: f0 */
    public final /* synthetic */ java.lang.Object f16449f0;

    /* renamed from: g0 */
    public final /* synthetic */ p185k7.C3918o1 f16450g0;

    public C3726a1(p185k7.C3918o1 r2, android.app.Activity r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r0 = 2
            r1.f16446c0 = r0
            r1.f16450g0 = r2
            r1.f16449f0 = r3
            r1.f16447d0 = r4
            r1.f16448e0 = r5
            r3 = 1
            r1.<init>(r2, r3)
            return
    }

    public C3726a1(p185k7.C3918o1 r2, java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
            r1 = this;
            r0 = 0
            r1.f16446c0 = r0
            r1.f16450g0 = r2
            r1.f16447d0 = r3
            r1.f16448e0 = r4
            r1.f16449f0 = r5
            r3 = 1
            r1.<init>(r2, r3)
            return
    }

    public C3726a1(p185k7.C3918o1 r2, java.lang.String r3, java.lang.String r4, p185k7.BinderC3865k0 r5) {
            r1 = this;
            r0 = 1
            r1.f16446c0 = r0
            r1.f16450g0 = r2
            r1.f16447d0 = r3
            r1.f16448e0 = r4
            r1.f16449f0 = r5
            r1.<init>(r2, r0)
            return
    }

    @Override // p185k7.AbstractRunnableC3852j1
    /* renamed from: a */
    public final void mo8181a() {
            r8 = this;
            int r0 = r8.f16446c0
            java.lang.String r1 = "null reference"
            switch(r0) {
                case 0: goto L1b;
                case 1: goto L8;
                default: goto L7;
            }
        L7:
            goto L2e
        L8:
            k7.o1 r0 = r8.f16450g0
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.String r1 = r8.f16447d0
            java.lang.String r2 = r8.f16448e0
            java.lang.Object r3 = r8.f16449f0
            k7.k0 r3 = (p185k7.BinderC3865k0) r3
            r0.getConditionalUserProperties(r1, r2, r3)
            return
        L1b:
            k7.o1 r0 = r8.f16450g0
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.String r1 = r8.f16447d0
            java.lang.String r2 = r8.f16448e0
            java.lang.Object r3 = r8.f16449f0
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0.clearConditionalUserProperty(r1, r2, r3)
            return
        L2e:
            k7.o1 r0 = r8.f16450g0
            k7.o0 r2 = r0.f16796f
            java.util.Objects.requireNonNull(r2, r1)
            java.lang.Object r0 = r8.f16449f0
            android.app.Activity r0 = (android.app.Activity) r0
            x6.b r3 = new x6.b
            r3.<init>(r0)
            java.lang.String r4 = r8.f16447d0
            java.lang.String r5 = r8.f16448e0
            long r6 = r8.f16698Y
            r2.setCurrentScreen(r3, r4, r5, r6)
            return
    }

    @Override // p185k7.AbstractRunnableC3852j1
    /* renamed from: b */
    public void mo8182b() {
            r2 = this;
            int r0 = r2.f16446c0
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r0 = r2.f16449f0
            k7.k0 r0 = (p185k7.BinderC3865k0) r0
            r1 = 0
            r0.mo8749D(r1)
            return
    }
}
