package p185k7;

/* renamed from: k7.z0 */
/* loaded from: classes.dex */
public final class C4060z0 extends p185k7.AbstractRunnableC3852j1 {

    /* renamed from: c0 */
    public final /* synthetic */ int f16978c0;

    /* renamed from: d0 */
    public final /* synthetic */ java.lang.Object f16979d0;

    /* renamed from: e0 */
    public final /* synthetic */ p185k7.C3918o1 f16980e0;

    public C4060z0(p185k7.C3918o1 r2, android.os.Bundle r3) {
            r1 = this;
            r0 = 0
            r1.f16978c0 = r0
            r1.f16980e0 = r2
            r1.f16979d0 = r3
            r3 = 1
            r1.<init>(r2, r3)
            return
    }

    public C4060z0(p185k7.C3918o1 r2, p185k7.BinderC3866k1 r3) {
            r1 = this;
            r0 = 1
            r1.f16978c0 = r0
            r1.f16980e0 = r2
            r1.f16979d0 = r3
            r1.<init>(r2, r0)
            return
    }

    @Override // p185k7.AbstractRunnableC3852j1
    /* renamed from: a */
    public final void mo8181a() {
            r4 = this;
            int r0 = r4.f16978c0
            java.lang.String r1 = "null reference"
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L19
        L8:
            k7.o1 r0 = r4.f16980e0
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.Object r1 = r4.f16979d0
            android.os.Bundle r1 = (android.os.Bundle) r1
            long r2 = r4.f16698Y
            r0.setConditionalUserProperty(r1, r2)
            return
        L19:
            k7.o1 r0 = r4.f16980e0
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.Object r1 = r4.f16979d0
            k7.k1 r1 = (p185k7.BinderC3866k1) r1
            r0.mo3127x37dae114(r1)
            return
    }
}
