package p169jb;

/* renamed from: jb.t */
/* loaded from: classes.dex */
public final class C3477t extends p169jb.AbstractC3473p {

    /* renamed from: a */
    public final java.lang.Object f14969a;

    public C3477t(java.lang.Boolean r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f14969a = r1
            return
    }

    public C3477t(java.lang.Number r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f14969a = r1
            return
    }

    public C3477t(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f14969a = r1
            return
    }

    /* renamed from: p */
    public static boolean m7951p(p169jb.C3477t r1) {
            java.lang.Object r1 = r1.f14969a
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L1e
            java.lang.Number r1 = (java.lang.Number) r1
            boolean r0 = r1 instanceof java.math.BigInteger
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof java.lang.Short
            if (r0 != 0) goto L1c
            boolean r1 = r1 instanceof java.lang.Byte
            if (r1 == 0) goto L1e
        L1c:
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
    }

    @Override // p169jb.AbstractC3473p
    /* renamed from: a */
    public int mo7941a() {
            r1 = this;
            java.lang.Object r0 = r1.f14969a
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r1.m7953n()
            int r0 = r0.intValue()
            goto L17
        Lf:
            java.lang.String r0 = r1.mo7944l()
            int r0 = java.lang.Integer.parseInt(r0)
        L17:
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L76
            java.lang.Class<jb.t> r2 = p169jb.C3477t.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L10
            goto L76
        L10:
            jb.t r7 = (p169jb.C3477t) r7
            java.lang.Object r2 = r6.f14969a
            if (r2 != 0) goto L1d
            java.lang.Object r7 = r7.f14969a
            if (r7 != 0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
        L1d:
            boolean r2 = m7951p(r6)
            if (r2 == 0) goto L40
            boolean r2 = m7951p(r7)
            if (r2 == 0) goto L40
            java.lang.Number r2 = r6.m7953n()
            long r2 = r2.longValue()
            java.lang.Number r7 = r7.m7953n()
            long r4 = r7.longValue()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L3e
            goto L3f
        L3e:
            r0 = 0
        L3f:
            return r0
        L40:
            java.lang.Object r2 = r6.f14969a
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r7.f14969a
            boolean r3 = r3 instanceof java.lang.Number
            if (r3 == 0) goto L6f
            java.lang.Number r2 = r6.m7953n()
            double r2 = r2.doubleValue()
            java.lang.Number r7 = r7.m7953n()
            double r4 = r7.doubleValue()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L6e
            boolean r7 = java.lang.Double.isNaN(r2)
            if (r7 == 0) goto L6d
            boolean r7 = java.lang.Double.isNaN(r4)
            if (r7 == 0) goto L6d
            goto L6e
        L6d:
            r0 = 0
        L6e:
            return r0
        L6f:
            java.lang.Object r7 = r7.f14969a
            boolean r7 = r2.equals(r7)
            return r7
        L76:
            return r1
    }

    @Override // p169jb.AbstractC3473p
    /* renamed from: h */
    public long mo7942h() {
            r2 = this;
            java.lang.Object r0 = r2.f14969a
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r2.m7953n()
            long r0 = r0.longValue()
            goto L17
        Lf:
            java.lang.String r0 = r2.mo7944l()
            long r0 = java.lang.Long.parseLong(r0)
        L17:
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.Object r0 = r4.f14969a
            if (r0 != 0) goto L7
            r0 = 31
            return r0
        L7:
            boolean r0 = m7951p(r4)
            r1 = 32
            if (r0 == 0) goto L1c
            java.lang.Number r0 = r4.m7953n()
            long r2 = r0.longValue()
        L17:
            long r0 = r2 >>> r1
            long r0 = r0 ^ r2
            int r1 = (int) r0
            return r1
        L1c:
            java.lang.Object r0 = r4.f14969a
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L2f
            java.lang.Number r0 = r4.m7953n()
            double r2 = r0.doubleValue()
            long r2 = java.lang.Double.doubleToLongBits(r2)
            goto L17
        L2f:
            int r0 = r0.hashCode()
            return r0
    }

    @Override // p169jb.AbstractC3473p
    /* renamed from: i */
    public short mo7943i() {
            r1 = this;
            java.lang.Object r0 = r1.f14969a
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r0 = r1.m7953n()
            short r0 = r0.shortValue()
            goto L17
        Lf:
            java.lang.String r0 = r1.mo7944l()
            short r0 = java.lang.Short.parseShort(r0)
        L17:
            return r0
    }

    @Override // p169jb.AbstractC3473p
    /* renamed from: l */
    public java.lang.String mo7944l() {
            r2 = this;
            java.lang.Object r0 = r2.f14969a
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto Lf
            java.lang.Number r0 = r2.m7953n()
            java.lang.String r0 = r0.toString()
            return r0
        Lf:
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L1a
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.String r0 = r0.toString()
            return r0
        L1a:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    /* renamed from: m */
    public boolean m7952m() {
            r2 = this;
            java.lang.Object r0 = r2.f14969a
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto Ld
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        Ld:
            java.lang.String r0 = r2.mo7944l()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            return r0
    }

    /* renamed from: n */
    public java.lang.Number m7953n() {
            r2 = this;
            java.lang.Object r0 = r2.f14969a
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Le
            lb.q r1 = new lb.q
            java.lang.String r0 = (java.lang.String) r0
            r1.<init>(r0)
            goto L11
        Le:
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
        L11:
            return r1
    }
}
