package p385w3;

@com.google.auto.value.AutoValue
/* renamed from: w3.i */
/* loaded from: classes.dex */
public abstract class AbstractC6787i {

    @com.google.auto.value.AutoValue.Builder
    /* renamed from: w3.i$a */
    public static abstract class a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public abstract p385w3.AbstractC6787i mo13801a();

        /* renamed from: b */
        public abstract p385w3.AbstractC6787i.a mo13802b(java.lang.String r1);

        /* renamed from: c */
        public abstract p385w3.AbstractC6787i.a mo13803c(p335t3.EnumC6151d r1);
    }

    public AbstractC6787i() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static p385w3.AbstractC6787i.a m13808a() {
            w3.b$b r0 = new w3.b$b
            r0.<init>()
            t3.d r1 = p335t3.EnumC6151d.f23742Y
            r0.mo13803c(r1)
            return r0
    }

    /* renamed from: b */
    public abstract java.lang.String mo13798b();

    /* renamed from: c */
    public abstract byte[] mo13799c();

    /* renamed from: d */
    public abstract p335t3.EnumC6151d mo13800d();

    public final java.lang.String toString() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.mo13798b()
            r2 = 0
            r0[r2] = r1
            t3.d r1 = r3.mo13800d()
            r2 = 1
            r0[r2] = r1
            byte[] r1 = r3.mo13799c()
            r2 = 2
            if (r1 != 0) goto L1b
            java.lang.String r1 = ""
            goto L23
        L1b:
            byte[] r1 = r3.mo13799c()
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)
        L23:
            r0[r2] = r1
            java.lang.String r1 = "TransportContext(%s, %s, %s)"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
