package p143i5;

/* renamed from: i5.k */
/* loaded from: classes.dex */
public abstract class AbstractC3087k extends p142i4.AbstractC3074h implements p143i5.InterfaceC3082f {

    /* renamed from: a0 */
    public p143i5.InterfaceC3082f f12431a0;

    /* renamed from: b0 */
    public long f12432b0;

    public AbstractC3087k() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: e */
    public int mo7537e(long r4) {
            r3 = this;
            i5.f r0 = r3.f12431a0
            java.util.Objects.requireNonNull(r0)
            long r1 = r3.f12432b0
            long r4 = r4 - r1
            int r4 = r0.mo7537e(r4)
            return r4
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: g */
    public long mo7538g(int r5) {
            r4 = this;
            i5.f r0 = r4.f12431a0
            java.util.Objects.requireNonNull(r0)
            long r0 = r0.mo7538g(r5)
            long r2 = r4.f12432b0
            long r0 = r0 + r2
            return r0
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: h */
    public java.util.List<p143i5.C3077a> mo7539h(long r4) {
            r3 = this;
            i5.f r0 = r3.f12431a0
            java.util.Objects.requireNonNull(r0)
            long r1 = r3.f12432b0
            long r4 = r4 - r1
            java.util.List r4 = r0.mo7539h(r4)
            return r4
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: k */
    public int mo7540k() {
            r1 = this;
            i5.f r0 = r1.f12431a0
            java.util.Objects.requireNonNull(r0)
            int r0 = r0.mo7540k()
            return r0
    }

    /* renamed from: u */
    public void m7542u() {
            r1 = this;
            r0 = 0
            r1.f12333Y = r0
            r0 = 0
            r1.f12431a0 = r0
            return
    }

    /* renamed from: v */
    public void m7543v(long r3, p143i5.InterfaceC3082f r5, long r6) {
            r2 = this;
            r2.f12364Z = r3
            r2.f12431a0 = r5
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 != 0) goto Le
            goto Lf
        Le:
            r3 = r6
        Lf:
            r2.f12432b0 = r3
            return
    }
}
