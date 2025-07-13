package p185k7;

/* renamed from: k7.e1 */
/* loaded from: classes.dex */
public final class C3782e1 extends p185k7.AbstractRunnableC3852j1 {

    /* renamed from: c0 */
    public final /* synthetic */ int f16609c0;

    /* renamed from: d0 */
    public final /* synthetic */ p185k7.BinderC3865k0 f16610d0;

    /* renamed from: e0 */
    public final /* synthetic */ p185k7.C3918o1 f16611e0;

    public C3782e1(p185k7.C3918o1 r3, p185k7.BinderC3865k0 r4, int r5) {
            r2 = this;
            r2.f16609c0 = r5
            r0 = 1
            if (r5 == r0) goto L2e
            r1 = 2
            if (r5 == r1) goto L26
            r1 = 3
            if (r5 == r1) goto L1e
            r1 = 4
            if (r5 == r1) goto L16
            r2.f16611e0 = r3
            r2.f16610d0 = r4
            r2.<init>(r3, r0)
            return
        L16:
            r2.f16611e0 = r3
            r2.f16610d0 = r4
            r2.<init>(r3, r0)
            return
        L1e:
            r2.f16611e0 = r3
            r2.f16610d0 = r4
            r2.<init>(r3, r0)
            return
        L26:
            r2.f16611e0 = r3
            r2.f16610d0 = r4
            r2.<init>(r3, r0)
            return
        L2e:
            r2.f16611e0 = r3
            r2.f16610d0 = r4
            r2.<init>(r3, r0)
            return
    }

    @Override // p185k7.AbstractRunnableC3852j1
    /* renamed from: a */
    public final void mo8181a() {
            r2 = this;
            int r0 = r2.f16609c0
            java.lang.String r1 = "null reference"
            switch(r0) {
                case 0: goto L2f;
                case 1: goto L22;
                case 2: goto L15;
                case 3: goto L8;
                default: goto L7;
            }
        L7:
            goto L3c
        L8:
            k7.o1 r0 = r2.f16611e0
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            k7.k0 r1 = r2.f16610d0
            r0.getCurrentScreenName(r1)
            return
        L15:
            k7.o1 r0 = r2.f16611e0
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            k7.k0 r1 = r2.f16610d0
            r0.generateEventId(r1)
            return
        L22:
            k7.o1 r0 = r2.f16611e0
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            k7.k0 r1 = r2.f16610d0
            r0.getCachedAppInstanceId(r1)
            return
        L2f:
            k7.o1 r0 = r2.f16611e0
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            k7.k0 r1 = r2.f16610d0
            r0.getGmpAppId(r1)
            return
        L3c:
            k7.o1 r0 = r2.f16611e0
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            k7.k0 r1 = r2.f16610d0
            r0.getCurrentScreenClass(r1)
            return
    }

    @Override // p185k7.AbstractRunnableC3852j1
    /* renamed from: b */
    public final void mo8182b() {
            r2 = this;
            int r0 = r2.f16609c0
            r1 = 0
            switch(r0) {
                case 0: goto L19;
                case 1: goto L13;
                case 2: goto Ld;
                case 3: goto L7;
                default: goto L6;
            }
        L6:
            goto L1f
        L7:
            k7.k0 r0 = r2.f16610d0
            r0.mo8749D(r1)
            return
        Ld:
            k7.k0 r0 = r2.f16610d0
            r0.mo8749D(r1)
            return
        L13:
            k7.k0 r0 = r2.f16610d0
            r0.mo8749D(r1)
            return
        L19:
            k7.k0 r0 = r2.f16610d0
            r0.mo8749D(r1)
            return
        L1f:
            k7.k0 r0 = r2.f16610d0
            r0.mo8749D(r1)
            return
    }
}
