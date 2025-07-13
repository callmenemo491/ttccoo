package p182k4;

/* renamed from: k4.f */
/* loaded from: classes.dex */
public class C3691f implements p325s5.InterfaceC5969i {

    /* renamed from: a */
    public final p108g5.C2271h0 f16334a;

    public C3691f(p108g5.C2271h0 r1) {
            r0 = this;
            r0.<init>()
            r0.f16334a = r1
            return
    }

    @Override // p325s5.InterfaceC5969i
    /* renamed from: e */
    public p108g5.C2271h0 mo8144e() {
            r1 = this;
            g5.h0 r0 = r1.f16334a
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1b
            java.lang.Class<k4.f> r2 = p182k4.C3691f.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1b
        L10:
            k4.f r5 = (p182k4.C3691f) r5
            g5.h0 r2 = r4.f16334a
            g5.h0 r5 = r5.f16334a
            if (r2 != r5) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
        L1b:
            return r1
    }

    public int hashCode() {
            r1 = this;
            g5.h0 r0 = r1.f16334a
            int r0 = java.lang.System.identityHashCode(r0)
            return r0
    }

    @Override // p325s5.InterfaceC5969i
    /* renamed from: l */
    public int mo8145l(int r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            goto L5
        L4:
            r1 = -1
        L5:
            return r1
    }
}
