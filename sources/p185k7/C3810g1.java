package p185k7;

/* renamed from: k7.g1 */
/* loaded from: classes.dex */
public final class C3810g1 extends p185k7.AbstractRunnableC3852j1 {

    /* renamed from: c0 */
    public final /* synthetic */ int f16642c0;

    /* renamed from: d0 */
    public final /* synthetic */ java.lang.Object f16643d0;

    /* renamed from: e0 */
    public final /* synthetic */ java.lang.Object f16644e0;

    /* renamed from: f0 */
    public final /* synthetic */ java.lang.Object f16645f0;

    public C3810g1(p185k7.C3905n1 r2, android.app.Activity r3, p185k7.BinderC3865k0 r4) {
            r1 = this;
            r0 = 3
            r1.f16642c0 = r0
            r1.f16645f0 = r2
            r1.f16643d0 = r3
            r1.f16644e0 = r4
            k7.o1 r2 = r2.f16755Y
            r3 = 1
            r1.<init>(r2, r3)
            return
    }

    public C3810g1(p185k7.C3905n1 r2, android.os.Bundle r3, android.app.Activity r4) {
            r1 = this;
            r0 = 2
            r1.f16642c0 = r0
            r1.f16645f0 = r2
            r1.f16643d0 = r3
            r1.f16644e0 = r4
            k7.o1 r2 = r2.f16755Y
            r3 = 1
            r1.<init>(r2, r3)
            return
    }

    public C3810g1(p185k7.C3918o1 r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            r0 = 0
            r1.f16642c0 = r0
            r1.f16645f0 = r2
            r1.f16643d0 = r3
            r1.f16644e0 = r4
            r1.<init>(r2, r0)
            return
    }

    public C3810g1(p185k7.C3918o1 r2, java.lang.String r3, p185k7.BinderC3865k0 r4) {
            r1 = this;
            r0 = 1
            r1.f16642c0 = r0
            r1.f16645f0 = r2
            r1.f16643d0 = r3
            r1.f16644e0 = r4
            r1.<init>(r2, r0)
            return
    }

    @Override // p185k7.AbstractRunnableC3852j1
    /* renamed from: a */
    public final void mo8181a() {
            r9 = this;
            int r0 = r9.f16642c0
            r1 = 0
            java.lang.String r2 = "null reference"
            switch(r0) {
                case 0: goto L61;
                case 1: goto L4c;
                case 2: goto La;
                default: goto L8;
            }
        L8:
            goto L85
        La:
            java.lang.Object r0 = r9.f16643d0
            android.os.Bundle r0 = (android.os.Bundle) r0
            if (r0 == 0) goto L32
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.Object r0 = r9.f16643d0
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r3 = "com.google.app_measurement.screen_service"
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L32
            java.lang.Object r0 = r9.f16643d0
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.Object r0 = r0.get(r3)
            boolean r4 = r0 instanceof android.os.Bundle
            if (r4 == 0) goto L32
            android.os.Bundle r0 = (android.os.Bundle) r0
            r1.putBundle(r3, r0)
        L32:
            java.lang.Object r0 = r9.f16645f0
            k7.n1 r0 = (p185k7.C3905n1) r0
            k7.o1 r0 = r0.f16755Y
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r2)
            java.lang.Object r2 = r9.f16644e0
            android.app.Activity r2 = (android.app.Activity) r2
            x6.b r3 = new x6.b
            r3.<init>(r2)
            long r4 = r9.f16699Z
            r0.onActivityCreated(r3, r1, r4)
            return
        L4c:
            java.lang.Object r0 = r9.f16645f0
            k7.o1 r0 = (p185k7.C3918o1) r0
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r2)
            java.lang.Object r1 = r9.f16643d0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r9.f16644e0
            k7.k0 r2 = (p185k7.BinderC3865k0) r2
            r0.getMaxUserProperties(r1, r2)
            return
        L61:
            java.lang.Object r0 = r9.f16645f0
            k7.o1 r0 = (p185k7.C3918o1) r0
            k7.o0 r3 = r0.f16796f
            java.util.Objects.requireNonNull(r3, r2)
            r4 = 5
            java.lang.Object r0 = r9.f16643d0
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r9.f16644e0
            x6.b r6 = new x6.b
            r6.<init>(r0)
            x6.b r7 = new x6.b
            r7.<init>(r1)
            x6.b r8 = new x6.b
            r8.<init>(r1)
            r3.logHealthData(r4, r5, r6, r7, r8)
            return
        L85:
            java.lang.Object r0 = r9.f16645f0
            k7.n1 r0 = (p185k7.C3905n1) r0
            k7.o1 r0 = r0.f16755Y
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r2)
            java.lang.Object r1 = r9.f16643d0
            android.app.Activity r1 = (android.app.Activity) r1
            x6.b r2 = new x6.b
            r2.<init>(r1)
            java.lang.Object r1 = r9.f16644e0
            k7.k0 r1 = (p185k7.BinderC3865k0) r1
            long r3 = r9.f16699Z
            r0.onActivitySaveInstanceState(r2, r1, r3)
            return
    }

    @Override // p185k7.AbstractRunnableC3852j1
    /* renamed from: b */
    public void mo8182b() {
            r2 = this;
            int r0 = r2.f16642c0
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r0 = r2.f16644e0
            k7.k0 r0 = (p185k7.BinderC3865k0) r0
            r1 = 0
            r0.mo8749D(r1)
            return
    }
}
