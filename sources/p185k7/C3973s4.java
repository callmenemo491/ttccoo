package p185k7;

/* renamed from: k7.s4 */
/* loaded from: classes.dex */
public final class C3973s4<T> extends p185k7.AbstractC3960r4<T> {

    /* renamed from: Y */
    public final T f16859Y;

    public C3973s4(T r1) {
            r0 = this;
            r0.<init>()
            r0.f16859Y = r1
            return
    }

    @Override // p185k7.AbstractC3960r4
    /* renamed from: a */
    public final T mo8907a() {
            r1 = this;
            T r0 = r1.f16859Y
            return r0
    }

    @Override // p185k7.AbstractC3960r4
    /* renamed from: b */
    public final boolean mo8908b() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p185k7.C3973s4
            if (r0 == 0) goto Lf
            k7.s4 r2 = (p185k7.C3973s4) r2
            T r0 = r1.f16859Y
            T r2 = r2.f16859Y
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            T r0 = r2.f16859Y
            int r0 = r0.hashCode()
            r1 = 1502476572(0x598df91c, float:4.995234E15)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            T r0 = r4.f16859Y
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 13
            r2.<init>(r1)
            java.lang.String r1 = "Optional.of("
            java.lang.String r3 = ")"
            java.lang.String r0 = p083f.C1932s.m4774a(r2, r1, r0, r3)
            return r0
    }
}
