package sj;

/* renamed from: sj.f */
/* loaded from: classes.dex */
public class C6085f implements sj.InterfaceC6080a {

    /* renamed from: a */
    public final java.math.BigInteger f23449a;

    public C6085f(java.math.BigInteger r1) {
            r0 = this;
            r0.<init>()
            r0.f23449a = r1
            return
    }

    @Override // sj.InterfaceC6080a
    /* renamed from: b */
    public int mo12527b() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // sj.InterfaceC6080a
    /* renamed from: c */
    public java.math.BigInteger mo12528c() {
            r1 = this;
            java.math.BigInteger r0 = r1.f23449a
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof sj.C6085f
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            sj.f r2 = (sj.C6085f) r2
            java.math.BigInteger r0 = r1.f23449a
            java.math.BigInteger r2 = r2.f23449a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.math.BigInteger r0 = r1.f23449a
            int r0 = r0.hashCode()
            return r0
    }
}
