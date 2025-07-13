package p335t3;

/* renamed from: t3.a */
/* loaded from: classes.dex */
public final class C6148a<T> extends p335t3.AbstractC6150c<T> {

    /* renamed from: a */
    public final java.lang.Integer f23738a;

    /* renamed from: b */
    public final T f23739b;

    /* renamed from: c */
    public final p335t3.EnumC6151d f23740c;

    public C6148a(java.lang.Integer r1, T r2, p335t3.EnumC6151d r3) {
            r0 = this;
            r0.<init>()
            r0.f23738a = r1
            java.lang.String r1 = "Null payload"
            java.util.Objects.requireNonNull(r2, r1)
            r0.f23739b = r2
            java.lang.String r1 = "Null priority"
            java.util.Objects.requireNonNull(r3, r1)
            r0.f23740c = r3
            return
    }

    @Override // p335t3.AbstractC6150c
    /* renamed from: a */
    public java.lang.Integer mo12695a() {
            r1 = this;
            java.lang.Integer r0 = r1.f23738a
            return r0
    }

    @Override // p335t3.AbstractC6150c
    /* renamed from: b */
    public T mo12696b() {
            r1 = this;
            T r0 = r1.f23739b
            return r0
    }

    @Override // p335t3.AbstractC6150c
    /* renamed from: c */
    public p335t3.EnumC6151d mo12697c() {
            r1 = this;
            t3.d r0 = r1.f23740c
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p335t3.AbstractC6150c
            r2 = 0
            if (r1 == 0) goto L3b
            t3.c r5 = (p335t3.AbstractC6150c) r5
            java.lang.Integer r1 = r4.f23738a
            if (r1 != 0) goto L16
            java.lang.Integer r1 = r5.mo12695a()
            if (r1 != 0) goto L39
            goto L20
        L16:
            java.lang.Integer r3 = r5.mo12695a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L39
        L20:
            T r1 = r4.f23739b
            java.lang.Object r3 = r5.mo12696b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L39
            t3.d r1 = r4.f23740c
            t3.d r5 = r5.mo12697c()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L39
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
        L3b:
            return r2
    }

    public int hashCode() {
            r3 = this;
            java.lang.Integer r0 = r3.f23738a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            T r2 = r3.f23739b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            t3.d r1 = r3.f23740c
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Event{code="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Integer r1 = r2.f23738a
            r0.append(r1)
            java.lang.String r1 = ", payload="
            r0.append(r1)
            T r1 = r2.f23739b
            r0.append(r1)
            java.lang.String r1 = ", priority="
            r0.append(r1)
            t3.d r1 = r2.f23740c
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
