package p185k7;

/* renamed from: k7.l1 */
/* loaded from: classes.dex */
public final class C3879l1 extends p185k7.AbstractRunnableC3852j1 {

    /* renamed from: c0 */
    public final /* synthetic */ int f16734c0;

    /* renamed from: d0 */
    public final /* synthetic */ android.app.Activity f16735d0;

    /* renamed from: e0 */
    public final /* synthetic */ p185k7.C3905n1 f16736e0;

    public C3879l1(p185k7.C3905n1 r3, android.app.Activity r4, int r5) {
            r2 = this;
            r2.f16734c0 = r5
            r0 = 1
            if (r5 == r0) goto L36
            r1 = 2
            if (r5 == r1) goto L2c
            r1 = 3
            if (r5 == r1) goto L22
            r1 = 4
            if (r5 == r1) goto L18
            r2.f16736e0 = r3
            r2.f16735d0 = r4
            k7.o1 r3 = r3.f16755Y
            r2.<init>(r3, r0)
            return
        L18:
            r2.f16736e0 = r3
            r2.f16735d0 = r4
            k7.o1 r3 = r3.f16755Y
            r2.<init>(r3, r0)
            return
        L22:
            r2.f16736e0 = r3
            r2.f16735d0 = r4
            k7.o1 r3 = r3.f16755Y
            r2.<init>(r3, r0)
            return
        L2c:
            r2.f16736e0 = r3
            r2.f16735d0 = r4
            k7.o1 r3 = r3.f16755Y
            r2.<init>(r3, r0)
            return
        L36:
            r2.f16736e0 = r3
            r2.f16735d0 = r4
            k7.o1 r3 = r3.f16755Y
            r2.<init>(r3, r0)
            return
    }

    @Override // p185k7.AbstractRunnableC3852j1
    /* renamed from: a */
    public final void mo8181a() {
            r5 = this;
            int r0 = r5.f16734c0
            java.lang.String r1 = "null reference"
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L34;
                case 2: goto L1e;
                case 3: goto L8;
                default: goto L7;
            }
        L7:
            goto L60
        L8:
            k7.n1 r0 = r5.f16736e0
            k7.o1 r0 = r0.f16755Y
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            android.app.Activity r1 = r5.f16735d0
            x6.b r2 = new x6.b
            r2.<init>(r1)
            long r3 = r5.f16699Z
            r0.onActivityStopped(r2, r3)
            return
        L1e:
            k7.n1 r0 = r5.f16736e0
            k7.o1 r0 = r0.f16755Y
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            android.app.Activity r1 = r5.f16735d0
            x6.b r2 = new x6.b
            r2.<init>(r1)
            long r3 = r5.f16699Z
            r0.onActivityPaused(r2, r3)
            return
        L34:
            k7.n1 r0 = r5.f16736e0
            k7.o1 r0 = r0.f16755Y
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            android.app.Activity r1 = r5.f16735d0
            x6.b r2 = new x6.b
            r2.<init>(r1)
            long r3 = r5.f16699Z
            r0.onActivityResumed(r2, r3)
            return
        L4a:
            k7.n1 r0 = r5.f16736e0
            k7.o1 r0 = r0.f16755Y
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            android.app.Activity r1 = r5.f16735d0
            x6.b r2 = new x6.b
            r2.<init>(r1)
            long r3 = r5.f16699Z
            r0.onActivityStarted(r2, r3)
            return
        L60:
            k7.n1 r0 = r5.f16736e0
            k7.o1 r0 = r0.f16755Y
            k7.o0 r0 = r0.f16796f
            java.util.Objects.requireNonNull(r0, r1)
            android.app.Activity r1 = r5.f16735d0
            x6.b r2 = new x6.b
            r2.<init>(r1)
            long r3 = r5.f16699Z
            r0.onActivityDestroyed(r2, r3)
            return
    }
}
