package p124h7;

/* renamed from: h7.xb */
/* loaded from: classes.dex */
public abstract class AbstractC2947xb {

    /* renamed from: Y */
    public final /* synthetic */ int f12021Y;

    public AbstractC2947xb(int r1) {
            r0 = this;
            r0.f12021Y = r1
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract java.lang.Object mo7308a();

    /* renamed from: b */
    public p240nj.AbstractC4848f m7309b(p240nj.AbstractC4848f r3, java.math.BigInteger r4) {
            r2 = this;
            int r0 = r4.signum()
            if (r0 == 0) goto L20
            boolean r1 = r3.m10930k()
            if (r1 == 0) goto Ld
            goto L20
        Ld:
            java.math.BigInteger r4 = r4.abs()
            nj.f r3 = r2.mo7310c(r3, r4)
            if (r0 <= 0) goto L18
            goto L1c
        L18:
            nj.f r3 = r3.mo10933n()
        L1c:
            p240nj.C4843a.m10861a(r3)
            return r3
        L20:
            nj.c r3 = r3.f19286a
            nj.f r3 = r3.mo10881n()
            return r3
    }

    /* renamed from: c */
    public abstract p240nj.AbstractC4848f mo7310c(p240nj.AbstractC4848f r1, java.math.BigInteger r2);

    /* renamed from: d */
    public abstract p124h7.C2570cc mo7137d(java.lang.CharSequence r1);

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f12021Y
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.Object r0 = r1.mo7308a()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
