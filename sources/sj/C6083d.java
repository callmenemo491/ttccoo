package sj;

/* renamed from: sj.d */
/* loaded from: classes.dex */
public class C6083d implements sj.InterfaceC6084e {

    /* renamed from: a */
    public final sj.InterfaceC6080a f23447a;

    /* renamed from: b */
    public final sj.C6082c f23448b;

    public C6083d(sj.InterfaceC6080a r1, sj.C6082c r2) {
            r0 = this;
            r0.<init>()
            r0.f23447a = r1
            r0.f23448b = r2
            return
    }

    @Override // sj.InterfaceC6084e
    /* renamed from: a */
    public sj.C6082c mo12530a() {
            r1 = this;
            sj.c r0 = r1.f23448b
            return r0
    }

    @Override // sj.InterfaceC6080a
    /* renamed from: b */
    public int mo12527b() {
            r3 = this;
            sj.a r0 = r3.f23447a
            int r0 = r0.mo12527b()
            sj.c r1 = r3.f23448b
            int[] r1 = r1.f23446a
            int r2 = r1.length
            int r2 = r2 + (-1)
            r1 = r1[r2]
            int r0 = r0 * r1
            return r0
    }

    @Override // sj.InterfaceC6080a
    /* renamed from: c */
    public java.math.BigInteger mo12528c() {
            r1 = this;
            sj.a r0 = r1.f23447a
            java.math.BigInteger r0 = r0.mo12528c()
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof sj.C6083d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            sj.d r5 = (sj.C6083d) r5
            sj.a r1 = r4.f23447a
            sj.a r3 = r5.f23447a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L21
            sj.c r1 = r4.f23448b
            sj.c r5 = r5.f23448b
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    public int hashCode() {
            r3 = this;
            sj.a r0 = r3.f23447a
            int r0 = r0.hashCode()
            sj.c r1 = r3.f23448b
            int r1 = r1.hashCode()
            r2 = 16
            int r1 = java.lang.Integer.rotateLeft(r1, r2)
            r0 = r0 ^ r1
            return r0
    }
}
