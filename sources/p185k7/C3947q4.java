package p185k7;

/* renamed from: k7.q4 */
/* loaded from: classes.dex */
public final class C3947q4<T> extends p185k7.AbstractC3960r4<T> {

    /* renamed from: Y */
    public static final p185k7.C3947q4<java.lang.Object> f16843Y = null;

    static {
            k7.q4 r0 = new k7.q4
            r0.<init>()
            p185k7.C3947q4.f16843Y = r0
            return
    }

    public C3947q4() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.AbstractC3960r4
    /* renamed from: a */
    public final T mo8907a() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Optional.get() cannot be called on an absent value"
            r0.<init>(r1)
            throw r0
    }

    @Override // p185k7.AbstractC3960r4
    /* renamed from: b */
    public final boolean mo8908b() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r1 = this;
            r0 = 2040732332(0x79a31aac, float:1.0586067E35)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Optional.absent()"
            return r0
    }
}
