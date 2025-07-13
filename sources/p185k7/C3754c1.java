package p185k7;

/* renamed from: k7.c1 */
/* loaded from: classes.dex */
public final class C3754c1 extends p185k7.AbstractRunnableC3852j1 {

    /* renamed from: c0 */
    public final /* synthetic */ int f16540c0;

    /* renamed from: d0 */
    public final /* synthetic */ java.lang.String f16541d0;

    /* renamed from: e0 */
    public final /* synthetic */ p185k7.C3918o1 f16542e0;

    public C3754c1(p185k7.C3918o1 r2, java.lang.String r3, int r4) {
            r1 = this;
            r1.f16540c0 = r4
            r0 = 1
            if (r4 == r0) goto Ld
            r1.f16542e0 = r2
            r1.f16541d0 = r3
            r1.<init>(r2, r0)
            return
        Ld:
            r1.f16542e0 = r2
            r1.f16541d0 = r3
            r1.<init>(r2, r0)
            return
    }

    @Override // p185k7.AbstractRunnableC3852j1
    /* renamed from: a */
    public final void mo8181a() {
            r4 = this;
            int r0 = r4.f16540c0
            java.lang.String r1 = "null reference"
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L17
        L8:
            k7.o1 r0 = r4.f16542e0
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.String r1 = r4.f16541d0
            long r2 = r4.f16699Z
            r0.beginAdUnitExposure(r1, r2)
            return
        L17:
            k7.o1 r0 = r4.f16542e0
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            java.lang.String r1 = r4.f16541d0
            long r2 = r4.f16699Z
            r0.endAdUnitExposure(r1, r2)
            return
    }
}
